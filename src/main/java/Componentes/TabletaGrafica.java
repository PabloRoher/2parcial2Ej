package Componentes;

import java.util.List;

public class TabletaGrafica extends Componentes implements DispositivosEntrada{
    @Override
    public String tipoConector(String tipoConector) {
        return tipoConector;
    }

    @Override
    public List<Integer> ListaPuertos(List<Integer> ListaPuertos) {
        return ListaPuertos;
    }
}
