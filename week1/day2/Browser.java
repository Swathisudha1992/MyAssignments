package week1.day2;

public class Browser {
	String launchBrowser(String Firefox){
		System.out.println("Browser launched successfully");
		return Firefox;
		
	}
	public void loadUrl(){
		System.out.println("Application url loaded successfully");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser bm=new Browser();
		bm.loadUrl();
		//bm.launchBrowser("Firefox");
		System.out.println(bm.launchBrowser("Firefox"));

	}

}
