
package Model;

public class Fila {
    

    //Clinica geral - N
    //Vacinação - N
    //Fratura - C
    //Cirurgia - C
        private int dados[];
    private int tamanho;
    
    public Fila(int capacidade){
        dados = new int[capacidade];
        tamanho = 0;
    }
    
    public boolean vazia(){
        return tamanho == 0;
        /*
         * if (tamanho == 0) return true;
         * 
         * return false;
         */
    }
    
    public boolean cheia(){
        return tamanho == dados.length;
    }

    public void adicionaFila(int e, String tipo){
        if(cheia()){
            System.out.println("Fila cheia");
        }else{
            if(tipo == "N"){
                
            }else if(tipo == "C"){
                
            }
            dados[tamanho] = e;
            tamanho++;
        }
    }
    
  
    public int removeFila(){
        int a = dados[0];
        if(vazia()){
           System.out.println("Fila Vazia");
        }else{
            for(int i = 0; i < tamanho-1; i++){
                dados[i] = dados[i+1];
            }
            tamanho--;
        }
     return a;
   }
    
    
     public String mostra(){
            String resp = "Elementos:\n";
            for( int i=0; i <= tamanho-1;i++)
                resp = resp + "  " + dados[i];
            return resp;
     }
    
    
}
