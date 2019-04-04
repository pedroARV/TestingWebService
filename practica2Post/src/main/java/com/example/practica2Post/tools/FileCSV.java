package com.example.practica2Post.tools;

import java.io.FileWriter;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.practica2Post.model.FileManager;
import com.example.practica2Post.model.Response;
import com.example.practica2Post.model.Usuario;

@Service
public class FileCSV {
	
	FileManager fileManager = new FileManager();
	@Value("${file.path}")
	String filePath;
	
	public ResponseEntity<Response> crearCSV(String fileName, Usuario usuario){
  		Response respuesta = new Response();
		
		//tomar dia, mes y año
		Calendar c = Calendar.getInstance();
		String dia = Integer.toString(c.get(Calendar.DATE));
		String mes = Integer.toString(c.get(Calendar.MONTH) + 1);
		String year = Integer.toString(c.get(Calendar.YEAR));		
		
				
		  
		 try {	
			 //crea archivo vacio 
			 FileWriter fw = new FileWriter(filePath + fileName + "-" + dia + "-" + mes + "-"  + year + ".csv");
			 
			 fw.append("accountId," + usuario.getAccountId() + "\n");
			 fw.append("accountStatus," + usuario.getAccountStatus() + "\n");
			 fw.append("alias," + usuario.getAlias() + "\n");
			 fw.append("competitorFlag," + usuario.getCompetitorFlag() + "\n");
			 fw.append("currencyCode," + usuario.getCurrencyCode() + "\n");
			 fw.append("expertise," + usuario.getExpertise() + "\n");
			 fw.append("perfilPago," + usuario.getPerfilPago() + "\n");
			 fw.append("mainPhoneNumber," + usuario.getMainPhoneNumber() + "\n");
			 fw.append("name," + usuario.getName() + "\n");
			 fw.append("partnerFlag," + usuario.getPartnerFlag() + "\n");
			 fw.append("priceList," + usuario.getPriceList() + "\n");
			 fw.append("priceListId," + usuario.getPriceListId() + "\n");
			 fw.append("primaryOrganization," + usuario.getPrimaryOrganization() + "\n");
			 fw.append("skipCreditCheck," + usuario.getSkipCreditCheck() + "\n");
			 fw.append("subscriberType," + usuario.getSubscriberType() + "\n");
			 fw.append("ttGiroNegocio," + usuario.getTtGiroNegocio() + "\n");
			 fw.append("type," + usuario.getType() + "\n");
			 fw.append("vatregistration," + usuario.isVatregistration() + "\n");
			 
			 for (int i = 0; i < usuario.getAccountEmails().size(); ++i) {
				 fw.append("correo," + usuario.getAccountEmails().get(i).getCorreo() + "\n");
				 fw.append("promo," + usuario.getAccountEmails().get(i).getPromo() + "\n");
				 fw.append("cvmotivo," + usuario.getAccountEmails().get(i).getCvmotivo() + "\n");
				 fw.append("cvnewsletter," + usuario.getAccountEmails().get(i).getCvnewsletter() + "\n");
				 fw.append("cvpaperless," + usuario.getAccountEmails().get(i).getCvpaperless() + "\n");
				 fw.append("cvemailId," + usuario.getAccountEmails().get(i).getCvemailId() + "\n");
				 fw.append("cvtcontacto," + usuario.getAccountEmails().get(i).getCvtcontacto() + "\n");
				 fw.append("ttupdated," + usuario.getAccountEmails().get(i).getTtupdated() + "\n");
				 fw.append("ttupdatedByLogin," + usuario.getAccountEmails().get(i).getTtupdatedByLogin() + "\n");
				 fw.append("ttupdatedFlg," + usuario.getAccountEmails().get(i).getTtupdatedFlg() + "\n");
			 }
			 
			 for (int i = 0; i < usuario.getAccountPhones().size(); ++i) {
				 fw.append("accountId," + usuario.getAccountPhones().get(i).getAccountId() + "\n");
				 fw.append("extensionNumber," + usuario.getAccountPhones().get(i).getExtensionNumber() + "\n");
				 fw.append("numeroTelefonico," + usuario.getAccountPhones().get(i).getNumeroTelefonico()+ "\n");
				 fw.append("sms," + usuario.getAccountPhones().get(i).getSms() + "\n");
				 fw.append("telefonoCompany," + usuario.getAccountPhones().get(i).getTelefonoCompany() + "\n");
				 fw.append("tipoTelefono," + usuario.getAccountPhones().get(i).getTipoTelefono() + "\n");
				 fw.append("ttupdated," + usuario.getAccountPhones().get(i).getTtupdated() + "\n");
				 fw.append("ttupdatedByLogin," + usuario.getAccountPhones().get(i).getTtupdatedByLogin() + "\n");
				 fw.append("ttupdatedFlg," + usuario.getAccountPhones().get(i).getTtupdatedFlg() + "\n");
			 }
			 
			 for (int i = 0; i < usuario.getBusinessAddresses().size(); ++i) {
				 fw.append("addressId," + usuario.getBusinessAddresses().get(i).getAddressId() + "\n");
				 fw.append("addressIntegrationId," + usuario.getBusinessAddresses().get(i).getAddressIntegrationId() + "\n");
				 fw.append("city," + usuario.getBusinessAddresses().get(i).getCity() + "\n");
				 fw.append("country," + usuario.getBusinessAddresses().get(i).getCountry() + "\n");
				 fw.append("county," + usuario.getBusinessAddresses().get(i).getCounty() + "\n");
				 fw.append("postalCode," + usuario.getBusinessAddresses().get(i).getPostalCode() + "\n");
				 fw.append("province," + usuario.getBusinessAddresses().get(i).getProvince() + "\n");
				 fw.append("state," + usuario.getBusinessAddresses().get(i).getState() + "\n");
				 fw.append("streetAddress," + usuario.getBusinessAddresses().get(i).getStreetAddress() + "\n");
				 fw.append("streetAddress2," + usuario.getBusinessAddresses().get(i).getStreetAddress2() + "\n");
			 }
			 
			 fw.flush();
			 fw.close();
			 
			 ResponseEntity<Response> entity = new ResponseEntity<Response>(respuesta, HttpStatus.OK);
			 entity.getBody().setMessage("archivo guardado correctamente");
			 entity.getBody().setCode(200);
			 return entity;
		 } catch (Exception e) {
			 ResponseEntity<Response> entityFileError = new ResponseEntity<Response>(respuesta, HttpStatus.INTERNAL_SERVER_ERROR);
			 entityFileError.getBody().setMessage("error al crear el archivo CSV");
			 entityFileError.getBody().setCode(409);
			 return entityFileError;
		 }
	}
}
