/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cochesMedianteComposicion;

public class Llanta{
    private double altura;
    private double anchura;
    private double rin;
    
    public Llanta(double alto, double ancho, double radio){
        altura=alto; anchura=ancho; rin=radio;
        System.out.println("Construyendo una llanta altura= "+alto+", anchura="+
                ancho+", rin= "+rin);
    }
}
