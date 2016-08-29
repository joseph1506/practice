package practice.Threading.threadLocal;

public class SeatAllocator {
    private static final ThreadLocal<String> seatReserved = new ThreadLocal<String>();

    public static void allocateSeat(String seat){
        seatReserved.set(seat);
    }

    public static String getSeatForAudience(){
        String seat=seatReserved.get();
        return seat;
    }

    public static void cleanup() {
        seatReserved.remove();
    }

}
