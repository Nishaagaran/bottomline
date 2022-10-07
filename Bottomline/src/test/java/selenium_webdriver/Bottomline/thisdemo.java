package selenium_webdriver.Bottomline;

public class thisdemo {

	
	int a;   //global variable
	
	
	public thisdemo(int a)
	{
		this.a=a;
		System.out.println(a);
		
	}
	
	public void demo()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
thisdemo d=new thisdemo(20);
d.demo();
	}

}
