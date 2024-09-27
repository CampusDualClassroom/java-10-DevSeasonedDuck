package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    //TODO ↓
    // Imprimir el color de las pelotas que salgan, hasta que salgan 2 de color azul
    // El mensaje a imprimir es → La bola es de color: COLOR_BOLA
    // COLOR_BOLA puede ser → rojo, azul, verde
    public static void main(String[] args) {
        int bolasAzules=0;
        String bola;
        do {
            bola=getBall();
            System.out.println("La bola es de color: "+bola);
            if (bola.equals("azul")){
                bolasAzules=bolasAzules+1;
            }
        }while (bolasAzules<2);
        System.out.println(bolasAzules);
    }

    //TODO ↓
    // Un método que devuelva una cadena de texto con el color de una pelota (en minúscula). Dicho color se escogerá de
    // manera aleatoria. Se empleará el método randomWithRange(int min, int max) para escoger un número aleatorio, que
    // lo asociaremos al valor de un color de la siguiente manera:
    // 1 → rojo
    // 2 → azul
    // 3 → verde
    public static String getBall() {
        String colorBola="";
        switch (randomWithRange(1,4)){
            case 1:
                colorBola = "rojo";
                break;
            case 2:
                colorBola = "azul";
                break;
            case 3:
                colorBola = "verde";
                break;
            default:
                System.out.println("Error");
        }
        return colorBola;
    }

    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min,max);
    }
}