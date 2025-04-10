public class EagerSingleton{
	private static final EagerSingleton uniqueinstance = new EagerSingleton();
	private static int cnt = 0;

	private EagerSingleton(){
		cnt++;
		System.out.println("Count : " + cnt);
	}

	public static EagerSingleton getInstance(){
		return uniqueinstance;
	}

	public static void main(String[] args){
		EagerSingleton s1 = EagerSingleton.getInstance();
		EagerSingleton s2 = EagerSingleton.getInstance();
	}
}
