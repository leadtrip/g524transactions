package g524transactions

import grails.gorm.transactions.Transactional
import wood.mike.Book

class BootStrap {

    def init = { servletContext ->
        addBooks()
    }

    @Transactional
    def addBooks() {
        new Book(title: 'Grails transactions', author: 'Mike Wood').save()
        new Book(title: 'Insects', author: 'Bob').save()
    }

    def destroy = {
    }
}
