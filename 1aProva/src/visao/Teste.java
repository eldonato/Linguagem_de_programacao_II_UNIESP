package visao;

import modelo.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<String> respostaCerta = new ArrayList<>();
        ArrayList<String> respostasAluno = new ArrayList<>();
        ArrayList<ArrayList<String>> respostas = new ArrayList<>();
        ArrayList<String> perguntas = new ArrayList<>();
        ArrayList<Integer> pesos = new ArrayList<>();
        ArrayList<Float> pontuacoesQuestoes = new ArrayList<>();
        ArrayList<ArrayList<Float>> pontuacoesAluno = new ArrayList<>();
        ArrayList<Prova> provas = new ArrayList<>();
        int matricula, varAux, i, idProva;
        String nome, curso;

        System.out.println("Bem vindo ao sistema de provas!");

        System.out.print("Insira a quantidade de alunos: ");
        varAux = scan.nextInt();

        for (i = 0; i < varAux; i++) {
            System.out.println("Informações do aluno " + (i + 1));

            System.out.println("Nome: ");
            nome = scan.next();
            System.out.println("Matrícula: ");
            matricula = scan.nextInt();
            System.out.println("Curso: ");
            curso = scan.next();
            alunos.add(new Aluno(nome, matricula, curso));
        }
        System.out.println("Insira o identificador da prova: ");
        idProva = scan.nextInt();
        System.out.println("Insira a quantidade de questões: ");
        varAux = scan.nextInt();

        for (i = 0; i < varAux; i++) {
            perguntas.add("Q" + (i + 1));
            System.out.println("Reposta certa da " + (i + 1) + "ª questão: ");
            respostaCerta.add(scan.next());
            System.out.println("Peso da " + (i + 1) + "ª questão: ");
            pesos.add(scan.nextInt());
        }

        for (i = 0; i < alunos.size(); i++) {
            respostasAluno.clear();
            pontuacoesQuestoes.clear();
            System.out.println("Aluno " + alunos.get(i).getNome());
            for (int j = 0; j < perguntas.size(); j++) {
                System.out.println(perguntas.get(j) + "? ");
                respostasAluno.add(scan.next());
                if (respostasAluno.get(j).equalsIgnoreCase(respostaCerta.get(j))) {
                    pontuacoesQuestoes.add(10f);
                } else
                    pontuacoesQuestoes.add(0f);
            }
            pontuacoesAluno.add(pontuacoesQuestoes);
            respostas.add(respostasAluno);
        }

        for (i = 0; i < alunos.size(); i++) {
            respostas.add(respostasAluno);
            provas.add(new Prova(idProva, alunos.get(i), pesos, respostaCerta, perguntas, respostas.get(i),
                    pontuacoesAluno.get(i)));
        }

        for (i = 0; i < alunos.size(); i++) {
            System.out.println("Notas do aluno " + provas.get(i).getAluno().getNome());
            System.out.println(provas.get(i).calcularNota());
        }

        scan.close();
    }
}
