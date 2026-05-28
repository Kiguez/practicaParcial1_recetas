package ar.edu.unahur.obj2.practicaparcial1.criterios;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class ComeTutti implements ICriterio{

    public ComeTutti() {
    }

    @Override
    public Boolean leGustaEstaReceta(IReceta unaReceta) {
        return
            Boolean.TRUE;
    }

    @Override
    public IReceta customizarReceta(IReceta unaReceta) {
        return
            unaReceta; //Como todo le gusta no customiza, la deja asi 
    }
    
    
}
