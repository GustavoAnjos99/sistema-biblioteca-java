package atvbiblioteca;

import java.util.Date;

public class ExemplarLivro extends Livro {
    private Date data_aquisicao = new Date();
    private double preco;
    private boolean ativo = false;
    private static int nmSq_id = 0;
    private int nmSequencial;
    private int livro_funcionario;
    
    ExemplarLivro(Livro l,double p, Date d_a){
        nmSq_id++;
        this.nmSequencial = nmSq_id;
        this.preco = p;
        this.data_aquisicao = d_a;
        this.ativo = true;
    }
    
    public double getPreco(){
        return this.preco;
    }
    public int getNmSquencial(){
        return this.nmSequencial;
    }
    public boolean getAtivação(){
        return this.ativo;
    }
    public int getValidacaoFuncionario(){
        return this.livro_funcionario;
    }
    public void setValidacaoFuncionario(int n){
        this.livro_funcionario = n;
    }    
    public void ativarDesativar(){
        this.ativo = !this.ativo;
    }
    
    public void manter(){}
    public void pesquisar(){}
}
