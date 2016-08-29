package practice.sort;

import java.util.Comparator;

public class CarComparator  implements Comparator<Car> {
    @Override
    public int compare(Car car1,Car car2){
        if(car1==null && car2==null){
            return -1;
        }
        if(car1.getTenSecondSpeed()==car2.getTenSecondSpeed()){
            return 0;
        }
        if(car1.getTenSecondSpeed()>car2.getTenSecondSpeed()){
            return 1;
        }
        if(car1.getTenSecondSpeed()<car2.getTenSecondSpeed()){
            return -1;
        }
        return 0;
    }
}
