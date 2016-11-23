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

    public static void menu() {
        Fila normal = new Fila();
        Fila preferencial = new Fila();
        int opcao, atend;

        Scanner entrada = new Scanner(System.in);

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
                            normal.insere(nome);
                            break;
                        case 2:
                            preferencial.insere(nome);
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
        
        Recepcao instancia = new Recepcao();
        instancia.GuicheNormal(normal);
    }

}
