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
    private boolean visitando = false;
    private boolean visitado = false;
    private ArrayList<Integer> arestaVizinha = new ArrayList<Integer>();
    private ArrayList<Integer> peso = new ArrayList<Integer>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getArestaVizinha() {
        return arestaVizinha;
    }

    public void setArestaVizinha(int are) {
        this.arestaVizinha.add(are);
    }

    public ArrayList<Integer> getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso.add(peso);
    }
    
}