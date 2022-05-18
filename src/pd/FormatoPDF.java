/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pd;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode;

/**
 *
 * @author Rojas Piña Efrain Ulises <al2172001457@azc.uam.mx>
 */
public class FormatoPDF extends AbstractFormato {

   private int id;

   public FormatoPDF() {
   }
   
   public FormatoPDF(String nombreFormato) {
      this.nombreFormato = nombreFormato;
      bookmarkSeccion = new ArrayList<>();
      id = 0;
   }

   @Override
   public ArrayList<Seccion> leerFormato() {
      try {
         PDDocument documentPDF = PDDocument.load(new File(nombreFormato));
         PDDocumentOutline outline = documentPDF.getDocumentCatalog().
                 getDocumentOutline();
         formatoSecciones(documentPDF, outline);
         documentPDF.close();
         return this.bookmarkSeccion;
      } catch (IOException e) {
         System.err.println("Error al leer o escribir en el archivo con la ruta especificada");
      } catch (NullPointerException e) {
         System.err.println("Error al leer los bookmarks del archivo");
      }
      return null;
   }

   public void formatoSecciones(PDDocument document, PDOutlineNode bookmark) throws IOException {
      PDOutlineItem current = bookmark.getFirstChild();
      while (current != null) {
         ++id;
         seccion = new Seccion(id, current.getTitle());
         bookmarkSeccion.add(seccion);
         System.out.println(id + " " + current.getTitle());
         formatoSecciones(document, current);
         current = current.getNextSibling();
      }
   }

   public void array(){
      System.out.println(" " + bookmarkSeccion.toString());
   }
   
}
