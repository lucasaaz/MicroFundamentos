/*using System;

class MainOS{

    //Definir o tamanho do vetor
    const int TAM = 7;
    public static int contador;

    //Preencher o vetor [] com valores aleatórios
    public static async void preencherVetor(int [] vetor){
        Random rnd = new Random();
        for(int i=0; i<TAM; i++){
            vetor[i] = rnd.Next(100);
        }
    }

    //Imprimir vetor []
    public static void imprimirVetor(int [] array){
        Console.Write("\n[ ");
        foreach (int x in array){
            Console.Write(x + " ");
        }
         Console.Write("]");
    }

    //SWAP - Trocar elementos do lugar no vetor
    public static void swap(int menor, int i, int [] array){
        int temp = array[menor]; 
        array[menor] = array[i]; 
        array[i] = temp;         
    }

    //Seleção - Pesquisar elemento chave no vetor
    private static void selecao(int [] vetor, int tam){
        int i, j, menor;

        for (i = 0; i < tam - 1; i++){
            menor = i;

            for (j = i + 1; j < tam; j++){
                
                contador++;
                if (vetor[menor] > vetor[j]){
                    menor = j;
                }
            }
            swap(menor, i, vetor);
        }
    }

    public static void Main(String[] args){
        int [] vetor = new int[TAM];

        preencherVetor(vetor);

        imprimirVetor(vetor);

        selecao(vetor, TAM);

        Console.Write("\n[ ");
        foreach (int item in vetor){
            Console.Write(item + " ");
        }
        Console.Write("]");
        Console.WriteLine("\n\nNumero de comparações: " + contador);
    }

}
*/