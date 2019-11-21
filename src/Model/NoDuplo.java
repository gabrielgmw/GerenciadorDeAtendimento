/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author WS
 */
public class NoDuplo {
   
    public int dado;
    public NoDuplo prox;
    public NoDuplo ant;
    
   

    
    public NoDuplo(int e){
        dado = e;
        prox = null;
        ant = null;
    }
}
