package Filtro_de_Palabras_Repetidas;

import java.util.HashSet;
import java.util.Set;

public class FiltroPalabras {

    public void FiltroPalabras() {
        Set<String> PalabrasMinusculas = new HashSet<>();
            Set<String> ConjuntoMayusculas = new HashSet<>();

        PalabrasMinusculas.add("hola");
        PalabrasMinusculas.add("lego");
        PalabrasMinusculas.add("diegospapu21");
        PalabrasMinusculas.add("laptop");
        PalabrasMinusculas.add("compu");

        for (String PalabrasMayusculas : PalabrasMinusculas ){
            ConjuntoMayusculas.add(PalabrasMayusculas.toUpperCase());
        }

        System.out.println(PalabrasMinusculas);
        System.out.println(ConjuntoMayusculas);

    }
}
