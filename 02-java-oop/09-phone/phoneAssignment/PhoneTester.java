
public class PhoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Galaxy s9 = new Galaxy("S9", 85, "Verizon", "Buzz Buzz Buzz" );
		IPhone iphone12 = new IPhone("Pro Max", 95, "AT&T", "Ringgg Ringgg Ringgg");
		
		iphone12.displayInfo();
		System.out.println(iphone12.unlock());
		System.out.println(iphone12.ring());
		
		
		s9.displayInfo();
		System.out.println(s9.unlock());
		System.out.println(s9.ring());

	}

}
