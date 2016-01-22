import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cochesMedianteComposicion;

/**
 *
 * @author a.Quiroga
 */
public class Coche {

  private String nombre;
  public Llanta llanta1, llanta2, llanta3, llanta4;
  
  public Coche(String nombre){
      System.out.println("Construyendo un coche "+nombre+".");
      this.nombre=nombre;
  }
  
  public Coche(String nombre, Llanta l1, Llanta l2, Llanta l3, Llanta l4){
      this.nombre=nombre;
      llanta1=l1;llanta2=l2;llanta3=l3;llanta4=l4;
      System.out.println("Construyendo un coche " + nombre + "con llantas asignadas.");
  }
  
  public String setNombre(){
      return nombre;
  }
    
}
