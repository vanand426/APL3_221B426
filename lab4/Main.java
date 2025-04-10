abstract class Beverage{
    private void pour(int qty)
    {System.out.println("pour"+ qty + "ml of beverage in a glass");
    }
    protected abstract void addContiment();
    
    protected void stir(){}
    
    private void serve(){
        System.out.println("Serve through waiter");
    }
    public void templateMethod(int qty)
    {pour(qty);
    addContiment();
    stir();
    serve();}
}

class Whisky extends Beverage{
    @Override
    protected void addContiment(){
        System.out.println("Add some ice");}
    @Override
     protected void stir(){
            System.out.println("Stir for 30 sec");}
            }

class Beer extends Beverage{
    @Override
    protected void addContiment(){
        System.out.println("Nothing");}
       }
       
class Main{
    public static void main(String args[]){
    Beverage b=new Whisky();
    b.templateMethod(30);
    
    b=new Beer();
    b.templateMethod(200);}}
