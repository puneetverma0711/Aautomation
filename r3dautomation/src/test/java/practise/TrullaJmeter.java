package practise;

import org.testng.annotations.Test;



import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TrullaJmeter {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:/selenium jar files/chromedriver_win32/chromedriver.exe");
	  driver = new ChromeDriver();
    baseUrl = "https://www.blazedemo.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testTrullaxLoadTestingSeleniumOnly() throws Exception {
    // Label: Test
    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1366,625 | ]]
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://qa.trullarx.com/accounts/login/");
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("shibua@chetu.com");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("admin@123");
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).click();
    // Label: login requests
    driver.findElement(By.cssSelector("div.card-body")).click();
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("password")).click();
    driver.findElement(By.cssSelector("div.card-body")).click();
    driver.findElement(By.cssSelector("button.btn.btn-info.btn-lg.btn-block.text-uppercase.waves-effect.waves-light")).click();

    // Label: settings menu request
    
   // here element exception is appearing 
  
    
    driver.findElement(By.linkText("Settings")).click();
    // Label: add locations requests
    driver.findElement(By.linkText("Locations")).click();
    driver.findElement(By.cssSelector("button.btn.waves-effect.waves-light.btn-info")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("san francisco");
    driver.findElement(By.name("city")).click();
    driver.findElement(By.name("city")).clear();
    driver.findElement(By.name("city")).sendKeys("SF");
    driver.findElement(By.name("address")).click();
    driver.findElement(By.name("address")).clear();
    driver.findElement(By.name("address")).sendKeys("SF");
    driver.findElement(By.name("state_zip")).click();
    driver.findElement(By.name("state_zip")).clear();
    driver.findElement(By.name("state_zip")).sendKeys("110056");
    driver.findElement(By.id("dept_id")).click();
    driver.findElement(By.id("dept_id")).clear();
    driver.findElement(By.id("dept_id")).sendKeys("TRT5455");
    driver.findElement(By.id("facility_id")).click();
    driver.findElement(By.id("facility_id")).clear();
    driver.findElement(By.id("facility_id")).sendKeys("SD344");
    driver.findElement(By.cssSelector("button.btn.waves-effect.waves-light.btn-success.add-location")).click();
    // Label: add users requests
    driver.findElement(By.linkText("Users")).click();
    driver.findElement(By.cssSelector("button.btn.waves-effect.waves-light.btn-info")).click();
    driver.findElement(By.id("first_name")).click();
    driver.findElement(By.id("first_name")).clear();
    driver.findElement(By.id("first_name")).sendKeys("nikhil");
    driver.findElement(By.id("last_name")).clear();
    driver.findElement(By.id("last_name")).sendKeys("kumar");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("nikhil@yopmail.com");
    driver.findElement(By.id("user_role")).click();
    new Select(driver.findElement(By.id("user_role"))).selectByVisibleText("Basic Role");
    driver.findElement(By.id("user_role")).click();
    driver.findElement(By.cssSelector("button.multiselect.dropdown-toggle.btn-block.text-left.btn.btn-default")).click();
    driver.findElement(By.xpath("//form[@id='add_user_detail']/div/div[6]/div/div/span/div/ul/li[3]/a/label")).click();
    driver.findElement(By.cssSelector("div.modal-footer")).click();
    driver.findElement(By.cssSelector("button.btn.waves-effect.waves-light.btn-success")).click();
    // Label: add supplier requests
    driver.findElement(By.linkText("Suppliers")).click();
    driver.findElement(By.cssSelector("button.btn.waves-effect.waves-light.btn-info")).click();
    driver.findElement(By.id("supplier_type")).click();
    new Select(driver.findElement(By.id("supplier_type"))).selectByVisibleText("Manual");
    driver.findElement(By.id("supplier_type")).click();
    driver.findElement(By.id("supplier_name_manual")).click();
    driver.findElement(By.id("supplier_name_manual")).click();
    driver.findElement(By.id("supplier_name_manual")).clear();
    driver.findElement(By.id("supplier_name_manual")).sendKeys("boston supplier");
    driver.findElement(By.id("supplier_email")).click();
    driver.findElement(By.id("supplier_email")).clear();
    driver.findElement(By.id("supplier_email")).sendKeys("boston@yopmail.com");
    driver.findElement(By.id("supplier_order")).click();
    driver.findElement(By.id("supplier_order")).clear();
    driver.findElement(By.id("supplier_order")).sendKeys("supplier of boston");
    driver.findElement(By.id("create_supplier")).click();
    driver.findElement(By.id("supplier_phone")).click();
    driver.findElement(By.id("supplier_phone")).clear();
    driver.findElement(By.id("supplier_phone")).sendKeys("(565) 465-4654");
    driver.findElement(By.id("create_supplier")).click();
    driver.findElement(By.cssSelector("button.btn.waves-effect.waves-light.btn-info")).click();
    driver.findElement(By.id("supplier_type")).click();
    new Select(driver.findElement(By.id("supplier_type"))).selectByVisibleText("EDI");
    driver.findElement(By.id("supplier_type")).click();
    driver.findElement(By.id("supplier_name_edi")).click();
    driver.findElement(By.id("supplier_name_edi")).clear();
    driver.findElement(By.id("supplier_name_edi")).sendKeys("bronx supplier");
    driver.findElement(By.id("create_supplier")).click();
    driver.findElement(By.cssSelector("button.btn.waves-effect.waves-light.btn-info")).click();
    driver.findElement(By.id("supplier_type")).click();
    new Select(driver.findElement(By.id("supplier_type"))).selectByVisibleText("Internal");
    driver.findElement(By.id("supplier_type")).click();
    driver.findElement(By.id("supplier_location")).click();
    driver.findElement(By.id("supplier_location")).click();
    driver.findElement(By.id("supplier_location")).click();
    new Select(driver.findElement(By.id("supplier_location"))).selectByVisibleText("new jersey");
    driver.findElement(By.id("supplier_location")).click();
    driver.findElement(By.name("ordering_unit")).click();
    driver.findElement(By.name("ordering_unit")).click();
    driver.findElement(By.id("create_supplier")).click();
    // Label: medication order workflow requests
    driver.findElement(By.linkText("Medications")).click();
    driver.findElement(By.id("medic_search")).click();
    driver.findElement(By.id("medic_search")).clear();
    driver.findElement(By.id("medic_search")).sendKeys("aba");
    driver.findElement(By.id("header_search_form")).submit();
    driver.findElement(By.id("cart_qty")).click();
    driver.findElement(By.id("cart_qty")).clear();
    driver.findElement(By.id("cart_qty")).sendKeys("4");
    driver.findElement(By.id("add_cart")).click();
    driver.findElement(By.cssSelector("i.fal.fa-shopping-cart.cart_icon")).click();
    // Label: create template request
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.id("template_name")).click();
    driver.findElement(By.id("template_name")).clear();
    driver.findElement(By.id("template_name")).sendKeys("template 78");
    driver.findElement(By.id("save_template")).click();
    driver.findElement(By.cssSelector("button.swal2-confirm.swal2-styled")).click();
    driver.findElement(By.id("prepare_order_btn")).click();
    driver.findElement(By.cssSelector("i.fal.fa-exchange-alt")).click();
    // Label: prepare and submit order request
    driver.findElement(By.cssSelector("select.custom-select.col-12.swap-supplier-select")).click();
    new Select(driver.findElement(By.cssSelector("select.custom-select.col-12.swap-supplier-select"))).selectByVisibleText("Consolidated Service Center");
    driver.findElement(By.cssSelector("select.custom-select.col-12.swap-supplier-select")).click();
    driver.findElement(By.cssSelector("button.btn.waves-effect.waves-light.btn-success")).click();
    driver.findElement(By.id("order-submit")).click();
    driver.findElement(By.cssSelector("button.swal2-confirm.swal2-styled")).click();
    driver.findElement(By.cssSelector("button.swal2-confirm.swal2-styled")).click();
    // Label: accounting menu request
    driver.findElement(By.xpath("//ul[@id='sidebarnav']/li[9]/a/span")).click();
    driver.findElement(By.cssSelector("#acc_edit_button > a.nav-link > span")).click();
    // Label: add journal request
    driver.findElement(By.id("add_accounting_button")).click();
    driver.findElement(By.name("po_number")).click();
    driver.findElement(By.name("po_number")).clear();
    driver.findElement(By.name("po_number")).sendKeys("39483943434344");
    driver.findElement(By.name("shipment_number")).click();
    driver.findElement(By.name("shipment_number")).clear();
    driver.findElement(By.name("shipment_number")).sendKeys("3345345345345");
    driver.findElement(By.id("select")).click();
    new Select(driver.findElement(By.id("select"))).selectByVisibleText("340B");
    driver.findElement(By.id("select")).click();
    driver.findElement(By.id("select")).click();
    new Select(driver.findElement(By.id("select"))).selectByVisibleText("Internal");
    driver.findElement(By.id("select")).click();
    driver.findElement(By.id("ordering_facility_type")).click();
    new Select(driver.findElement(By.id("ordering_facility_type"))).selectByVisibleText("new jersey");
    driver.findElement(By.id("ordering_facility_type")).click();
    driver.findElement(By.id("ordering_facility_type")).click();
    new Select(driver.findElement(By.id("ordering_facility_type"))).selectByVisibleText("California");
    driver.findElement(By.id("ordering_facility_type")).click();
    driver.findElement(By.id("ordering_facility_id")).click();
    driver.findElement(By.id("supplier_facility_type")).click();
    new Select(driver.findElement(By.id("supplier_facility_type"))).selectByVisibleText("California");
    driver.findElement(By.id("supplier_facility_type")).click();
    driver.findElement(By.id("item_desc")).click();
    driver.findElement(By.id("item_desc")).clear();
    driver.findElement(By.id("item_desc")).sendKeys("tewe3445");
    driver.findElement(By.id("unit_price")).click();
    driver.findElement(By.id("unit_price")).clear();
    driver.findElement(By.id("unit_price")).sendKeys("45");
    driver.findElement(By.id("order_qty")).click();
    driver.findElement(By.id("order_qty")).clear();
    driver.findElement(By.id("order_qty")).sendKeys("45");
    driver.findElement(By.id("shipped_qty")).click();
    driver.findElement(By.id("shipped_qty")).clear();
    driver.findElement(By.id("shipped_qty")).sendKeys("45");
    driver.findElement(By.id("received_date")).click();
    driver.findElement(By.xpath("//tr[4]/td[3]")).click();
    driver.findElement(By.cssSelector("button.btn.waves-effect.waves-light.btn-success")).click();
    driver.findElement(By.id("ndc")).click();
    driver.findElement(By.id("ndc")).clear();
    driver.findElement(By.id("ndc")).sendKeys("46546-5465-46");
    driver.findElement(By.cssSelector("button.btn.waves-effect.waves-light.btn-success")).click();
    // Label: add device request
    driver.findElement(By.xpath("//ul[@id='sidebarnav']/li[5]/a/span")).click();
    driver.findElement(By.cssSelector("button.btn.waves-effect.waves-light.btn-info")).click();
    driver.findElement(By.id("name")).click();
    driver.findElement(By.id("name")).clear();
    driver.findElement(By.id("name")).sendKeys("samsung");
    driver.findElement(By.id("device_id")).click();
    driver.findElement(By.id("device_location")).click();
    new Select(driver.findElement(By.id("device_location"))).selectByVisibleText("California");
    driver.findElement(By.id("device_location")).click();
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.waves-effect.waves-light.btn-success")).click();
    driver.findElement(By.xpath("//ul[@id='sidebarnav']/li[3]/a/span")).click();
    driver.findElement(By.xpath("//ul[@id='sidebarnav']/li[6]/a/span")).click();
    driver.findElement(By.linkText("Pick and Ship")).click();
    // Label: edit medication details request
    driver.findElement(By.xpath("//ul[@id='sidebarnav']/li[12]/a/span")).click();
    driver.findElement(By.linkText("Medications")).click();
    driver.findElement(By.linkText("ACETAMINOPHEN TAB 500 MG")).click();
    driver.findElement(By.xpath("//div/ul/li[2]/a/span")).click();
    driver.findElement(By.id("edit_supplier")).click();
    driver.findElement(By.cssSelector("div.col-md-12.text-lg-right > button.btn.waves-effect.waves-light.btn-success")).click();
    driver.findElement(By.cssSelector("div.swal2-container.swal2-center.swal2-fade.swal2-shown")).click();
    driver.findElement(By.xpath("//div/ul/li[5]/a/span")).click();
    driver.findElement(By.cssSelector("div.col-md-6.text-lg-right > button.btn.waves-effect.waves-light.btn-info")).click();
    driver.findElement(By.id("note_text")).click();
    driver.findElement(By.id("note_text")).clear();
    driver.findElement(By.id("note_text")).sendKeys("test6777");
    driver.findElement(By.id("save_note")).click();
    driver.findElement(By.xpath("//div/ul/li[4]/a/span")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [openWindow |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.linkText("Add Location")).click();
    driver.findElement(By.id("ndc_location")).click();
    new Select(driver.findElement(By.id("ndc_location"))).selectByVisibleText("California");
    driver.findElement(By.id("ndc_location")).click();
    driver.findElement(By.id("ndc_prod")).click();
    driver.findElement(By.id("ndc_prod")).clear();
    driver.findElement(By.id("ndc_prod")).sendKeys("51111048993");
    driver.findElement(By.id("ndc_location_save")).click();
    driver.findElement(By.xpath("//div/ul/li[3]/a/span")).click();
    driver.findElement(By.cssSelector("button.mr-2.btn.waves-effect.waves-light.btn-info.addProductButton")).click();
    driver.findElement(By.id("ndc")).click();
    driver.findElement(By.id("ndc")).clear();
    driver.findElement(By.id("ndc")).sendKeys("56656-5665-6");
    driver.findElement(By.id("manufacturer")).click();
    driver.findElement(By.id("manufacturer")).clear();
    driver.findElement(By.id("manufacturer")).sendKeys("tst6777");
    driver.findElement(By.id("drug_name")).clear();
    driver.findElement(By.id("drug_name")).sendKeys("test7888");
    driver.findElement(By.id("pack_size")).clear();
    driver.findElement(By.id("pack_size")).sendKeys("12");
    driver.findElement(By.id("orange_book")).clear();
    driver.findElement(By.id("orange_book")).sendKeys("565566");
    driver.findElement(By.id("pack_quantity")).click();
    driver.findElement(By.id("pack_quantity")).clear();
    driver.findElement(By.id("pack_quantity")).sendKeys("0");
    driver.findElement(By.id("pack_quantity")).click();
    driver.findElement(By.id("pack_quantity")).click();
    driver.findElement(By.id("add_product")).click();
    driver.findElement(By.id("pack_quantity")).clear();
    driver.findElement(By.id("pack_quantity")).sendKeys("56");
    driver.findElement(By.cssSelector("div.controls > div.onoffswitch2 > label.onoffswitch2-label > span.onoffswitch2-switch")).click();
    driver.findElement(By.id("pack_price")).click();
    driver.findElement(By.id("pack_price")).clear();
    driver.findElement(By.id("pack_price")).sendKeys("45");
    driver.findElement(By.cssSelector("div.controls > div.onoffswitch2 > label.onoffswitch2-label > span.onoffswitch2-inner")).click();
    driver.findElement(By.cssSelector("div.controls > div.onoffswitch2 > label.onoffswitch2-label > span.onoffswitch2-inner")).click();
    driver.findElement(By.id("unit_price")).click();
    driver.findElement(By.id("unit_price")).click();
    driver.findElement(By.id("add_med_prod")).click();
    driver.findElement(By.cssSelector("button.swal2-confirm.swal2-styled")).click();
    driver.findElement(By.xpath("//div/ul/li[2]/a/span")).click();
    driver.findElement(By.cssSelector("a.nav-link > span")).click();
    driver.findElement(By.id("edit_medication_information_btn")).click();
    driver.findElement(By.id("formulary_status")).click();
    driver.findElement(By.id("formulary_status")).click();
    driver.findElement(By.id("pref_pack_type")).click();
    new Select(driver.findElement(By.id("pref_pack_type"))).selectByVisibleText("BOTTLE");
    driver.findElement(By.id("pref_pack_type")).click();
    driver.findElement(By.cssSelector("button.btn.waves-effect.waves-light.btn-success")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

