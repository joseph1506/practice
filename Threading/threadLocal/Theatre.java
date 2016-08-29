package practice.Threading.threadLocal;

public class Theatre {
    public void reserveSeat(){
        String seat= "Seat:"+Thread.currentThread().getName();
        SeatAllocator.allocateSeat(seat);
    }
}
