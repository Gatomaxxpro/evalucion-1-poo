
package poo;

//import Paquete.PruebaB;
import Paquete.otro_Paquete;


public class eva_1_practica3_modificadores {
    public int x;
    protected int y;
    private  int z;
    int w;
    
    public static void main(String[] args) {
        PruebaA obJa=new PruebaA();
        //obJa---> puedo ver x (public)
        //obJa---> puedo ver y (protected)
        //obJa---> puedo ver w (default)
        otro_Paquete  obja = new otro_Paquete();
       // esta clase no es visible PruebaB ob=new PruebaB();
       
       
    }
    
}

// estas clases son defalult 
class PruebaA{
     public int x;
    protected int y;
    private  int z;
    int w;
    
}
