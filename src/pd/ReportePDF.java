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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rojas Piña Efrain Ulises <al2172001457@azc.uam.mx>
 */
public class ReportePDF implements AbstractRepote{
   //private Seccion seccion;
   private ArrayList<Seccion> seccionPA;
   private String nombrePA;

   public ReportePDF(ArrayList<Seccion> seccionPA) {
      this.seccionPA = seccionPA;
   }

   public ReportePDF(ArrayList<Seccion> seccionPA, String nombrePA) {
      this.seccionPA = seccionPA;
      this.nombrePA = nombrePA;
   }
   
   
   public void comparacion(){
      for(Seccion seccion : seccionPA){
         if(seccion.isCumplido() && seccion.getNumPalabras() == 0){
            seccion.setCumplido(false);
         }
      }
   }
   
   @Override
   public void construirReporte(){
      try {
         String file = nombreReporte();
         
         
         //1. Creacion del PDF
         PdfDocument pdfDoc
                 = new PdfDocument(new PdfWriter(file));
         
         //2. Creacion del docuemnto como objeto
         Document doc = new Document(pdfDoc);
         
         //3. Creando tabla
         // Table(2) -> Indica que la tabla tendra dos columnas
         Table table = new Table(2);
         
         //4. Añadimos las celas a la tabla
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
         
         //6. Añadimos la tabla al docuemento
         doc.add(table);
         
         //7. Cerramos el documento
         doc.close();
      } catch (FileNotFoundException ex) {
         Logger.getLogger(ReportePDF.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
   
   public String nombreReporte(){
      String nombrePDF = "";
      if(nombrePA.lastIndexOf(".docx") > 0){
         nombrePDF = "ReporteCumplidos_".concat(nombrePA.substring(0, 
                 nombrePA.lastIndexOf(".docx")));
         nombrePDF += ".pdf";
         return nombrePDF;
      } else {
         nombrePDF = "ReporteCumplidos_".concat(nombrePDF);
         return nombrePDF;
      }
   }
   
}
