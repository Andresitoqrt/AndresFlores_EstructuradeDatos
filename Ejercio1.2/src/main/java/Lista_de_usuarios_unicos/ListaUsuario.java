package Lista_de_usuarios_unicos;

import java.util.HashSet;
import java.util.Set;

public class ListaUsuario {

    public void Hashset(){
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Diegospapu21");
        conjunto.add("Walter Parada");
        conjunto.add("Ivan barrera");
        conjunto.add("Carlos Manuel");
        conjunto.add("Andres Flores");
        conjunto.add("Diegospapu21");

        System.out.println("Contenido de la lista de usuarios: " + conjunto);

        System.out.println("¿Existe 'Walter Parada'?: " + conjunto.contains("Walter Parada"));


    }
}
