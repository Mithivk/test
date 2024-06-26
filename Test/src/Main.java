class A{
	public void meth1(int id) {
		System.out.println(id);

	}
	
	public void meth1(int id, String name) {
		System.out.println(id+" "+name);

	}
}





public class Main {
public static void main(String[] args) {
	A a = new A();
	a.meth1(12);
	a.meth1(12, "Tom");
}
}
