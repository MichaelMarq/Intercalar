
package intercalarvalores;

import java.util.Scanner;


public class IntercalarValores {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int [10];
        int aux[] = new int[10];
        int indice = 0, indice1 = numeros.length-1;
                
        System.out.println("Dimension del arregli: "+numeros.length);
        
        for(int i =0; i< numeros.length; i++){
            System.out.println("Ingrese los numeros: ");
            numeros[i] = entrada.nextInt();
        }
            
        for(int i=0; i<aux.length; i++){
            
            if(i%2 == 0){
                aux[i] = numeros[indice];
                indice++;
            }
            else{
               aux[i] = numeros[indice1];
               indice1--;
            }
        }
        
        System.out.println("");
        for(int mostrar: aux){
            System.out.println(mostrar);
        }
        
    }
    
}
