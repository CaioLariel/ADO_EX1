/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

public class Aluno extends Pessoa {
    
    int registroAluno;
    float notaVestibular;
    String curso, dataMatricula;
    
     public String retornaDadosAluno(){
        String dados ;
        
        dados = super.retornaDados();
                
        dados += "RA.: " + registroAluno + "\n";
        dados += "Nota do vestibular: " + notaVestibular + "\n";
        dados += "Curso: " + curso + "\n";
        dados += "Data da Matricula: " + dataMatricula + "\n";

        return dados;
    }
}

