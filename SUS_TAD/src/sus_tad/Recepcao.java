package sus_tad;

import java.util.Scanner;
import static sus_tad.Atendimento.Atendimento;

public class Recepcao {

    Fila consulta = new Fila();
    Fila retorno = new Fila();
    Fila especialidade = new Fila();
    
    /**
     * Metodo que pega a fila normal e separa em primeira consulta, retorno ou especialidade do dia
     * @param normal Fila normal
     */
    public void GuicheNormal(Fila normal) {
        Scanner entrada = new Scanner(System.in);

        while (!normal.vazia()) {
            String paciente = normal.remove().toString();
            System.out.println("\n==========================");
            System.out.println("Paciente: " + paciente);
            System.out.println("==========================\n");
            System.out.println("1. Primeira Consulta");
            System.out.println("2. Retorno");
            System.out.println("3. Especialidade do Dia");
            System.out.print("Informe a opção: ");
            if (entrada.hasNextInt()) {
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
                    case 0:
                        Chamar c = new Chamar();
                        c.Chamar(consulta, retorno, especialidade);
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

        }

    }

    /**
     * Metodo que pega a fila preferencial e separa em primeira consulta, retorno ou especialidade do dia
     * @param preferencial Fila preferencial
     */
    public void GuichePreferencial(Fila preferencial) {
        Scanner entrada = new Scanner(System.in);

        while (!preferencial.vazia()) {
            String paciente = preferencial.remove().toString();
            System.out.println("\n==========================");
            System.out.println("Paciente: " + paciente);
            System.out.println("==========================\n");
            System.out.println("1. Primeira Consulta");
            System.out.println("2. Retorno");
            System.out.println("3. Especialidade do Dia");
            System.out.print("Informe a opção: ");
            if (entrada.hasNextInt()) {
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
            } else {
                System.out.println("\n==========================");
                System.out.println("Entrada Inválida!");
                System.out.println("==========================\n");
                entrada.nextLine();
            }
        }

    }

    /**
     * Metodo que seleciona qual o guiche deseja abrir
     * Aonde podemos ir para a parte de chamar os pacientes
     * @param normal
     * @param preferencial 
     */
    public void Guiche(Fila normal, Fila preferencial) {
        Scanner entrada = new Scanner(System.in);
        boolean sair = false;
        do {
            System.out.println("\n=== Guiches ===");
            System.out.println("1. Guiche Normal");
            System.out.println("2. Guiche Preferencial");
            System.out.println("3. Chamar Pacientes");
            System.out.println("4. Voltar");
            System.out.println("0. sair");
            System.out.print("Informe o Guiche: ");
            if (entrada.hasNextInt()) {
                int op = entrada.nextInt();
                entrada.nextLine();
                switch (op) {
                    case 1:
                        if (!normal.vazia()) {
                            GuicheNormal(normal);
                        } else {
                            System.out.println("\n==========================");
                            System.out.println("Fila Vazia!");
                            System.out.println("==========================\n");
                        }

                        break;
                    case 2:
                        if (!preferencial.vazia()) {
                            GuichePreferencial(preferencial);
                        } else {
                            System.out.println("\n==========================");
                            System.out.println("Fila Vazia!");
                            System.out.println("==========================\n");
                        }
                        break;

                    case 3:
                        Chamar c = new Chamar();
                        c.Chamar(consulta, retorno, especialidade);
                        sair = true;
                        break;
                    case 4:
                        Atendimento();
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
