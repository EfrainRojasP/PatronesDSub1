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
public abstract class AbstractFormato {
   
   String nombreFormato;
   ArrayList<Seccion> bookmarkSeccion;
   Seccion seccion;
   
   public abstract ArrayList<Seccion> leerFormato();
   
   public ArrayList<Seccion> getBookmarkSeccion(){
      return bookmarkSeccion;
   }
   public void setBookmarkSeccion(ArrayList<Seccion> formatoSeccion){
      this.bookmarkSeccion = bookmarkSeccion;
   }

   public String getNombreFormato() {
      return nombreFormato;
   }

   public void setNombreFormato(String nombreFormato) {
      this.nombreFormato = nombreFormato;
   }
   
   
   
}
