package visao;

import modelo.Conta;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int qtdContas, numConta, indiceMaior = 0;
        ArrayList<Conta>  contas = new ArrayList<>();
        float saldo, maiorSaldo=0;

        System.out.println("Insira o número de contas a serem digitadas");
        qtdContas = scan.nextInt();

        for (int i=0;i<qtdContas;i++){
            System.out.println("Insira o numero da "+(i+1)+"ª conta");
            numConta = scan.nextInt();
            System.out.println("Insira o saldo da "+(i+1)+"ª conta");
            saldo = scan.nextFloat();
            if(saldo > maiorSaldo){
                indiceMaior = i;
                maiorSaldo = saldo;
            }
            contas.add(new Conta(numConta,saldo));
        }

        System.out.println("O número da conta de maior saldo é: "+contas.get(indiceMaior).getNumero());



    }
}
