package Testsuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.utiles;
import Pages.HomePage;
import io.cucumber.java.en.*;

public class HomePageStepDef {
	@Given("utilisateur est sur la page d accueil")
	public void utilisateur_est_sur_la_page_d_accueil() throws Exception {
		Config.driver=new ChromeDriver () ;
		Config.MaximizeWindow();
		Config.driver.get(utiles.getproprety("Web_Home_Link"));
	}

	@When("utilisateur survole la souris sur le menu {string} et clique sur submenu {string}")
	public void utilisateur_survole_la_souris_sur_le_menu_et_clique_sur_submenu(String menuname, String submenuname) {
		HomePage page =new HomePage () ; 
				page.mouseHoverOnMenu(menuname);
		        page.ClickOnProduct(submenuname);
	    
	}

	@Then("utilisateur est dirige vers la page {string}")
	public void utilisateur_est_dirige_vers_la_page(String Productname) {
		HomePage page=new HomePage () ;
				page.verif(Productname) ;
	   
	}


	

}
