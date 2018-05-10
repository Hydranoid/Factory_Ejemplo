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

    
    public class Lenovo implements Celular{
        
	private int ram;
	private String color;
	private String camara;
        private String procesador;
	
        public Lenovo(int ram, String color, String camara , String procesador){
		this.ram = ram;
		this.color = color;
		this.camara = camara;
                this.procesador = procesador;
    
}
    public void mostrarDatos(){
        
        System.out.println("El celular Lenovo tiene las siguientes características :  \n" 
                                + "RAM: " + ram  + "\n" 
                              + "Color: " + color + "\n" +
                              "Camara: " + camara + "\n" +
                                "Procesdor: " + procesador);
                  }
    }
    
