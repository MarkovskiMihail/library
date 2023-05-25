import java.util.*;

public class Library {
private List<Title> titles;
private List<Member> members;
private List<Borrowable> borrowables;

//methods: constructor
public Library() {
this.titles = new ArrayList<Title>();
this.members = new ArrayList<Member>();
this.borrowables = new ArrayList<Borrowable>();
}

public void addTitle(Title title) {
//if title already exists in the library ,throw exception
titles.add(title);
}

public void addBorrowable(Borrowable borrowable ) {
//if borrowable already there ,throw exception
borrowables.add(borrowable);
}

public void addMember(Member member) {
//if member already there ,throw exception
members.add(member);
}

public void addMember(int id , String name) {
members.add( new Member(id ,name));
}
}