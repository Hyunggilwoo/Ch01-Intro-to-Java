// Author Hyunggil Woo


public class StarFigures {
	public static void main(String[] args) {
		
		drawbox();
		drawax();
		drawline();
		drawbox();
		drawax();
		drawbox();
		drawline();
		drawpole();
		drawbox();
		drawax();
		
	}
	public static void drawbox () {
		System.out.println ("*****");
		System.out.println ("*****");
		
	}
	public static void drawax () {
		System.out.println (" * * ");
		System.out.println ("  *  ");
		System.out.println (" * * ");
	}
	public static void drawpole () {
		System.out.println ("  *  ");
		System.out.println ("  *  ");
		System.out.println ("  *  ");
		
	}
	public static void drawline () {
		System.out.println ();
		System.out.println ();
	}
}
