/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

public class Pessoa {
    String nome, rg, cpf;
    
    public String retornaDados(){
        String dados = "";
                
        dados += "Nome: " + nome + "\n";
        dados += "RG: " + rg + "\n";
        dados += "CPF: " + cpf + "\n";

        return dados;
    }
}

