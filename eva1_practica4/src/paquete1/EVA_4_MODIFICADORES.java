/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import paquete2.B;
import paquete2.C;

/**
 *
 * @author MAX
 */
public class EVA_4_MODIFICADORES {
    
    public static void main(String[] args) {
        one obj1=new one ();
        System.out.println(obj1);
        // CLASES DE PAQUETE 2
        B objB = new B();
        System.out.println(objB);
        //there obj2= new there(); no se puede usar papa Xd no es accesible  por que es default (tiene modificador de default )
        C objC = new C();
        System.out.println(objC);
    }
}

class one{
    
}