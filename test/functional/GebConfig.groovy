/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

//import org.openqa.selenium.firefox.FirefoxDriver
//import org.openqa.selenium.chrome.ChromeDriver
//import org.openqa.selenium.htmlunit.HtmlUnitDriver

import org.openqa.selenium.phantomjs.PhantomJSDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.Dimension
driver = {
    def driver = new PhantomJSDriver(new DesiredCapabilities())
    driver.manage().window().setSize(new Dimension(1028, 100))
    driver
}

environments {
	
	// run as “grails -Dgeb.env=chrome test-app”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
	//	driver = { new ChromeDriver() }
	}
	
	// run as “grails -Dgeb.env=firefox test-app”
	// See: http://code.google.com/p/selenium/wiki/FirefoxDriver
	firefox {
	//	driver = { new FirefoxDriver() }
	}

}