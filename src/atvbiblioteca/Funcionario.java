/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvbiblioteca;

import java.util.ArrayList;

/**
 *
 * @author dti
 */
public class Funcionario {
    private String descricao;
    private int matricula;
    private char numeroOAB;
    private int areaAdvocacia; 
    private String nome;
    public int limite_livros = 0;
    
    Funcionario(int m, String n, int aa){
        this.matricula = m;
        this.nome = n;
        this.areaAdvocacia = aa;
    }
    Funcionario(int m, String n, char oab, int aa){
        this.matricula = m;
        this.nome = n;
        this.areaAdvocacia = aa;
        this.numeroOAB = oab;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public void manter(){}
    public void pesquisar(){
        
    }
}
