package edu.pedro.examenrest.tools;

import org.springframework.stereotype.Service;
import edu.pedro.examenrest.model.Alumno;
import edu.pedro.examenrest.model.ResponseCode;

@Service
public class Validacion {

	public ResponseCode validar(String matricula, Alumno alumno) {
		ResponseCode r = new ResponseCode();

		if (matricula == null || matricula.length() != 6 || contiene(matricula) || matricula.contains(" ")) {
			r.setCode(1);
			r.setMessage("error en: matricula");
			return r;
		}
		if (alumno.getNombre() == null || alumno.getNombre().isEmpty() || alumno.getNombre().length() > 20
				|| contiene(alumno.getNombre())) {
			r.setCode(2);
			r.setMessage("error en: nombre");
			return r;
		}
		if (alumno.getApellidos() == null || alumno.getApellidos().isEmpty() || alumno.getApellidos().length() > 30
				|| contiene(alumno.getApellidos())) {
			r.setCode(3);
			r.setMessage("error en: apellidos");
			return r;
		}
//Calificaciones		
		if (alumno.getCalificaciones() == null || alumno.getCalificaciones().isEmpty()
				|| !alumno.getCalificaciones().contains(",")) {
			r.setCode(4);
			r.setMessage("error en: calificaciones");
			return r;
		}
		String[] a = alumno.getCalificaciones().split(",");
		if (a.length < 4 || a.length > 8) {
			r.setCode(4);
			r.setMessage("error en: calificaciones");
			return r;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == null || a[i].isEmpty() || Integer.parseInt(a[i]) < 0 || Integer.parseInt(a[i]) > 100) {
				r.setCode(4);
				r.setMessage("error en: calificaciones");
				return r;
			}
		}

		if (alumno.getSexo() == null || alumno.getSexo().isEmpty()) {
			r.setCode(5);
			r.setMessage("error en: sexo");
			return r;
		}
		if (!alumno.getSexo().equals("Masculino") && !alumno.getSexo().equals("Femenino")) {
			r.setCode(5);
			r.setMessage("error en: sexo");
			return r;
		}

		if (alumno.getBeca() == null || alumno.getBeca().isEmpty()) {
			r.setCode(6);
			r.setMessage("error en: beca");
			return r;
		}
		if (!alumno.getBeca().equals("si") && !alumno.getBeca().equals("no")) {
			r.setCode(6);
			r.setMessage("error en: beca");
			return r;
		}

		if (alumno.getSemestre() == null || alumno.getSemestre().isEmpty()) {
			r.setCode(7);
			r.setMessage("error en: semestre");
			return r;
		}
		if (Integer.parseInt(alumno.getSemestre()) > 12 || Integer.parseInt(alumno.getSemestre()) < 1) {
			r.setCode(7);
			r.setMessage("error en: semestre");
			return r;
		}
//almacen
		if (alumno.getAlmacenar() == null || alumno.getAlmacenar().isEmpty()) {
			r.setCode(8);
			r.setMessage("error en: almacenar");
			return r;
		}
		if (!alumno.getAlmacenar().equals("si") && !alumno.getAlmacenar().equals("no")) {
			r.setCode(8);
			r.setMessage("error en: almacenar");
			return r;
		}
//return sin errores
		r.setCode(00);
		return r;
	}

//validamos caracteres especiales
	private static boolean contiene(String p) {
		if (p.contains("¡") || p.contains("¢") || p.contains("£") || p.contains("¤") || p.contains("¥")
				|| p.contains("§") || p.contains("¨") || p.contains("©") || p.contains("ª") || p.contains("«")
				|| p.contains("¬") || p.contains("®") || p.contains("¯") || p.contains("°") || p.contains("±")
				|| p.contains("´") || p.contains("µ") || p.contains("¶") || p.contains("·") || p.contains("¸")
				|| p.contains("º") || p.contains("»") || p.contains("¿") || p.contains("À") || p.contains("Á")
				|| p.contains("Â") || p.contains("Ã") || p.contains("Ä") || p.contains("Å") || p.contains("Æ")
				|| p.contains("Ç") || p.contains("È") || p.contains("É") || p.contains("Ê") || p.contains("Ë")
				|| p.contains("Ì") || p.contains("Í") || p.contains("Î") || p.contains("Ï") || p.contains("Ñ")
				|| p.contains("Ò") || p.contains("Ó") || p.contains("Ô") || p.contains("Õ") || p.contains("Ö")
				|| p.contains("Ø") || p.contains("Ù") || p.contains("Ú") || p.contains("Û") || p.contains("Ü")
				|| p.contains("ß") || p.contains("à") || p.contains("á") || p.contains("â") || p.contains("ã")
				|| p.contains("ä") || p.contains("å") || p.contains("æ") || p.contains("ç") || p.contains("è")
				|| p.contains("é") || p.contains("ê") || p.contains("ë") || p.contains("ì") || p.contains("í")
				|| p.contains("î") || p.contains("ï") || p.contains("ñ") || p.contains("ò") || p.contains("ó")
				|| p.contains("ô") || p.contains("õ") || p.contains("ö") || p.contains("÷") || p.contains("ø")
				|| p.contains("ù") || p.contains("ú") || p.contains("û") || p.contains("ü") || p.contains("ÿ")
				|| p.contains("₫") || p.contains("•") || p.contains("☺") || p.contains("☻") || p.contains("♥")
				|| p.contains("♦") || p.contains("♣") || p.contains("♠") || p.contains(".") || p.contains("◘")
				|| p.contains("○") || p.contains("◙") || p.contains("♂") || p.contains("♀") || p.contains("♪")
				|| p.contains("♫") || p.contains("☼") || p.contains("►") || p.contains("◄") || p.contains("↕")
				|| p.contains("‼") || p.contains("↑") || p.contains("▬") || p.contains("↨") || p.contains("↑")
				|| p.contains("↓") || p.contains("→") || p.contains("←") || p.contains("∟") || p.contains("↔")
				|| p.contains("▲") || p.contains("▼") || p.contains("#") || p.contains("<") || p.contains("\"")
				|| p.contains("(") || p.contains("[") || p.contains("'") || p.contains("‰") || p.contains("¡")
				|| p.contains("=") || p.contains("¦") || p.contains("¹") || p.contains("³") || p.contains(".")
				|| p.contains("¼") || p.contains("¾") || p.contains("?") || p.contains("×") || p.contains("-")
				|| p.contains("/") || p.contains(":") || p.contains("…") || p.contains("″") || p.contains("↵")
				|| p.contains("ℜ") || p.contains("⇑") || p.contains("⇓") || p.contains("∀") || p.contains("∃")
				|| p.contains("∇") || p.contains("∉") || p.contains("∏") || p.contains("−") || p.contains("√")
				|| p.contains("∞") || p.contains("∨") || p.contains("∪") || p.contains("∴") || p.contains("≅")
				|| p.contains("≠") || p.contains("≤") || p.contains("⊂") || p.contains("⊄") || p.contains("⊇")
				|| p.contains("⊗") || p.contains("⋅") || p.contains("β") || p.contains("δ") || p.contains("π")
				|| p.contains("θ") || p.contains("ζ") || p.contains("λ") || p.contains("ν") || p.contains("σ")
				|| p.contains("τ") || p.contains("φ") || p.contains("ψ") || p.contains("Ω") || p.contains("Δ")
				|| p.contains("&") || p.contains("$") || p.contains(">") || p.contains("™") || p.contains(")")
				|| p.contains("]") || p.contains("%") || p.contains("€") || p.contains("!") || p.contains("²")
				|| p.contains("½") || p.contains(",") || p.contains("⁄") || p.contains("+") || p.contains("*")
				|| p.contains(";") || p.contains("′") || p.contains("‾") || p.contains("ℑ") || p.contains("⇐")
				|| p.contains("⇒") || p.contains("⇔") || p.contains("∂") || p.contains("∅") || p.contains("∈")
				|| p.contains("∋") || p.contains("∑") || p.contains("∗") || p.contains("∝") || p.contains("∧")
				|| p.contains("∩") || p.contains("∫") || p.contains("∼") || p.contains("≈") || p.contains("≡")
				|| p.contains("≥") || p.contains("⊃") || p.contains("⊆") || p.contains("⊕") || p.contains("⊥")
				|| p.contains("α") || p.contains("γ") || p.contains("ε") || p.contains("ρ") || p.contains("κ")
				|| p.contains("η") || p.contains("ξ") || p.contains("ο") || p.contains("υ") || p.contains("χ")
				|| p.contains("ω") || p.contains("Α") || p.contains("@")) {
			return true;
		}
		return false;

	}

}
