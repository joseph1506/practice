package practice.Threading.concurrency;

public class MyRunnableClass implements Runnable{
	
	private final long countUtil;
	
	public MyRunnableClass(long countUtil){
		this.countUtil=countUtil;
	}
	
	public void run(){
		long sum=0;
		System.out.println("inside run method of thread---->");
		for(int iCount=1;iCount<=countUtil;iCount++){
			sum+=iCount;
		}
		System.out.println("Sum for countUtil--->"+countUtil+"  : is ----->"+sum);
	}
}
