import java.util.ArrayList;
import java.util.List;

public class Member {
	private int id;
	private String name;
	public static final int MAX_ON_LOAN = 6;
	private List<Borrowable> onLoan;

	public Member(int id, String name) {
		this.id = id;
		this.name = name;
		onLoan = new ArrayList<Borrowable>();
	}

	public void borrows(Borrowable b) throws AvailabilityExceprion, LoanLimitException{
		// if member has max on loan throw an exeption
		if (onLoan.size() == MAX_ON_LOAN)
			new LoanLimitException("Member"+ name + "with id" + b.getId() + "cannot borrow becuase maximum reached");
		// if b is not available than throw an exeption
		if()
		//
		
		onLoan.add(b);
		b.borrowItem();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}

}
