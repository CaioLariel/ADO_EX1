/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

public class Professor extends Pessoa {
    int matriculaProfessor;
    String dataAdmissao;
    double salarioHorista;
   
    
    public String retornaDadosProfessor(){
        String dados ;
        
        //atribuindo valores da principal dentro dos dados do aluno
        dados = super.retornaDados();
                
        dados += "Data de admissao: " + dataAdmissao + "\n";
        dados += "Matricula do professor: " + matriculaProfessor + "\n";
        dados += "salarioHorista: " + salarioHorista + "\n";

        return dados;
    }
    
}