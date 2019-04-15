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
public class Nodo {
    public Object e;
    Nodo post;              //Se construyen la clse nodo doblemente enlazado
    Nodo pre;               //Se diferencia por el Nodo previo(pre)
    public String Color;
    public Boolean Ita,Bold,Under;

    public Nodo(Object e, String Color, Boolean Ita, Boolean Bold) {
        this.e = e;
        this.Color = Color;
        this.Ita = Ita;
        this.Bold = Bold;
        this.Under = Under;
    }
    
    
}
