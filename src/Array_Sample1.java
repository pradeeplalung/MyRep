import java.util.ArrayList;
import java.util.Hashtable;


public class Array_Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("kela");
		
				
		for(int i =0; i<list.size() ; i++){
			System.out.println(list.get(i));
		}
		
		Hashtable<String,String> hlist = new Hashtable<String,String>();
		hlist.put("App", "SinglePoint");
		hlist.put("Street", "High Street");
		
		System.out.println(hlist.get("App"));
			
		}
		

}
