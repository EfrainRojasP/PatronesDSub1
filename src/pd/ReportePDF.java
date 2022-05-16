/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pd;

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
   
   public void construirReporte(){
   
   }
   
}
