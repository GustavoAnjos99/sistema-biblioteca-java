package atvbiblioteca;

import java.util.Calendar;
import java.util.Date;

public class MovimentacaoExemplar {
    
    public void emprestar(Funcionario f, ExemplarLivro exl){
        if(f.limite_livros < 4 && exl.getAtivação() == true){
            f.limite_livros++;
            exl.ativarDesativar();
            exl.setValidacaoFuncionario(f.getMatricula());
        }
    }
    public void devolver(Funcionario f, ExemplarLivro exl){
        if (f.limite_livros > 0){
            f.limite_livros--;
            exl.ativarDesativar();
            exl.setValidacaoFuncionario(0);
        }
    }
    
    public Date calcularDataDevolucao(ExemplarLivro exl){
        final Date data_emprestimo = new Date();
        final Date data_devolucao;
  
        Calendar c = Calendar.getInstance();
        c.setTime(data_emprestimo);
        c.add(Calendar.DATE, 5);
        data_devolucao = c.getTime();
        
        return data_devolucao;
        
    }
}
