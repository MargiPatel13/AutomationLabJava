package Assignment_Interface;

public class LoginPage extends PageDesign implements WebPage, MobilePage, W3C  {

	@Override
	public void Internationalization() {
		System.out.println("LoginPage -- Internationalization");
	}
	@Override
	public void Accessibility() {
		System.out.println("LoginPage -- Accessibility");
	}
	@Override
	public void privacy() {
		System.out.println("LoginPage -- privacy");
	}
	@Override
	public void css() {
		System.out.println("LoginPage -- css");
	}
	@Override
	public void html() {
		System.out.println("LoginPage -- html");
	}
	@Override
	public void javaScript() {
		System.out.println("LoginPage -- javaScript");
	}
	@Override
	public void responsiveDesign() {
		System.out.println("LoginPage -- responsiveDesign");
	}
	@Override
	public void graphics() {
		System.out.println("LoginPage -- graphics");
	}
	@Override
	public void responsiveImages() {
		System.out.println("LoginPage -- responsiveImages");
	}
	@Override
	public void lazyLoad() {
		System.out.println("LoginPage -- lazyLoad");
	}
	@Override
	public void dynamicWebPage() {
		System.out.println("LoginPage -- dynamicWebPage");
	}
	@Override
	public void staticWebPage() {
		System.out.println("LoginPage -- staticWebPage");
	}
	@Override
	public void webAPI() {
		System.out.println("LoginPage -- webAPI");
	}
	
	public void userNameTextbox() {
		System.out.println("LoginPage -- userNameTextBox");
	}
	public void passwordTextbox() {
		System.out.println("LoginPage -- passwordTextbox");
	}
	public void loginButton() {
		System.out.println("LoginPage -- loginButton");
	}
	public void forgotPasswordlink() {
		System.out.println("LoginPage -- forgotPasswordlink");
	}
	public void createNewAccount() {
		System.out.println("LoginPage -- createNewAccount");
	}
	
	@Override
	public void asymmetricalLayout() {
		System.out.println("LoginPage -- asymmetrical Layout");
	}
	@Override
	public void gridOfCardsLayout() {
		System.out.println("LoginPage -- grid Of Cards Layout");
	}
}
