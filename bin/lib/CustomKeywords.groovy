
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String


 /**
	 * Refresh browser
	 */ 
def static "pages.loginPage.refreshBrowser"() {
    (new pages.loginPage()).refreshBrowser()
}

 /**
	 * Click element
	 * @param to Katalon test object
	 */ 
def static "pages.loginPage.clickElement"(
    	TestObject to	) {
    (new pages.loginPage()).clickElement(
        	to)
}

 /**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */ 
def static "pages.loginPage.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new pages.loginPage()).getHtmlTableRows(
        	table
         , 	outerTagName)
}
