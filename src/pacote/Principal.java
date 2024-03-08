/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        Scanner text = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        
        System.out.println("\t Bem vindo ao cadastro! \n");
        System.out.println("digite uma opção:\n[0]- aluno\n[1]- professor\n:");
        int valor = number.nextInt();

        if (valor == 0) {
            //aluno
            System.out.println("digite o nome do aluno :\n");
            a1.nome = text.nextLine();
            System.out.println("-----------------------------------------------------");

            System.out.println("digite o rg do aluno :\n");
            a1.rg = text.nextLine();
            System.out.println("-----------------------------------------------------");

            System.out.println("digite o cpf do aluno :\n");
            a1.cpf = text.nextLine();
            System.out.println("-----------------------------------------------------");

            System.out.println("digite o registro do aluno do aluno :\n");
            a1.registroAluno = number.nextInt();
            System.out.println("-----------------------------------------------------");

            System.out.println("digite a nota do vestibular do aluno :\n");
            a1.notaVestibular = number.nextFloat();
            System.out.println("-----------------------------------------------------");

            System.out.println("digite o curso do aluno :\n");
            a1.curso = text.nextLine();
            System.out.println("-----------------------------------------------------");

            System.out.println("digite a data matricula do aluno :\n");
            a1.dataMatricula = text.nextLine();

            System.out.println("-----------------------------------------------------");

            System.out.println("\t - Dados do Aluno RA nº: " + a1.registroAluno + "-\n");
            System.out.println(a1.retornaDadosAluno());
        }
        if(valor == 1){

        System.out.println("digite o nome do professor :\n");
        p1.nome = text.nextLine();
        System.out.println("-----------------------------------------------------");

        System.out.println("digite o rg do professor :\n");
        p1.rg = text.nextLine();
        System.out.println("-----------------------------------------------------");

        System.out.println("digite o cpf do professor :\n");
        p1.cpf = text.nextLine();
        System.out.println("-----------------------------------------------------");

        System.out.println("digite a matricula do professor :\n");
        p1.matriculaProfessor = number.nextInt();
        System.out.println("-----------------------------------------------------");

        System.out.println("digite a data admissao do professor :\n");
        p1.dataAdmissao = text.nextLine();
        System.out.println("-----------------------------------------------------");

        System.out.println("digite o slario horista do professor :\n");
        p1.salarioHorista = number.nextDouble();

        System.out.println("-----------------------------------------------------");
        System.out.println("\t - Dados do Professor matricula nº: " + p1.matriculaProfessor + "-\n");
        System.out.println(p1.retornaDadosProfessor());
        }
        else{
            System.out.println("o valor escolhido não existe, tente novamente!");
            //tratativa de erro
        }
    }

}
