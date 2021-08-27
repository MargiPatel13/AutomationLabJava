package Assignment_Interface;

public class HomePage extends PageDesign implements WebPage, MobilePage, W3C {

	@Override
	public void Internationalization() {
		System.out.println("HomePage -- Internationalization");
	}
	@Override
	public void Accessibility() {
		System.out.println("HomePage -- Accessibility");
	}
	@Override
	public void privacy() {
		System.out.println("HomePage -- privacy");
	}
	@Override
	public void css() {
		System.out.println("HomePage -- css");
	}
	@Override
	public void html() {
		System.out.println("HomePage -- html");
	}
	@Override
	public void javaScript() {
		System.out.println("HomePage -- javaScript");
	}
	@Override
	public void responsiveDesign() {
		System.out.println("HomePage -- responsiveDesign");
	}
	@Override
	public void graphics() {
		System.out.println("HomePage -- graphics");
	}
	@Override
	public void responsiveImages() {
		System.out.println("HomePage -- responsiveImages");
	}
	@Override
	public void lazyLoad() {
		System.out.println("HomePage -- lazyLoad");
	}
	@Override
	public void dynamicWebPage() {
		System.out.println("HomePage -- dynamicWebPage");
	}
	@Override
	public void staticWebPage() {
		System.out.println("HomePage -- staticWebPage");
	}
	@Override
	public void webAPI() {
		System.out.println("LoginPage -- webAPI");
	}
	
	public void header() {
		System.out.println("HomePage -- header");
	}
	public void logo() {
		System.out.println("HomePage -- logo");
	}
	public void navigationBar() {
		System.out.println("HomePage -- navigationBar");
	}
	public void searchBar() {
		System.out.println("HomePage -- searchBar");
	}
	public void footer() {
		System.out.println("HomePage -- footer");
	}
	
	@Override
	public void asymmetricalLayout() {
		System.out.println("HomePage -- asymmetrical Layout");
	}
	@Override
	public void gridOfCardsLayout() {
		System.out.println("HomePage -- grid Of Cards Layout");
	}
}
