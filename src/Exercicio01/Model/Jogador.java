package Exercicio01.Model;

import java.util.Scanner;

public class Jogador {
    Scanner e =  new Scanner(System.in);

    private String nome;
    private double[] notas = new double[3];


    public double[] jogando(){
        int cont=0;
        while(cont<3){
            System.out.println("Rodada - "+(cont+1)+" ");
            System.out.print("Digite a pontuação: ");
            this.notas[cont]=e.nextDouble();
            cont++;
        }
        return notas;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double somaNotas(){
        double pontuacaoFinal=0;
        for (double i : notas){
            pontuacaoFinal+=i;
        }
        return pontuacaoFinal;
    }

    public void listaRodadas(){
        for(int i=0;i<3;i++){
            System.out.println("Rodada - "+(i+1));
            System.out.println("Pontuação: "+this.notas[i]);
        }
        System.out.print("Pontuação final: "+this.somaNotas());
    }

}
