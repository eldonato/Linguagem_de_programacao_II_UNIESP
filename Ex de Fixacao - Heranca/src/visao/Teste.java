package visao;

import modelo.Livro;
import modelo.Revista;

public class Teste {

    public static void main(String[] args) {

        Livro ibizaBohemia = new Livro("Ibiza Bohemia", "15/05/2017", "Amazon", 2541);
        Revista veja = new Revista("VEJA", "30/09/2020", "Abril", "Semanal");

        System.out.println(ibizaBohemia);
        System.out.println(veja);
    }




}
