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
        ver.setId(Integer.parseInt(valor));
        ver.setVerticeVizinha(Integer.parseInt(scan.next()));
        ver.setPeso(Integer.parseInt(scan.next()));
        
        grafo.add(ver);
        
        while(scan.hasNext())
        {
            valor = scan.next();

            existe = verticeExiste(Integer.parseInt(valor));
            if(existe != -1){
                grafo.get(existe).setVerticeVizinha(Integer.parseInt(scan.next()));
                grafo.get(existe).setPeso(Integer.parseInt(scan.next()));
            }else {
                Vertice ver1 = new Vertice();
                ver1.setId(Integer.parseInt(valor));
                ver1.setVerticeVizinha(Integer.parseInt(scan.next()));
                ver1.setPeso(Integer.parseInt(scan.next()));
                grafo.add(ver);
            }
            exibeGrafo();
        }
    }
    
    public int verticeExiste (int id){
        for(int i = 0; i < grafo.size(); i++){
            if(grafo.get(i).getId() == id){
                existe = i;
                break;
            }
        }
        return existe;
    }
    
    public void exibeGrafo(){
        for(int i = 0; i <= grafo.size(); i++){
            for(int j = 0; j <= grafo.get(i).getVerticeVizinha().size(); i++){
                System.out.println(grafo.get(i).getId() + " --> " + grafo.get(i).getVerticeVizinha().get(j));
            }
        }
    }
}
