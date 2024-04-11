package org.example

class BookManagementImpl implements BookManagement {

    List<Book> bookList = new ArrayList<>()

    BookManagementImpl() {
        bookList.add(new Book("Metro 2033", "Dmitry Glukhovsky", 2005))
        bookList.add(new Book("Ferdydurke", "Witold Gombrowicz", 1937))
    }

    @Override
    void addBook(String title, String author, int year) {
        println("Adding book: $title, $author, $year, to the list")
        bookList.add(new Book(title, author, year))
    }

    @Override
    boolean removeBook(String title) {
        println("Removing book: $title from the list")
        def bookToRemove = bookList.find { it.title == title }
        if (bookToRemove != null) {
            bookList.remove(bookToRemove)
            return true
        }
        return false
    }

    @Override
    List<Book> allBooks() {
        return bookList
    }
}
