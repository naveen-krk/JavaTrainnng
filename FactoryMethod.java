package DesignPattern;

public class FactoryMethod {
public static void main(String[] args) {
	OSFactory factory=new OSFactory();
	OS obj=factory.getInstance("Closed");
	obj.spec();
}
}
 interface OS{
	void spec();
}
class Android implements OS{	
	public void spec() {
		
		System.out.println("Widely used OS");
	}
}
class IOS implements OS{
	public void spec() {
		System.out.println("Secure OS");
	}
	
}
class Windows implements OS{
	public void spec() {
		System.out.println("Oldest OS");
	}
	
}
class Linux implements OS {
	public void spec() {
		System.out.println("Open Source");
	}
	

}
class OSFactory{
	public OS getInstance(String str) {
		if(str.equals("Open"))
			return new Android();
		else if(str.equals("Closed"))
			return new IOS();
		else if(str.equals("Old"))
			return new Windows();
		else
			return new Linux();
	}
}

