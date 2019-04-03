package com.example.practica2Post.business;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.practica2Post.model.Response;
import com.example.practica2Post.model.Usuario;
import com.example.practica2Post.service.IUserService;

@Service
public class UserBusiness implements IUserService {
	
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
			crearExcel(fileName, usuario);
			return entity;	
		}
	}
		
	

	private void crearExcel(String fileName, Usuario usuario) throws Exception {
		
		//creacion del archivo excel
		HSSFWorkbook excel = new HSSFWorkbook();
		HSSFSheet hoja = excel.createSheet();
		//creacion de las hojas del archivo excel
		excel.setSheetName(0, "usuario");
		HSSFSheet hoja1 = excel.createSheet();
		excel.setSheetName(1, "Emails");
		HSSFSheet hoja2 = excel.createSheet();
		excel.setSheetName(2, "Phones");
		HSSFSheet hoja3 = excel.createSheet();
		excel.setSheetName(3, "Addresses");

		
	    //escribe las columnas de la hoja usuario
		HSSFRow dataRow = hoja.createRow(0);		
		dataRow.createCell(0).setCellValue(usuario.getAccountId());
		dataRow.createCell(1).setCellValue(usuario.getAccountStatus());
		dataRow.createCell(2).setCellValue(usuario.getAlias());
		dataRow.createCell(3).setCellValue(usuario.getCompetitorFlag());
		dataRow.createCell(4).setCellValue(usuario.getCurrencyCode());
		dataRow.createCell(5).setCellValue(usuario.getExpertise());
		dataRow.createCell(6).setCellValue(usuario.getAccountEmails().size()); //meto el tamaño de la lista
		dataRow.createCell(7).setCellValue(usuario.getAccountPhones().size()); //meto el tamaño de la lista
		dataRow.createCell(8).setCellValue(usuario.getBusinessAddresses().size()); //meto el tamaño de la lista
		dataRow.createCell(9).setCellValue(usuario.getPerfilPago());
		dataRow.createCell(10).setCellValue(usuario.getMainPhoneNumber());
		dataRow.createCell(11).setCellValue(usuario.getName());
		dataRow.createCell(12).setCellValue(usuario.getPartnerFlag());
		dataRow.createCell(13).setCellValue(usuario.getPriceList());
		dataRow.createCell(14).setCellValue(usuario.getPriceListId());
		dataRow.createCell(15).setCellValue(usuario.getPrimaryOrganization());
		dataRow.createCell(16).setCellValue(usuario.getSkipCreditCheck());
		dataRow.createCell(17).setCellValue(usuario.getSubscriberType());
		dataRow.createCell(18).setCellValue(usuario.getTtGiroNegocio());
		dataRow.createCell(19).setCellValue(usuario.getType());
		dataRow.createCell(20).setCellValue(usuario.isVatregistration());
		

	    //escribe las columnas de la hoja1 (Emails)...		
		HSSFRow dataRow1 = hoja1.createRow(0);		
	    //escribe las columnas de la hoja1 (Emails)...		
		HSSFRow dataRow2 = hoja2.createRow(0);		
	    //escribe las columnas de la hoja1 (Emails)...		
		HSSFRow dataRow3 = hoja3.createRow(0);		

	        
	        
		//tomar dia, mes y año
		Calendar c = Calendar.getInstance();
		String dia = Integer.toString(c.get(Calendar.DATE));
		String mes = Integer.toString(c.get(Calendar.MONTH) + 1);
		String año = Integer.toString(c.get(Calendar.YEAR));
	    
		

		//creamos el path del excel y le ponemos nombre
		FileOutputStream file = new FileOutputStream("/home/pedro/Documentos/pedro/" + fileName + "-" + dia + "-" + mes + "-" + año + ".xls");
		
		//escribimos dentro el excel
		excel.write(file);
		file.close();
	}

}
