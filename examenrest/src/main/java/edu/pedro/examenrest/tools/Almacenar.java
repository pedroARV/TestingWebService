package edu.pedro.examenrest.tools;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import org.springframework.stereotype.Service;
import edu.pedro.examenrest.model.Alumno;
import edu.pedro.examenrest.model.Response;

@Service
public class Almacenar {

	public void crear(String fecha, String filePath, String matricula, Response res, Alumno alumno) throws IOException {

		// crea archivo vacio
		FileWriter fw = new FileWriter(filePath + matricula + "-" + res.getSemestre() + "-" + fecha + ".parv");

		Calendar c = Calendar.getInstance();
		String year = Integer.toString(c.get(Calendar.YEAR));
		String mes = Integer.toString(c.get(Calendar.MONTH) + 1);
		String dia = Integer.toString(c.get(Calendar.DATE));
		String hora = Integer.toString(c.get(Calendar.HOUR));
		String minuto = Integer.toString(c.get(Calendar.MINUTE));
		String segundo = Integer.toString(c.get(Calendar.SECOND));
		String fecha2 = year + "-" + mes + "-" + dia + " " + hora + ":" + minuto + ":" + segundo;

		fw.append("matricula: " + res.getMatriclua() + ". \n");
		fw.append("nombre: " + res.getNombre() + ". \n");
		fw.append("califcaciones: " + alumno.getCalificaciones() + ". \n");
		fw.append("promedio: " + res.getCalificacion() + ". \n");
		fw.append("beca: " + res.getBeca() + ". \n");
		fw.append("status del alumno: " + res.getStatus_del_alumno() + ". \n");
		fw.append("semestre: " + res.getSemestre() + ". \n");
		fw.append(filePath + matricula + "-" + res.getSemestre() + "-" + fecha + ".parv" + ". \n");
		fw.append("fecha: " + fecha2 + ".");
		// cerramos el csv
		fw.flush();
		fw.close();

		return;

	}

}
