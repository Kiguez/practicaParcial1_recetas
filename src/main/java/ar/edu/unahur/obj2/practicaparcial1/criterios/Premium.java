package ar.edu.unahur.obj2.practicaparcial1.criterios;

import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.ingredientes.RodajaDePalta;
import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class Premium implements ICriterio {
    
    List<String> autoresPreferidos;

    public Premium(List<String> autoresPreferidos) {
        this.autoresPreferidos = autoresPreferidos;
    }

    @Override
    public Boolean leGustaEstaReceta(IReceta unaReceta) {
        return
            autoresPreferidos.contains(unaReceta.getAutor());
    }

    @Override
    public IReceta customizarReceta(IReceta unaReceta) {
        return
            new RodajaDePalta(unaReceta); //agrega palta porque suena sofisticado y premium
    }

    
}
