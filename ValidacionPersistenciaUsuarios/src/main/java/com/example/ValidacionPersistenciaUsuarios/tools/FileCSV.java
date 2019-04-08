package com.example.ValidacionPersistenciaUsuarios.tools;

import java.io.FileWriter;
import org.springframework.stereotype.Service;
import com.example.ValidacionPersistenciaUsuarios.modelo.ResponseSaveFiles;
import com.example.ValidacionPersistenciaUsuarios.modelo.Empleado;

@Service
public class FileCSV {

	ResponseSaveFiles response = new ResponseSaveFiles();

	public void crearCSV(String fecha, String filePath, Empleado usuario) throws Exception {

		// crea archivo vacio
		FileWriter fw = new FileWriter(filePath + "csv" + fecha + ".csv");

		fw.append("ESTE ARCHIVO CSV CONTIENE LOS DATOS DEL EMPLEADO: " + usuario.getNombre() + " " + usuario.getApellidos() + ", \n");
		// escribimos la primer parte del CSV
		fw.append("nombre: , " + usuario.getNombre() + " , \n");
		fw.append("apellidos: , " + usuario.getApellidos() + " , \n");
		fw.append("correo: , " + usuario.getCorreo() + " , \n");
		fw.append("edad: , " + usuario.getEdad() + " , \n");
		fw.append("fechaContratacion: , " + usuario.getFechaContratacion() + " , \n \n");

		fw.append("MARCADORES , \n");
		// crea los headers AccountEmails
		String[] headerAccountEmails = new String[] { "latitude", "longitude", "city", "description" };
		// escribimos los headers de AccountEmails
		for (int i = 0; i < headerAccountEmails.length; ++i) {
			String header = headerAccountEmails[i];
			fw.append(header + " , ");
		}
		fw.append("\n");
		// escribimos el contenido de AccountEmails
		for (int i = 0; i < usuario.getMarcadores().size(); ++i) {
			fw.append(usuario.getMarcadores().get(i).getLatitude() + " , ");
			fw.append(usuario.getMarcadores().get(i).getLongitude() + " , ");
			fw.append(usuario.getMarcadores().get(i).getCity() + " , ");
			fw.append(usuario.getMarcadores().get(i).getDescription() + " , \n");
		}
//cerramos el csv
		fw.flush();
		fw.close();

		return;
	}

}
