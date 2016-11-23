/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sus_tad;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Juliana Mareco
 */
public class Fila {

  private List<Object> objetos = new LinkedList<Object>();

  public void insere(Object objeto) {
    this.objetos.add(objeto);
  }

  public Object remove() {
    return this.objetos.remove(0);
  }

  public boolean vazia() {
    return this.objetos.isEmpty();
  }
}