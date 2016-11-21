/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sus_tad;

import java.util.Scanner;

/**
 *
 * @author Juliana Mareco
 */
public class Atendimento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;
        int nor = 1;
        int pref = 1;
        boolean sair = false;
        Fila normal = new Fila(nor);
        Fila preferencial = new Fila(pref);
        do {
            System.out.println("1. Atendimento Normal");
            System.out.println("2. Atendimento Preferêncial");
            System.out.println("0. Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Informe o nome do paciente: ");
            String nome = entrada.nextLine();
            
            switch (opcao) {
                case 1:
                    normal.enqueue(nome);
                    nor++;
                    break;
                case 2:
                    preferencial.enqueue(nome);
                    pref++;
                    break;
                case 0:
                    sair = true;
                    break;
            }

        } while (sair = true);

    }
}
