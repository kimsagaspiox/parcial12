/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zonia Roldan
 */
public class Pila {
    Nodopilaa cima;
    int tamaño;

    public Pila() {
        cima = null;
        tamaño = 0;
    }
    
    public void push(char dato){
        Nodopilaa nuevo = new Nodopilaa(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamaño++;
    }
    
    public char pop(){
        char aux = cima.dato;
        cima = cima.siguiente;
        tamaño--;
        return aux;
    }
    
    public char cima(){
        return cima.dato;
    }
    
    public int tamaño(){
        return tamaño;
    }
    
    public boolean estaVacia(){
     return cima==null;   
    }
    
    public void limpiar(){
        while(!estaVacia()){
            pop();
        }
    }
}
