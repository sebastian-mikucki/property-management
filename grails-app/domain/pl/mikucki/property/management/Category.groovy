package pl.mikucki.property.management

class Category {

    String name

    static constraints = {
        name blank: false, unique: true, maxSize: 100
    }
}
