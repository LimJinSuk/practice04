package prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int statecode;
	
	public Book(int bookNo,String title,String author){
		setBookNo(bookNo);
		setTitle(title);
		setAuthor(author);
		statecode=1;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getStatecode() {
		return statecode;
	}
	public void setStatecode(int statecode) {
		this.statecode = statecode;
	}
	
	public void rent(){
		statecode=0;
		System.out.println(title+"이(가) 대여 됐습니다.");
	}
	public void print(){
		
		System.out.print("책 제목 : "+title);
		System.out.print(", 작가 : "+author);
		System.out.print(", 대여유무 : ");
		if(statecode==1)
			System.out.println("재고있음");
		else
			System.out.println("대여중");
	}
}
