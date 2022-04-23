
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zonia Roldan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
  
     static Scanner sc = new Scanner(System.in);
    static Pila pila = new Pila();
    static String variable, palabra;
     
    public static void main(String[] args) {        
        boolean salir = false;
        Main primero = new Main();
        while(salir != true){
        primero.datos();
        if(pila.estaVacia()){
            System.out.println("La adena es correcta");
        }else{
            System.out.println("La cadena es incorrecta");
        }
        primero.palabra();
        
            System.out.println("¿Desea salir?\n1.Sí\n2.No");
            int eleccion = sc.nextInt();
            switch(eleccion){
                case 1 -> salir=true;
                case 2 -> salir = false;
                default -> System.out.println("Se repetirá ya que no se selecciono una opción valida");
            }
        }
    }
    public void palabra(){
    palabra = "";
        while(!pila.estaVacia()){
            palabra+=pila.pop();
        }
        System.out.println(palabra);
        
    }
    public void datos(){
        System.out.println("Ingresar dato");
        variable = sc.next();
        for(char c: variable.toCharArray()){
            if(c =='('){
                pila.push(c);
                if(c=='{'){
                    pila.push(c);
                    if(c=='['){
                        pila.push(c);
                    }
                }
            }else if (c == ')'){
                pila.pop();
                if(c=='}'){
                    pila.push(c);
                    if(c==']'){
                        pila.push(c);
                    }
            }
        }
    }
    
} // TODO code application logic here
       // TODO code application logic here
    }
    

