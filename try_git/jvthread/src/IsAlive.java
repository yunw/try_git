public class IsAlive {
   public static void main(String[] argv) 
   throws Exception {
      Thread thread = new MyThread();
      thread.start();
      if (thread.isAlive()) {
         System.out.println("Thread has not finished");
      }
      else {
         System.out.println("Finished");
      }
      long delayMillis = 5000; 
      thread.join(delayMillis);
      if (thread.isAlive()) {
         System.out.println("thread has not finished");
      }
      else {
         System.out.println("Finished");
      }
      thread.join();
   }
}

class MyThread extends Thread {
   boolean stop = false;
   public void run() {
      while (true) {
         if (stop) {
            return;
         }
      }
   }
}