/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Jean.Carli
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scan = new Scanner(System.in);
        Grafo gr = new Grafo();
        int from, to;
        
        gr.montarGrafo();
        
        System.out.print("Digite o vertice de partida: ");
        from = scan.nextInt();
        System.out.print("\n Digite o vertice de destino: ");
        to = scan.nextInt();
        
        gr.Dijkstra(from, to);
    }
}
