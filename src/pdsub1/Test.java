/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pdsub1;

import java.io.IOException;
import java.util.ArrayList;
import pd.FormatoPDF;
import pd.FormatoWord;
import pd.ManagerFormato;
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
      /*FormatoWord formatoWord = new FormatoWord("Formato.docx");
      formatoWord.leerFormato();
      System.out.println(formatoWord.getBookmarkSeccion());
      
      ProductoWord productoWord = new ProductoWord("holin2.docx", formatoWord.getBookmarkSeccion());
      productoWord.leerPA();
      productoWord.construirSecciones();
      System.out.println(productoWord.getBookmarkSeccionFormato());

      ReportePDF rpdf = new ReportePDF(productoWord.getBookmarkSeccionFormato(), "holin2.docx");
      rpdf.construirReporte();*/

      //PDF - WORD
      /*FormatoPDF p = new FormatoPDF("Formato.pdf");
      p.leerFormato();
      p.array();
      
      ProductoWord productoWord = new ProductoWord("holin2.docx", p.getBookmarkSeccion());
      productoWord.leerPA();
      productoWord.construirSecciones();
      System.out.println(productoWord.getBookmarkSeccionFormato());
      
      ReportePDF rpdf = new ReportePDF(productoWord.getBookmarkSeccionFormato(), "holin2.docx");
      rpdf.construirReporte();*/
      
      //WORD - PDF
      /*FormatoWord formatoWord = new FormatoWord("Formato.docx");
      formatoWord.leerFormato();
      
      ProductoPDF productoPDF = new ProductoPDF("holin2.pdf", formatoWord.getBookmarkSeccion());
      productoPDF.leerPA();
      productoPDF.construirSecciones();
      
      ReportePDF rpdf = new ReportePDF(productoPDF.getBookmarkSeccionFormato(), "holin2.docx");
      rpdf.construirReporte();*/
      
      //ManagerFormato
      ManagerFormato managerFormato = new ManagerFormato();
      managerFormato.setNombreFormato("Formato.docx");
      managerFormato.leerFormatoWord();
      System.out.println("Uno\n" + managerFormato.getFormatoWord().getBookmarkSeccion() + "\nFin");
      
      ManagerFormato mf = new ManagerFormato("holin2.pdf");
      mf.leerFormatoPDF();
      System.out.println("Dos\n" + mf.getFormatoPDF().getBookmarkSeccion() + "FIN\n");
      
   }

}
