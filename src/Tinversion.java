/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Tinversion {

    public static double calcularTasa(String tipo, String plazo, String estado) {
        double tasa = 0.0;

        
        tipo = tipo.toLowerCase();
        plazo = plazo.toLowerCase();
        estado = estado.toLowerCase();

    
        if ("bonos".equals(tipo)) {
            tasa = 5.0;
        } else if ("acciones".equals(tipo)) {
            tasa = 10.0;
        } else if ("fondos de inversión".equals(tipo)) {
            tasa = 7.0;
        } else {
            System.out.println("Tipo de inversión no reconocido.");
            return 0.0;
        }

        if ("corto plazo".equals(plazo)) {
            tasa -= 1.0;
        } else if ("mediano plazo".equals(plazo)) {
            // No cambia
        } else if ("largo plazo".equals(plazo)) {
            tasa += 2.0;
        } else {
            System.out.println("Plazo de inversión no reconocido.");
            return 0.0;
        }


        if ("riesgoso".equals(estado)) {
            tasa -= 3.0;
        } else if ("estable".equals(estado)) {
            // No cambia
        } else if ("crecimiento".equals(estado)) {
            tasa += 2.0;
        } else {
            System.out.println("Estado de inversión no reconocido.");
            return 0.0;
        }

        return tasa;
    }
}



    

