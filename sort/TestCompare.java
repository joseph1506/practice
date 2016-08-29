package practice.sort;

public class TestCompare {
    public static void main(String args[]){
        Car car1= new Car("Ferrari",2000,120);
        Car car2= new Car("Lamborgini",2200,110);

        int compareValue=car1.compareTo(car2);
        switch (compareValue){
            case -1:
                System.out.println(car2.getCarName()+" is way better");
                break;
            case 0:
                System.out.println(car2.getCarName()+"and "+car1.getCarName()+" are both equal in terms");
                break;
            case 1:
                System.out.println(car1.getCarName()+" is way better");
                break;
            default:
                System.out.println("Cant determine");
                break;
        }
    }


}
