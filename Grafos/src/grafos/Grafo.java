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
    
    public void montarGrafo() throws FileNotFoundException, IOException{
        String valor;

        valor = scan.next();
        
        Vertice ver = new Vertice();
        JOptionPane.showMessageDialog(null, valor);
        ver.setId(Integer.parseInt(valor));
        ver.setArestaVizinha(Integer.parseInt(scan.next()));
        ver.setPeso(Integer.parseInt(scan.next()));
        
        grafo.add(ver);
        
        while(valor != null)
        {
            valor = scan.next();
            
            Vertice ver1 = new Vertice();
            existe = verticeExiste(Integer.parseInt(valor));
            if(existe != -1){
                grafo.get(existe).setArestaVizinha(Integer.parseInt(scan.next()));
                grafo.get(existe).setPeso(Integer.parseInt(scan.next()));
            }else {
                ver.setId(Integer.parseInt(valor));
                ver.setArestaVizinha(Integer.parseInt(scan.next()));
                ver.setPeso(Integer.parseInt(scan.next()));
                grafo.add(ver);
            }
        }
    }
    
    public int verticeExiste (int linha){
        int existe = -1;
        for(int i = 0; i < grafo.size(); i++){
            if(grafo.get(i).getId() == linha){
                existe = i;
                break;
            }
        }
        return existe;
    }
}
