/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sus_tad;

import java.util.Scanner;
import static sus_tad.Atendimento.Atendimento;

/**
 *
 * @author Juliana Mareco
 */
public class Chamar {

    public void Chamar(Fila consulta, Fila retorno, Fila especialidade) {
        Scanner entrada = new Scanner(System.in);
        boolean sair = false;
        do {
            System.out.println("\n=== Chamada de Pacientes ===");
            System.out.println("1. Primeira Consulta");
            System.out.println("2. Retorno");
            System.out.println("3. Especialidade do Dia");
            System.out.println("4. Voltar");
            System.out.println("0. Sair");
            System.out.print("Informe a opcao: ");
            if (entrada.hasNextLine()) {
                int opcao = entrada.nextInt();
                entrada.nextLine();
                switch (opcao) {
                    case 1:
                        if (!consulta.vazia()) {
                            System.out.println("\n==========================");
                            System.out.println("Paciente: " + consulta.remove());
                            System.out.println("==========================\n");
                        } else {
                            System.out.println("\n==========================");
                            System.out.println("Fila Vazia!");
                            System.out.println("==========================\n");
                        }
                        break;
                    case 2:
                        if (!retorno.vazia()) {
                            System.out.println("\n==========================");
                            System.out.println("Paciente: " + retorno.remove());
                            System.out.println("==========================\n");
                        } else {
                            System.out.println("\n==========================");
                            System.out.println("Fila Vazia!");
                            System.out.println("==========================\n");
                        }
                        break;
                    case 3:
                        if (!especialidade.vazia()) {
                            System.out.println("\n==========================");
                            System.out.println("Paciente: " + especialidade.remove());
                            System.out.println("==========================\n");
                        } else {
                            System.out.println("\n==========================");
                            System.out.println("Fila Vazia!");
                            System.out.println("==========================\n");
                        }
                        break;
                    case 0:
                        sair = true;
                        break;

                    case 4:
                        Atendimento();
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
                System.out.println("Entrada Inválida");
                System.out.println("==========================\n");
                entrada.nextLine();
            }
        } while (!sair);

    }

}
