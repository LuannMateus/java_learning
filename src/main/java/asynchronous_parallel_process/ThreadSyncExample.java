package asynchronous_parallel_process;

public class ThreadSyncExample {
  public static void main(String[] args) {
    LoadingBarWithInterface loadingBarOne = new LoadingBarWithInterface();
    LoadingBarThead loadingBarThead = new LoadingBarThead();

    loadingBarOne.run();
    loadingBarThead.start();

  }
}

// ? Usando uma interface para criar uma thread.
class LoadingBarWithInterface implements Runnable {
  @Override
  public void run() {
    try {
      Thread.sleep(5000);
      System.out.println("Running using Runnable Interface");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}

// ? Usando a class Thread para criar uma thread.
class LoadingBarThead extends Thread {
  @Override
  public void run() {
    super.run();
    System.out.println("Running... | " + this.getName());

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

