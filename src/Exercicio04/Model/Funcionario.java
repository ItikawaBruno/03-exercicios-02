package Exercicio04.Model;

import java.util.Scanner;

public class Funcionario {

    Scanner e = new Scanner(System.in);
    private String nome;
    private String cargo;
    private double salario;

    //Construtor para inicializar os atributos com valores recebidos por parametro;
    //----------------------------------------------------------------------------
    public Funcionario(String nome, String cargo, double salario){
        this.nome=nome;
        this.cargo=cargo;
        this.salario=salario;
    }
    //----------------------------------------------------------------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public void aumentarSalario(double valorAumento){
        this.salario=this.salario+(this.salario*valorAumento/100);
    }

    public void aumentarSalario(double valorPercentual, String cargo){
        if(this.cargo.equalsIgnoreCase(cargo)){
            this.salario=this.salario+(this.salario*valorPercentual/100);
        }
    }

    public void promover(String nome){
        if(this.nome.equalsIgnoreCase(nome)){
            this.cargo=null;
            System.out.println("Digite o novo cargo do funcionario: ");
            this.cargo=e.next();
        }
    }

    @Override
    public String toString(){
        return "Nome: "+this.nome+" Cargo: "+this.cargo+" Salario: "+this.salario;
    }

}
