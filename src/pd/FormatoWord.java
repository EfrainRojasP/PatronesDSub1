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
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

/**
 *
 * @author Rojas Piña Efrain Ulises <al2172001457@azc.uam.mx>
 */
public class FormatoWord extends AbstractFormato {


   public FormatoWord(String nombreFormato) {
      this.nombreFormato = nombreFormato;
      bookmarkSeccion = new ArrayList<>();
   }

   @Override
   public ArrayList<Seccion> leerFormato() {
      try {
         XWPFDocument documento = new XWPFDocument(new FileInputStream(nombreFormato));
         XWPFWordExtractor xwpfWordExtractor = new XWPFWordExtractor(documento);
         List<XWPFParagraph> paragraphs = documento.getParagraphs();
         
         int idSeccion = 1;
         for (XWPFParagraph para : paragraphs) {
           if (para.getStyleID() != null && (para.getStyleID().compareTo("Ttulo") == 0
                    || para.getStyleID().compareTo("Ttulo1") == 0
                    || para.getStyleID().compareTo("Ttulo2") == 0
                    || para.getStyleID().compareTo("Ttulo3") == 0
                    || para.getStyleID().compareTo("Subttulo") == 0)) {
               seccion = new Seccion(idSeccion, para.getText());
               bookmarkSeccion.add(seccion);
               ++idSeccion;
            } 
         }
         return  this.bookmarkSeccion;
      } catch (FileNotFoundException ex) {
         Logger.getLogger(FormatoWord.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
         System.err.println("Error al leer o escribir en el archivo con la ruta especificada");
      }
      return null;
   }
   
}
