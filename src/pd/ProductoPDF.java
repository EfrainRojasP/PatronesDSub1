/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pd;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode;
import org.apache.pdfbox.text.PDFTextStripper;

/**
 *
 * @author Rojas Piña Efrain Ulises <al2172001457@azc.uam.mx>
 */
public class ProductoPDF extends AbstractProductoAcademico{

   public ProductoPDF() {
   }
   
   public ProductoPDF(String nombrePA, ArrayList<Seccion> bookmarkSeccionFormato) {
      this.nombrePA = nombrePA;
      this.bookmarkSeccionFormato = bookmarkSeccionFormato;
      bookmarkSeccionPA = new ArrayList<>();
      //System.out.println(this.bookmarkSeccionFormato.size());
   }

   @Override
   public ArrayList<String> leerPA() {
      try {
         PDDocument documentPDF = PDDocument.load(new File(nombrePA));
         PDDocumentOutline outline = documentPDF.getDocumentCatalog().
                 getDocumentOutline();
         productoAcSecciones(documentPDF, outline);
         documentPDF.close();
         return this.bookmarkSeccionPA;
      } catch (IOException e) {
         System.err.println("Error al leer o escribir en el archivo con la ruta especificada");
      } catch (NullPointerException e) {
         System.err.println("Error al leer los bookmarks del archivo");
      }
      return null;
   }

   private void productoAcSecciones(PDDocument document, PDOutlineNode bookmark) {
      PDOutlineItem current = bookmark.getFirstChild();
      while (current != null) {
         bookmarkSeccionPA.add(current.getTitle());
         productoAcSecciones(document, current);
         current = current.getNextSibling();
      }
   }

   @Override
   public void construirSecciones() {
      try {
         File file = new File(nombrePA);
         PDDocument document = PDDocument.load(file);
         
         PDFTextStripper pdfTextStripper = new PDFTextStripper();
         String text = pdfTextStripper.getText(document);
         StringTokenizer parrafos = new StringTokenizer(text, "\n");
         StringBuilder textoSeccion = new StringBuilder();
         Seccion seccion = null;
         int numPalabras = 0;
         while (parrafos.hasMoreTokens()) {
            String parrafo = parrafos.nextToken().trim();
            StringTokenizer palabras = new StringTokenizer(parrafo, " ");
            if (bookmarkSeccionPA.contains(parrafo)) {
               if (seccion != null) {
                  seccion.setNumPalabras(numPalabras);
                  seccion.setTexto(textoSeccion.toString());
                  textoSeccion = new StringBuilder();
               }
               seccion = findSeccion(parrafo);
               numPalabras = 0;
               bookmarkSeccionPA.remove(parrafo);
            } else if (seccion != null) {
               while (palabras.hasMoreTokens()) {
                  String palabra = palabras.nextToken();
                  textoSeccion.append(palabra).append(" ");
                  numPalabras++;
               }
               textoSeccion.append("\n");
            }
         }
         if (!textoSeccion.toString().isEmpty() && seccion != null) {
            seccion.setNumPalabras(numPalabras);
            seccion.setTexto(textoSeccion.toString());
         }
      } catch (IOException ex) {
         System.err.println("ProductoPDF : "
                 + "Error al leer o escribir en el archivo con la ruta especificada");
      }

   }
   
}
