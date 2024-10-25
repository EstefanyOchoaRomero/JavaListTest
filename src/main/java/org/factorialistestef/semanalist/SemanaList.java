package org.factorialistestef.semanalist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SemanaList {
    private List<String> dias;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public SemanaList() {
        crearDias();
    }

    public void crearDias() {
        dias = new ArrayList<>();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miércoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sábado");
        dias.add("Domingo");
    }
    public List<String> obtenerDiasdelasemana() {
        return dias;
    }

    public int obtenerLargoLista() {
        return dias.size();
    }


    public boolean eliminarDiadeSemanalist(String dia) {
        return dias.remove(dia);
    }
    public String obtenerDiadeSemanalist(int indice) {
        if (indice < 0 || indice >= dias.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return dias.get(indice);
    }

    public boolean existeDiaenSemanalist(String dia) {
        return dias.contains(dia);
    }


    public void ordenarDiasAlfabeticamente() {
        Collections.sort(dias);
    }


    public void vaciarDiasdeSemanalist() {
        dias.clear();
    }
}
