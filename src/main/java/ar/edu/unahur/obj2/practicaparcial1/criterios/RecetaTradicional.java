package ar.edu.unahur.obj2.practicaparcial1.criterios;

import ar.edu.unahur.obj2.practicaparcial1.ingredientes.SemillaDeChia;
import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class RecetaTradicional implements ICriterio{

    public RecetaTradicional() {
    }

    @Override
    public Boolean leGustaEstaReceta(IReceta unaReceta) {
        return
            unaReceta.getAñosDeTradicion() > 20;
    }

    @Override
    public IReceta customizarReceta(IReceta unaReceta) {
        return
            new SemillaDeChia(unaReceta); //agrega chia porque es un clasico y por ende es tradicional
    }
    
    
}
