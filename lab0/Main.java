public class Main{
    public static void main(String [] args){
        JUET j = new JUET();
        j.setAge(20);
        j.setName("JARVIS");
        int age = j.getAge();
        String name = j.getName();
        System.out.println("Name = " +name);
        System.out.println("Age = " +age);
    }
}

class JUET{
    private int age;
    private String name;
    
    //Age
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    
    //Name
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}