/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pd;

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
   
   public ConstruirReporte(){
      
   }
  
   
   
   public final void generarRorte(){
      managerFormato = new ManagerFormato(nombreFormato);
      managerPA = new ManagerProductoAcademico(nombrePA);
      if(isPDFFormato){
         managerFormato.leerFormatoPDF();
         managerPA.
                 leerProductoAcademicoPDF(managerFormato.getBookMarksPDF());
         reportePDF = 
                 new ReportePDF(managerPA.getBookMarksPDF(), nombrePA);
         reportePDF.construirReporte();
      } else {
         managerFormato.leerFormatoWord();
         managerPA.
                 leerProductoAcademicoWord(managerFormato.getBookMarksWord());
         reportePDF = 
                 new ReportePDF(managerPA.getBookMarksWord(), nombrePA);
         reportePDF.construirReporte();
      }
      if(isPDFPA){
         
      } else {
         
      }
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
   
   
   
}