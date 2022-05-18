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
public abstract class AbstractProductoAcademico {
   String nombrePA;
   ArrayList<Seccion> bookmarkSeccionFormato;
   ArrayList<String> bookmarkSeccionPA;
   
   public abstract ArrayList<String> leerPA();
   public abstract void construirSecciones();
   
   public Seccion findSeccion(String name) {
      for (Seccion seccion
              : bookmarkSeccionFormato) {
         if (name.equals(seccion.getNombre())) {
            seccion.setCumplido(true);
            return seccion;
         }
      }
      return null;
   }
   
   public ArrayList<Seccion> getBookmarkSeccionFormato() {
      return bookmarkSeccionFormato;
   }
   
}
