package assignment_AppDesign;

public class TestAppDesign {

	public static void main(String[] args) {
		
		Web web = new Web();
		web.header();
		web.body();
		web.footer();
		web.url();
		web.title();
		web.navBar();
		web.logo();
		web.HeadLine();
		web.isUserActive();
		
		IOS ios = new IOS();
		ios.header();
		ios.body();
		ios.footer();
		ios.url();
		ios.logo();
		ios.navBar();
		ios.title();
		

		Android andro = new Android();
		andro.logo();
		andro.navBar();
		andro.title();
		andro.header();
		andro.body();
		andro.footer();
		andro.url();
		
		
		AppDesign app1 = new Web();
		app1.body();
		app1.url();
		
	}

}
