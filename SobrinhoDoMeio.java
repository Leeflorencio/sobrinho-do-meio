package com.br.beecrowd;

import java.util.Scanner;

public class SobrinhoDoMeio {
    public static void main(String[] args) {

        /*
            Entrada
            A entrada consiste em vários casos de teste. Cada caso contém três valores inteiros H, Z e L,
             que representam as idades de Huguinho, Zezinho e Luisinho, respectivamente.
         */

        Scanner sc = new Scanner(System.in);

        Integer numero1 = 0;
        Integer numero2 = 0;
        Integer numero3 = 0;

        String menor = "zezinho";
        String maior = "luisinho";
        String meio = "huguinho";

        System.out.println("Informe os numeros: ");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println(maior);
        } else if (numero1 < numero2 && numero1 < numero3) {
            System.out.println(menor);
        } else {
            System.out.println(meio);
        }
    }
}
