package practice.inner;

public class Food {
    Pizza vegCrustedPizza=new Pizza(){
      public void make(){
          System.out.println("Veg Crusted Pizza");
          this.eat();
      }
      public void eat(){
          System.out.println("Eating Crusted Pizza");
      }
    };

    Pizza hamBakedPizza=new Pizza(){
        public void make(){
            System.out.println("Ham Baked Pizza");
            this.eat();
        }
        public void eat(){
            System.out.println("Eating Ham Baked Pizza");
        }
    };


    public Pizza getHamBakedPizza() {
        return hamBakedPizza;
    }

    public void setHamBakedPizza(Pizza hamBakedPizza) {
        this.hamBakedPizza = hamBakedPizza;
    }

    public Pizza getVegCrustedPizza() {
        return vegCrustedPizza;
    }

    public void setVegCrustedPizza(Pizza vegCrustedPizza) {
        this.vegCrustedPizza = vegCrustedPizza;
    }
}
