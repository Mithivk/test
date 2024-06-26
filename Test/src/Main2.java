class C {
	public void meth1(int id) {
		System.out.println(id);

	}
}

class B extends C{
	@Override
	public void meth1(int id) {
		// TODO Auto-generated method stub
		super.meth1(id);
	}
}




public class Main2 {
public static void main(String[] args) {
	B b = new B();
	b.meth1(12);
}
}
