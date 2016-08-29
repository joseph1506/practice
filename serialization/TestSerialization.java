package practice.serialization;

public class TestSerialization {
    public static void main(String args[]){
        DemolitionMan dm=new DemolitionMan(new Badge("fighter","12323123"));
        SerializeDemolitionMan serializeDemolitionMan= new SerializeDemolitionMan();
        try {
            serializeDemolitionMan.serialize(dm);
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        DemolitionMan iAmBack = null;
        DeSerializeDemolitionMan deSerializeDemolitionMan= new DeSerializeDemolitionMan();
        try {
            iAmBack=deSerializeDemolitionMan.deserialize();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Identify yourself");
        System.out.println("I am ------->" + iAmBack.getBadge().getName());
        System.out.println("My id------->" + iAmBack.getBadge().getId());
    }


}
