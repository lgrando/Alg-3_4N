/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jean.Carli
 */
public class Grafo {

    Scanner scan;
    private ArrayList<Vertice> grafo = new ArrayList<Vertice>();
    int existe = -1;

    public Grafo() throws FileNotFoundException {
        this.scan = new Scanner(new FileReader("Grafo.txt"));
    }

    public void montarGrafo() throws FileNotFoundException, IOException {
        String valor;

        valor = scan.next();

        Vertice ver = new Vertice();
        ver.setId(Integer.parseInt(valor));
        ver.setEtiqueta(Integer.MAX_VALUE);
        ver.setVerticeVizinhos(Integer.parseInt(scan.next()));
        ver.setPeso(Integer.parseInt(scan.next()));

        grafo.add(ver);

        while (scan.hasNext()) {
            valor = scan.next();

            this.existe = verticeExiste(Integer.parseInt(valor));
            if (this.existe != -1) {
                grafo.get(this.existe).setVerticeVizinhos(Integer.parseInt(scan.next()));
                grafo.get(this.existe).setPeso(Integer.parseInt(scan.next()));
            } else {
                Vertice ver1 = new Vertice();
                ver1.setId(Integer.parseInt(valor));
                ver1.setEtiqueta(Integer.MAX_VALUE);
                ver1.setVerticeVizinhos(Integer.parseInt(scan.next()));
                ver1.setPeso(Integer.parseInt(scan.next()));
                grafo.add(ver1);
            }
        }
        exibeGrafo();
    }

    public int verticeExiste(int id) {
        this.existe = -1;
        for (int i = 0; i < grafo.size(); i++) {
            if (grafo.get(i).getId() == id) {
                this.existe = i;
                break;
            }
        }
        return this.existe;
    }
    
    public void exibeGrafo(){
        for(int i = 0; i < grafo.size(); i++){
            for(int j = 0; j < grafo.get(i).getVerticeVizinhos().size(); j++){
                System.out.println(grafo.get(i).getId() + " " + grafo.get(i).getVerticeVizinhos().get(j) + " " + grafo.get(i).getPeso().get(j));
            }
        }
    }
}
