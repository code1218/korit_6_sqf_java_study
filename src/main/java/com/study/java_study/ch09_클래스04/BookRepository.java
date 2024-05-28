package com.study.java_study.ch09_클래스04;


// 저장소 -> CRUD
public class BookRepository {

    private BookEntity[] books;

    public BookRepository() {
        books = new BookEntity[0];
    }

    private void extendBooks() {
        // 기존 배열보다 크기가 하나 더 큰 배열을 생성한다.
        BookEntity[] newBooks = new BookEntity[books.length + 1];

        // 기존 배열의 정보를 새로운 배열로 모두 옮긴다. 이 때 마지막 인덱스의 값은 빈값이다.
        for(int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }

        // 기존 배열의 주소가 들어있는 books 변수에 새로운 배열의 주소를 대입한다.
        books = newBooks;
    }

    public void saveBook(BookEntity book) {
        // 배열 확장
        extendBooks();

        // 새로운 배열의 비어있는 마지막 인덱스에 매개변수로 받아온 book 객체를 대입한다.
        books[books.length - 1] = book;
    }

    public BookEntity findBookByBookId(int bookId) {
        BookEntity findBook = null;

        // 선형탐색
        for(BookEntity book : books) {
            if(book.getBookId() == bookId) {
                findBook = book;
                break;
            }
        }

        return findBook;
    }

    public BookEntity findBookByBookName(String bookName) {
        BookEntity findBook = null;

        // 선형탐색
        for(BookEntity book : books) {
            if(book.getBookName().equals(bookName)) {
                findBook = book;
                break;
            }
        }

        return findBook;
    }

    private int getNewArraySize(String bookName, String author, String publisher) {
        int newArraySize = 0;

        for(BookEntity book : books) {
            if(book.getBookName().contains(bookName)
                    || book.getAuthor().contains(author)
                    || book.getPublisher().contains(publisher)) {
                newArraySize++;
            }
        }

        return newArraySize;
    }

    public BookEntity[] searchBooks(String bookName, String author, String publisher) {
        int newArraySize = getNewArraySize(bookName, author, publisher);

        BookEntity[] searchBooks = new BookEntity[newArraySize];

        int i = 0;
        for(BookEntity book : books) {
            if(book.getBookName().contains(bookName)
                    || book.getAuthor().contains(author)
                    || book.getPublisher().contains(publisher)) {
                searchBooks[i] = book;
                i++;
            }
        }

        return searchBooks;
    }

}









