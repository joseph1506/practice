package practice.sort;

public class Car implements Comparable<Car> {
   private int capacity;
   private int tenSecondSpeed;
    private String carName;

    public Car(String carName,int capacity, int tenSecondSpeed) {
        this.capacity = capacity;
        this.tenSecondSpeed = tenSecondSpeed;
        this.carName=carName;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getTenSecondSpeed() {
        return tenSecondSpeed;
    }

    public void setTenSecondSpeed(int tenSecondSpeed) {
        this.tenSecondSpeed = tenSecondSpeed;
    }

    public int compareTo(Car car) {
       if(car==null){
           return -1;
       }
       if(this.getTenSecondSpeed()==car.getTenSecondSpeed()){
          return 0;
       }
        if(this.getTenSecondSpeed()>car.getTenSecondSpeed()){
            return 1;
        }
        if(this.getTenSecondSpeed()<car.getTenSecondSpeed()){
            return -1;
        }
        return 0;
   }

    public String toString(){
        return "CarName-->"+this.getCarName()+"::::capacity---->"+this.getCapacity()+"::::10SecSpeed----->"+this.getTenSecondSpeed();
    }

}
