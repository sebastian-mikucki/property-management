package pl.mikucki.property.management

class Bill {

    String name
    Date createdDate
    Date expirationDate
    Date payedDate
    Category category
    Provider provider

    static constraints = {
        category nullable: false
        provider nullable: false
        name blank: false, maxSize: 255
        expirationDate nullable: false
        payedDate nullable: true
    }
}
