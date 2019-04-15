package edu.pedro.examenrest.tools;

public class Calificacion {

	public int promedio(String calificaciones) {
		int promedio = 0;
		String[] a = calificaciones.split(",");
		for (int i = 0; i < a.length; i++)
			promedio += Integer.parseInt(a[i]);
		return promedio /= a.length;
	}

	public String beca(int promedio, String beca) {
		if (beca.equals("si") && promedio >= 90)
			return "si";
		else if (promedio >= 93)
			return "si";
		else
			return "no";
	}

	public String status(int promedio, String beca) {
		if (promedio >= 90 && beca.equals("si"))
			return "Aprobado con beca";
		if (promedio >= 70 && promedio <= 89 && beca.equals("si"))
			return "Aprobado(Perdio su beca)";
		if (promedio >= 70 && promedio <= 92 && beca.equals("no"))
			return "Aprobado";
		if (promedio >= 93 && beca.equals("no"))
			return "Aprobado(Gano beca)";
		if (promedio < 70 && beca.equals("no"))
			return "Repite";
		if (promedio < 70 && beca.equals("si"))
			return "Repite(Perdio beca)";
		return "no coicide con los parametros";
	}

	public String semestre(int promedio, String semestre) {
		int intSemestre;
		if (promedio < 70)
			return semestre;
		else
			return Integer.toString(intSemestre = Integer.parseInt(semestre) + 1);
	}

}
