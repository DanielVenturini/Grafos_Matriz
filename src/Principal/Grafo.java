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
public class Grafo {
    
    private String[][] grafo;
    private final int dimension;

        Grafo(int dimension){
            grafo = new String[dimension][dimension];
            this.dimension = dimension;
            
            initializeGrafo();
        }

    private void initializeGrafo(){
        for(int i = 0; i < dimension; i ++){
            for(int j = 0; j < dimension; j ++){
                grafo[i][j] = "0";
            }
        }
    }
    
    public String[][] getGrafo(){
        return grafo;
    }

    private boolean isNotVertice(int vertice){
        if(vertice > dimension-1){
            System.out.println("Vertice maior que a dimensao: " + dimension);
            return true;
        }
        return false;
    }

    public void addVertice(int vertice){
        if(isNotVertice(vertice)){
            return;
        }

        grafo[vertice][vertice] = "1";
    }

    public void addAresta(int v1, int v2){
        if(isNotVertice(v1) || isNotVertice(v2)){
            return;
        }

        if(grafo[v1][v1].equals("0") || grafo[v2][v2].equals("0")){
            System.out.println("Um dos indices nao sao vertices: " + v1 + " " + v2);
            return;
        }

        grafo[v1][v2] = grafo[v2][v1] = "1";
    }

    public void removeVertice(int vertice){
        if(isNotVertice(vertice)){
            return;
        }

        grafo[vertice][vertice] = "0";
        for(int i = 0; i < dimension; i ++){
            grafo[vertice][i] = grafo[i][vertice] = "0";
        }
    }

    public void removeAresta(int v1, int v2){
        if(isNotVertice(v1) || isNotVertice(v2)){
            return;
        }

        grafo[v1][v2] = grafo[v2][v1] = "0";
    }

    public void print(){
        for(int i = 0; i < dimension; i ++){
            if(grafo[i][i].equals("0")){
                continue;
            }
            
            System.out.print(i + " => [");
            for(int j = 0; j < dimension; j ++){
                if(i==j){
                    continue;
                }

                if(grafo[i][j].equals("1")){
                    System.out.print(j + " ");
                }
            }
            System.out.println("]");
        }
    }
    
}
