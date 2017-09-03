/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Daniel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grafo g = new Grafo(10);
        
        g.addVertice(0);
        g.addVertice(1);
        g.addVertice(2);
        g.addVertice(4);
        g.addVertice(5);
        g.addVertice(6);
        g.addVertice(7);
        g.addVertice(9);

        g.addAresta(0,2);
        g.addAresta(0,5);
        g.addAresta(2,1);
        g.addAresta(4,5);
        g.addAresta(2,9);
        g.addAresta(0,7);
        g.addAresta(1,4);
        g.addAresta(7,9);
        g.addAresta(0,9);

        g.removeVertice(0);
        g.print();
    }
    
}
