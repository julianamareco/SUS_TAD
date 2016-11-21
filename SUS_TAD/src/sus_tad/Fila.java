/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sus_tad;

/**
 *
 * @author Juliana Mareco
 */
public class Fila {
    private Object elementos[];
    private int inicio, fim;

    public Fila(int tam) {
        this.elementos = new Object[tam];
        this.inicio = 0;
        this.fim = -1;
    }

    public void enqueue(Object e) {
        if (fim < this.elementos.length) {
            this.fim++;
            this.elementos[this.fim] = e;
        }
    }

    public Object dequeue() {
        if (inicio < this.elementos.length) {
            Object mesg = this.elementos[this.inicio];
            this.inicio++;
            return mesg;
        }
        return null;
    }
}
