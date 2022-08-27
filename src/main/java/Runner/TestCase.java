package Runner;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.Commitment;
import PageObject.ContactUS;
import PageObject.Coupons;
import PageObject.Facebook;
import PageObject.Language;
import PageObject.Login;
import PageObject.Footer;
import PageObject.Shopproduct;
import PageObject.WashClothes;
import PageObject.WhatsNew;
import PageObject.Search;
import Utility.BaseClass;
import Utility.Log4j;

public class TestCase extends BaseClass{

	@Test(priority=11)
	public void login() throws InterruptedException {
		org.apache.logging.log4j.Logger log=LogManager.getLogger(Log4j.class);	
		logger=report.createTest("Login");
		Login page=PageFactory.initElements(driver,Login.class);
		log.info("Verifying login in the application ");
		page.login();
		logger.pass("success");
		}
	@Test(priority=2)
	public void language() throws InterruptedException {
		org.apache.logging.log4j.Logger log=LogManager.getLogger(Log4j.class);	
		logger=report.createTest("Language");
		Language page=PageFactory.initElements(driver,Language.class);
		log.info("verifing language in the application");
		page.language();
		logger.pass("sucess");
	}
	@Test(priority=3)
	public void contact() throws InterruptedException {
		org.apache.logging.log4j.Logger log=LogManager.getLogger(Log4j.class);	
		logger=report.createTest("Contact Us");
		ContactUS page=PageFactory.initElements(driver,ContactUS.class);
		log.info("verifing contacts in the application");
		page.contact();
		logger.pass("sucess");
	}
	@Test(priority=4)
	public void shop() throws InterruptedException {
		org.apache.logging.log4j.Logger log=LogManager.getLogger(Log4j.class);	
		logger=report.createTest("Shop Product");
		Shopproduct page=PageFactory.initElements(driver,Shopproduct.class);
		log.info("verifing Shop product in the application");
		page.shop();
		logger.pass("sucess");
	}
	@Test(priority=5)
	public void commitment() throws InterruptedException {
		org.apache.logging.log4j.Logger log=LogManager.getLogger(Log4j.class);	
		logger=report.createTest(" Commitment");
		Commitment page=PageFactory.initElements(driver,Commitment.class);
		log.info("verifing Commitment in the application");
		page.commitment();
		logger.pass("sucess");
	}
	@Test(priority=6)
	public void coupons() throws InterruptedException {
		org.apache.logging.log4j.Logger log=LogManager.getLogger(Log4j.class);	
		logger=report.createTest(" Coupons");
		Coupons page=PageFactory.initElements(driver,Coupons.class);
		log.info("verifing Coupons in the application");
		page.coupons();
		logger.pass("sucess");
	}
	@Test(priority=7)
	public void Search() throws InterruptedException {
		org.apache.logging.log4j.Logger log=LogManager.getLogger(Log4j.class);	
		logger=report.createTest(" Search");
		Search page=PageFactory.initElements(driver,Search.class);
		log.info("verifing Search in the application");
		page.search();
		logger.pass("sucess");
	}
	@Test(priority=8)
	public void Wash() throws InterruptedException {
		org.apache.logging.log4j.Logger log=LogManager.getLogger(Log4j.class);	
		logger=report.createTest(" Coupons");
		WashClothes page=PageFactory.initElements(driver,WashClothes.class);
		log.info("verifing Coupons in the application");
		page.wash();
		logger.pass("sucess");
	}
	@Test(priority=9)
	public void New() throws InterruptedException {
		org.apache.logging.log4j.Logger log=LogManager.getLogger(Log4j.class);	
		logger=report.createTest(" WhatsNew");
		WhatsNew page=PageFactory.initElements(driver,WhatsNew.class);
		log.info("verifing WhatsNew in the application");
		page.New();
		logger.pass("sucess");
	}
	@Test(priority=10)
	public void Footer() throws InterruptedException {
		org.apache.logging.log4j.Logger log=LogManager.getLogger(Log4j.class);	
		logger=report.createTest(" Footer");
		Footer page=PageFactory.initElements(driver,Footer.class);
		log.info("verifing Footer in the application");
		page.footer();
		logger.pass("sucess");
	}
	@Test(priority=1)
	public void FaceBook() throws InterruptedException {
		org.apache.logging.log4j.Logger log=LogManager.getLogger(Log4j.class);	
		logger=report.createTest(" FaceBook");
		Facebook page=PageFactory.initElements(driver,Facebook.class);
		log.info("verifing FaceBook in the application");
		page.facebook();
		logger.pass("sucess");
	}
}
