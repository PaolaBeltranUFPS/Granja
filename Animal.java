import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Animal
{
    //Variables
    protected int idAnimal;
    protected String nombre;
    protected double peso;
    protected String tipoAnimal;
    int edad;
  
    protected List <Animal> animales = new ArrayList<>();


    //Constructor
    public Animal(){
    }

    public Animal(int idAnimal, String nombre, double peso, String tipoAnimal){
        this.idAnimal = idAnimal;
        this.nombre = nombre;
        this.peso = peso;
        this.tipoAnimal = tipoAnimal;

    }

    public int getIdAnimal(){
        return idAnimal;
    }
    public int getEdad(){
        return edad;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPeso(){
        return peso;
    }

    public String getTipoAnimal(){
        return tipoAnimal;
    }

    public void setIdAnimal(int idAnimal){
        this.idAnimal = idAnimal;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setTipoAnimal(String tipoAnimal){
        this.tipoAnimal = tipoAnimal;
    }



    public void registrarAnimal(Animal animal){
        animales.add(animal);
    }
    public void pedirDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el id.");
        setIdAnimal(sc.nextInt());
        System.out.println("Ingrese el nombre.");
        setNombre(sc.next());
        System.out.println("Ingrese el peso.");
        setPeso(sc.nextDouble());
        System.out.println("Ingrese el tipo de animal.");
        setTipoAnimal(sc.next());
        calcularEdad();
        
    }

    public void calcularEdad(){
        Fecha fechan = new Fecha();
        Fecha fechaa = new Fecha();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dia de nacimiento.");
        fechan.setDia(sc.nextInt());
        System.out.println("Ingrese el mes de nacimiento.");
        fechan.setMes(sc.nextInt());
        System.out.println("Ingrese el año de nacimiento.");
        fechan.setAnio(sc.nextInt());
        System.out.println("Ingrese el dia actual.");
        fechaa.setDia(sc.nextInt());
        System.out.println("Ingrese el mes actual.");
        fechaa.setMes(sc.nextInt());
        System.out.println("Ingrese el año actual");
        fechaa.setAnio(sc.nextInt());
        
        edad = fechaa.getAnio() - fechan.getAnio();
         if (fechaa.getMes() < fechan.getMes() || (fechaa.getMes() == fechan.getMes() && fechaa.getDia() < fechan.getDia())) {
        edad--; 
    }
        
        System.out.println(edad);
     
    }

    public Map<String, Integer> contarAnimalesPorTipo() {
        Map<String, Integer> conteo = new HashMap<>();
        for (Animal animal : this.animales) {
            String tipo = animal.getTipoAnimal();
            conteo.put(tipo, conteo.getOrDefault(tipo, 0) + 1);
        }
        return conteo;
    }
}

