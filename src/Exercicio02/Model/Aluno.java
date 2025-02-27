package Exercicio02.Model;

public class Aluno {

    private String nome;
    private int rm;
    private String[] disciplinas = new String[3];
    private double[][] notas = new double[3][2];
    private double[] media = new double[3];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }
    public void calculaMedia(){
        for(int i=0;i<3;i++){
            for (int j = 0; j < 2; j++) {
                media[i]+=notas[i][j];
            }
            media[i]=media[i]/2;
        }
    }

    public void listar(){
        System.out.println("Aluno: "+this.nome);
        for (int i = 0; i < 3; i++) {
            System.out.println("Disciplina: "+this.disciplinas[i]);

            if (this.media[i]>=6){
                System.out.println("Media: "+this.media[i]+" Aprovado!");
            }else {
                System.out.println("Media: "+this.media[i]+" Reprovado.");
            }

        }
    }
}
