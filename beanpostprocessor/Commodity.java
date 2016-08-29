package practice.beanpostprocessor;

public class Commodity {
    private String name;
    private boolean inStock;
    @AddUnit
    private String cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Name----->"+this.getName()+"-----:: Cost------->"+this.getCost()+"-----:: Stock Available------->"+this.isInStock();
    }
}
