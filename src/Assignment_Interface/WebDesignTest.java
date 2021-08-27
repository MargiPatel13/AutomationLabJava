package Assignment_Interface;

public class WebDesignTest {

	public static void main(String[] args) {

		HomePage hp = new HomePage();
		hp.Accessibility();
		hp.asymmetricalLayout();
		hp.dynamicWebPage();
		hp.footer();
		hp.graphics();
		hp.gridOfCardsLayout();
		hp.header();
		hp.Internationalization();
		hp.javaScript();
		hp.lazyLoad();
		hp.SingleColumnLayout();
		
		LoginPage lp = new LoginPage();
		lp.createNewAccount();
		lp.userNameTextbox();
		lp.passwordTextbox();
		lp.forgotPasswordlink();
		lp.loginButton();
		lp.privacy();
		lp.Accessibility();
		lp.graphics();
		lp.SingleColumnLayout();
		
		PageDesign pd1 = new PageDesign();
		pd1.asymmetricalLayout();
		
		//Top Casting
		MobilePage mp  = new LoginPage();
		mp.responsiveDesign();
		mp.graphics();
		mp.responsiveDesign();
		mp.webAPI();
		mp.javaScript();
		mp.css();
		mp.html();
		
		WebPage wp  = new HomePage();
		wp.dynamicWebPage();
		wp.staticWebPage();
		wp.lazyLoad();
		wp.webAPI(); 
		
		W3C wc = new HomePage();
		wc.Accessibility();
		wc.css();
		wc.html();
		wc.javaScript();
		wc.webAPI();
		wc.privacy();
		wc.Internationalization();
		
		PageDesign pd = new LoginPage();
		pd.asymmetricalLayout();
		pd.gridOfCardsLayout();
		pd.SingleColumnLayout();
		
		//Down casting
		//LoginPage lp = new MobilePage();
		//HomePage hp = new WebPage();
		//HomePage hp1 = new W3C();
		
		//LoginPage lp1 = (LoginPage) new PageDesign();
		//HomePage hp2 = (HomePage) new PageDesign();
		
	}

}
