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

	public ResponseEntity<ResponseValidacion> validar(String csv, String xls, String pdf, String db,
			Empleado usuario) {
		ResponseValidacion body = new ResponseValidacion();

		ResponseEntity<ResponseValidacion> error = new ResponseEntity<ResponseValidacion>(body,
				HttpStatus.INTERNAL_SERVER_ERROR);

		if (!pdf.trim().equals("si") && !pdf.trim().equals("no") && pdf.isEmpty()) {
			error.getBody().setCode(10);
			error.getBody().setMessage("error en parametro: pdf");
			return error;
		}

		if (!csv.trim().equals("si") && !csv.trim().equals("no") && csv.isEmpty()) {
			error.getBody().setCode(11);
			error.getBody().setMessage("error en parametro: csv");
			return error;
		}

		if (!xls.trim().equals("si") && !xls.trim().equals("no") && xls.isEmpty()) {
			error.getBody().setCode(12);
			error.getBody().setMessage("error en parametro: xls");
			return error;
		}
		if (!db.trim().equals("si") && !db.trim().equals("no") && db.isEmpty()) {
			error.getBody().setCode(13);
			error.getBody().setMessage("error en parametro: bd");
			return error;
		}
		if (usuario.getNombre().isEmpty() || usuario.getNombre().length() < 5 || usuario.getNombre().length() > 40) {
			error.getBody().setCode(21);
			error.getBody().setMessage("error en parametro: nombre");
			return error;
		}
		if (usuario.getApellidos().isEmpty() || usuario.getApellidos().length() < 5
				|| usuario.getApellidos().length() > 40) {
			error.getBody().setCode(22);
			error.getBody().setMessage("error en parametro: apellidos");
			return error;
		}
// validar correo
		String emailPattern = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@" + "[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
		Pattern pattern = Pattern.compile(emailPattern);
		Matcher matcher = pattern.matcher(usuario.getCorreo());
		if (usuario.getCorreo().isEmpty() || !matcher.matches()) {
			error.getBody().setCode(23);
			error.getBody().setMessage("error en parametro: correo");
			return error;
		}
		if (usuario.getEdad() < 18 || usuario.getEdad() > 70) {
			error.getBody().setCode(24);
			error.getBody().setMessage("error en parametro: edad");
			return error;
		}
// validamos fecha de contratacion
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int mes = c.get(Calendar.MONTH) + 1;
		int dia = c.get(Calendar.DATE);
		String fecha[] = usuario.getFechaContratacion().split("-");
		int year0 = Integer.parseInt(fecha[0]);
		int mes0 = Integer.parseInt(fecha[1]);
		int dia0 = Integer.parseInt(fecha[2]);

		if (usuario.getFechaContratacion().isEmpty() || year0 + 10 < year || year0 > year) {
			error.getBody().setCode(25);
			error.getBody().setMessage("error en parametro: fechaContratacion");
			return error;

		} else if (year0 == year && mes0 >= mes && dia0 > dia) {
			error.getBody().setCode(25);
			error.getBody().setMessage("error en parametro: fechaContratacion");
			return error;
		}
//validamos lista		
		for (int i = 0; i < usuario.getMarcadores().size(); ++i) {
			if (usuario.getMarcadores().get(i).getLatitude() == null) {
				String codeLatitude = "00" + Integer.toString(i);
				int code = Integer.parseInt(codeLatitude);
				error.getBody().setCode(code);
				error.getBody().setMessage("error en parametro: latitude");
				return error;
			}
			if (usuario.getMarcadores().get(i).getLongitude() == null) {
				String codeLongitude = "01" + Integer.toString(i);
				int code = Integer.parseInt(codeLongitude);
				error.getBody().setCode(code);
				error.getBody().setMessage("error en parametro: longitude");
				return error;
			}
			if (usuario.getMarcadores().get(i).getCity().isEmpty()
					|| usuario.getMarcadores().get(i).getCity().length() < 3
					|| usuario.getMarcadores().get(i).getCity().length() > 20) {
				String codeCity = "02" + Integer.toString(i);
				int code = Integer.parseInt(codeCity);
				error.getBody().setCode(code);
				error.getBody().setMessage("error en parametro: city");
				return error;
			}
			if (usuario.getMarcadores().get(i).getDescription().isEmpty()
					|| usuario.getMarcadores().get(i).getDescription().length() < 3
					|| usuario.getMarcadores().get(i).getDescription().length() > 120) {
				String codeDescription = "03" + Integer.toString(i);
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
