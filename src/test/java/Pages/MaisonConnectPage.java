package Pages;



import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.Config;

public class MaisonConnectPage {
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[2]/div[4]/form/div/select")
	WebElement tri;
    
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3/a")
	List<WebElement> menus ;
	
	@FindBy(xpath="//*[@id=\"product-16704\"]/div[1]/div/div[1]/div/div[1]/h1")
        WebElement verifProd ; 
	
	public void MaisonConnectePage () {
		

		PageFactory.initElements(Config.driver, this);
	}
		public void sortTriandClickproduct (String sortTri,String productName) throws Exception {
			Thread.sleep(6000);
			System.out.println("Hello");
			//Select select=new Select(tri) ;
			//select.selectByVisibleText(sortTri) ; 
			System.out.println( Config.driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[1]/div/header/h1")).getText());
			try {
			for (WebElement menu:menus) {
				System.out.println(menu.getText()) ;
				System.out.println("Test");
				if (menu.getText().contains(productName)) {
					menu.click();
				}	
			}
		
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		}
	
     public void verifProduct(String titreProduit) { 
     Assert.assertEquals(titreProduit, verifProd.getText());  
     }


}



