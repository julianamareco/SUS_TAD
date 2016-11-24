package sus_tad;

import java.util.LinkedList;
import java.util.List;

public class Fila {

  private List<Object> objetos = new LinkedList<Object>();

  /**
   * método que insere um objeto na fila
   * @param objeto 
   */
  public void insere(Object objeto) {
    this.objetos.add(objeto);
  }

  /**
   * métoro que remove um objeto na fila
   * @return o objeto que foi removido
   */
  public Object remove() {
    return this.objetos.remove(0);
  }

  /**
   * método que verifica se a fila esta vazia
   * @return true se estiver vazia e false se não
   */
  public boolean vazia() {
    return this.objetos.isEmpty();
  }
}