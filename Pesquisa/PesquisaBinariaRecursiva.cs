using System;

class MainPBR{

    //Definir tamanho para vetor []
    const int TAM = 100;
    public static int contador;

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

    //Pesquisa Binaria Recursiva
    public static int pesquisaBinariaRecursiva(int [] vetor, int esq, int dir, int chave){
        if(esq>dir) return -1;
        else{
            int meio = (esq + dir) / 2;
            contador++;
            if(chave == vetor[meio]){
                return meio;
            }else if(chave > vetor[meio]){
                return pesquisaBinariaRecursiva(vetor, meio + 1, dir, chave);
            }else {
                return pesquisaBinariaRecursiva(vetor, esq, meio - 1, chave);
            }
        }
    }

    public static void Main(String [] args){
        int [] vetor = new int[TAM];
        preeencherVetor(vetor);
        ImprimirVetor(vetor);

        contador = 0; // contador de operações

        //Leitura do número a ser pesquisado
        Console.WriteLine("\nEntre com um número: ");
        int num = Int32.Parse(Console.ReadLine());

        //Ordenar o vetor [] com o método nativo
        Array.Sort(vetor);
        ImprimirVetor(vetor);

        //Invicar a pesquisa binária recursiva
        int esq = 0, dir = TAM -1;
        int resp = pesquisaBinariaRecursiva(vetor, esq, dir, num);
        if(resp >= 0){
            Console.WriteLine("\n\nO número " + num + ", foi encontado com SUCESSO!!! - Comparações: " + contador + "\n");
        }else{
            Console.WriteLine("\n\nO número " + num + ", NÃO foi encontrado - Comparações: " + contador + "\n");
        }

    }

}