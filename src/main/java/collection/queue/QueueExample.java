package collection.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
  public static void main(String[] args) {
    Queue<String> bankQueue = new LinkedList<>();

    // ? Adicionar elementos na fila - ADD
    bankQueue.add("Ellie");
    bankQueue.add("Joe");
    bankQueue.add("Jason");
    bankQueue.add("John");

    // ? Pegando e removendo um elemento da fila - POLL
    String removedClient = bankQueue.poll();
    System.out.println(removedClient);

    // ? Pegando o primeiro elemento da fila OU nullo caso esteja vazia - PEEK
    System.out.println(bankQueue.peek());

    // ? Pegando o primeiro elemento da fila OU um erro caso esteja vazia - ELEMENT
    System.out.println(bankQueue.element());

    // ? Pegando o tamanho da fila - SIZE
    System.out.println(bankQueue.size());

    // ? Verificando se a fila esta vazia - ISEMPTY
    System.out.println(bankQueue.isEmpty());

    // ? Usando um FOR EACH para iterar sobre os elementos
    for (String client : bankQueue) {
      System.out.println(client);
    }

    // ? Usando um ITERATOR em uma QUEUE
    Iterator<String> iterator = bankQueue.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    // ? Removendo todos os elementos da fila - CLEAR
    bankQueue.clear();

  }
}
