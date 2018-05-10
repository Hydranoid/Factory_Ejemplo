/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.aragon;

/**
 *
 * @author user
 */ 
     public class Android implements Celular {
        
	private final int ram;
	private final String procesador;
	
public Android(int ram, String procesador){
		this.ram = ram;
		this.procesador = procesador;
    
    
}

 public void mostrarDatos(){
        
       System.out.println("El celular Android tiene las siguientes características :  \n" 
                              + "RAM: " + ram + "\n" +
                              "Procesador: " + procesador);
    }
     }

