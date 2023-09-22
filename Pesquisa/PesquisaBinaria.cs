/*using System;

class MainPB{

    //Definir tamanho para vetor []
    const int TAM = 10;

    //Preencher o vetor [] com valores aleatorios
    public static void preeencherVetor(int [] vetor){
        Random rnd = new Random();
        for (int i = 0; i < TAM; i++){
            vetor[i] = rnd.Next(TAM);
        }
    }

    //Imprimir o vetor [] na tela
    public static void ImprimirVetor(int [] vetor){
        Console.Write("[ ");
        foreach(int x in vetor){
            Console.Write(x + ", ");
        }
        Console.Write("]");
    }

    public static void Main(String [] args){
        int [] vetor = new int[TAM];
        preeencherVetor(vetor);
        ImprimirVetor(vetor);

        //Leitura do número a ser pesquisado
        Console.WriteLine("\nEntre com um número: ");
        int num = Int32.Parse(Console.ReadLine());

        //Ordenar o vetor [] com o método nativo
        Array.Sort(vetor);
        ImprimirVetor(vetor);

        //Invicar a pesquisa binária nativa da class Array
        int resp = Array.BinarySearch(vetor, num);
        if(resp >= 0){
            Console.WriteLine("\nO número " + num + ", foi encontado com SUCESSO!!!");
        }else{
            Console.WriteLine("\nO número " + num + ", nao foi encontrado.");
        }

    }

}
*/