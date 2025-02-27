package Exercicio01;

import Exercicio01.Model.Jogador;
import Exercicio02.Model.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

            Jogador jogador =  new Jogador();

            System.out.print("Digite seu nome: ");
            jogador.setNome(e.next());

            jogador.jogando();
            jogador.somaNotas();







    }
}