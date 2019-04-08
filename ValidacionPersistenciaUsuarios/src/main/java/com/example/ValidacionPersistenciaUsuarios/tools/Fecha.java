package com.example.ValidacionPersistenciaUsuarios.tools;

import java.util.Calendar;

public class Fecha {

	public static String fechaActual() {
		Calendar c = Calendar.getInstance();
		String year = Integer.toString(c.get(Calendar.YEAR));
		String mes = Integer.toString(c.get(Calendar.MONTH) + 1);
		String dia = Integer.toString(c.get(Calendar.DATE));
		String hora = Integer.toString(c.get(Calendar.HOUR));
		String minuto = Integer.toString(c.get(Calendar.MINUTE));
		String segundo = Integer.toString(c.get(Calendar.SECOND));
		String fecha = year + mes + dia + hora + minuto + segundo;
		return fecha;
	}

}
