package threads;

public class Demo100 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getId());
		}

	}

}
