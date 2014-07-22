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
public class Pintar {
    
    public void pintarm (int[][] matriz){
        for(int i=0; i<10; i++){
            for(int j=0; j<5; j++){
               
              System.out.print(matriz[i][j]+" ");  
              
            }
              System.out.println();
        }
        System.out.println();
    }
    }

