package pl.mikucki.property.management

class Property {

    String name
    String street
    String homeNumber
    String zipCode
    City city
    //TODO add bills and investments

    static constraints = {
        name blank: false, maxSize: 150
        street blank: false, maxSize: 255
        homeNumber blank: false, maxSize: 10
        city nullable: false
        zipCode blank: false, matches: "^[\\d]{2}-[\\d]{3}\$", maxSize: 6
    }
}
