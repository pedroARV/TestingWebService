package edu.pedro.examenrest.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import edu.pedro.examenrest.model.Alumno;
import edu.pedro.examenrest.model.Response;
import edu.pedro.examenrest.model.ResponseCode;
import edu.pedro.examenrest.service.ICalificacionesService;
import edu.pedro.examenrest.tools.Almacenar;
import edu.pedro.examenrest.tools.Calificacion;
import edu.pedro.examenrest.tools.Fecha;
import edu.pedro.examenrest.tools.Validacion;

@Service
public class CalificacionesBusiness implements ICalificacionesService {

	@Autowired
	Validacion validacion;
	@Autowired
	Almacenar almacenar;

	Calificacion cali = new Calificacion();

	@Value("${file.path}")
	String filePath;

	@Override
	public ResponseEntity<ResponseCode> altaCalificaciones(String matricula, Alumno alumno) {

		ResponseCode response = validacion.validar(matricula, alumno);
		if (response.getCode() != 00) {
			ResponseEntity<ResponseCode> error = new ResponseEntity<ResponseCode>(response, HttpStatus.CONFLICT);
			return error;
		} else {
			response.setMessage("operacion exitosa");
		}

		Response res = new Response();

		res.setMatriclua(matricula + "-" + alumno.getSemestre());
		res.setNombre(alumno.getNombre() + " " + alumno.getApellidos());
		res.setCalificacion(cali.promedio(alumno.getCalificaciones()));
		res.setSexo(alumno.getSexo());
		res.setBeca(cali.beca(res.getCalificacion(), alumno.getBeca()));
		res.setStatus_del_alumno(cali.status(res.getCalificacion(), alumno.getBeca()));
		res.setSemestre(cali.semestre(res.getCalificacion(), alumno.getSemestre()));

		if (alumno.getAlmacenar().equals("si")) {
			try {
				String fecha = Fecha.fechaActual();
				almacenar.crear(fecha, filePath, matricula, res, alumno);
				res.setAlmacenar("si");
				res.setRuta(filePath + matricula + "-" + res.getSemestre() + "-" + fecha + ".parv");
			} catch (Exception e) {
				res.setAlmacenar("error");
				res.setRuta("error");
				response.setMessage("error");
			}
		} else if (alumno.getAlmacenar().equals("no")) {
			res.setAlmacenar("no aplica");
			res.setRuta("no aplica");
		}

		response.setResponse(res);

		ResponseEntity<ResponseCode> ok = new ResponseEntity<ResponseCode>(response, HttpStatus.OK);
		return ok;
	}

}
