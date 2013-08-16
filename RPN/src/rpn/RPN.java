/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpn;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Jean.Carli
 */
public class RPN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Double> pilha = new <Double>Stack();
        String om, parentese;
        int idxi, idxf;
        
        System.out.println("Digite a operação matematica: ");
        om = s.nextLine();
        
        if(om.lastIndexOf("(") >= 0){
            idxi = om.lastIndexOf("(");
            parentese = om.substring(idxi, om.length());
            idxf = parentese.indexOf(")") + idxi;
            parentese = om.substring(idxi + 1, idxf);
            System.out.println(parentese);
        }
        
    }
}
