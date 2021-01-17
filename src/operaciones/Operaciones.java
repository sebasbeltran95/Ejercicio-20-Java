package operaciones;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Operaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     double cateto1, cateto2;
     Scanner in = new Scanner(System.in);
     
     System.out.println("Porfavor ingrese la longitud del primer cateto");
     cateto1 = in.nextDouble();
     
     System.out.println("Porfavor ingrese la longitud del segundo cateto");
     cateto2 = in.nextDouble();
     
     System.out.println("Hipotenusa -> " + Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2)));

    }
}
