package ar.edu.unahur.obj2.practicaparcial1.ingredientes;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class RodajaDePalta extends Ingrediente {

    public RodajaDePalta(IReceta recetaDecorada) {
        super(recetaDecorada);
    }

    @Override
    public Double doValorNutricional() {
        return
            160.0;
    }
}
