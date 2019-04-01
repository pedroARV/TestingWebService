package com.testing.Testing.controller;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testing.Testing.model.Usuario;

import org.springframework.ui.Model;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model) {
		return "home";		
	}
	
	@RequestMapping("/home")
	public String home1(Model model) {
		return "home";
	}
	
	@PostMapping("/usuarios")
	public ResponseEntity<Usuario> update(@RequestBody Usuario usuario) {		

		String nombre = usuario.getNombre();
		int edad = usuario.getEdad();
		String sexo = usuario .getSexo();
		
		//remplazo interactivo de los espacios 
		ArrayList<String> nombreL = new ArrayList<String>(Arrays.asList(nombre.split(" ")));
		String resultado ="";
		boolean s = true;
		while(s) {
		if(nombreL.size() < 2 ) {
			if(nombreL.size() == 0) {
				s = false;
			}else {
				resultado = resultado + nombreL.get(0);
				s= false;
			}			
		}else {
			String p1 = nombreL.get(0);
			String p2 = nombreL.get(1);
			nombreL.remove(p1);
			nombreL.remove(p2);
			resultado = resultado + p1 + edad + p2 + sexo;
		}
		}
		nombre = resultado;
		
		
		//factorial de edad
		int factorial = 1;
	    while ( edad!=0 && edad>=0) {
	        factorial = factorial * edad;
	        edad--;
	      }
	    edad = factorial;
	    
	    //polindromo de sexo
	    int des = sexo.length()-1;
	    String polindromo = "";
	    char letra;
	    while (des>=0){
	    	letra = sexo.charAt(des);
    		des--; 
    		polindromo = polindromo + letra;
	    }
	    sexo = sexo + polindromo;
	    
	    
	    //se guardan los valores en el objeto a devolver
	    usuario.setEdad(edad);
	    usuario.setSexo(sexo);
	    usuario.setNombre(nombre);
	    
	    
		
		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
	}
}
