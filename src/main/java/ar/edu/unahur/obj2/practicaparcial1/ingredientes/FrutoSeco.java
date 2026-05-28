package ar.edu.unahur.obj2.practicaparcial1.ingredientes;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class FrutoSeco extends Ingrediente{
    
    public FrutoSeco(IReceta recetaDecorada) {
        super(recetaDecorada);
    }

    @Override
    public Double doValorNutricional() {
        return
            594.0;
    }
}
