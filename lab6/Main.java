abstract class Offering{
    abstract int getPrice();
    abstract String getName();
}

abstract class Decorator extends Offering{
    Offering offering;
}

class Coffee extends Offering{
    int getPrice(){
        return 30;
    }
    String getName(){
        return "Coffee";
    }
}

class Tea extends Offering{
    int getPrice(){
        return 20;
    }
    String getName(){
        return "Tea";
    }
}

class IceCream extends Offering{
    int getPrice(){
        return 50;
    }
    String getName(){
        return "IceCream";
    }
}

class Rum extends Decorator{
    Rum(Offering offering){
        this.offering = offering;
    }
    
    String getName(){
        return offering.getName() + " with Rum";
    }
    int getPrice(){
        return offering.getPrice() + 55;
    }
}

class Gin extends Decorator{
    Gin(Offering offering){
        this.offering = offering;
    }
    
    String getName(){
        return offering.getName() + " with Gin";
    }
    int getPrice(){
        return offering.getPrice() + 45;
    }
}

public class Main
{
	public static void main(String[] args) {
		Offering offering = new Coffee();
		offering = new Rum(offering);
		offering = new Rum(offering);
		System.out.println(offering.getName() + " " + offering.getPrice());
	}
}

