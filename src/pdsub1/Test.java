/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pdsub1;

import java.io.IOException;
import java.util.ArrayList;
import pd.FormatoPDF;
import pd.FormatoWord;
import pd.ProductoPDF;
import pd.ProductoWord;
import pd.ReportePDF;
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
      /* 
      //PDF
      FormatoPDF p = new FormatoPDF("Formato.pdf");
      p.leerFormato();
      p.array();
      
      ProductoPDF ppdf = new ProductoPDF("PA.pdf", p.getBookmarkSeccion());
      ppdf.leerPA();
      ppdf.construirSecciones();
      
      ArrayList<Seccion> s = ppdf.getBookmarkSeccionFormato();
      for (Seccion seccion : s){
         if(seccion.isCumplido()){
            System.out.println(seccion.getNombre());
         }
      }
      
      ReportePDF reportePDF = new ReportePDF(ppdf.getBookmarkSeccionFormato());
      reportePDF.construirReporte();
       */

      //WORD
      FormatoWord formatoWord = new FormatoWord("Formato.docx");
      formatoWord.leerFormato();
      System.out.println(formatoWord.getBookmarkSeccion());

      ProductoWord productoWord = new ProductoWord("holin2.docx", formatoWord.getBookmarkSeccion());
      productoWord.leerPA();
      productoWord.construirSecciones();
      System.out.println(productoWord.getBookmarkSeccionFormato());

      ReportePDF rpdf = new ReportePDF(productoWord.getBookmarkSeccionFormato());
      rpdf.construirReporte();

   }

}
