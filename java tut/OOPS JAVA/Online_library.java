class Library {
    String[] books = new String[100];
    String booksIssued[] = new String[100];
    int noOfBooks;
    int noIssueBooks;

    public void addBook(String b) {
        this.books[noOfBooks] = b;
        noOfBooks++;
    }

    public void issue_book(String b) {

        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                continue;
            }
            if (this.books[i].equals(b)) {
                this.booksIssued[noIssueBooks] = b;
                noIssueBooks++;
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book is already taken or not available in library");

    }

    public void returnBook(String s) {
        for (int i = 0; i < this.booksIssued.length; i++) {
            if (this.booksIssued[i] == null) {
                continue;
            }
            if (this.booksIssued[i].equals(s)) {
                addBook(s);
                this.booksIssued[i] = null;
                return;
            }
        }
        System.out.println("This book was never in our library");
    }

    public void showAvailableBooks() {
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println(book);
        }
    }

}

public class Online_library {
    public static void main(String[] args) {
        Library l = new Library();
        l.addBook("james");
        l.addBook("charles");
        l.showAvailableBooks();
        l.issue_book("james");
        l.showAvailableBooks();
        l.issue_book("james");
        l.returnBook("james");
        l.showAvailableBooks();
        l.returnBook("hens");
    }
}
