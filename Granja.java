import java.util.Scanner;
/**
 *
 * @author PAOLA
 */
public class Granja {
   public static void main(String[] args) {
        Animal animal = new Animal();

        Gallina gallina = new Gallina();
        gallina.pedirDatos();
        Vaca vaca = new Vaca();
        vaca.pedirDatos();
        Cerdo cerdo = new Cerdo();
        cerdo.pedirDatos();

        animal.registrarAnimal(gallina);
        animal.registrarAnimal(vaca);
        animal.registrarAnimal(cerdo);

        System.out.println("La edad de la vaca es: "+ vaca.edad);
        System.out.println("La edad de la gallina es: "+ gallina.edad);
        System.out.println("La edad de el cerdo es: "+ cerdo.edad);

        System.out.println("Numero de animales: " + animal.contarAnimalesPorTipo());
    }
}
