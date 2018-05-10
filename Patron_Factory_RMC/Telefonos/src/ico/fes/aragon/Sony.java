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

    
    public class Sony implements Celular{
        
	private String medidas;
	private String color;
	private String camara;
	
        public Sony(String medidas, String color, String camara){
		this.medidas = medidas;
		this.color = color;
		this.camara = camara;
    
}
     public void mostrarDatos(){
       
         System.out.println("El celular Huaweii tiene las siguientes características :  \n" 
                              + "Medidas: " + medidas + "\n" +
                              "Color: " + color + "\n" +
                                "Camara: " + camara);
                  
    }
    }
