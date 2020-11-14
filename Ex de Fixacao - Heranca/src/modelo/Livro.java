package modelo;

public class Livro extends Publicacao{

    private int isbn;

    public Livro(String nome, String dataPub, String editora, int isbn) {
        super(nome, dataPub, editora);
        this.isbn = isbn;
    }

    public Livro(){}


    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livro{" +
                super.toString()+
                "isbn=" + isbn +
                "} ";
    }
}
