class LazySingleton{
    private static LazySingleton instance;

    private LazySingleton(){
        System.out.println("Instance Created");
    }

    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void main(String[] args){
        LazySingleton s1 = LazySingleton.getInstance();
        LazySingleton s2 = LazySingleton.getInstance();

        System.out.println(s1 == s2);
    }
}
