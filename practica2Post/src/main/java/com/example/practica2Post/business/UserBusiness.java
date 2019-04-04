package com.example.practica2Post.business;

import java.io.FileOutputStream;
import java.util.Calendar;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.practica2Post.model.Response;
import com.example.practica2Post.model.Usuario;
import com.example.practica2Post.service.IUserService;
import com.example.practica2Post.tools.FileExcel;

@Service
public class UserBusiness implements IUserService {
	
	@Autowired FileExcel fileExcel;
	
	@Override
	public ResponseEntity<Response> nombreArchivoExcel(String fileName, Usuario usuario) throws Exception {
		Response respuesta = new Response();

		if(fileName.length() < 1) {
			ResponseEntity<Response> entity = new ResponseEntity<Response>(respuesta, HttpStatus.CONFLICT);
			entity.getBody().setMessage("nombre de archivo incorrecto");
			entity.getBody().setCode(409);
			return entity;
		}else {
			ResponseEntity<Response> entity = new ResponseEntity<Response>(respuesta, HttpStatus.OK);
			entity.getBody().setMessage("ok");
			entity.getBody().setCode(200);	
			fileExcel.crearExcel(fileName, usuario);
			return entity;	
		}
	}
}
