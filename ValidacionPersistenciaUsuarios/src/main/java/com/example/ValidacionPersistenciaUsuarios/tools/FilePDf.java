package com.example.ValidacionPersistenciaUsuarios.tools;

import java.io.FileNotFoundException;
import org.springframework.stereotype.Service;
import com.example.ValidacionPersistenciaUsuarios.modelo.Empleado;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

@Service
public class FilePDf {

	public void crearPDF(String fecha, String filePath, Empleado usuario) throws FileNotFoundException {
//creacion del pdf en modo de escritura
		PdfWriter writer = new PdfWriter(filePath + "pdf" + fecha + ".pdf");
		PdfDocument pdfDoc = new PdfDocument(writer);
		pdfDoc.addNewPage();
		Document document = new Document(pdfDoc);

//creamos los parrafos a usar:
		Paragraph title = new Paragraph();
		title.setBold();
		title.setFontSize(20);

		Paragraph row = new Paragraph();
		row.setFontSize(10);

		Paragraph subTitle = new Paragraph();
		subTitle.setBold();
		subTitle.setFontSize(16);

		Paragraph rowL = new Paragraph();
		row.setFontSize(10);

//llenamos los parrafos que vamos a escribir
		title.add("Documentacion del empleado: " + usuario.getNombre() + " " + usuario.getApellidos());

		row.add("nombre: " + usuario.getNombre() 
				+ "\napellidos: " + usuario.getApellidos() + "\ncorreo: " + usuario.getCorreo() 
				+ "\nedad: " + usuario.getEdad() 
				+ "\nfechaContratacion: " + usuario.getFechaContratacion() + "\n");

		subTitle.add("MARCADORES: " + "\nlatitude, " + " longitude, " + " city, " + " description");

		for (int i = 0; i < usuario.getMarcadores().size(); i++) {
			rowL.add(usuario.getMarcadores().get(i).getLatitude() + " , "
					+ usuario.getMarcadores().get(i).getLongitude() + " , " 
					+ usuario.getMarcadores().get(i).getCity() + " , " 
					+ usuario.getMarcadores().get(i).getDescription() + "\n");
		}

//escribimos los parrafos en el documento pdf
		document.add(title);
		document.add(row);
		document.add(subTitle);
		document.add(rowL);

//cerramos el documento
		document.close();

	}

}
