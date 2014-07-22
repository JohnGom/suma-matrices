/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package opermatriz;

/**
 *
 * @author Administrador
 */
public class OperMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pintar s = new Pintar();
        int [][] A = {{1,2,7,3,5},
                      {3,6,8,5,3},
                      {4,3,7,8,9},
                      {3,5,6,2,8},
                      {9,5,8,4,2},
                      {4,5,6,4,8},
                      {8,7,2,1,0},
                      {5,2,5,9,6},
                      {5,9,8,0,1},
                      {0,1,2,4,7},
                      };
        
        int [][] B = {{2,5,7,4,8},
                      {5,7,4,9,6},
                      {5,4,0,1,2},
                      {8,7,6,2,9},
                      {5,4,7,0,1},
                      {4,7,8,2,5},
                      {6,3,2,1,0},
                      {3,2,4,7,5},
                      {9,8,5,4,2},
                      {7,9,6,4,0},
                      };
        
        
         int [][] C = new int [10][5];
         
         
        for(int i=0; i<10; i++){
            for(int j=0; j<5; j++){
        
          C[i][j]= A[i][j]+B[i][j];
 
  
            }
         }
        System.out.println("matriz A");
        s.pintarm(A);
        
        System.out.println("matriz B");
        s.pintarm(B);
       
        System.out.println("sume de matrices A + B ");
        
        s.pintarm(C);
    
    }
}
