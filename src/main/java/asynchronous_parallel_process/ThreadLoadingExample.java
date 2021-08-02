package asynchronous_parallel_process;

public class ThreadLoadingExample {
  public static void main(String[] args) {
    PDFGenerate startGeneratingPDF = new PDFGenerate();
    Loading startLoading = new Loading(startGeneratingPDF);

    startGeneratingPDF.start();
    startLoading.start();
  }
}

class PDFGenerate extends Thread {
  @Override
  public void run() {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("PDF Generated!");
  }

}

class Loading extends Thread {
  private Thread startGeneratingPDF;

  public Loading(Thread startGeneratingPDF) {
    this.startGeneratingPDF = startGeneratingPDF;
  }

  @Override
  public void run() {
    while (true) {
      try {
        Thread.sleep(500);

        // ? Veficando se o processo ainda está vivo
        if (!startGeneratingPDF.isAlive()) break;

        System.out.println("Loading...");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }


    }
  }
}
