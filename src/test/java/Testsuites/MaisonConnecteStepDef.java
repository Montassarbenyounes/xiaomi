package Testsuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.utiles;
import Pages.MaisonConnectPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MaisonConnecteStepDef {

	
	@Given("utilisateur est sur la page du maison connecte")
	public void utilisateur_est_sur_la_page_du_maison_connecte() throws Exception {
		Config.driver=new ChromeDriver(); 
		Config.MaximizeWindow();
		Config.driver.get("https://mistore.com.tn/product-category/maison-connectee/"); 
		
	   	}

	
		@When("utilisateur effectue le tri {string} et clique sur le produit {string}")
		public void utilisateur_effectue_le_tri_et_clique_sur_le_produit(String sortTri, String nameProd) throws Exception {
	
		MaisonConnectPage  page = new MaisonConnectPage();
	    page.sortTriandClickproduct(sortTri, nameProd);
	}

	
		@Then("utilisateur est dirige vers la page du produit {string}")
		public void utilisateur_est_dirige_vers_la_page_du_produit(String nameProd) {
	     		MaisonConnectPage  page = new MaisonConnectPage();
		
	    page.verifProduct(nameProd);
	}



}
