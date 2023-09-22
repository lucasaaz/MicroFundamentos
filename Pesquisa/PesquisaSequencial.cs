using System;

class MainPS {

    //Definir o tamanho do vetor []
    const int TAM = 100;

    //Preencher o vetor [] com valores aleatótios
    public static void preencherVetor(int [] vetor){
        Random rnd = new Random();
        Console.Write("[");
        for(int i=0; i<TAM; i++){
            vetor[i] = rnd.Next(100);
            Console.Write(vetor[i] + " ");
        }
        Console.Write("]");
    }

    //Pesquisar o elemento chave no vetor []
    public static bool pesquisaSequencial(int [] vetor, int chave){
        bool resultado = false;
        int contador = 0;
        for(int i =0; i<TAM; i++){
            contador++;
            if(vetor[i] == chave){
                resultado = true;
                i = TAM;
            }
        }
        Console.WriteLine("Comparações feitas: " + contador);
        return resultado;
    }

    public static void Main( String[] args){
        int [] vetor = new int[TAM];
        preencherVetor(vetor);
        Console.WriteLine("\nEntre com um numero:");
        int num = Int32.Parse(Console.ReadLine());
        bool resp = pesquisaSequencial(vetor, num);

        if(resp == true){
            Console.WriteLine("O número " + num + ", foi encontrado com SUCESSO!!!");
        }else{
            Console.WriteLine("O número " + num + ", nao encontrado.");
        }
    }

}
