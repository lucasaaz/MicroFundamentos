class ArvoreBinaria{
    No raiz;
  
    ArvoreBinaria(){
      this.raiz = null;
    }
  
    
    //Pesquisar
    public boolean pesquisar(int x){
      return pesquisar(x, raiz);
    }
  
    public boolean pesquisar(int x, No raiz){
      boolean resp;
          if (raiz == null) {
           resp = false;
  
        } else if (x == raiz.elemento) {
          System.out.println("Encontrado: " + raiz.elemento);
           resp = true;
  
        } else if (x < raiz.elemento) {
           resp = pesquisar(x, raiz.esq);
  
        } else {
           resp = pesquisar(x, raiz.dir);
        }
      return resp;
    }
  
  
    //Caminhar Centarl
    public void caminharCentral(){
      System.out.print("\n[ ");
      caminharCentral(raiz);
      System.out.print(" ]\n");
    }
    public void caminharCentral(No raiz){
      if ( raiz != null){
        caminharCentral(raiz.esq);
        System.out.print(raiz.elemento + " ");
        caminharCentral(raiz.dir);
      }
    }
    //Caminhar Pre
    public void caminharPre(){
      System.out.print("\n[ ");
      caminharPre(raiz);
      System.out.print(" ]\n");
    }
    public void caminharPre(No raiz){
      if ( raiz != null){
        System.out.print(raiz.elemento + " ");
        caminharPre(raiz.esq);
        caminharPre(raiz.dir);
      }    
    }
    //Caminhar Pos
    public void caminharPos(){
      System.out.print("\n[ ");
      caminharPos(raiz);
      System.out.print(" ]\n");
    }
    public void caminharPos(No raiz){
      if ( raiz != null){
        caminharPos(raiz.esq);
        caminharPos(raiz.dir);
        System.out.print(raiz.elemento + " "); 
      }
    }
  
  
    //Inserir
    public void inserir(int x) throws Exception{
      raiz = inserir(x, raiz);
    }
    public No inserir(int x, No raiz) throws Exception{
      if ( raiz == null){
        raiz = new No(x);
      }else if( x < raiz.elemento){
        raiz.esq = inserir(x, raiz.esq);
      }else if( x > raiz.elemento){
        raiz.dir = inserir(x, raiz.dir);
      }else{
        throw new Exception("Erro!");
      }
      return raiz;
    }
  
  
    //Remover
    public void remover(int x) throws Exception{
      raiz = remover(x, raiz);
    }
    public No remover(int x, No raiz) throws Exception{
      if ( raiz == null){
        throw new Exception("Erro ao remover!");
      }else if ( x < raiz.elemento){
        raiz.esq = remover(x, raiz.esq);
      }else if ( x > raiz.elemento){
        raiz.dir = remover(x, raiz.dir);
      
      //sem No a direita
      }else if ( raiz.dir == null){
        raiz = raiz.esq;
        
      //sem No a esquerda
      }else if ( raiz.esq == null){
        raiz = raiz.dir;
  
      //com dois No
      }else {
        raiz.esq = maiorEsq(raiz, raiz.esq);
      }
      return raiz;
    }
  
  
    //Maior a esquerda
    public No maiorEsq(No raiz, No rE) {
        if (rE.dir == null) {
            raiz.elemento = rE.elemento; 
            rE = rE.esq; 
        // Existe no a direita.
        } else {
        // Caminha para direita.
           rE.dir = maiorEsq(raiz, rE.dir);
        }
        return rE;
    }
  

    //Altura 
    public int getAltura(){
      return getAltura(raiz, 0);
    }
    public int getAltura(No i, int altura){
      if(i == null){
        altura--;
      } else {
        int alturaEsq = getAltura(i.esq, altura + 1);
        int alturaDir = getAltura(i.dir, altura + 1);
        altura = (alturaEsq > alturaDir) ? alturaEsq : alturaDir;
      }
      return altura;
    }


    /*
    //Exercicio
    No toAB(Celula p1, CelulaDupla p2){
        No resp = null;
        p1 = p1.prox;
        p2 = p2.prox;
        while(p1 != null && p2 != null){
            resp = inserir(p1.elemento, raiz);
            resp = inserir(p2.elemento, raiz);
            p1 = p1.prox;
            p2 = p2.prox;
        }
        while (p1 != null) {
            resp = inserir(p1.elemento, raiz);
            p1 = p1.prox;
        }
        while (p2 != null) {
            resp = inserir(p2.elemento, raiz);
            p2 = p2.prox;
        }
        return resp;
    }
*/

    //Rotacionar para esq
    // no = rotacionarEsq(no);
    No rotacionarEsq (No no){
        No noDir = no.dir;
        No noDirEsq = noDir.esq;

        noDir.esq = no;
        no.dir = noDirEsq;

        return noDir;
    }
    //Rotacionar para dir
    // no = rotacionarDir(no);
    No rotacionarDir (No no){
        No noEsq = no.esq;
        No noEsqDir = noEsq.dir;

        noEsq.dir = no;
        no.esq = noEsqDir;

        return noEsq;
    }
    //Rotacionar dir - esq
    No rotacionarDirEsq( No no){
        no.dir = rotacionarDir(no.dir);
        return rotacionarEsq(no);
    }
    //Rotacionar esq - dir
    No rotacionarEsqDir( No no){
        no.esq = rotacionarEsq(no.esq);
        return rotacionarDir(no);
    }


    //Balanciamento 
    void balancear(){
        if(raiz.esq != null && raiz.dir != null){
            System.out.println("Arvore Balanceada");
        } else if (raiz.dir != null){
            if(raiz.dir.dir != null){
                raiz = rotacionarEsq(raiz);
            }else {
                raiz = rotacionarDirEsq(raiz);
            }
        } else{
            if(raiz.esq.dir != null){
                raiz = rotacionarEsqDir(raiz);
            }else{
                raiz = rotacionarDir(raiz);
            }
        }

    }























    
  }