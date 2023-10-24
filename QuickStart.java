import modelo.Persona;

/**
 * QuickStart
 */
public class QuickStart {

    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");

        Persona persona = new Persona("Ana", 22);
        System.out.println("Nombre: "+ persona.getNombre() + " edad: "+ persona.getEdad());
      
    }
}