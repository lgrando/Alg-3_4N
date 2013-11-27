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

/**
 *
 * @author Jean.Carli
 */
public class Grafo {

    Scanner scan;
    private ArrayList<Vertice> grafo = new ArrayList<Vertice>();
    private ArrayList<Integer> caminho = new ArrayList<Integer>();
    int verticeExiste = -1;
    int vizinhoExiste = -1;

    public Grafo() throws FileNotFoundException {
        this.scan = new Scanner(new FileReader("Grafo.txt"));
    }

    public void montarGrafo() throws FileNotFoundException, IOException {
        String idVertice, vizinho;

        idVertice = scan.next();

        Vertice ver = new Vertice();
        ver.setId(Integer.parseInt(idVertice));
        ver.setEtiqueta(Integer.MAX_VALUE);
        vizinho = scan.next();
        this.vizinhoExiste = vizinhoExiste(Integer.parseInt(vizinho));
        if (this.vizinhoExiste == -1) {
            Vertice ver3 = new Vertice();

            ver3.setId(Integer.parseInt(vizinho));
            ver3.setEtiqueta(Integer.MAX_VALUE);

            grafo.add(ver3);
        }
        ver.setVerticeVizinhos(Integer.parseInt(vizinho));
        ver.setPeso(Integer.parseInt(scan.next()));

        grafo.add(ver);

        while (scan.hasNext()) {
            idVertice = scan.next();

            this.verticeExiste = verticeExiste(Integer.parseInt(idVertice));
            if (this.verticeExiste != -1) {
                vizinho = scan.next();
                vizinhoExiste = vizinhoExiste(Integer.parseInt(vizinho));
                if (vizinhoExiste == -1) {
                    Vertice ver4 = new Vertice();

                    ver4.setId(Integer.parseInt(vizinho));
                    ver4.setEtiqueta(Integer.MAX_VALUE);

                    grafo.add(ver4);
                }
                grafo.get(this.verticeExiste).setVerticeVizinhos(Integer.parseInt(vizinho));
                grafo.get(this.verticeExiste).setPeso(Integer.parseInt(scan.next()));
            } else {
                Vertice ver1 = new Vertice();
                ver1.setId(Integer.parseInt(idVertice));
                ver1.setEtiqueta(Integer.MAX_VALUE);
                vizinho = scan.next();
                this.vizinhoExiste = vizinhoExiste(Integer.parseInt(vizinho));
                if (this.vizinhoExiste == -1) {
                    Vertice ver5 = new Vertice();

                    ver5.setId(Integer.parseInt(vizinho));
                    ver.setEtiqueta(Integer.MAX_VALUE);

                    grafo.add(ver5);
                }
                ver1.setVerticeVizinhos(Integer.parseInt(vizinho));
                ver1.setPeso(Integer.parseInt(scan.next()));
                grafo.add(ver1);
            }
        }
    }

    public int verticeExiste(int id) {
        this.verticeExiste = -1;
        for (int i = 0; i < grafo.size(); i++) {
            if (grafo.get(i).getId() == id) {
                this.verticeExiste = i;
                break;
            }
        }
        return this.verticeExiste;
    }
    
    public int vizinhoExiste(int id) {
        this.vizinhoExiste = -1;
        for (int i = 0; i < grafo.size(); i++) {
            if (grafo.get(i).getId() == id) {
                this.vizinhoExiste = i;
                break;
            }
        }
        return this.vizinhoExiste;
    }

    public void zeraEtiquetaVerticeInicial(int from) {
        for (int i = 0; i < grafo.size(); i++) {
            if (grafo.get(i).getId() == from) {
                grafo.get(i).setEtiqueta(0);
            }
        }
    }

    public void Dijkstra() {
        int existeVerticeNaoVisitado;
        int menorEtiquetaNaoVisitada = Integer.MAX_VALUE;
        do {
            existeVerticeNaoVisitado = 0;

            for (int i = 0; i < grafo.size(); i++) {
                if (grafo.get(i).getEtiqueta() <= menorEtiquetaNaoVisitada && (grafo.get(i).isVisitado() == false)) {
                    menorEtiquetaNaoVisitada = grafo.get(i).getEtiqueta();
                }
            }

            for (int i = 0; i < grafo.size(); i++) {
                if (grafo.get(i).getEtiqueta() == menorEtiquetaNaoVisitada && (grafo.get(i).isVisitado() == false)) {
                    grafo.get(i).setVisitado(true);

                    for (int j = 0; j < grafo.get(i).getVerticeVizinhos().size(); j++) {
                        if ((grafo.get(grafo.get(i).getVerticeVizinhos().get(j)).getEtiqueta()) > (grafo.get(i).getEtiqueta() + grafo.get(i).getPeso().get(j))) {
                            grafo.get(grafo.get(i).getVerticeVizinhos().get(j)).setEtiqueta(grafo.get(i).getEtiqueta() + grafo.get(i).getPeso().get(j));
                            grafo.get(grafo.get(i).getVerticeVizinhos().get(j)).setPrecedente(grafo.get(i).getId());
                        }
                    }
                    menorEtiquetaNaoVisitada = Integer.MAX_VALUE;
                }
            }

            for (int i = 0; i < grafo.size(); i++) {
                if (!grafo.get(i).isVisitado()) {
                    existeVerticeNaoVisitado++;
                }
            }

        } while (existeVerticeNaoVisitado != 0);
    }

    public String menorCaminho(int from, int to) {
        String menorCaminho = null;
        this.caminho.add(to);

        for (int i = 0; i < this.grafo.size(); i++) {
            if (this.grafo.get(i).getId() == to) {
                this.caminho.add(this.grafo.get(i).getPrecedente());
                to = this.grafo.get(i).getPrecedente();
                i = 0;
            }
        }

        for (int i = this.caminho.size(); i > 0; i--) {
            menorCaminho = menorCaminho + " --> " + this.caminho.get(i);
        }

        return menorCaminho;
    }
}
