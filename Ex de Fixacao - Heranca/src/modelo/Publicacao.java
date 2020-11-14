package modelo;

public class Publicacao {
    private String nome;
    private String dataPub;
    private String editora;

    public Publicacao (String nome, String dataPub, String editora){
        this.nome = nome;
        this.dataPub = dataPub;
        this.editora = editora;
    }

    public Publicacao(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataPub() {
        return dataPub;
    }

    public void setDataPub(String dataPub) {
        this.dataPub = dataPub;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Publicacao{" +
                "nome='" + nome + '\'' +
                ", dataPub='" + dataPub + '\'' +
                ", editora='" + editora + '\'' +
                '}';
    }
}
