package com.example.soapEjercicioWsdlImport.config;

import javax.xml.namespace.QName;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.soapEjercicioWsdlImport.mx.izzi.service.pkm_querymanagement.PKMQueryManagementBindingQSService;
import com.example.soapEjercicioWsdlImport.mx.izzi.service.pkm_querymanagement.PKMQueryManagementPortType;

@Configuration
public class Config {

	@Bean
	public PKMQueryManagementPortType port() {

		PKMQueryManagementBindingQSService service = new PKMQueryManagementBindingQSService();
		QName portName = new QName("http://www.izzi.mx/Service/PKM_QueryManagement",
				"PKM_QueryManagementBindingQSPort");
		PKMQueryManagementPortType port = service.getPort(portName, PKMQueryManagementPortType.class);

		return port;
	}

}
