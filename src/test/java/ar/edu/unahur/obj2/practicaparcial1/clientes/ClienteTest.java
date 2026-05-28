package ar.edu.unahur.obj2.practicaparcial1.clientes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.criterios.*;
import ar.edu.unahur.obj2.practicaparcial1.recetas.*;

public class ClienteTest {

    Cliente unCliente = new Cliente(43869937);

    @Test
    void testClienteDeCriterioAltoValorNutricionalSolamenteLeGustanRecetasDeMuchasCalorias() {
        unCliente.setCriterio(new AltoValorNutricional(200.0));
        IReceta recetaCalorica = new Receta("calorica", "Donato", 400.0, 1);
        IReceta recetaNoCalorica = new Receta("NoCalorica", "Donato", 150.0, 1);
        assertAll(
            () -> assertTrue(unCliente.getCriterio().leGustaEstaReceta(recetaCalorica)) ,
            () -> assertFalse(unCliente.getCriterio().leGustaEstaReceta(recetaNoCalorica))
        );
    }

    @Test
    void testClienteDeCriterioPremiumlSolamenteLeGustanRecetasDeAutoresPreferidos() {
        List<String> autores = new ArrayList<>();
        autores.add("Germán Martitegui");
        unCliente.setCriterio(new Premium(autores));
        IReceta recetaCualquiera = new Receta("calorica", "Donato", 400.0, 1);
        IReceta recetaDeAutor = new Receta("NoCalorica", "Germán Martitegui", 150.0, 1);
        assertAll(
            () -> assertTrue(unCliente.getCriterio().leGustaEstaReceta(recetaDeAutor)) ,
            () -> assertFalse(unCliente.getCriterio().leGustaEstaReceta(recetaCualquiera))
        );
    }

    @Test
    void testClienteDeCriterioTradicionalSolamenteLeGustanRecetasTradicionales() {
        unCliente.setCriterio(new RecetaTradicional());
        IReceta recetaCualquiera = new Receta("calorica", "Donato", 400.0, 1);
        IReceta recetaTradicional = new Receta("NoCalorica", "Germán Martitegui", 150.0, 21);
        assertAll(
            () -> assertTrue(unCliente.getCriterio().leGustaEstaReceta(recetaTradicional)) ,
            () -> assertFalse(unCliente.getCriterio().leGustaEstaReceta(recetaCualquiera))
        );
    }

} 
