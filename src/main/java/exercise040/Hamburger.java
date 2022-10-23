package exercise040;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name, addition2Name, addition3Name, addition4Name;
    private double addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double total = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " with " + this.meat + ", price is " + this.price);
        if (this.addition1Name!= null) {
            total += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " +this.addition1Price);
        }
        if (this.addition2Name!= null) {
            total += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " +this.addition2Price);
        }
        if (this.addition3Name!= null) {
            total += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " +this.addition3Price);
        }
        if (this.addition4Name!= null) {
            total += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " +this.addition4Price);
        }
        return total;
    }
}
