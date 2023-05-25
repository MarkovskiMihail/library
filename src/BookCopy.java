
public class BookCopy implements Borrowable {
	
	private int id;
	private boolean available;
	private Book book;
	
	public BookCopy(int id, Book book) {
		this.id = id;
		available = true;
		this.book = book;
	}
	
	public Book getBook() {
		return book;
	}
	
	public int getId() {
		return id;
	}
	
	public boolean isAvailable() {
		return available;
	}

	@Override
	public String toString() {
		return "BookCopy [id=" + id + ", available=" + available + ", book=" + book + "]";
	}

	@Override
	public void borrowItem() throws AvailabilityExceprion {
		// If the book copy is not available then throw exception
		if(!available)
			throw new AvailabilityExceprion("book copy" + id + " of the book: " + book.getTitle() + "is not available becasue it is not available");
		available = false;	
	} 

	@Override
	public void returnItem() throws AvailabilityExceprion {
		// If the book copy is already available then throw exception
		if(available)
			throw new AvailabilityExceprion("book copy" + id + " of the book: " + book.getTitle() + "is not available becasue it is not available");
		available = true;
	}
}
