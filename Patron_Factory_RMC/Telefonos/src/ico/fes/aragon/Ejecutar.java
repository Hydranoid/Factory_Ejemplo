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
public class Ejecutar {
    
    public static void main(String[] args) {
        
        Celular cl =Creacioncelu.getCelu("iPhone");
        cl.mostrarDatos();
        
        Celular cl1 =Creacioncelu.getCelu("Sony");
        cl1.mostrarDatos();
        
        Celular cl2 =Creacioncelu.getCelu("Android");
        cl2.mostrarDatos();
        
        Celular cl3 =Creacioncelu.getCelu("Huaweii");
        cl3.mostrarDatos();
        
        Celular cl4 =Creacioncelu.getCelu("Lenovo");
        cl4.mostrarDatos();
        
        Celular cl5 =Creacioncelu.getCelu("Windows");
        cl5.mostrarDatos();
       
        
        
        
        
        
  
        
    }
}
