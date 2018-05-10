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

    

    public class Windows implements Celular{
        
	private int ram;
	private String color;
	private String camara;
	
        public Windows(int ram, String color, String camara){
		this.ram = ram;
		this.color = color;
		this.camara = camara;
	}
         public void mostrarDatos(){
        
               System.out.println("El celular Windows tiene las siguientes características :  \n" + 
                                    "RAM: " + ram + "\n"
                              + "Color: " + color + "\n" +
                              "Camara: " + camara);
    }
}

