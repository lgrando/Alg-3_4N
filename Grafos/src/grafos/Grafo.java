/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jean.Carli
 */
public class Grafo {
    public void montarGrafo() throws FileNotFoundException, IOException{
        String linha;

        FileInputStream stream = new FileInputStream("Grafo.txt");
        InputStreamReader streamReader = new InputStreamReader(stream);
        BufferedReader reader = new BufferedReader(streamReader);

        linha = reader.readLine();
        
        while(linha != null)
        {
            System.out.println(linha);
            linha = reader.readLine();
        }
    }
}
