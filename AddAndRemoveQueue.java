package atvd7estruturadedados1fila;

import br.unicap.ed.TAD.Queue;
import java.util.Scanner;

/*
João tem uma lanchonete. Na lanchonete do João só trabalham duas pessoas: ele e sua esposa Maria.
Maria atende as mesas e anota os pedidos. Cada pedido tem um número
que corresponde ao número do boleto onde o mesmo foi anotado. Maria
passa os pedidos a João, que os prepara. A ordem de preparo é a mesma
ordem em que o pedido foi feito. Quando o pedido está pronto, João avisa
Maria, que o leva até o cliente. Implemente um programa que contenha um
procedimento para incluir um novo pedido na lista de pedidos da
lanchonete e um procedimento para registrar o atendimento de um pedido.
*/

public class Atvd7EstruturaDeDados1Fila {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int op;
        String pedido;
        Queue pedidos = new Queue();

        do {
            menu();

            op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.println("Digite o nome do novo pedido");
                pedido = sc.nextLine();
                pedidos.enqueue(pedido);
                System.out.println("Pedido solicitado");

            } else if (op == 2) {
                if (!pedidos.isEmpty()) {
                    pedidos.dequeue();
                    System.out.println("Pedido entregue");
                } else {
                    System.err.println("Nenhum pedido a ser entregue");
                }
            } else if (op == 3) {
                    System.out.println("Fechando loja...");
                    Thread.sleep(1200);
                    System.out.println("Limpando...");
                    Thread.sleep(1100);
                    System.out.println("Apagando as luzes...");
                    Thread.sleep(1500); // timer in miliseconds
                System.err.println("Loja fechada =D");
            }

        } while (op != 3);

    }

    public static void registrarAtendimento(Queue pedidos) {

    }

    private static void registrarNovoPedido(Queue pedidos) {

    }

    private static void menu() {
        System.out.print("1 - Registrar novo pedido \n"
                + "2 - Registrar atendimento do pedido \n"
                + "3 - Fechar loja \n"
                + "Sua opção: ");

    }

}
