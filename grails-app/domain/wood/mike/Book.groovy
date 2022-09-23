package wood.mike

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Book {

    String title
    String author

    static mapping = {
        title nullable: false
        author nullable: false
    }
}
