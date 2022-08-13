package com.tarea.logic;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EcuacionPrimerGradoTest {
    /**
     * 
     */
    @Test
    public void shouldReturnTheRootOfEquation() {
        EcuacionPrimerGrado epg = new EcuacionPrimerGrado();
        assertTrue(epg.FindRoot() == (float) 0.0);
    }
}
