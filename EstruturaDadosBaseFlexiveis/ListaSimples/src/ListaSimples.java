public class ListaSimples {
    
    private Celula primeiro;
    private Celula ultimo;

    ListaSimples(){
        this.primeiro = new Celula();
        this.ultimo   = primeiro;
    }

    /**
     * @return Celula return the primeiro
     */
    public Celula getPrimeiro() {
        return primeiro;
    }

    /**
     * @param primeiro the primeiro to set
     */
    public void setPrimeiro(Celula primeiro) {
        this.primeiro = primeiro;
    }

    /**
     * @return Celula return the ultimo
     */
    public Celula getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(Celula ultimo) {
        this.ultimo = ultimo;
    }






    /**
     * Metodo inserir Inicio
     */
    public void inserirInicio(int x){
        Celula tmp = new Celula(x);
        tmp.setProx(primeiro.getProx());
        primeiro.setProx(tmp);
        if(primeiro == ultimo)
            ultimo = tmp;
        tmp = null;
    }

    /**
     * Metodo inserir Fim
     */
    public void inserirFim(int x){
        ultimo.setProx(new Celula(x));
        ultimo = ultimo.getProx();
    }

    /**
     * Metodo inserir
     */
    public void inserir(int x, int pos) throws Exception{
        int tamanho = tamanho();
        if(pos < 0 || pos > tamanho){
            throw new Exception("Erro!");
        }else if(pos == 0){
            inserirInicio(x);
        }else if(pos == tamanho){
            inserirFim(x);
        }else{
            Celula i = primeiro;
            for(int j = 0; j < pos; j++, i = i.getProx());
            Celula tmp = new Celula(x);
            tmp.setProx(i.getProx());
            i.setProx(tmp);
            tmp = null;
        }
    }
    public int tamanho(){
        int tam = 0;

        for(Celula i = primeiro; i != ultimo; i = i.getProx()){
            tam +=1;
        }
        System.out.print(tam);
        return tam;
    }






    /**
     * Metodo remover Inicio
     */
    public int removerInicio() throws Exception{
        if(primeiro == ultimo)
            throw new Exception("Erro!");
        
        int remover = primeiro.getProx().getElemento();
        Celula tmp = primeiro.getProx();
        primeiro.setProx(primeiro.getProx().getProx());
        tmp.setProx(null);
        tmp = null;

        return remover;
    }

    /**
     * Metodo remover Fim
     */
    public int removerFim() throws Exception{
        if(primeiro == ultimo)
            throw new Exception("Erro!");
        
        int remover = ultimo.getElemento();
        for(Celula i = primeiro; i.getProx().getProx() == null; i = i.getProx()){
            ultimo = i;
            i.setProx(null);
        }
        return remover;
    }

    /**
     * Metodo remover
     */
    public int remover(int pos) throws Exception{
        int tamanho = tamanho();
        int removido = 0;
        if(primeiro == ultimo || pos < 0 || pos >= tamanho){
            throw new Exception("Erro!");
        }else if(pos == 0){
            removido = removerInicio();
        }else if(pos == tamanho - 1){
            removido = removerFim();
        }else{
            Celula i = primeiro;
            for(int j = 0; j < pos; j++, i = i.getProx());
            Celula tmp = i.getProx();
            removido = tmp.getElemento();
            i.setProx(tmp.getProx());
            tmp.setProx(null);
            tmp = null;    
        }
        return removido;
    }






     /**
     * Metodo mostrar
     */
    public void mostrar(){
        System.out.print("\n[ ");
        for(Celula i = primeiro.getProx(); i != null; i = i.getProx()){
            System.out.print(i.getElemento() + " ");
        }
        System.out.print("]\n");
    }

}
