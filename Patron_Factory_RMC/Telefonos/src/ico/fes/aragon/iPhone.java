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

     public class iPhone implements Celular {
        
	private int ram;
	private String color;
	private String procesador;
	
    public iPhone(int ram, String color, String procesador){
		this.ram = ram;
		this.color = color;
		this.procesador = procesador;
	
}
     public void mostrarDatos(){
           System.out.println("El celular iPhone tiene las siguientes características :  \n" 
                              + "Color: " + color + "\n" +
                              "RAM: " + ram  + "\n" +
                                "Procesador: " + procesador);
        
    }
}

