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
public class ManagerFormato {
   private FormatoPDF formatoPDF;
   private FormatoWord formatoWord;
   private String nombreFormato;
   
   public ManagerFormato() {
   }

   public ManagerFormato(String nombreFormato) {
      this.nombreFormato = nombreFormato;
   }
   
   public void leerFormatoPDF(){
      formatoPDF = new FormatoPDF(nombreFormato);
      formatoPDF.leerFormato();
   }
   
   public void leerFormatoWord(){
      formatoWord = new FormatoWord(nombreFormato);
      formatoWord.leerFormato();
   }
   
   public String getNombreFormato() {
      return nombreFormato;
   }

   public void setNombreFormato(String nombreFormato) {
      this.nombreFormato = nombreFormato;
   }

   public FormatoPDF getFormatoPDF() {
      return formatoPDF;
   }

   public void setFormatoPDF(FormatoPDF formatoPDF) {
      this.formatoPDF = formatoPDF;
   }

   public FormatoWord getFormatoWord() {
      return formatoWord;
   }

   public void setFormatoWord(FormatoWord formatoWord) {
      this.formatoWord = formatoWord;
   }
   
   public ArrayList<Seccion> getBookMarksPDF(){
      return formatoPDF.getBookmarkSeccion();
   }
   
   public ArrayList<Seccion> getBookMarksWord(){
      return formatoWord.getBookmarkSeccion();
   }
   
}
