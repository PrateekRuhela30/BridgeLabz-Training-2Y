public class BackgroundJobExecution {

    public static void main(String[] args) {
        Runnable backgroundTask = () -> {
            System.out.println(" Background task started...");
            try {
                Thread.sleep(3000); // Simulate time-consuming work
            } catch (InterruptedException e) {
                System.out.println(" Task interrupted.");
            }
            System.out.println(" Background task completed.");
        };

        Thread backgroundThread = new Thread(backgroundTask);
        backgroundThread.start();

        System.out.println(" Main thread continues executing...");
    }
}