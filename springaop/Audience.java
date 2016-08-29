package practice.springaop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
    public void takeSeats(){
        System.out.println("The audience is taking their seats.");
    }
    public void turnOffCellPhones(){
        System.out.println("The audience is turning off their cellphones");
    }
    public void applaud(){
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }
    public void demandRefund(){
        System.out.println("Boo!We want our money back!");
    }

    public void performanceTime(ProceedingJoinPoint pcj) throws Throwable {
        long start=System.currentTimeMillis();
        System.out.println("Start time---->"+start);
        Object obj=pcj.proceed();
        long endTime=System.currentTimeMillis();
        System.out.println("End time---->"+endTime);
        System.out.println("time taken--->"+(endTime-start));
    }
}
