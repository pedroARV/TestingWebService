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

	public ResponseEntity<Response> crearCSV(String fileName, Usuario usuario) {
		Response respuesta = new Response();

		// tomar dia, mes y año
		Calendar c = Calendar.getInstance();
		String dia = Integer.toString(c.get(Calendar.DATE));
		String mes = Integer.toString(c.get(Calendar.MONTH) + 1);
		String year = Integer.toString(c.get(Calendar.YEAR));

		try {
			// crea archivo vacio
			FileWriter fw = new FileWriter(filePath + fileName + "-" + dia + "-" + mes + "-" + year + ".csv");

			fw.append("ESTE ARCHIVO CSV CONTIENE LOS DATOS PERSONALES DE UN SOLO USUARIO, \n");
			// escribimos la primer parte del CSV
			fw.append("accountId: , " + usuario.getAccountId() + " , \n");
			fw.append("accountStatus: , " + usuario.getAccountStatus() + " , \n");
			fw.append("alias: , " + usuario.getAlias() + " , \n");
			fw.append("competitorFlag: , " + usuario.getCompetitorFlag() + " , \n");
			fw.append("currencyCode: , " + usuario.getCurrencyCode() + " , \n");
			fw.append("expertise: , " + usuario.getExpertise() + " , \n");
			fw.append("perfilPago: , " + usuario.getPerfilPago() + " , \n");
			fw.append("mainPhoneNumber: , " + usuario.getMainPhoneNumber() + " , \n");
			fw.append("name: , " + usuario.getName() + " , \n");
			fw.append("partnerFlag: , " + usuario.getPartnerFlag() + " , \n");
			fw.append("priceList: , " + usuario.getPriceList() + " , \n");
			fw.append("priceListId: , " + usuario.getPriceListId() + " , \n");
			fw.append("primaryOrganization: , " + usuario.getPrimaryOrganization() + " , \n");
			fw.append("skipCreditCheck: , " + usuario.getSkipCreditCheck() + " , \n");
			fw.append("subscriberType: , " + usuario.getSubscriberType() + " , \n");
			fw.append("ttGiroNegocio: , " + usuario.getTtGiroNegocio() + " , \n");
			fw.append("type: , " + usuario.getType() + " , \n");
			fw.append("vatregistration , " + usuario.isVatregistration() + " , \n \n");

			fw.append("ESTA ES UNA LISTA DE CUENTAS-EMAILS QUE TIENE EL USUARIO, \n");
			// crea los headers AccountEmails
			String[] headerAccountEmails = new String[] { "correo", "promo", "cvmotivo", "cvnewsletter", "cvpaperless",
					"cvemailId", "cvtcontacto", "ttupdated", "ttupdatedByLogin", "ttupdatedFlg" };
			// escribimos los headers de AccountEmails
			for (int i = 0; i < headerAccountEmails.length; ++i) {
				String header = headerAccountEmails[i];
				fw.append(header + " , ");
			}
			fw.append("\n");
			// escribimos el contenido de AccountEmails
			for (int i = 0; i < usuario.getAccountEmails().size(); ++i) {
				fw.append(usuario.getAccountEmails().get(i).getCorreo() + " , ");
				fw.append(usuario.getAccountEmails().get(i).getPromo() + " , ");
				fw.append(usuario.getAccountEmails().get(i).getCvmotivo() + " , ");
				fw.append(usuario.getAccountEmails().get(i).getCvnewsletter() + " , ");
				fw.append(usuario.getAccountEmails().get(i).getCvpaperless() + " , ");
				fw.append(usuario.getAccountEmails().get(i).getCvemailId() + " , ");
				fw.append(usuario.getAccountEmails().get(i).getCvtcontacto() + " , ");
				fw.append(usuario.getAccountEmails().get(i).getTtupdated() + " , ");
				fw.append(usuario.getAccountEmails().get(i).getTtupdatedByLogin() + " , ");
				fw.append(usuario.getAccountEmails().get(i).getTtupdatedFlg() + " , \n");
			}
			fw.append("\n");

			fw.append("ESTA ES UNA LISTA DE CUENTAS DE CELULARES QUE TIENE EL USUARIO, \n");
			// crea los headers AccountPhones
			String[] headerAccountPhones = new String[] { "accountId", "extensionNumber", "numeroTelefonico", "sms",
					"telefonoCompany", "tipoTelefono", "ttupdated", "ttupdatedByLogin", "ttupdatedFlg" };
			// escribimos los headers de AccountPhones
			for (int i = 0; i < headerAccountPhones.length; ++i) {
				String header = headerAccountPhones[i];
				fw.append(header + " , ");
			}
			fw.append("\n");
			// escribimos el contenido de AccountPhones
			for (int i = 0; i < usuario.getAccountPhones().size(); ++i) {
				fw.append(usuario.getAccountPhones().get(i).getAccountId() + " , ");
				fw.append(usuario.getAccountPhones().get(i).getExtensionNumber() + " , ");
				fw.append(usuario.getAccountPhones().get(i).getNumeroTelefonico() + " , ");
				fw.append(usuario.getAccountPhones().get(i).getSms() + " , ");
				fw.append(usuario.getAccountPhones().get(i).getTelefonoCompany() + " , ");
				fw.append(usuario.getAccountPhones().get(i).getTipoTelefono() + " , ");
				fw.append(usuario.getAccountPhones().get(i).getTtupdated() + " , ");
				fw.append(usuario.getAccountPhones().get(i).getTtupdatedByLogin() + " , ");
				fw.append(usuario.getAccountPhones().get(i).getTtupdatedFlg() + " , \n");
			}
			fw.append("\n");

			fw.append("ESTA ES UNA LISTA DE LAS DIRECCIONES QUE SE HAN REGISTRADO A ESTE USUARIO, \n");
			// crea los headers BusinessAddresses
			String[] headerBusinessAddresses = new String[] { "addressId", "addressIntegrationId", "city", "country",
					"county", "postalCode", "province", "state", "streetAddress", "streetAddress2" };
			// escribimos los headers de BusinessAddresses
			for (int i = 0; i < headerBusinessAddresses.length; ++i) {
				String header = headerBusinessAddresses[i];
				fw.append(header + " , ");
			}
			fw.append("\n");
			// escribimos el contenido de BusinessAddresses
			for (int i = 0; i < usuario.getBusinessAddresses().size(); ++i) {
				fw.append(usuario.getBusinessAddresses().get(i).getAddressId() + " , ");
				fw.append(usuario.getBusinessAddresses().get(i).getAddressIntegrationId() + " , ");
				fw.append(usuario.getBusinessAddresses().get(i).getCity() + " , ");
				fw.append(usuario.getBusinessAddresses().get(i).getCountry() + " , ");
				fw.append(usuario.getBusinessAddresses().get(i).getCounty() + " , ");
				fw.append(usuario.getBusinessAddresses().get(i).getPostalCode() + " , ");
				fw.append(usuario.getBusinessAddresses().get(i).getProvince() + " , ");
				fw.append(usuario.getBusinessAddresses().get(i).getState() + " , ");
				fw.append(usuario.getBusinessAddresses().get(i).getStreetAddress() + " , ");
				fw.append(usuario.getBusinessAddresses().get(i).getStreetAddress2() + " , \n");
			}

			fw.flush();
			fw.close();

			ResponseEntity<Response> entity = new ResponseEntity<Response>(respuesta, HttpStatus.OK);
			entity.getBody().setMessage("archivo guardado correctamente");
			entity.getBody().setCode(200);
			return entity;
		} catch (Exception e) {
			ResponseEntity<Response> entityFileError = new ResponseEntity<Response>(respuesta,
					HttpStatus.INTERNAL_SERVER_ERROR);
			entityFileError.getBody().setMessage("error al crear el archivo CSV");
			entityFileError.getBody().setCode(409);
			return entityFileError;
		}
	}
}
