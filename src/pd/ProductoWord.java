/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

/**
 *
 * @author Rojas Piña Efrain Ulises <al2172001457@azc.uam.mx>
 */
public class ProductoWord {

   private String nombrePA;
   private ArrayList<Seccion> bookmarkSeccionFormato;
   private ArrayList<String> bookmarkSeccionPA;

   public ProductoWord(String nombrePA, ArrayList<Seccion> bookmarkSeccionFormato) {
      this.nombrePA = nombrePA;
      this.bookmarkSeccionFormato = bookmarkSeccionFormato;
      bookmarkSeccionPA = new ArrayList<>();
      System.out.println(this.bookmarkSeccionFormato.size());
   }

   public ArrayList<String> leerPA() throws IOException {
      try {
         XWPFDocument documento = new XWPFDocument(new FileInputStream(nombrePA));
         XWPFWordExtractor xwpfWordExtractor = new XWPFWordExtractor(documento);
         List<XWPFParagraph> paragraphs = documento.getParagraphs();

         for (XWPFParagraph para : paragraphs) {
            if (para.getStyleID() != null && (para.getStyleID().compareTo("Ttulo") == 0
                    || para.getStyleID().compareTo("Ttulo1") == 0
                    || para.getStyleID().compareTo("Ttulo2") == 0
                    || para.getStyleID().compareTo("Ttulo3") == 0
                    || para.getStyleID().compareTo("Subttulo") == 0)) {
               bookmarkSeccionPA.add(para.getText());
            }
         }
         return this.bookmarkSeccionPA;
      } catch (FileNotFoundException ex) {
         Logger.getLogger(ProductoWord.class.getName()).log(Level.SEVERE, null, ex);
      }
      return null;
   }

   public void construirSecciones() {
      try {
         XWPFDocument documento = new XWPFDocument(new FileInputStream(nombrePA));
         XWPFWordExtractor xwpfWordExtractor = new XWPFWordExtractor(documento);
         String contenido = xwpfWordExtractor.getText();
         StringTokenizer parrafos = new StringTokenizer(contenido, "\n");
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
         Logger.getLogger(ProductoWord.class.getName()).log(Level.SEVERE, null, ex);
      }
   }

   public Seccion findSeccion(String name) {
      for (Seccion seccion
              : bookmarkSeccionFormato) {
         if (name.equals(seccion.getNombre())) {
            seccion.setCumplido(true);
            return seccion;
         }
      }
      return null;
   }

   public ArrayList<Seccion> getBookmarkSeccionFormato() {
      return bookmarkSeccionFormato;
   }
   
}
