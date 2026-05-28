package ar.edu.unahur.obj2.practicaparcial1.criterios;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public interface ICriterio {
    
    Boolean leGustaEstaReceta(IReceta unaReceta);

    IReceta customizarReceta(IReceta unaReceta);
}
