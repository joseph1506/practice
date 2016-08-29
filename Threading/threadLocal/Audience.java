package practice.Threading.threadLocal;

public class Audience implements Runnable{
    private Theatre theatre;

    public Audience(Theatre theatre) {
        this.theatre=theatre;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" booking seat");
        theatre.reserveSeat();
        System.out.println("Seat for "+Thread.currentThread().getName()+"---->"+SeatAllocator.getSeatForAudience());
    }
}
