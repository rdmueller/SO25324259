package pages

import geb.Page


class IndexPage extends Page {
	static url = ""

	static at = {
		title ==~ /Welcome to Grails/
	}
	
	static content = {
        dbdocLink() { $("a[href='/SO25324259/dbdoc']") }
	}

}