
public class MyProj6 {

	public static void main(String[] args) {
		int x = 5;
		System.out.println(Math.pow(-99999, 99999999));
		
		int y = 5 / 2;
		int a = 5;
		double z = (double) a /2;
		int w = 5 % 2;
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
		
		x--;
		System.out.println(x);
		
		x++;
		System.out.println(x);
		
		++x;
		System.out.println(x);
		
		int b = 43;
		int c = 7685;;
		Integer.max(b, c);
		System.out.println(Integer.max(b, c));
		
		System.out.println(Integer.compare(b, c));
		
		String money = "300";
		System.out.println(Integer.valueOf(money));
		System.out.println(Integer.parseInt(money));
		
		
		String e = "hello\n\n\n\"dog\""; //object, an instance of a class
		System.out.println(e.charAt(1));
		System.out.println(e);
		
		String f = "hello cats";
		System.out.println(f + " and dogs");
		f += " and puppies";
		System.out.println(f);
		System.out.println(f + " and dogs");
		
		System.out.println(f.length());
		
		String g = "my oh my hot moi moi";
		System.out.println(g.charAt(4));
		System.out.println(g.charAt(g.length() - 1));
		
		System.out.println(g.concat (" saving lives since 1900"));
		
		String fullAd = g + " no be lie";
		System.out.println(fullAd);
		
		System.out.println(fullAd.contains("eba"));
		
		System.out.println(fullAd.indexOf("hot" , 3)); 
		System.out.println(fullAd.lastIndexOf("my"));

	}

}

/*
* + addition
* - minus
*  division
** multiplication
* % modulus
*/
