package practice.generics;

import java.util.List;

public class Rental<T> {
    private List<T> rentalPool;
    private int maxNum;

    public Rental(int maxNum,List<T> rentalPool){
        this.rentalPool=rentalPool;
        this.maxNum=maxNum;
    }

    public T getRental() throws EntryNotFoundException {
        if(!rentalPool.isEmpty()){
            T movie=rentalPool.get(0);
            rentalPool.remove(0);
            return movie;
        }else{
            throw new EntryNotFoundException("No Entry in the pool");
        }
    }

    public void returnRental(T returnRental) throws MaxNumberExceeded {
        if(rentalPool.size()>=maxNum){
            throw new MaxNumberExceeded("Max Number Exceeded");
        }else{
           rentalPool.add(returnRental);
        }
    }
}
