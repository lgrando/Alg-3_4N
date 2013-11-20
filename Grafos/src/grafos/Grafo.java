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
import java.util.Scanner;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Jean.Carli
 */
public class Grafo {
    public void montarGrafo() throws FileNotFoundException, IOException{
        Scanner scan = new Scanner(System.in);
        String linha;

        FileInputStream stream = new FileInputStream("Grafo.txt");
        InputStreamReader streamReader = new InputStreamReader(stream);
        BufferedReader reader = new BufferedReader(streamReader);

        linha = reader.readLine();
        System.out.println(linha);
        
        
        while(linha != null)
        {
            linha = reader.readLine();
            System.out.println(linha);
        }
    }
}
