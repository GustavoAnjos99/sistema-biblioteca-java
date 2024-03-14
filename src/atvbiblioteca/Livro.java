package atvbiblioteca;

public class Livro {
    private int isbn;
    private String titulo;
    private Autor autor;
    private Editora editora;
    private boolean servivel = true;
    
    Livro(){};
    Livro(int isbn, String tit, Autor at, Editora ed){
        this.isbn = isbn;
        this.titulo = tit;
        this.autor = at;
        this.editora = ed;
    }
    
    public void livroInservivel(){
        this.servivel = false;
    }
    
    public void manter(){}
    public void pesquisar(){}
            
}
