package exercisee;

public class exp25{
	public static void useD(String[] args) {
		base z = new base();
		System.out.println("base says, " + z.Method());
	}
}

class base {
	String Method() {
		return "Wow";
	}
}