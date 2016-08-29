package practice.Threading;

import org.apache.commons.lang.StringUtils;

public class Racer implements Runnable{

    public static String winner;

    @Override
    public void run() {
        try {
            this.race();
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    private void race() throws InterruptedException {
        for(int distance=1;distance<=100;distance++){

            System.out.println("Distance covered by "+Thread.currentThread().getName()+" is "+distance+" meters");
            if(Thread.currentThread().getName().equalsIgnoreCase("Hare") && distance==30){
                System.out.println("Hare sleeping after 30 meters");
                Thread.sleep(30*1000);
            }
            boolean isRaceWon=this.isRaceWon(distance);
            if(isRaceWon){
                break;
            }
        }
    }

    private boolean isRaceWon(int distance) {
        boolean isRaceWon=false;
        if(StringUtils.isEmpty(Racer.winner) && distance==100){
            isRaceWon=true;
            Racer.winner=Thread.currentThread().getName();
            System.out.println("Winner is :"+Racer.winner);
        }else if(StringUtils.isEmpty(Racer.winner)){
            isRaceWon=false;
        }else if(StringUtils.isNotEmpty(Racer.winner)){
            isRaceWon=true;
        }
        return isRaceWon;
    }
}
