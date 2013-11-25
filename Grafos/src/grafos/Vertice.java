/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.ArrayList;

/**
 *
 * @author 631210066
 */

public class Vertice {
    private int id;
    private int etiqueta;
    private boolean visitando = false;
    private boolean visitado = false;
    private ArrayList<Integer> verticesVizinhos = new ArrayList<Integer>();
    private ArrayList<Integer> peso = new ArrayList<Integer>();
    
    public int getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(int etiqueta) {
        this.etiqueta = etiqueta;
    }

    public boolean isVisitando() {
        return visitando;
    }

    public void setVisitando(boolean visitando) {
        this.visitando = visitando;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getVerticeVizinhos() {
        return verticesVizinhos;
    }

    public void setVerticeVizinhos(int are) {
        this.verticesVizinhos.add(are);
    }

    public ArrayList<Integer> getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso.add(peso);
    }
    
}