package com.example.tamagochi;

public class Prueba {
    public static void main(String[] args) {

        tamagochi tamagochi1= new tamagochi();
        tamagochi1.setName("Pepito");
        tamagochi1.setTiempoMinutos(100);
        tamagochi1.setEstado("hambrienta");
        System.out.println("El pibe esta " + tamagochi1.getEstado());

        tamagochi1.comer();
        tamagochi1.setEstado("aburrida");

        tamagochi1.jugar();
        tamagochi1.setTiempoMinutos(30);
        System.out.println("El pibe esta " + tamagochi1.getEstado());
        tamagochi1.comer();

        tamagochi1.jugar();
        System.out.println("El pibe esta " + tamagochi1.getEstado());


    }
}
//para agregar el estado triste se agrega un nuevo estado al switch de comer o jugar generando otro comportamiento