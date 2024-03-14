package atvbiblioteca;

import java.util.Date;

public class AtvBiblioteca {
    public static void main(String[] args) {
       /*
        Instancias de todos os itens necessários para testar o código:
        DATA, EDITORA, AUTOR, FUNCIONARIO, LIVRO1, LIVRO2,
        EXEMPLAR LIVRO1, EXEMPLAR LIVRO2, MOVIMENTACAOEXEMPLAR
        */
       
       Date data = new Date();
       Editora editora = new Editora("abril");
       Autor autor = new Autor("Joao silva");
       Funcionario funcionario = new Funcionario(1, "Jose campos", 1);
       Livro livro = new Livro(10, "Era uma vez", autor, editora);
       Livro livro2 = new Livro(10, "Um Dois Tres", autor, editora);
       ExemplarLivro exemplarEraUmaVez = new ExemplarLivro(livro, 40.5,data);
       ExemplarLivro exemplarUmDoisTres = new ExemplarLivro(livro2, 60.5,data);
       MovimentacaoExemplar movimentacao = new MovimentacaoExemplar();
       
       /*
       TESTES DE:
       EMPRESTIMOS E DEVOLUÇÃO; LIMITES PARA FUNCIONARIO;
       STATUS DA CONDIÇÃO DO EXEMPLAR; CALCULO DA DATA DE DEVOLUÇÃO;
       E CASO O LIVRO JA ESTEJA EMPRESTADO NÃO EMPRESTAR ATÉ DEVOLUÇÃO.
       */
       
       System.out.println("lIVRO PODE SER EMPRESTADO? " + exemplarEraUmaVez.getAtivação());
       System.out.println("LIMITE DE LIVROS FUNCIONARIO: " + funcionario.limite_livros);
       
       movimentacao.emprestar(funcionario, exemplarEraUmaVez);
       movimentacao.emprestar(funcionario, exemplarEraUmaVez);
       movimentacao.emprestar(funcionario, exemplarUmDoisTres);

       System.out.println("LIMITE DE LIVROS FUNCIONARIO: " + funcionario.limite_livros);
       System.out.println("lIVRO PODE SER EMPRESTADO? " + exemplarEraUmaVez.getAtivação());
       
       System.out.println("DATA DA DEVOLUCAO:" + movimentacao.calcularDataDevolucao(exemplarUmDoisTres));
       System.out.println("DATA DA DEVOLUCAO:" + movimentacao.calcularDataDevolucao(exemplarEraUmaVez));
       
       movimentacao.devolver(funcionario, exemplarEraUmaVez);
       System.out.println("lIVRO PODE SER EMPRESTADO? " + exemplarUmDoisTres.getAtivação());
       System.out.println("lIVRO PODE SER EMPRESTADO? " + exemplarEraUmaVez.getAtivação());
       System.out.println("LIMITE DE LIVROS FUNCIONARIO: " + funcionario.limite_livros);    
  
    }
}
