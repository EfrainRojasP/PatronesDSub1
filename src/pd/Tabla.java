/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pd;

import java.util.ArrayList;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;

import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;

/**
 *
 * @author Rojas Piña Efrain Ulises <al2172001457@azc.uam.mx>
 */
public class Tabla {

   public static void main(String[] args) throws Exception {

      System.out.println("Hola mundo");
      FormatoPDF p = new FormatoPDF("Formato.pdf");
      p.leerFormato();
      p.array();

      ProductoPDF ppdf = new ProductoPDF("PA.pdf", p.getBookmarkSeccion());
      ppdf.leerPA();
      ppdf.construirSecciones();
      System.out.println(ppdf.getBookmarkSeccionFormato());
      //p.getBookmarkSeccion().get(0).setTexto("smdfosndfnsdiofn spodpsoado sdksapod");
      ArrayList<Seccion> s = p.getBookmarkSeccion();

      String file
              = "addingTableToPDF.pdf";

      // Step-1 Creating a PdfDocument object
      PdfDocument pdfDoc
              = new PdfDocument(new PdfWriter(file));

      // Step-2 Creating a Document object
      Document doc = new Document(pdfDoc);

      // Step-3 Creating a table
      Table table = new Table(2);

      // Step-4 Adding cells to the table}
      table.addCell("Formato");
      table.addCell("Cumplido");
      for (Seccion seccion : s) {
         table.addCell(seccion.getNombre());
         if (seccion.isCumplido()) {
            table.addCell("Si");
         } else {
            table.addCell("No");
         }
      }

      // Step-6 Adding Table to document
      doc.add(table);

      // Step-7 Closing the document
      doc.close();
      System.out.println("Table created successfully..");

   }
}
