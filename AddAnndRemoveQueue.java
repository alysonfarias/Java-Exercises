package atvd7estruturadedados1fila;

import br.unicap.ed.TAD.Queue;
import java.util.Scanner;

public class Atvd7EstruturaDeDados1Fila {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        int op;
        String pedido;
        Queue pedidos = new Queue();

        do {
            menu();

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    registrarAtendimento(pedidos);
                    break;
                case 2:
                    registrarNovoPedido(pedidos);
                    break;
                case 3:
                    fechandoPrograma();
                    break;
                default:
                    break;
            }

        } while (op != 3);

    }

    public static void registrarAtendimento(Queue pedidos) {
        String pedido;
        System.out.println("Digite o nome do novo pedido");
        pedido = sc.nextLine();
        pedidos.enqueue(pedido);
        System.out.println("Pedido solicitado");
    }

    public static void registrarNovoPedido(Queue pedidos) {
        if (!pedidos.isEmpty()) {
            pedidos.dequeue();
            System.out.println("Pedido entregue");
        } else {
            System.err.println("Nenhum pedido a ser entregue");
        }
    }

    public static void fechandoPrograma() {
        System.out.println("Fechando loja...");
        Thread.sleep(1200);
        System.out.println("Limpando...");
        Thread.sleep(1100);
        System.out.println("Apagando as luzes...");
        Thread.sleep(1500); // timer in miliseconds
        System.err.println("Loja fechada =D");
    }

    public static void menu() {
        System.out.print("1 - Registrar novo pedido \n"
                + "2 - Registrar atendimento do pedido \n"
                + "3 - Fechar loja \n"
                + "Sua opção: ");

    }

}
