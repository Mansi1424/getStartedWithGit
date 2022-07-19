public class Hamburger {
    private String breadRoll;
    private double price;
    private String name;
    private String meat;

    private String additionalItem1;
    private double additionalItem1Price;
    private String additionalItem2;
    private double additionalItem2Price;
    private String additionalItem3;
    private double additionalItem3Price;

    private String additionalItem4;
    private double additionalItem4Price;

    public Hamburger(String breadRoll, String meat, double price, String name) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.additionalItem1 = name;
        this.additionalItem1Price = price;
    }
    public void addHamburgerAddition2(String name, double price) {
        this.additionalItem2 = name;
        this.additionalItem2Price = price;
    }
    public void addHamburgerAddition3(String name, double price) {
        this.additionalItem3 = name;
        this.additionalItem3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.additionalItem4 = name;
        this.additionalItem4Price = price;
    }



    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRoll + " roll "
                + "with meat " +  this.meat +  " price is " + this.price);
        if (this.additionalItem1 != null) {
            hamburgerPrice += this.additionalItem1Price;
            System.out.println("Added " + this.additionalItem1 + " for an extra " + this.additionalItem1Price);

        }
        if (this.additionalItem2 != null) {
            hamburgerPrice += this.additionalItem2Price;
            System.out.println("Added " + this.additionalItem2 + " for an extra " + this.additionalItem2Price);

        }
        if (this.additionalItem3 != null) {
            hamburgerPrice += this.additionalItem3Price;
            System.out.println("Added " + this.additionalItem3 + " for an extra " + this.additionalItem3Price);

        }
        if (this.additionalItem4 != null) {
            hamburgerPrice += this.additionalItem4Price;
            System.out.println("Added " + this.additionalItem4 + " for an extra " + this.additionalItem4Price);

        }
        return hamburgerPrice;


    }
}
