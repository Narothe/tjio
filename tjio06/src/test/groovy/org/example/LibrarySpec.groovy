package org.example

import spock.lang.Specification

class LibrarySpec extends Specification {

    def "test borrowBook method"() {
        println("\n\nRunning 'test borrowBook method' test\n")
        given:
        BookManagement bookManagement = new BookManagementImpl() // Tworzymy BookManagementImpl z gotowymi książkami
        Library library = new Library(bookManagement)
        def initialBooksCount = bookManagement.allBooks().size() // Zapisujemy początkową liczbę książek

        when:
        boolean result = library.borrowBook("Metro 2033") // Wypożyczamy dostępną książkę

        then:
        result == true // Spodziewamy się, że metoda zwróci true, gdyż książka "Metro 2033" istnieje i zostanie wypożyczona
        bookManagement.allBooks().size() == initialBooksCount - 1 // Sprawdzamy, czy liczba książek w bibliotece jest o 1 mniejsza niż przed wypożyczeniem
    }

    def "test returnBook method"() {
        println("\n\nRunning 'test returnBook method' test\n")
        given:
        BookManagement bookManagement = new BookManagementImpl() // Tworzymy BookManagementImpl z gotowymi książkami
        Library library = new Library(bookManagement)
        def initialBooksCount = bookManagement.allBooks().size() // Zapisujemy początkową liczbę książek
        library.borrowBook("Metro 2033") // Wypożyczamy książkę, aby móc ją potem zwrócić

        when:
        library.returnBook("Metro 2033", "Dmitry Glukhovsky", 2005) // Zwracamy książkę do biblioteki

        then:
        bookManagement.allBooks().size() == initialBooksCount // Spodziewamy się, że po zwrocie książki, lista książek będzie zawierać tyle samo pozycji co oryginalnie
    }
}
