package ar.edu.unahur.obj2.practicaparcial1.recetas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.ingredientes.FrutoSeco;
import ar.edu.unahur.obj2.practicaparcial1.ingredientes.RodajaDePalta;
import ar.edu.unahur.obj2.practicaparcial1.ingredientes.SemillaDeChia;

public class IRecetaTest {

    IReceta unaReceta = new Receta("recetita", "Donato", 200.0, 15);

    @Test
    void testRecetitaConSemillasDeChiaTieneValorDe690() {
        IReceta unaRecetaDecorada = new SemillaDeChia(unaReceta);
        assertEquals(690.0, unaRecetaDecorada.getValorNutricional());
    }

    @Test
    void testRecetitaConPaltaTieneValorDe360() {
        IReceta unaRecetaDecorada = new RodajaDePalta(unaReceta);
        assertEquals(360.0, unaRecetaDecorada.getValorNutricional());
    }

    @Test
    void testRecetitaConFrutosSecosTieneValorDe794() {
        IReceta unaRecetaDecorada = new FrutoSeco(unaReceta);
        assertEquals(794.0, unaRecetaDecorada.getValorNutricional());
    }
}
