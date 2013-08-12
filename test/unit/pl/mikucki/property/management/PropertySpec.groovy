package pl.mikucki.property.management



import grails.test.mixin.*
import org.junit.*
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Property)
class PropertySpec extends Specification {


    def "should pass validation test on property"(){
        setup:
        mockForConstraintsTests(Property)
        City city = mockDomain(City) as City
        Property property = new Property(name: "name", city: city, homeNumber: "999", street: "Blotna", zipCode: "01-222")

        expect:
        property.validate()
    }

    def "should fail validation test on property zip code"(){
        setup:
        mockForConstraintsTests(Property)
        City city = mockDomain(City) as City
        Property property = new Property(name: "name", city: city, homeNumber: "999", street: "Blotna", zipCode: zipCode)

        when:
        property.validate()

        then:

        property.errors.getFieldError("zipCode") != null

        where:

        zipCode << ["1-222", "01-55", "01256", " 01-564", "01-565 ", "01-555 9"]
    }

}
