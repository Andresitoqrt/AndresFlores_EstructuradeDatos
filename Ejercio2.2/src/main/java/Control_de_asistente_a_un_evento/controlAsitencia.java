package Control_de_asistente_a_un_evento;

import java.util.HashSet;
import java.util.Set;

public class controlAsitencia {
    public void controlAsitencia() {
        Set<String> conjunto = new HashSet<>();

        conjunto.add("20240147");
        conjunto.add("20240000");
        conjunto.add("20240001");
        conjunto.add("20240148");
        conjunto.add("20230147");

        System.out.println(" Contenido del ControlAsistencia: " + conjunto);

        System.out.println(" Este codigo ya esta registrado: " + conjunto.contains("20240147"));
    }

}
