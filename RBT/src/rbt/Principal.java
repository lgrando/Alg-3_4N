/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rbt;

import java.util.Scanner;

/**
 *
 * @author Jean.Carli
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;

        Scanner scan = new Scanner(System.in);
        Tree t = new Tree();

        do {

            System.out.println("Escolha uma das opções abaixo:\n"
                    + "1 - para importar arquivo\n"
                    + "2 - para adicionar nódo\n"
                    + "3 - para remover nódo\n"
                    + "4 - para procurar um nódo\n"
                    + "5 - para sair");
            op = scan.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Digite o nome do arquivo com o caminho:\n");
                    t.crateTree(scan.next());
                    break;
                }
                case 2: {
                    System.out.println("Digite um par de chave=valor:\n");
                    t.addNodo(scan.nextLine());
                    break;
                }
                case 3: {
                    System.out.println("Digite um par de chave=valor:\n");
                    t.rmNodo(scan.nextLine());
                    break;
                }
                case 4: {
                    System.out.println("Digite um par de chave=valor:\n");
                    t.searchNodo(scan.nextLine());
                    break;
                }
                case 5: {
                    System.exit(0);
                }
                default: {
                    System.err.println("Opção inválida, tente novamente.\n");
                    break;
                }
            }
        } while (true);
    }
}
