package practice.Threading.concurrency;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Long> {

	private final long countUtil;
	
	public MyCallable(long countUtil){
		this.countUtil=countUtil;
	}
	
	public Long call() throws Exception {
		// TODO Auto-generated method stub
		long sum=0;
		for(int iCount=0;iCount<countUtil;iCount++){
			sum+=iCount;
		}
		return sum;
	}
}
