/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *
 * @author Jean.Carli
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Grafo gr = new Grafo();
        gr.montarGrafo();
    }
}
