/*
import java.util.Random;

public class AlgoritmoCountingSort {
    
    //Definir tamanho do array
    static int TAM = 10;

    //Preencher o vetor com elementos aléatorios
    public static void preencherVetor(int [] vetor){
        Random rnd = new Random();
        for(int i = 0; i < TAM; i++){
            vetor[i] = rnd.nextInt(100);
        }
    }

    //Imprimir vetor
    public static void imprimirVetor(int [] vetor){
        System.out.print("\n[ ");
        for (int i : vetor) {
            System.out.print( i + " ");
        }
        System.out.print("]\n");
    }

    //Maior elemento
    public static int maiorElemtos(int [] vetor){
        int maior = 0;
        for(int i = 0; i < TAM; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
        return maior;
    }

    //CountingSort
    public static void countingSort(int [] vetor){
        int max = maiorElemtos(vetor);
        //Vetor para contar o numero de ocorrencias de cada elemento
        int [] count = new int[max+1];
        int [] ordenado = new int[TAM + 1];

        //Inicializar a cada posição do vetor de contagem
        for(int i = 0; i < count.length; i++){
            count[i] = 0;
        }

        //Agora, o count[i] contem o numero de elementos iguais a i
        for( int i = 0; i < TAM; i++){
            count[vetor[i]]++;
        }

        //Agora, o count[i] contem o numero de elementos menores ou iguais a i
        for( int i = 1; 1 <= count.length; i++){
            count[i] += count[i - 1];
        }

        //Ordenado
        for(int i = TAM-1; i >= 0; i--){
            ordenado[count[vetor[i]] - 1] = vetor[i];
            //                   7              7
            //             ---3----       ----3---
            //       -------7-------
            //---------6--------------
            count[vetor[i]]--;
        }

    }

    public static void main(String [] args){
        int [] vetor = new int[TAM];

        preencherVetor(vetor);

        imprimirVetor(vetor);

        countingSort(vetor);

        imprimirVetor(vetor);

    }

}
*/
