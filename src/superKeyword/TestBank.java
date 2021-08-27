package superKeyword;

public class TestBank {
 
	public static void main(String Args[]) {
		
		
		
        HDFCBank hb = new HDFCBank("nav", "Pune");
		
		System.out.println(hb.min_bal);
		
		hb.balanceDisplay();

		Bank b = new Bank("ICICI", "Delhi");
		
		HSBCBank hs = new HSBCBank();
		hs.display();
		
	}
}
