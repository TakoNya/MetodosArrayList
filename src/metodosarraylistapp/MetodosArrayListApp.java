package metodosarraylistapp;

import java.util.ArrayList;

public class MetodosArrayListApp {

    public static void main(String[] args) {
        //Declarar el ArrayList
        ArrayList<String> listaPaises = new ArrayList();
        

        //Agregar elementos a la lista con add()
        listaPaises.add("España");  //Ocupa la posición 0
        listaPaises.add("Francia"); //Ocupa la posición 1
        listaPaises.add("Portugal"); //Ocupa la posición 2
        
        ArrayList<String> listaPaises2 = (ArrayList<String>)listaPaises.clone();
        
        System.out.println("Original" + listaPaises);
        System.out.println("Copia" + listaPaises2);

        //Listar elementos
        System.out.println("=================");
        for (String pais : listaPaises) {
            System.out.println(pais);
        }

        //Agregar un elemento en una determinada posición con add()
        //El orden hasta ahora es: España, Francia, Portugal
        listaPaises.add(1, "Italia");
        //El orden ahora es: España, Italia, Francia, Portugal

        //Listar elementos
        System.out.println("=================");
        for (String pais : listaPaises) {
            System.out.println(pais);
        }

        //Obtener el elemento que está en una posición determinada con get()
        System.out.println("=================");
        System.out.println(listaPaises.get(3));
        //Siguiendo el ejemplo anterior, mostraría: Portugal

        //Usar bucle for clásico, método size() y método get() para listar
        System.out.println("=================");
        for (int i = 0; i < listaPaises.size(); i++) {
            System.out.println(listaPaises.get(i));
        }

        //Buscar un elemento con indexOf()
        System.out.println("=================");
        String paisBuscado = "Francia";
        int pos = listaPaises.indexOf(paisBuscado);
        if (pos != -1) {
            System.out.println(paisBuscado + " se encontró en la posición " + pos);
        } else {
            System.out.println(paisBuscado + " no se ha encontrado");
        }

        //Remover elemento que está en una posición determinada con remove()
        System.out.println("=================");
        listaPaises.remove(2);
        //Eliminada Francia, queda: España, Italia, Portugal

        //remover el elemento indicado con remove()
        System.out.println("=================");
        listaPaises.remove("Portugal");
        //Eliminada Portugal, queda: España, Italia
        for (String pais : listaPaises) {
            System.out.println(pais);
        }
        System.out.println("=================");
        //Modificarelemento que está en una posición determinada con set()
        listaPaises.set(1, "Alemania");
        //Si la lista era España, Itaia ahora es España, Alemania
        
        if (listaPaises.contains("Italia"))
            System.out.println("SI, aparece Italia");
        else
            System.out.println("Noup, solo Doitsu y Supein");
        
        if (listaPaises.contains("Alemania"))
            System.out.println("DOITSU DOITSUUUUU");
        else
            System.out.println("Doitsu wa inai. . . ");
        
        System.out.println("This array is empty?: "+listaPaises.isEmpty());
        
        listaPaises.clear();
        
        System.out.println("Now, this array is empty?: "+listaPaises.isEmpty());
                
                
        
        

    }
}




