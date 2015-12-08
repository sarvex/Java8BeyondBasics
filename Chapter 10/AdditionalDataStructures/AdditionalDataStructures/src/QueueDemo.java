import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueDemo {
  public void showOperations() {
    PriorityQueue<Integer> piq = new PriorityQueue<>();
    PriorityBlockingQueue<Integer> pbqi = new PriorityBlockingQueue<>();
    ArrayDeque<Integer> adqi = new ArrayDeque<>();

    // offer/add
    for (int i = 0; i < 10; i++) {
      piq.offer(Integer.valueOf(i));
      pbqi.offer(Integer.valueOf(i * 2));
      adqi.add(Integer.valueOf(i * 4));
    }

    // peek/poll
    while (piq.peek() != null) {
      System.out.println("Next item from PIQ: " + piq.poll());
    }
    while (pbqi.peek() != null) {
      System.out.println("Next item from PBQI: " + pbqi.poll());
    }

    // element/remove
    // while (adqi.element() != null) --> won't work because it throws an exception
    try {
      while (adqi.element() != null) {
        System.out.println("Next item from adqi: " + adqi.remove());
      }
    } catch (Exception ex) {
      System.out.println("Exception was thrown:");
      ex.printStackTrace();
    }
    System.out.println("Done");
  }
}
