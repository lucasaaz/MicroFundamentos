public class ListaDupla {
    
    //Atributos
    private CelulaDupla primeiro;
    private CelulaDupla ultimo;


    //Construtores
    ListaDupla(){
        primeiro = new CelulaDupla();
        ultimo = primeiro;
    }

    
    /**
     * @return CelulaDupla return the primeiro
     */
    public CelulaDupla getPrimeiro() {
        return primeiro;
    }

    /**
     * @param primeiro the primeiro to set
     */
    public void setPrimeiro(CelulaDupla primeiro) {
        this.primeiro = primeiro;
    }

    /**
     * @return CelulaDupla return the ultimo
     */
    public CelulaDupla getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(CelulaDupla ultimo) {
        this.ultimo = ultimo;
    }






    /**
     * Metodo inserir Inicio
     */
    public void inserirInicio(int x){
       CelulaDupla tmp = new CelulaDupla(x);
       tmp.setAnt(primeiro);
       tmp.setProx(primeiro.getProx());
       primeiro.setProx(tmp);
       if(primeiro == ultimo){
        ultimo = primeiro.getProx();
       } else{
           primeiro.getProx().getProx().setAnt(tmp);
           //tmp.getProx().setAnt(tmp);
       }
       tmp = null;
    }

    /**
     * Metodo inserir Fim
     */
    public void inserirFim(int x){
        ultimo.setProx(new CelulaDupla(x));
        ultimo.getProx().setAnt(ultimo);
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
            CelulaDupla i = primeiro;
            for(int j = 0; j < pos; j++, i = i.getProx());
            CelulaDupla tmp = new CelulaDupla(x);
            tmp.setAnt(i);
            tmp.setProx(i.getProx());
            i.setProx(tmp);
            i.getProx().setAnt(tmp);
            tmp = null;
        }
    }
    public int tamanho(){
        int tam = 0;

        for(CelulaDupla i = primeiro; i != ultimo; i = i.getProx()){
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
        CelulaDupla tmp = primeiro.getProx();
        primeiro.setProx(tmp.getProx());
        tmp.getProx().setAnt(primeiro);
        tmp.setAnt(null);
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
        ultimo = ultimo.getAnt();
        ultimo.getProx().setAnt(null);
        ultimo.setProx(null);

        return remover;
    }

    /**
     * Metodo remover 
     */
    public int remover(int pos) throws Exception{
        int tamanho =  tamanho();
        int removido = 0;
        if(primeiro == ultimo || pos < 0 || pos >= tamanho){
            throw new Exception("Erro!");
        }else if( pos == 0){
            removido = removerInicio();
        }else if( pos == tamanho - 1){
            removido = removerFim();
        }else{
            CelulaDupla i = primeiro;
            for(int j = 0; j < pos; j++, i = i.getProx());
            removido = i.getProx().getElemento();
            CelulaDupla tmp = i.getProx();
            i.setProx(tmp.getProx());
            tmp.getProx().setAnt(i);
            tmp.setAnt(null);
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
        for(CelulaDupla i = primeiro.getProx(); i != null; i = i.getProx()){
            System.out.print(i.getElemento() + " ");
        }
        System.out.print("]\n");
    }






    /**
     * Metodo pesquisar
     */
    public boolean pesquisar(int x){
        CelulaDupla i;
        boolean resp = false;

        for(i = primeiro; i.getProx() != null; i = i.getProx()){
            if( x == i.getElemento()){
                resp = true;
            }
        }

       if(resp == true){
         System.out.print("\nO número " + x + " foi encontrado!! ");
       }else{
         System.out.print("\nO número " + x + " não foi encontrado!! ");
       }
       return resp;
    }







    /**
     * Metodo inserirOrdem
     */
    public void inserirOrdem(int x){
        CelulaDupla i, tmp = new CelulaDupla(x);

        for(i = primeiro; i.getProx() != null && i.getProx().getElemento() < x; i = i.getProx() );
            tmp.setProx(i.getProx());
            tmp.setAnt(i);
            i.getProx().setAnt(tmp);
            i.setProx(tmp);
            tmp = null;
            if( primeiro == ultimo){
                ultimo = ultimo.getProx();
            }

    }


}
