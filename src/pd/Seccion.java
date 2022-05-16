/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pd;

/**
 *
 * @author Rojas Piña Efrain Ulises <al2172001457@azc.uam.mx>
 */
public class Seccion {

   private int id;
   private String nombre;
   private int numPalabras;
   private String texto;

   public Seccion(int id) {
      this(id, "NO DEFINIDA");
   }

   public Seccion(int id, String nombre) {
      this(id, nombre, 0, "");
   }

   public Seccion(int id, String nombre, int numPalabras, String texto) {
      this.id = id;
      this.nombre = nombre;
      this.numPalabras = numPalabras;
      this.texto = texto;
   }

   public Seccion() {

   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getNumPalabras() {
      return numPalabras;
   }

   public void setNumPalabras(int numPalabras) {
      this.numPalabras = numPalabras;
   }

   public String getTexto() {
      return texto;
   }

   public void setTexto(String texto) {
      this.texto = texto;
   }

   @Override
   public String toString() {
      return "Seccion{" + "id=" + id
              + ",\nnombre=" + nombre
              + ",\nnumPalabras=" + numPalabras
              + ",\ntexto=" + texto + '}';
   }

}
