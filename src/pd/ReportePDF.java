/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pd;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Table;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Rojas Piña Efrain Ulises <al2172001457@azc.uam.mx>
 */
public class ReportePDF {
   //private Seccion seccion;
   private ArrayList<Seccion> seccionPA;

   public ReportePDF(ArrayList<Seccion> seccionPA) {
      this.seccionPA = seccionPA;
   }
   
   
   public void comparacion(){
      for(Seccion seccion : seccionPA){
         if(seccion.isCumplido() && seccion.getNumPalabras() == 0){
            seccion.setCumplido(false);
         }
      }
   }
   
   public void construirReporte() throws FileNotFoundException{
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
      for (Seccion seccion : seccionPA) {
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
   }
   
}
