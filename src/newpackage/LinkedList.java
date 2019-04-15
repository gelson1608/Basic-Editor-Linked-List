/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author AlssiadPC
 */
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class LinkedList {
    Nodo head;      //Para este proyecto no es necesario tener un nodo primero;
    Nodo tail;      //sin embargo, es necesario uno posterior al actual y uno 
    Nodo lista;     //anterior al mismo(Current:actual-head:previo-tail:posterior)
    Nodo current;
    
                                                //No son necesarios los metodos
    public void agregarFrente(Object n, String c, Boolean i, Boolean b){        //BorraNodo, getPrimero o AgregarCima
        Nodo temp=new Nodo(n,c,i,b);                  //Se trabajo con agregarFrente y
        if (lista==null){                       //se imprimio con un JOptionPane
            lista=temp;
        }
        else{
            lista.post=temp;
        }
        lista=temp;
    }
}
