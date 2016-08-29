package practice.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class FileLogger {

    public FileLogger(){

    }

    @Pointcut("execution(public * practice.springaop.TestAOPClass.callInternalMethods()) " +
            "|| execution(public * practice.springaop.TestAOPClass.firstMethod()) || execution(public * practice.springaop.TestAOPClass.thirdMethod())")
    public void allMethods(){
    }

    /*@Around("allMethods()")
    public void printComments(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("jointPoint --->"+joinPoint.toString());
        joinPoint.proceed();
        System.out.println("jointPoint --->"+joinPoint.toString());
    }*/
    @AfterThrowing(pointcut = "allMethods()",throwing = "exception")
    public void printErrors(JoinPoint joinPoint,Exception exception){
        System.out.println("Error---->"+joinPoint.toString()+exception.getMessage());
    }

     @Before("allMethods()")
     @After("allMethods()")
     public void beforeComments(JoinPoint joinPoint){
         System.out.println("before jointpoint--->"+joinPoint.toString());
     }

     @After("allMethods()")
     public void afterComments(JoinPoint joinPoint){
         System.out.println("after jointpoint--->"+joinPoint.toString());
     }






}
