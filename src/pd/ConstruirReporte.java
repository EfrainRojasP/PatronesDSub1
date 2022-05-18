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
public class ConstruirReporte {
  
   private ReportePDF reportePDF;
   private ManagerFormato managerFormato;
   private ManagerProductoAcademico managerPA;

   private boolean isPDFFormato;
   private boolean isPDFPA;
   private String nombreFormato;
   private String nombrePA;
   private String nombreReporte = "";
   private String ruta;
   
   public ConstruirReporte(){
      
   }
  
   public void generarRorte(){
     if(isPDFPA){
        generarReporteAPartirPDF();
     } else {
        generarReporteAPartirWord();
     }
   }

   
   public void analizarPA(){
      String rutaFormato = "./".concat(nombreFormato);
      String rutaPA = "./".concat(nombrePA);
      managerFormato = new ManagerFormato(rutaFormato);
      managerPA = new ManagerProductoAcademico(rutaPA);
      if(isPDFFormato){
         managerFormato.leerFormatoPDF();
      } else {
         managerFormato.leerFormatoWord();
      }
      
      if(isPDFFormato == true && isPDFPA == true){
         managerPA.
                 leerProductoAcademicoPDF(managerFormato.getBookMarksPDF());
         //generarReporteAPartirPDF();
      } else if(isPDFFormato == false && isPDFPA == true){
         managerPA.
                 leerProductoAcademicoPDF(managerFormato.getBookMarksWord());
         //generarReporteAPartirPDF();
      } else if(isPDFFormato == true && isPDFPA == false){
         managerPA.
                 leerProductoAcademicoWord(managerFormato.getBookMarksPDF());
         //generarReporteAPartirWord();
      } else if (isPDFFormato == false && isPDFPA == false){
         managerPA
                 .leerProductoAcademicoWord(managerFormato.getBookMarksWord());
         //generarReporteAPartirWord();
      }
   }
   
   private void generarReporteAPartirPDF(){
      reportePDF = 
                 new ReportePDF(managerPA.getBookMarksPDF(), nombreReporte, ruta);
         reportePDF.construirReporte();
   }
   
   private void generarReporteAPartirWord(){
      reportePDF = 
                 new ReportePDF(managerPA.getBookMarksWord(), nombreReporte, ruta);
         reportePDF.construirReporte();
   }
   
   public boolean isIsPDFFormato() {
      return isPDFFormato;
   }

   public void setIsPDFFormato(boolean isPDFFormato) {
      this.isPDFFormato = isPDFFormato;
   }

   public boolean isIsPDFPA() {
      return isPDFPA;
   }

   public void setIsPDFPA(boolean isPDFPA) {
      this.isPDFPA = isPDFPA;
   }

   public String getNombreFormato() {
      return nombreFormato;
   }

   public void setNombreFormato(String nombreFormato) {
      this.nombreFormato = nombreFormato;
   }

   public String getNombrePA() {
      return nombrePA;
   }

   public void setNombrePA(String nombrePA) {
      this.nombrePA = nombrePA;
   }

   public String getRuta() {
      return ruta;
   }

   public void setRuta(String ruta) {
      this.ruta = ruta;
   }

   public String getNombreReporte() {
      return nombreReporte;
   }

   public void setNombreReporte(String nombreReporte) {
      this.nombreReporte = nombreReporte;
   }
   
   public String nombreReporte(){
      if(nombrePA.lastIndexOf(".docx") > 0){
         nombreReporte = "ReporteCumplidos_".concat(nombrePA.substring(0, 
                 nombrePA.lastIndexOf(".docx")));
         nombreReporte += ".pdf";
         return nombreReporte;
      } else {
         nombreReporte = "ReporteCumplidos_".concat(nombrePA);
         return nombreReporte;
      }
   }
   
}
