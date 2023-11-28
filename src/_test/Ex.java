//package _test;
//
//class Book implements Borrowable{
//    String title;
//    String writer;
//    String publisher;
//    int year;
//
//    public Book(String title, String writer, String publisher, int year) {
//        this.title = title;
//        this.writer = writer;
//        this.publisher = publisher;
//        this.year = year;
//    }
//    public void borrow(){
//        System.out.println("책을 빌렸습니다.");
//    }
//    public void returnItem(){
//        System.out.println("책을 빌릴 수있는 item은");
//    }
//}
//interface Borrowable {
//
//    public void borrow();
//
//    public void returnItem();
//}
//
//class LibraryUser extends Library{
//    //도서관 이용자
//    String user;
//    String phone;
//
//    public LibraryUser(String user, String phone) {
//        this.user = user;
//        this.phone = phone;
//    }
//
//    @Override
//    public void loanBook(String title) {
//        super.loanBook(title);
//    }
//
//    @Override
//    public void returnBook(String title) {
//        super.returnBook(title);
//    }
//}
//class Library  {
//    public void addBook(){
//
//    }
//    public void deleteBook(){
//
//    }
//    public void loanBook(String title){
//        System.out.println(title + "책을 빌렸습니다.");
//    }
//    public void returnBook(String title){
//        System.out.println(title + "책을 반납했습니다.");
//    }
//
//}
//public class Ex {
//    public static void main(String[] args) {
//    LibraryUser user = new LibraryUser("미녕","112");
//
//    }
//}

