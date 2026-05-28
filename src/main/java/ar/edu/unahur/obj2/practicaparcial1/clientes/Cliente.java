package ar.edu.unahur.obj2.practicaparcial1.clientes;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.criterios.*;
import ar.edu.unahur.obj2.practicaparcial1.recetas.*;

public class Cliente {
    
    private Integer dni;
    private ICriterio criterio = new ComeTutti(); //strategy
    private List<IReceta> recetas = new ArrayList<>();

    public Cliente(Integer dni) {
        this.dni = dni;
    }

    public Integer getDni() {
        return dni;
    }

    public ICriterio getCriterio() {
        return criterio;
    }

    public List<IReceta> getRecetas() {
        return recetas;
    }

    public void setCriterio(ICriterio criterio) {
        this.criterio = criterio;
    }

    public void agregarReceta(IReceta unaReceta) {
        recetas.add(unaReceta);
    }

    public List<Double> valorNutricionalDeCadaReceta() {
        return
            recetas.stream().map(r -> r.getValorNutricional()).toList();
    }
    
}
