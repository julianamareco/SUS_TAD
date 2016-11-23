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
public class Recepcao {

    Fila consulta = new Fila();
    Fila retorno = new Fila();
    Fila especialidade = new Fila();

    public void GuicheNormal(Fila normal) {

        Scanner entrada = new Scanner(System.in);

        while (!normal.vazia()) {
            String paciente = normal.remove().toString();

            System.out.println("\n1. Primeira Consulta");
            System.out.println("2. Retorno");
            System.out.println("3. Especialidade do Dia");
            System.out.println("Informe a opção: ");
            int opcao = entrada.nextInt();
            entrada.nextLine();
            switch (opcao) {
                case 1:
                    consulta.insere(paciente);
                    break;
                case 2:
                    retorno.insere(paciente);
                    break;
                case 3:
                    especialidade.insere(paciente);
                    break;
                default:
                    break;
            }
        }

        while (!consulta.vazia()) {
            System.out.println(consulta.remove());

        }

    }

    public void GuichePreferencial(Fila preferencial) {
        Scanner entrada = new Scanner(System.in);

        while (!preferencial.vazia()) {
            String paciente = preferencial.remove().toString();

            System.out.println("\n1. Primeira Consulta");
            System.out.println("2. Retorno");
            System.out.println("3. Especialidade do Dia");
            System.out.println("Informe a opção: ");
            int opcao = entrada.nextInt();
            entrada.nextLine();
            switch (opcao) {
                case 1:
                    consulta.insere(paciente);
                    break;
                case 2:
                    retorno.insere(paciente);
                    break;
                case 3:
                    especialidade.insere(paciente);
                    break;
                default:
                    break;
            }
        }

    }
}
