/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pd;

import java.util.ArrayList;
import org.apache.pdfbox.pdmodel.PDDocument;

/**
 *
 * @author Rojas Piña Efrain Ulises <al2172001457@azc.uam.mx>
 */
public class FormatoPDF {
   private String nombreFormato;
   private ArrayList<Seccion> formatoSeccion;
   private Seccion seccion;

   public FormatoPDF(String nombreFormato) {
      this.nombreFormato = nombreFormato;
      formatoSeccion = new ArrayList<>();
   }
   
   
   
}
