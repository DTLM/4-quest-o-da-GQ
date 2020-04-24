/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;

import java.util.Scanner ;

public class Aplicacao {

        static Scanner s = new Scanner(System.in);

        private static int menu() {

            System.out.println("Menu");
            System.out.println("1 - Para Novo Motorista");
            System.out.println("2 - Para Novo Passageiro");
            System.out.println("3 - Solicitar Corrida");
            System.out.println("5 - Para Sair");
            int opcao = s.nextInt();
            s.nextLine();
            return opcao;
        }

        public static void main(String[] args) {
            Uber logica = new Uber();
            int opcao;
            do {
                opcao = menu();

                switch (opcao) {
                    case 1: {
                        System.out.println("Digite um nome");
                        String nome = s.nextLine();
                        System.out.println("Digite o modelo do carro");
                        String modelo = s.nextLine();
                        System.out.println("Digite um telefone");
                        int telefone = s.nextInt();
                        s.nextLine();
                        logica.adicionaMotorista(nome, modelo, telefone);
                        break;
                    }
                    case 2: {
                        System.out.println("Digite um nome");
                        String nome = s.nextLine();
                        System.out.println("Digite um telefone");
                        int telefone = s.nextInt();
                        s.nextLine();
                        logica.adicionaPassageiro(nome, telefone);
                        break;
                    }
                    case 3: {
                        System.out.println("Digite o numero do telefone do passageiro");
                        int telefone = s.nextInt();
                        s.nextLine();
                        System.out.println("A origem da viagem");
                        String origem = s.nextLine();
                        System.out.println("O destino da viagem");
                        String destino = s.nextLine();
                        double valor = logica.solicitarCorrida(telefone, origem, destino);
                        System.out.println("Sua corrida vai custar " + valor);
                        break;
                    }
                    default:
                        throw new IllegalArgumentException("Unexpected value: " + opcao);
                }
            } while (opcao != 5);
        }

}
