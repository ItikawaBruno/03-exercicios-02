package Exercicio02;

import Exercicio01.Model.Jogador;
import Exercicio02.Model.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner((System.in));
        String[] disciplinas = new String[3];
        double[][] notas = new double[3][2];


        char resp = 'S';

        List<Aluno> listaAlunos = new ArrayList<>();

        while (resp == 'S') {
            Aluno aluno = new Aluno();

            System.out.print("Digite o nome do aluno: ");
            aluno.setNome(e.next());

            System.out.print("Digite o RM: ");
            aluno.setRm(e.nextInt());

            for (int i = 0; i < 3; i++) {
                System.out.println("Digite o nome da disciplina: ");
                disciplinas[i] = e.next();
                for (int j = 0; j < 2; j++) {
                    System.out.println("Digite a " + (j + 1) + ": ");
                    notas[i][j] = e.nextDouble();
                }
            }
                aluno.setDisciplinas(disciplinas);
                aluno.setNotas(notas);
                aluno.calculaMedia();
                listaAlunos.add(aluno);
                System.out.print("Digite N: para sair e S para continuar:");
                resp = e.next().toUpperCase().charAt(0);

        }

        for (Aluno aluno : listaAlunos) {
            aluno.listar();

        }
    }
}