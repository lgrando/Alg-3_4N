/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rbt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Jean.Carli
 */
public class Tree  {
    
    private String kv;
    
    public void crateTree(String file){
       try{
           FileReader arq = new FileReader(file);
           BufferedReader lerArq = new BufferedReader(arq);
           
           String linha = lerArq.readLine();
           
           while (linha != null) {
               System.out.printf("%s\n", linha);
               linha = lerArq.readLine();
           }
           
           arq.close();
       } catch(IOException e){
           System.err.println("Erro ao ler o arquivo: \n" + e.getMessage());
       }
    }
    
    public void addNodo(String kv){
        
    }
    
    public void rmNodo(String kv){
        
    }
    
    public void searchNodo(String kv){
        
    }
    
}
