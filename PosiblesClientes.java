/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cochesMedianteComposicion;


public class PosiblesClientes {
   
    private Coche[] listadoCoches;
    private Cliente[ ] listadoClientes;
    
    public PosiblesClientes(int n){
        listadoCoches=new Coche[n];
        listadoClientes=new Cliente[n];
    }
    
    public void agregaCliente(int lugar, Coche co, Cliente cl){
        listadoCoches[lugar]=co;
        listadoClientes[lugar]=cl;    
    
    }

    public void despliegaPosibleCliente(int lugar){
        System.out.println(lugar+ ")"+listadoClientes[lugar].setNombre()+"("+
                listadoClientes[lugar].setEdad()+")"+listadoCoches[lugar].setNombre());
    }
    
}
