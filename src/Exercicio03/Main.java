package Exercicio03;

import Exercicio03.Model.Ponto;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat fP = new DecimalFormat("0.00");
        Scanner e = new Scanner(System.in);
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        System.out.println("Primerio ponto.");
        System.out.print("Digite o valor do ponto X:");
        p1.setX(e.nextInt());

        System.out.print("Digite o valor do ponto Y:");
        p1.setY(e.nextInt());

        //---------------------------------------------

        System.out.println("Segundo ponto.");
        System.out.print("Digite o valor do ponto X:");
        p2.setX(e.nextInt());

        System.out.print("Digite o valor do ponto Y:");
        p2.setY(e.nextInt());

        System.out.println("Distância de P1 para P2: "+ fP.format(p1.calculaDistancia(p2)));
        System.out.println("Distância de P2 para P1: "+fP.format(p2.calculaDistancia(p1)));
        System.out.println();
        System.out.println();
        System.out.println("Distância de P1 até a origem: "+ fP.format(p1.calculaDistanciaOrigem()));
        System.out.println("Distância de P2 até a origem: "+fP.format(p2.calculaDistanciaOrigem()));

        Ponto aux = p1.pontoMaisProximo(p1,p2);

        System.out.println("Pontos mais próximo.");
        System.out.println(aux.formataPonto());


    }
}
