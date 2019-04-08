package com.example.ValidacionPersistenciaUsuarios.tools;

import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.springframework.stereotype.Service;
import com.example.ValidacionPersistenciaUsuarios.modelo.ResponseSaveFiles;
import com.example.ValidacionPersistenciaUsuarios.modelo.Empleado;

@Service
public class FileXLS {

	ResponseSaveFiles response = new ResponseSaveFiles();

	public void crearExcel(String fecha, String filePath, Empleado usuario) throws Exception {

// creacion del archivo excel
		HSSFWorkbook excel = new HSSFWorkbook();
		HSSFSheet hoja = excel.createSheet();
		excel.setSheetName(0, "empleado");

// creacion del style oscuro para los headers
		CellStyle headerStyle = excel.createCellStyle();
		Font font = excel.createFont();
		font.setBold(true);
		headerStyle.setFont(font);

		int intFila = 0;

// crea los headers del empleado
		String[] header = new String[] { "nombre", "apellidos", "correo", "edad", "fechaContratacion" };
// escribimos los headers empleado
		HSSFRow headerRow = hoja.createRow(intFila += 0);
		for (int i = 0; i < header.length; ++i) {
			String headers = header[i];
			HSSFCell cell = headerRow.createCell(i);
			cell.setCellStyle(headerStyle);
			cell.setCellValue(headers);
		}
// escribimos la parte plana del objeto empleado
		HSSFRow dataRow = hoja.createRow(intFila += 1);
		dataRow.createCell(0).setCellValue(usuario.getNombre());
		dataRow.createCell(1).setCellValue(usuario.getApellidos());
		dataRow.createCell(2).setCellValue(usuario.getCorreo());
		dataRow.createCell(3).setCellValue(usuario.getEdad());
		dataRow.createCell(4).setCellValue(usuario.getFechaContratacion());
		HSSFRow espacioRow = hoja.createRow(intFila += 1);

// crea los headers Marcador
		String[] headerMarcador = new String[] { "latitude", "longitude", "city", "description" };
// escribimos los headers de Marcador
		HSSFRow headerRow1 = hoja.createRow(intFila += 1);
		for (int i = 0; i < headerMarcador.length; ++i) {
			String headers = headerMarcador[i];
			HSSFCell cell = headerRow1.createCell(i);
			cell.setCellStyle(headerStyle);
			cell.setCellValue(headers);
		}
// escribimos las listas (Marcador)
		for (int i = 0; i < usuario.getMarcadores().size(); ++i) {
			dataRow = hoja.createRow(intFila += 1);
			dataRow.createCell(0).setCellValue(usuario.getMarcadores().get(i).getLatitude());
			dataRow.createCell(1).setCellValue(usuario.getMarcadores().get(i).getLongitude());
			dataRow.createCell(2).setCellValue(usuario.getMarcadores().get(i).getCity());
			dataRow.createCell(3).setCellValue(usuario.getMarcadores().get(i).getDescription());
		}

		FileOutputStream file = new FileOutputStream(filePath + "xls" + fecha + ".xls");
		excel.write(file);
		file.close();
		return;
	}
}
