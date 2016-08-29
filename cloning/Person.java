package practice.cloning;

public class Person implements Cloneable {
    private String name;
    private Features personFeatures;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Features getPersonFeatures() {
        return personFeatures;
    }

    public void setPersonFeatures(Features personFeatures) {
        this.personFeatures = personFeatures;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
