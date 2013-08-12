package pl.mikucki.property.management

class City {

    String name

    static constraints = {
        name blank: false, unique: true, maxSize: 255
    }
}
