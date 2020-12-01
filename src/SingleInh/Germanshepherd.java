package SingleInh;

public class Germanshepherd extends Dog {
	
	public void run () {
		System.out.println("Germanshepherd dogs can run fast");
	}

	
	public static void main(String[] args) {
		Germanshepherd gs = new Germanshepherd();
		gs.run();
		gs.bark();
		
	}
}
