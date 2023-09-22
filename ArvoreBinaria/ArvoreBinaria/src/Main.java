class Main {
    public static void main(String[] args) throws Exception {
      ArvoreBinaria arvoreBinaria = new ArvoreBinaria(); 

      arvoreBinaria.inserir(10);
      arvoreBinaria.inserir(20);
      arvoreBinaria.inserir(30);
      arvoreBinaria.inserir(40);
      arvoreBinaria.inserir(50);
      arvoreBinaria.remover(30);
      arvoreBinaria.pesquisar(10);
      arvoreBinaria.pesquisar(30);
      arvoreBinaria.caminharCentral();
      
    }
  }
  