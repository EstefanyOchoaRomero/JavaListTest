package org.factorialistestef.semanalist;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SemanaListTest {
    private SemanaList semanaList;


    @BeforeEach
    void setUp() {
        semanaList = new SemanaList();
    }

    @Test
    void testCrearDiasTamaño() {
        List<String> dias = semanaList.obtenerDiasdelasemana();
        assertEquals(7, dias.size());
    }

    @Test
    void testCrearDiasLunes() {
        List<String> dias = semanaList.obtenerDiasdelasemana();
        assertTrue(dias.contains("Lunes"));
    }

    @Test
    void testCrearDiasMartes() {
        List<String> dias = semanaList.obtenerDiasdelasemana();
        assertTrue(dias.contains("Martes"));
    }

    @Test
    void testCrearDiasMiercoles() {
        List<String> dias = semanaList.obtenerDiasdelasemana();
        assertTrue(dias.contains("Miércoles"));
    }

    @Test
    void testCrearDiasJueves() {
        List<String> dias = semanaList.obtenerDiasdelasemana();
        assertTrue(dias.contains("Jueves"));
    }

    @Test
    void testCrearDiasViernes() {
        List<String> dias = semanaList.obtenerDiasdelasemana();
        assertTrue(dias.contains("Viernes"));
    }

    @Test
    void testCrearDiasSabado() {
        List<String> dias = semanaList.obtenerDiasdelasemana();
        assertTrue(dias.contains("Sábado"));
    }

    @Test
    void testCrearDiasDomingo() {
        List<String> dias = semanaList.obtenerDiasdelasemana();
        assertTrue(dias.contains("Domingo"));
    }

    @Test
    void testObtenerLargoLista() {
        assertEquals(7, semanaList.obtenerLargoLista());
    }

    @Test
    void testEliminarDiadeSemanalist() {
        assertTrue(semanaList.eliminarDiadeSemanalist("Lunes"));
        assertFalse(semanaList.existeDiaenSemanalist("Lunes"));
    }

    @Test
    void testObtenerDiadeSemanalist() {
        assertEquals("Martes", semanaList.obtenerDiadeSemanalist(1));
        assertThrows(IndexOutOfBoundsException.class, () -> semanaList.obtenerDiadeSemanalist(10));
        assertThrows(IndexOutOfBoundsException.class, () -> semanaList.obtenerDiadeSemanalist(-10));
    }

    @Test
    void testExisteDiaenSemanalist() {
        assertTrue(semanaList.existeDiaenSemanalist("Miércoles"));
        assertFalse(semanaList.existeDiaenSemanalist("Finde"));
    }

    @Test
    void testOrdenarDiasAlfabeticamente() {
        semanaList.ordenarDiasAlfabeticamente();
        List<String> dias = semanaList.obtenerDiasdelasemana();
        assertEquals("Domingo", dias.get(0));
        assertEquals("Martes", dias.get(3));
    }

    @Test
    void testVaciarDiasdeSemanalist() {
        semanaList.vaciarDiasdeSemanalist();
        assertEquals(0, semanaList.obtenerLargoLista());
    }
}

