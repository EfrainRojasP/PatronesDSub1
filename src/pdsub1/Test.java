/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pdsub1;

import java.io.IOException;
import java.util.ArrayList;
import pd.FormatoPDF;
import pd.ProductoPDF;
import pd.Seccion;

/**
 *
 * @author Rojas Piña Efrain Ulises <al2172001457@azc.uam.mx>
 */
public class Test {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) throws IOException {
      System.out.println("Hola mundo");
      FormatoPDF p = new FormatoPDF("Formato.pdf");
      p.leerFormato();
      p.array();
      
      ProductoPDF ppdf = new ProductoPDF("PA.pdf", p.getBookmarkSeccion());
      ppdf.leerPA();
      ppdf.construirSecciones();
      //System.out.println(p.getBookmarkSeccion());
      //p.getBookmarkSeccion().get(0).setTexto("smdfosndfnsdiofn spodpsoado sdksapod");
      ArrayList<Seccion> s = p.getBookmarkSeccion();
      for (Seccion seccion : s){
         if(seccion.isCumplido()){
            System.out.println(seccion.getNombre());
         }
      }
      
   }
   
}
