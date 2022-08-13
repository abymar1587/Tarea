package com.tarea;

import com.tarea.logic.EcuacionPrimerGrado;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        EcuacionPrimerGrado epg = new EcuacionPrimerGrado();
        System.out.println("The root is: " + epg.FindRoot());
    }
}
