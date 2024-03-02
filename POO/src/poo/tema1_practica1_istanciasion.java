/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author MAX
 */
public class tema1_practica1_istanciasion {


    public static void main(String[] args) {
        
      int valor=100;  
      /*instasacion
      //clase indentificador  = new constructor ()
      //lcostructor ---> metododo con el mismo nombre  que la clase 
      */
      Persona perso1=new Persona();//instaciacion
      System.out.println(perso1);
      //perso1--->referencia--->direccion en memoria
      Vehiculo mamalon = new Vehiculo();
      System.out.println(mamalon);
      mamalon.marca= "for";
      mamalon.año=1995;
      mamalon.modelo="aveo";
      System.out.println("marca:"+mamalon.marca);
      System.out.println("año:"+mamalon.año);
      System.out.println("modelo:"+mamalon.modelo);
    }




    
}


class Persona{
        
    // tipo de dato abstradpto
        

}


class Vehiculo{
    // ATRIBUTOS 
    String marca;
    int  año;
    String modelo;
    
    
    
    
}

