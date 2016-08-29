package practice.Threading.executor;

public class PrintName implements Runnable{
    private String name;
    private int delay;

    public PrintName(String name, int delay){
        this.name=name;
        this.delay=delay;
    }

    @Override
    public void run() {
        System.out.println("Name---------->"+name);
        /*try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }*/

        if(name.equalsIgnoreCase("Printer1") || name.equalsIgnoreCase("printer4")){
            Thread.yield();
        }
        System.out.println("Done with-------->"+name);
    }
}
