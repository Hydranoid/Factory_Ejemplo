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
public class Creacioncelu {
    
    
    public static Celular getCelu(String type){
		
        if (type.equals("iPhone")){
			return new iPhone(2, "A9", "A9 GPu");
		}else if(type.equals("Sony")){
			return new Sony("Mediano", "Rojo", "5MP");
		}else if(type.equals("Android")){
			return new Android(3, "Intel");
		}else if(type.equals("Huaweii")){
			return new Huaweii ("Blanco", "8MP");
                }else if(type.equals("Lenovo")){
			return new Lenovo(4, "Morado", "6MP", "Intel Pentium"); 
                }else if(type.equals("Windows")){
			return new Windows(5, "Gris", "6.5MP");
                }else{
                    return null;
                }           
                        
		}
	}

