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
    
    public class Huaweii implements Celular{

   
        
        
	
	private final String color;
	private final String camara;
	
        public Huaweii(String color, String camara){
		
		this.color = color;
		this.camara = camara;
                
                  
}
     public void mostrarDatos(){
                      System.out.println("El celular Huaweii tiene las siguientes características :  \n" 
                              + "Color: " + color + "\n" +
                              "Camara: " + camara);
                  }
    }
