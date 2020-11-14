package modelo;

public class Revista extends Publicacao {


    private String periodicidade;


    public Revista(String nome, String dataPub, String editora, String periodicidade) {
        super(nome, dataPub, editora);
        this.periodicidade = periodicidade;
    }

    public Revista(){}


    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    @Override
    public String toString() {
        return "Revista{" +
                super.toString()+
                "periodicidade='" + periodicidade + '\'' +
                "} ";
    }
}
