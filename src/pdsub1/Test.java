/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pdsub1;

import java.io.IOException;
import java.util.ArrayList;
import pd.ConstruirReporte;
import pd.FormatoPDF;
import pd.FormatoWord;
import pd.ManagerFormato;
import pd.ManagerProductoAcademico;
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
      /*ManagerFormato managerFormato = new ManagerFormato();
      managerFormato.setNombreFormato("Formato.docx");
      managerFormato.leerFormatoWord();
      ArrayList<Seccion> d = managerFormato.getBookMarksWord();
      System.out.println("Formato\n" + managerFormato.getBookMarksWord() + "\nFin");
     
      System.out.println("\nPA\n");
      ManagerProductoAcademico mpa = new ManagerProductoAcademico("holin2.pdf");
      mpa.leerProductoAcademicoPDF(managerFormato.getBookMarksWord());
      System.out.println("Uno\n" + mpa.getProductoPDF().getBookmarkSeccionFormato() + "FIN\n");
      
      ReportePDF rpdf = new ReportePDF(mpa.getProductoPDF().getBookmarkSeccionFormato(), "holin2.pdf");
      rpdf.construirReporte();
      
      System.out.println("\n\n\n-------------------------");
      
      ManagerFormato mf = new ManagerFormato("holin2.pdf");
      mf.leerFormatoPDF();
      System.out.println("Formato\n" + mf.getFormatoPDF().getBookmarkSeccion() + "FIN\n");
      
      System.out.println("\nPA\n");
      
      ManagerProductoAcademico mpa1 = new ManagerProductoAcademico("PA.docx");
      mpa1.leerProductoAcademicoWord(mf.getFormatoPDF().getBookmarkSeccion());
      System.out.println("Dos\n" + mpa1.getProductoWord().getBookmarkSeccionFormato() + "FIN\n");
      
      ReportePDF rpdf1 = new ReportePDF(mpa1.getProductoWord().getBookmarkSeccionFormato(), "PA.docx");
      rpdf1.construirReporte();*/
      
      //COnstruir reporte
      /*ConstruirReporte cr = new ConstruirReporte();
      cr.setIsPDFFormato(true);
      cr.setNombreFormato("holin2.pdf");
      cr.setIsPDFPA(false);
      cr.setNombrePA("PA.docx");
      cr.generarRorte();*/
      
      ConstruirReporte cr1 = new ConstruirReporte();
      cr1.setIsPDFFormato(false);
      cr1.setNombreFormato("Formato.docx");
      cr1.setIsPDFPA(false);
      cr1.setNombrePA("PA.docx");
      cr1.generarRorte();
      
      
   }

}
