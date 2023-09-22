/*
import java.util.Random;

public class AlgoritmoBubbleSort {

    //Definir tamanha do array
    static int TAM = 10;

    //Preencher array com elementos aléatorios
    public static void preencherVetor(int [] vetor) {
        Random rnd = new Random();
        for(int i = 0; i < TAM; i++){
            vetor[i] = rnd.nextInt(100);
        }
    }

    //Imprimir vetor
    public static void imprimirVetor(int [] vetor){
        System.out.print("\n[ ");
        for (int i : vetor) {
            System.out.print(i + " ");   
        }
        System.out.print("]\n");
    }

    //Método Bolha (BubbleSort)
    public static void bubblesort(int [] vetor){
        boolean houveTroca = true;
        for(int rep = 0; rep < TAM-1 && houveTroca; rep++){
            houveTroca = false;
            for(int b = 0; b < TAM-(rep + 1); b++){
                if (vetor[b] > vetor[b + 1]) {
                    //Swap
                    int tmp = vetor[b];
                    vetor[b] = vetor[b+1];
                    vetor[b+1] = tmp;
                    houveTroca = true;
                }
            }
        }
    }


    public static void main(String[] args){
        int [] vetor = new int[TAM];

        preencherVetor(vetor);

        System.out.print("\nAntes: ");
        imprimirVetor(vetor);

        bubblesort(vetor);

        System.out.print("\nDepois: ");
        imprimirVetor(vetor);
    }
    
}
*/
