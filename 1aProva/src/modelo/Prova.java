package modelo;

import java.util.ArrayList;

public class Prova {

    //Atributos
    private int idProva;
    private ArrayList<Integer> pesos;
    private ArrayList<Float> pontuacoesQuestoes;
    private ArrayList<String> respostaCerta;
    private ArrayList<String> perguntas;
    private ArrayList<String> respostas;
    private Aluno aluno;


    //Construtor
    public Prova(int idProva, Aluno aluno,
                 ArrayList<Integer> pesos,
                 ArrayList<String> respostaCerta,
                 ArrayList<String> perguntas,
                 ArrayList<String> respostas,
                 ArrayList<Float> pontuacoesQuestoes){
        this.idProva = idProva;
        this.aluno = aluno;
        this.pesos = pesos;
        this.respostaCerta = respostaCerta;
        this.perguntas = perguntas;
        this.respostas = respostas;
        this.pontuacoesQuestoes = pontuacoesQuestoes;
    }

    public Prova(){}

    //Métodos



    public String toString() {
        return "Prova{" +
                "idProva=" + idProva +
                ", pesos=" + pesos +
                ", pontuacoesQuestoes=" + pontuacoesQuestoes +
                ", respostaCerta=" + respostaCerta +
                ", perguntas=" + perguntas +
                ", respostas=" + respostas +
                ", aluno=" + aluno +
                '}';
    }

    public float calcularNota(){
        float media=0;
        for (int i=0;i<perguntas.size();i++){
            media += pontuacoesQuestoes.get(i) * pesos.get(i);
        }
        return media/10;
    }



    //Get e Set
    public int getIdProva() {
        return idProva;
    }

    public void setIdProva(int idProva) {
        this.idProva = idProva;
    }

    public ArrayList<Integer> getPesos() {
        return pesos;
    }

    public void setPesos(ArrayList<Integer> pesos) {
        this.pesos = pesos;
    }

    public ArrayList<Float> getPontuacoesQuestoes() {
        return pontuacoesQuestoes;
    }

    public void setPontuacoesQuestoes(ArrayList<Float> pontuacoesQuestoes) {
        this.pontuacoesQuestoes = pontuacoesQuestoes;
    }

    public ArrayList<String> getRespostaCerta() {
        return respostaCerta;
    }

    public void setRespostaCerta(ArrayList<String> respostaCerta) {
        this.respostaCerta = respostaCerta;
    }

    public ArrayList<String> getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(ArrayList<String> perguntas) {
        this.perguntas = perguntas;
    }

    public ArrayList<String> getRespostas() {
        return respostas;
    }

    public void setRespostas(ArrayList<String> respostas) {
        this.respostas = respostas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }


}
