package com.example.ValidacionPersistenciaUsuarios.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.ValidacionPersistenciaUsuarios.modelo.ResponseValidacion;
import com.example.ValidacionPersistenciaUsuarios.modelo.ResponseSaveFiles;
import com.example.ValidacionPersistenciaUsuarios.modelo.Empleado;
import com.example.ValidacionPersistenciaUsuarios.service.IEmpleadoService;
import com.example.ValidacionPersistenciaUsuarios.tools.Fecha;
import com.example.ValidacionPersistenciaUsuarios.tools.FileCSV;
import com.example.ValidacionPersistenciaUsuarios.tools.FilePDf;
import com.example.ValidacionPersistenciaUsuarios.tools.FileXLS;
import com.example.ValidacionPersistenciaUsuarios.tools.SaveDB;
import com.example.ValidacionPersistenciaUsuarios.tools.Validacion;

@Service
public class EmpleadoBusiness implements IEmpleadoService {

	@Value("${file.path}")
	String filePath;

	@Autowired
	Validacion validacion;
	@Autowired
	FileCSV fileCSV;
	@Autowired
	FileXLS fileXLS;
	@Autowired
	FilePDf filePDF;
	@Autowired
	SaveDB saveDB;

	@Override
	public ResponseEntity<?> procesarUsuarios(String pdf, String csv, String xls, String db, Empleado empleado) {
//validamos
		ResponseEntity<ResponseValidacion> erorres = validacion.validar(pdf, csv, xls, db, empleado);
//revisamos el codigo que regreso
		if (!(erorres.getBody().getCode() == 00)) {
			return erorres;
		} else {

			ResponseSaveFiles files = new ResponseSaveFiles();
			ResponseEntity<ResponseSaveFiles> responseFiles = new ResponseEntity<ResponseSaveFiles>(files,
					HttpStatus.OK);
//tomamos fecha actual
			String fecha = Fecha.fechaActual();
//almacenamos archivos...
//csv
			if (csv.trim().equals("si")) {
				try {
					fileCSV.crearCSV(fecha, filePath, empleado);
					responseFiles.getBody().setCsv("csv" + fecha + ".csv");
				} catch (Exception e) {
					responseFiles.getBody().setCsv("error");
				}
			}else if (csv.trim().equals("no")){
				responseFiles.getBody().setCsv("no aplica");
			}
//excel
			if (xls.trim().equals("si")) {
				try {
					fileXLS.crearExcel(fecha, filePath, empleado);
					responseFiles.getBody().setXls("xls" + fecha + ".xls");
				} catch (Exception e) {
					responseFiles.getBody().setXls("error");
				}
			}else if (xls.trim().equals("no")){
				responseFiles.getBody().setXls("no aplica");
			}
//pdf
			if (pdf.trim().equals("si")) {
				try {
					filePDF.crearPDF(fecha, filePath, empleado);
					responseFiles.getBody().setPdf("pdf" + fecha + ".pdf");
				} catch (Exception e) {
					responseFiles.getBody().setPdf("error");
				}
			}else if (pdf.trim().equals("no")) {
				responseFiles.getBody().setPdf("no aplica");
			}
//base de datos
			if (db.trim().equals("si")) {
				try {
					saveDB.guardarDB(empleado);
					responseFiles.getBody().setDb("almacenado correctamente");
				} catch (Exception e) {
					responseFiles.getBody().setDb("error");
				}
			} else if (db.trim().equals("no")) {
				responseFiles.getBody().setDb("no aplica");
			}

//respondemos json
			if (responseFiles.getBody().getPdf() == "error" 
					|| responseFiles.getBody().getCsv() == "error"
					|| responseFiles.getBody().getXls() == "error" 
					|| responseFiles.getBody().getDb() == "error") {

				responseFiles.getBody().setCode(01);
				responseFiles.getBody().setMessage("error en alguno de los archivos");
				return responseFiles;
			} else {
				responseFiles.getBody().setCode(00);
				responseFiles.getBody().setMessage("archivos almacenados correctamente");
				return responseFiles;
			}

		}

	}

}
