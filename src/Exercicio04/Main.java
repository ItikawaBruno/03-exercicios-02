package Exercicio04;

import Exercicio04.Model.Funcionario;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner e = new Scanner(System.in);

        String nomeFuncionario=null,cargoFuncionario=null;
        double salario=0;
        char resp = 'S';
        List<Funcionario> listaFuncionario = new ArrayList<>();

        while (resp == 'S') {
            System.out.print("Digite o nome do afuncionario: ");
            nomeFuncionario = e.next();
            System.out.print("Digite o cargo do afuncionario: ");
            cargoFuncionario = e.next();
            System.out.print("Digite o salario do funcionario: ");
            salario = e.nextDouble();
            Funcionario funcionario = new Funcionario(nomeFuncionario,cargoFuncionario,salario);


            listaFuncionario.add(funcionario);

            System.out.println("Deseja continuar adicionando funcionarios?");
            resp = e.next().toUpperCase().charAt(0);
        }

        resp = 'S';
        int menu=0;
        while (resp == 'S') {
            System.out.println("-------- MENU ---------");
            System.out.println("1. Aumentar salario de todos.\n" +
                    "2. Aumentar salario por cargo.\n" +
                    "3. Promover o funcionario.\n"+
                    "4. Listar.");
            menu=e.nextInt();


            if (menu == 1) {
                System.out.println("Digite o valor percentual do aumento: ");
                double percentual = e.nextInt();
                for (Funcionario funcionario : listaFuncionario) {
                    funcionario.aumentarSalario(percentual);
                }
            }else if (menu == 2){
                System.out.println("Digite o nome do cargo que recebere aumento: ");
                String cargo = e.next();
                System.out.println("Digite o valor percentual do aumento: ");
                double percentual = e.nextInt();
                listaFuncionario.forEach(f -> f.aumentarSalario(percentual,cargo));
            }else if(menu == 3){
                System.out.println("Digite o nome do funcionario que será promovido: ");
                String nome = e.next();
                listaFuncionario.forEach(f -> f.promover(nome));
            }else{
                listaFuncionario.forEach(f -> System.out.println(f.toString()));
            }


            System.out.println("Deseja continuar adicionando funcionarios?");
            resp = e.next().toUpperCase().charAt(0);

        }

        listaFuncionario.forEach(f -> System.out.println(f.toString()));


    }
}