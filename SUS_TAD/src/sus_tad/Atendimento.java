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

    public static void Atendimento() {
        Fila normal = new Fila();
        Fila preferencial = new Fila();
        boolean sair = false;
        int opcao;
        String nome;
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n==========================");
                            System.out.println("Clinica Oftalmológica!");
                            System.out.println("==========================\n");
        do {
            System.out.println("\n ==== Tipo de Atendimento ===");
            System.out.println("1. Atendimento Normal");
            System.out.println("2. Atendimento Preferêncial");
            System.out.println("3. Recepcao/Guiches");
            System.out.println("0. Sair");
            System.out.print("Informe a opção: ");
            
            if (entrada.hasNextInt()) {
                opcao = entrada.nextInt();
            entrada.nextLine();
                switch (opcao) {
                    case 1:
                        System.out.print("Informe o nome do paciente: ");
                        nome = entrada.nextLine();
                        normal.insere(nome);
                        break;
                    case 2:
                        System.out.print("Informe o nome do paciente: ");
                        nome = entrada.nextLine();
                        preferencial.insere(nome);
                        break;
                    case 3:
                        Recepcao r = new Recepcao();
                        r.Guiche(normal, preferencial);
                        sair = true;
                        break;
                    case 0:
                        sair = true;
                        break;
                    default:
                        System.out.println("\n==========================");
                            System.out.println("Opção Inválida!");
                            System.out.println("==========================\n");
                        break;
                }

            } else {
                System.out.println("\n==========================");
                            System.out.println("Entrada Inválida!");
                            System.out.println("==========================\n");
                entrada.nextLine();
            }
        } while (!sair);

    }

}
