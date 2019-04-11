package com.example.ValidacionPersistenciaUsuarios.tools;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.ValidacionPersistenciaUsuarios.modelo.ResponseValidacion;
import com.example.ValidacionPersistenciaUsuarios.modelo.Empleado;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class Validacion {

	public ResponseEntity<ResponseValidacion> validar(String pdf, String csv, String xls, String db,
			Empleado empleado) {
		ResponseValidacion body = new ResponseValidacion();

		ResponseEntity<ResponseValidacion> error = new ResponseEntity<ResponseValidacion>(body, HttpStatus.CONFLICT);

		if (!pdf.trim().equals("si") && !pdf.trim().equals("no")) {
			error.getBody().setCode(10);
			error.getBody().setMessage("error en parametro: pdf");
			return error;
		} else if (pdf.isEmpty()) {
			error.getBody().setCode(10);
			error.getBody().setMessage("error en parametro: pdf");
			return error;
		}

		if (!csv.trim().equals("si") && !csv.trim().equals("no")) {
			error.getBody().setCode(11);
			error.getBody().setMessage("error en parametro: csv");
			return error;
		} else if (csv.isEmpty()) {
			error.getBody().setCode(11);
			error.getBody().setMessage("error en parametro: csv");
			return error;
		}

		if (!xls.trim().equals("si") && !xls.trim().equals("no")) {
			error.getBody().setCode(12);
			error.getBody().setMessage("error en parametro: xls");
			return error;
		} else if (xls.isEmpty()) {
			error.getBody().setCode(12);
			error.getBody().setMessage("error en parametro: xls");
			return error;
		}

		if (!db.trim().equals("si") && !db.trim().equals("no")) {
			error.getBody().setCode(13);
			error.getBody().setMessage("error en parametro: bd");
			return error;
		} else if (db.isEmpty()) {
			error.getBody().setCode(13);
			error.getBody().setMessage("error en parametro: bd");
			return error;
		}

		if (empleado.getNombre() == null 
				|| empleado.getNombre().isEmpty() 
				|| empleado.getNombre().length() < 5
				|| empleado.getNombre().length() > 40) {
			error.getBody().setCode(21);
			error.getBody().setMessage("error en parametro: nombre");
			return error;
		}

		if (empleado.getApellidos() == null 
				|| empleado.getApellidos().isEmpty() 
				|| empleado.getApellidos().length() < 5
				|| empleado.getApellidos().length() > 40) {
			error.getBody().setCode(22);
			error.getBody().setMessage("error en parametro: apellidos");
			return error;
		}
// validar correo
		String emailPattern = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@" + "[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
		Pattern pattern = Pattern.compile(emailPattern);
		if (empleado.getCorreo() == null || empleado.getCorreo().isEmpty()) {
			error.getBody().setCode(23);
			error.getBody().setMessage("error en parametro: correo");
			return error;
		}
		Matcher matcher = pattern.matcher(empleado.getCorreo());
		if (!matcher.matches()) {
			error.getBody().setCode(23);
			error.getBody().setMessage("error en parametro: correo");
			return error;
		}

		if (empleado.getEdad() < 18 || empleado.getEdad() > 70) {
			error.getBody().setCode(24);
			error.getBody().setMessage("error en parametro: edad");
			return error;
		}
// validamos fecha de contratacion
		if (empleado.getFechaContratacion() == null || empleado.getFechaContratacion().isEmpty()) {
			error.getBody().setCode(25);
			error.getBody().setMessage("error en parametro: fechaContratacion");
			return error;
		}
		String fechaPattern = "([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))";
		Pattern patternFecha = Pattern.compile(fechaPattern);
		Matcher matcherFecha = patternFecha.matcher(empleado.getFechaContratacion());
		if (!matcherFecha.matches()) {
			error.getBody().setCode(23);
			error.getBody().setMessage("error en parametro: fechaContratacion");
			return error;
		}
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int mes = c.get(Calendar.MONTH) + 1;
		int dia = c.get(Calendar.DATE);
		String[] fecha = empleado.getFechaContratacion().split("-");
		int year0 = Integer.parseInt(fecha[0]);
		int mes0 = Integer.parseInt(fecha[1]);
		int dia0 = Integer.parseInt(fecha[2]);
		if (year0 + 10 < year || year0 > year) {
			error.getBody().setCode(25);
			error.getBody().setMessage("error en parametro: fechaContratacion");
			return error;
		} else if (year0 == year && mes0 >= mes && dia0 > dia) {
			error.getBody().setCode(25);
			error.getBody().setMessage("error en parametro: fechaContratacion");
			return error;
		}
//validamos lista		
		for (int i = 0; i < empleado.getMarcadores().size(); ++i) {
			
			if (empleado.getMarcadores().get(i).getLatitude() == null) {
				String codeLatitude = "00" + Integer.toString(i + 1);
				int code = Integer.parseInt(codeLatitude);
				error.getBody().setCode(code);
				error.getBody().setMessage("error en parametro: latitude");
				return error;
			}
			
			if (empleado.getMarcadores().get(i).getLongitude() == null) {
				String codeLongitude = "01" + Integer.toString(i + 1);
				int code = Integer.parseInt(codeLongitude);
				error.getBody().setCode(code);
				error.getBody().setMessage("error en parametro: longitude");
				return error;
			}
			
			if (empleado.getMarcadores().get(i).getCity() == null 
					|| empleado.getMarcadores().get(i).getCity().isEmpty()
					|| empleado.getMarcadores().get(i).getCity().length() < 3
					|| empleado.getMarcadores().get(i).getCity().length() > 20) {
				String codeCity = "02" + Integer.toString(i + 1);
				int code = Integer.parseInt(codeCity);
				error.getBody().setCode(code);
				error.getBody().setMessage("error en parametro: city");
				return error;
			}
			
			if (empleado.getMarcadores().get(i).getDescription() == null
					|| empleado.getMarcadores().get(i).getDescription().isEmpty()
					|| empleado.getMarcadores().get(i).getDescription().length() < 3
					|| empleado.getMarcadores().get(i).getDescription().length() > 120) {
				String codeDescription = "03" + Integer.toString(i + 1);
				int code = Integer.parseInt(codeDescription);
				error.getBody().setCode(code);
				error.getBody().setMessage("error en parametro: description");
				return error;
			}
		}
				
//return sin errores
		ResponseEntity<ResponseValidacion> ok = new ResponseEntity<ResponseValidacion>(body, HttpStatus.OK);
		ok.getBody().setCode(00);
		ok.getBody().setMessage("ok");
		return ok;
	}

}
