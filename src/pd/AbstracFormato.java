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
interface AbstracFormato {
   public ArrayList<Seccion> leerFormato();
   public ArrayList<Seccion> getBookmarkSeccion();
   public void setBookmarkSeccion(ArrayList<Seccion> formatoSeccion);
}
