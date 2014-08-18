import geb.spock.GebReportingSpec

import spock.lang.*

import pages.*

@Stepwise
class DemoSpec extends GebReportingSpec {


    def "try to click on a link"() {
        when:
		        to IndexPage
		        report "index"
        then:
            at IndexPage
        when:
        	dbdocLink.click()
        	report "clicked link"
        then:
        	  1 == 1
    }

}