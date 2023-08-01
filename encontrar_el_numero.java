import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class encontrar_el_numero {


    public static void main (String [] args){
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomNumbers.add(new Random().ints(0, 10 ).findAny().getAsInt());
        }
        System.out.println(randomNumbers);
        System.out.println(encontrar(randomNumbers ));
    }
    public static boolean encontrar (List<Integer> lista ){
            for ( int i = 0;i < lista.size();i++ ) {
                if(lista.get(i) == 8 ){
                System.out.println("El número está en la sucesión.");
                return true;
                }
                
            }
            return false;
    }
}
