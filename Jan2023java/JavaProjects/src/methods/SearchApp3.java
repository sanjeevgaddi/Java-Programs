package methods;

public class SearchApp3 {

	public static void main(String[] args) {
		
		Search3 search3=new Search3();
		int res = search3.linearSearch();
		if(res>=0)
		{
			System.out.println("key found at the index "+res);
		}
		else
		{
			System.out.println("Key not found");
		}
	}

}
