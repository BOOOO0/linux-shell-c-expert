package boo0.os.practice.threads;

public class ThreadExample5 {

	public static void main(String[] args) throws InterruptedException {
		Runnable task = () -> {
			try {
				while (true) {
					System.out.println("Hello Lambda Runnable");
					Thread.sleep(100);
				}
			} catch (InterruptedException ie) {
				System.out.println("I'm interrupted!");
			}
		};
		Thread thread = new Thread(task);
		thread.start();
		Thread.sleep(500);
		thread.interrupt();
		System.out.println("Hello, My Interrupted Child!");
	}
}
