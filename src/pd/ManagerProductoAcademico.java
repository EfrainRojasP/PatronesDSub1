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
public class ManagerProductoAcademico {
   private ProductoPDF productoPDF;
   private ProductoWord productoWord;
   private String nombrePA;

   public ManagerProductoAcademico() {
   }

   public ManagerProductoAcademico(String nombrePA) {
      this.nombrePA = nombrePA;
   }
   
   public void leerProductoAcademicoPDF(ArrayList<Seccion> bookMarksFormato){
      productoPDF = new ProductoPDF(nombrePA, bookMarksFormato);
      productoPDF.leerPA();
      productoPDF.construirSecciones();
   }   
   
   public void leerProductoAcademicoWord(ArrayList<Seccion> bookMarksFormato){
      productoWord = new ProductoWord(nombrePA, bookMarksFormato);
      productoWord.leerPA();
      productoWord.construirSecciones();
   }

   public ProductoPDF getProductoPDF() {
      return productoPDF;
   }

   public void setProductoPDF(ProductoPDF productoPDF) {
      this.productoPDF = productoPDF;
   }

   public ProductoWord getProductoWord() {
      return productoWord;
   }

   public void setProductoWord(ProductoWord productoWord) {
      this.productoWord = productoWord;
   }

   public String getNombrePA() {
      return nombrePA;
   }

   public void setNombrePA(String nombrePA) {
      this.nombrePA = nombrePA;
   }
   
   public ArrayList<Seccion> getBookMarksPDF(){
      return productoPDF.getBookmarkSeccionFormato();
   }
   
   public ArrayList<Seccion> getBookMarksWord(){
      return productoWord.getBookmarkSeccionFormato();
   }
   
   
   
}
