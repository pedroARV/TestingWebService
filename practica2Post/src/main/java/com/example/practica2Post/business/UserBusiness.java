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
		excel.setSheetName(0, "usuario");
		
		//creacion del style oscuro para los headers
        CellStyle headerStyle = excel.createCellStyle();
        Font font = excel.createFont();
        font.setBold(true);
        headerStyle.setFont(font);
        
		int intFila = 0;
		
		
		
        //crea los headers User
        String[] headerUser = new String[]{
                "accountId",
                "accountStatus",
                "alias",
                "competitorFlag",
                "currencyCode",
                "expertise",
                "perfilPago",
                "mainPhoneNumber",
                "name",
                "partnerFlag",
                "priceList",
                "priceListId",
                "primaryOrganization",
                "skipCreditCheck",
                "subscriberType",
                "ttGiroNegocio",
                "type",
                "vatregistration"
        };
        //escribimos los headers User
        HSSFRow headerRow = hoja.createRow(intFila += 0);
        for (int i = 0; i < headerUser.length; ++i) {
            String header = headerUser[i];
            HSSFCell cell = headerRow.createCell(i);
            cell.setCellStyle(headerStyle);
            cell.setCellValue(header);
        }
	    //escribimos la parte plana del objeto User
		HSSFRow dataRow = hoja.createRow(intFila += 1);		
		dataRow.createCell(0).setCellValue(usuario.getAccountId());
		dataRow.createCell(1).setCellValue(usuario.getAccountStatus());
		dataRow.createCell(2).setCellValue(usuario.getAlias());
		dataRow.createCell(3).setCellValue(usuario.getCompetitorFlag());
		dataRow.createCell(4).setCellValue(usuario.getCurrencyCode());
		dataRow.createCell(5).setCellValue(usuario.getExpertise());
		dataRow.createCell(6).setCellValue(usuario.getPerfilPago());
		dataRow.createCell(7).setCellValue(usuario.getMainPhoneNumber());
		dataRow.createCell(8).setCellValue(usuario.getName());
		dataRow.createCell(9).setCellValue(usuario.getPartnerFlag());
		dataRow.createCell(10).setCellValue(usuario.getPriceList());
		dataRow.createCell(11).setCellValue(usuario.getPriceListId());
		dataRow.createCell(12).setCellValue(usuario.getPrimaryOrganization());
		dataRow.createCell(13).setCellValue(usuario.getSkipCreditCheck());
		dataRow.createCell(14).setCellValue(usuario.getSubscriberType());
		dataRow.createCell(15).setCellValue(usuario.getTtGiroNegocio());
		dataRow.createCell(16).setCellValue(usuario.getType());
		dataRow.createCell(17).setCellValue(usuario.isVatregistration());
        HSSFRow espacioRow = hoja.createRow(intFila += 1);
        
		
		
		//crea los headers AccountEmails
        String[] headerAccountEmails = new String[]{
                "correo",
                "promo",
                "cvmotivo",
                "cvnewsletter",
                "cvpaperless",
                "cvemailId",
                "cvtcontacto",
                "ttupdated",
                "ttupdatedByLogin",
                "ttupdatedFlg"
        };
        //escribimos los headers de AccountEmails
        HSSFRow headerRow1 = hoja.createRow(intFila += 1);
        for (int i = 0; i < headerAccountEmails.length; ++i) {
            String header = headerAccountEmails[i];
            HSSFCell cell = headerRow1.createCell(i);
            cell.setCellStyle(headerStyle);
            cell.setCellValue(header);
        }
        //escribimos las listas (accountEmails)
        for (int i = 0; i < usuario.getAccountEmails().size(); ++i) {
        	dataRow = hoja.createRow(intFila += 1);
        	dataRow.createCell(0).setCellValue(usuario.getAccountEmails().get(i).getCorreo());
        	dataRow.createCell(1).setCellValue(usuario.getAccountEmails().get(i).getPromo());	
        	dataRow.createCell(2).setCellValue(usuario.getAccountEmails().get(i).getCvmotivo());	
        	dataRow.createCell(3).setCellValue(usuario.getAccountEmails().get(i).getCvnewsletter());	
        	dataRow.createCell(4).setCellValue(usuario.getAccountEmails().get(i).getCvpaperless());	
        	dataRow.createCell(5).setCellValue(usuario.getAccountEmails().get(i).getCvemailId());	
        	dataRow.createCell(6).setCellValue(usuario.getAccountEmails().get(i).getCvtcontacto());	
        	dataRow.createCell(7).setCellValue(usuario.getAccountEmails().get(i).getTtupdated());	
        	dataRow.createCell(8).setCellValue(usuario.getAccountEmails().get(i).getTtupdatedByLogin());	
        	dataRow.createCell(9).setCellValue(usuario.getAccountEmails().get(i).getTtupdatedFlg());	
        }
        HSSFRow espacioRow1 = hoja.createRow(intFila += 1);
        
        
        
		//crea los headers AccountPhones
        String[] headerAccountPhones = new String[]{
                "accountId",
                "extensionNumber",
                "numeroTelefonico",
                "sms",
                "telefonoCompany",
                "tipoTelefono",
                "ttupdated",
                "ttupdatedByLogin",
                "ttupdatedFlg"
        };
        //escribimos los headers de AccountPhones
        HSSFRow headerRow2 = hoja.createRow(intFila += 1);
        for (int i = 0; i < headerAccountPhones.length; ++i) {
            String header = headerAccountPhones[i];
            HSSFCell cell = headerRow2.createCell(i);
            cell.setCellStyle(headerStyle);
            cell.setCellValue(header);
        }
        //escribimos las listas (AccountPhones)
        for (int i = 0; i < usuario.getAccountPhones().size(); ++i) {
        	dataRow = hoja.createRow(intFila += 1);
        	dataRow.createCell(0).setCellValue(usuario.getAccountPhones().get(i).getAccountId());	
        	dataRow.createCell(1).setCellValue(usuario.getAccountPhones().get(i).getExtensionNumber());	
        	dataRow.createCell(2).setCellValue(usuario.getAccountPhones().get(i).getNumeroTelefonico());	
        	dataRow.createCell(3).setCellValue(usuario.getAccountPhones().get(i).getSms());	
        	dataRow.createCell(4).setCellValue(usuario.getAccountPhones().get(i).getTelefonoCompany());	
        	dataRow.createCell(5).setCellValue(usuario.getAccountPhones().get(i).getTipoTelefono());	
        	dataRow.createCell(6).setCellValue(usuario.getAccountPhones().get(i).getTtupdated());	
        	dataRow.createCell(7).setCellValue(usuario.getAccountPhones().get(i).getTtupdatedByLogin());	
        	dataRow.createCell(8).setCellValue(usuario.getAccountPhones().get(i).getTtupdatedFlg());	
        }
        HSSFRow espacioRow2 = hoja.createRow(intFila += 1);
        
        
        
        //crea los headers BusinessAddresses
        String[] headerBusinessAddresses= new String[]{
                "addressId",
                "addressIntegrationId",
                "city",
                "country",
                "county",
                "postalCode",
                "province",
                "state",
                "streetAddress",
                "streetAddress2"
        };
        //escribimos los headers de BusinessAddresses
        HSSFRow headerRow3 = hoja.createRow(intFila += 1);
        for (int i = 0; i < headerBusinessAddresses.length; ++i) {
            String header = headerBusinessAddresses[i];
            HSSFCell cell = headerRow3.createCell(i);
            cell.setCellStyle(headerStyle);
            cell.setCellValue(header);
        }
        //escribimos las listas (BusinessAddresses)
        for (int i = 0; i < usuario.getBusinessAddresses().size(); ++i) {
        	dataRow = hoja.createRow(intFila += 1);
        	dataRow.createCell(0).setCellValue(usuario.getBusinessAddresses().get(i).getAddressId());
        	dataRow.createCell(1).setCellValue(usuario.getBusinessAddresses().get(i).getAddressIntegrationId());
        	dataRow.createCell(2).setCellValue(usuario.getBusinessAddresses().get(i).getCity());
        	dataRow.createCell(3).setCellValue(usuario.getBusinessAddresses().get(i).getCountry());
        	dataRow.createCell(4).setCellValue(usuario.getBusinessAddresses().get(i).getCounty());
        	dataRow.createCell(5).setCellValue(usuario.getBusinessAddresses().get(i).getPostalCode());
        	dataRow.createCell(6).setCellValue(usuario.getBusinessAddresses().get(i).getProvince());
        	dataRow.createCell(7).setCellValue(usuario.getBusinessAddresses().get(i).getState());
        	dataRow.createCell(8).setCellValue(usuario.getBusinessAddresses().get(i).getStreetAddress());
        	dataRow.createCell(9).setCellValue(usuario.getBusinessAddresses().get(i).getStreetAddress2());
        }
        HSSFRow espacioRow3 = hoja.createRow(intFila += 1);
        
        
            
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
