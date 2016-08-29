package practice.Threading.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallableFutures {

	
	public static final int N_THREAD_COUNT=10;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executor= Executors.newFixedThreadPool(N_THREAD_COUNT);
		List<Future<Long>> futureList = new ArrayList<Future<Long>> ();
		
		for(int iCount=0;iCount<5;iCount++){
			Callable<Long> worker = new MyCallable(1000);
			Future<Long> workSubmit = executor.submit(worker);
			futureList.add(workSubmit);
		}
		
		System.out.println("Future List size---->"+futureList.size());
		long sum=0;
		
		for(Future<Long> future: futureList){
			try{
				sum+= future.get();
				System.out.println("Future Element----->"+future.get());
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("Sum is ----->"+sum);

	}

}
