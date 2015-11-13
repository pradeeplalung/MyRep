
class privateMembers {
	
	private int a;
	public int x;

	private void mPrompt(){
		System.out.println("Private Method");
	}
	
	
	public int b;
	public void mPrompt(int b){
		System.out.println("Value of B :"+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		privateMembers pm = new privateMembers();

		pm.mPrompt(5);
		System.out.println(pm.b);
		pm.mPrompt();


	}
}
/*public class privateMembers{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		privateMembers1 pm = new privateMembers1();
		pm.mPrompt(5);
		System.out.println(pm.b);
		

	}

}*/
