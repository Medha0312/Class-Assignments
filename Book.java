package OOPS;

public class Book {
	int bookid;
	String bookName;
	
	//Setter & getter method
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid= bookid;
	}
	public String getBookName()
	{
		return bookName;
		
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookName=" + bookName + "]";
	}
}