import java.util.ArrayList;

public class ListaObjeto {
    public static void main(String[] args) {
        
        Persona Miguel = new Persona("Miguel Cabrera", 21);
        Persona Mike = new Persona("Miguel Chacon", 21);
        Persona Javier = new Persona("Javier Jimenes", 21);
        Persona Paul = new Persona("Paul Jaramillo", 21);

        ArrayList<Persona> Lista = new ArrayList<>();

        Lista.add(Miguel);
        Lista.add(Mike);
        Lista.add(Javier);
        Lista.add(Paul);

        System.out.println(Lista);

    }
}
