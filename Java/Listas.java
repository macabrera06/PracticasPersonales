import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Listas {
    
    public static void main(String[] args) {
        
        //elementos de la lista con la que trabajaremos

        String Variable1 = "Clase 1";
        String Variable2 = "Clase 2";
        String Variable3 = "Clase 3";
        String Variable4 = "Clase 4";

        ArrayList<String> listaString = new ArrayList<>();

        listaString.add(Variable1);
        listaString.add(Variable2);
        listaString.add(Variable3);
        listaString.add(Variable4);

        System.out.println(listaString);

        //formas de imprimi un array en java

        //1. Forma tradicional con un for
        for(int i = 0; i < listaString.size() ; i++){
            System.out.println(listaString.get(i));
        }

        //2. Utilizando un for tipo for each
        for(String clase: listaString){
            System.out.println(clase);
        }

        //Ahora veremos formas de ordenar la lista

        //ordena nuestra lista de mayor a menor
        Collections.sort(listaString, null); 
        System.out.println(listaString);

        //ordenamos nuestra lista descendente de lo que esta actualmente
        Collections.sort(listaString, Collections.reverseOrder());
        System.out.println(listaString);

        //ordenamos de mayor a menor
        listaString.sort(Comparator.reverseOrder());
        System.out.println(listaString);

        //ordenamos de menor a mayor
        listaString.sort(Comparator.naturalOrder());
        System.out.println(listaString);

    }
}
