package practice.Threading.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class TestConcurrency1 {

	private static final int N_THREADS_COUNT=10;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService executor= Executors.newFixedThreadPool(N_THREADS_COUNT);
		
		for(int iCount=0;iCount<500;iCount++){
			Runnable worker= new MyRunnableClass(1000+iCount);
			executor.execute(worker);
		}
		
		//for not accepting anymore tasks, shutdown is necessary
		executor.shutdown();
		
		while(!executor.isTerminated())
		{
			
		}
		
		System.out.println("After shutdown completion");
	}

}
