 
package Model;

import javax.swing.JOptionPane;

public class Fila {
    

    //Clinica geral - N
    //Vacina��o - N
    //Fratura - C
    //Cirurgia - C
    public NoDuplo inicio;
    
    
    public Fila(){
        inicio = null;
    }
    
    public void adicionaItem(int e, String tipo){
        NoDuplo aux ;
        aux = inicio;
        if(tipo == "C")
        
        if (vazia()){
            adicionaInicio(e);
        }else{
           while(aux.prox != null){
               aux = aux.prox;
           }
           NoDuplo novo = new NoDuplo(e);
           novo.ant = aux;
           aux.prox = novo;
        }
    }
    
    public boolean vazia(){
       return inicio==null;
    }
    
   public String percorre(){
      String r="";
      NoDuplo aux = inicio;
      if(vazia()){
         r = "Lista Vazia!";
         return r;
      }else{
         while (aux != null){
            r = r + " " + aux.dado;
            aux = aux.prox;
         }
         return r;
      }
   }
    
    public void adicionaInicio(int e){
        NoDuplo novo = new NoDuplo(e);
        novo.prox = inicio;
        inicio = novo;
    }
    
    public void adicionaFinal(int e){
        NoDuplo aux ;
        aux = inicio;
        if (vazia()){
            adicionaInicio(e);
        }else{
           while(aux.prox != null){
               aux = aux.prox;
           }
           NoDuplo novo = new NoDuplo(e);
           novo.ant = aux;
           aux.prox = novo;
        }
    }
    
    public void adicionaPos(int pos, int e){
        NoDuplo aux ;
        aux = inicio;
        int cont = 1;
        if (vazia()){
            JOptionPane.showMessageDialog(null,"Posição inválida! Lista vazia!");
        }else{
           while(aux.prox != null && cont != pos-1){
               aux = aux.prox;
               cont++;
           }
           if(cont != pos-1){
               JOptionPane.showMessageDialog(null,"Posição inválida!");
           }else{
		NoDuplo novo = new NoDuplo(e);
		novo.prox = aux.prox;
                novo.ant = aux.ant;
		aux.prox = novo;
           }
        }
    }
    
    public void removeInicio(){
        if(vazia()){
           JOptionPane.showMessageDialog(null,"Lista vazia!");
        }else{
            inicio = inicio.prox;
        }
    }
    
    public void removeFinal(){
        if(vazia()){
           JOptionPane.showMessageDialog(null,"Lista vazia!");
        }else{
            NoDuplo aux1 = inicio;
            NoDuplo aux2 = null;
            while(aux1.prox != null){
                aux2 = aux1;
                aux1 = aux1.prox;
            }
            aux2.prox = null;
        }
    }
    
    
}
