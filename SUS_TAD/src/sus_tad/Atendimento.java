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

        int opcao, atend;
        int nor = 0;
        int pref = 0;
        boolean sair = false;
        Fila normal = new Fila(10);
        Fila preferencial = new Fila(10);

        do {
            System.out.println("Clínica Oftalmológica");
            System.out.println("1. Novo Atendimento");
            System.out.println("0. Sair");
            System.out.print("Informe a opção: ");
            atend = entrada.nextInt();
            entrada.nextLine();

            switch (atend) {
                case 1:
                    System.out.println("\nTipo de Atendimento");
                    System.out.println("1. Atendimento Normal");
                    System.out.println("2. Atendimento Preferêncial");
                    System.out.print("Informe a opção: ");
                    opcao = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("\nInforme o nome do paciente: ");
                    String nome = entrada.nextLine();

                    switch (opcao) {
                        case 1:
                            nor++;
                            normal.enqueue(nome);                            
                            break;
                        case 2:
                            pref++;
                            preferencial.enqueue(nome);                            
                            break;
                        default:
                            System.out.println("Numero Inválido!");
                    }
                case 0:
                    break;
                default:
                    System.out.println("Numero Inválido!");
            }

        } while (atend != 0);

        for (int i = 0; i < nor; i++) {
            System.out.println(normal.dequeue());
        }
        for (int i = 0; i < pref; i++) {
            System.out.println(preferencial.dequeue());
        }

    }
}
