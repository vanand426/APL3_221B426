public class Voice{
    
    Animal [] array = new Animal[5];
    
    public void prepareVoice(){
        array[0] = new Cow();
        array[1] = new Dog();
        array[2] = new Pig();
        array[3] = new Goat();
        array[4] = new Lion();
        
        hear(array);
    }
    public void hear(Animal a[]){
        for(int i=0;i<5;i++){
            System.out.println(a[i].makeVoice());
        }
    }
}