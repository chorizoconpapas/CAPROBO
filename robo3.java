public class robo3 {
    public static void main (String [] args) {
        double circle_radius, square_side;
        double circle_area, square_area;
        
        circle_radius = 5;
        square_side = 7; 
     
        circle_area = Math.PI * (circle_radius * circle_radius);
    
        square_area = square_side * square_side ;       
     
     System.out.println("el area del circulo es:" + circle_radius);
     System.out.println("el area del cuadrado es: " + square_area );

     String result;
     
     if (circle_area < square_area){
        result =" el area del cuadraado es mayo ";
     }else if ( circle_area > square_area){
        result = " El area del circulo es mayo ";
     }else {
        result = "las areas son iguales";
     }

     System.out.println(result);
    }
       
}
    

