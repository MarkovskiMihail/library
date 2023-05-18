import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTitleGUI extends JFrame implements ActionListener{

	private Library library;

private JButton addBookBt;
private JButton viewAllBt;
private JButton addJournalBt;

private JLabel idLb;
private JLabel titleLb;
private JLabel authEdLb;

private JTextField idTf;
private JTextField titleTf;
private JTextField authEdTf;

private JPanel contentPanel;
private JPanel mainPanel;
private JPanel buttonsPanel;

JFrame frame = new JFrame();

//constructor
public AddTitleGUI(){

library =  new Library();	
contentPanel = (JPanel) getContentPane();
contentPanel.setLayout(new BorderLayout());

mainPanel = new JPanel(new GridLayout(3,2));

buttonsPanel = new JPanel();

addBookBt = new JButton("Add Book");
addJournalBt = new JButton("Add Journal");
viewAllBt = new JButton("View All");

addBookBt.addActionListener(e->addBookActionPerformed());
addJournalBt.addActionListener(e->addJurnalActionPerformed());
viewAllBt.addActionListener(e->viewAllActionPerformed());

idLb = new JLabel("ID:");
titleLb = new JLabel("Title:");
authEdLb = new JLabel("Author(book) or Editor(journal)");

idTf = new JTextField();
titleTf = new JTextField();
authEdTf = new JTextField();

setTitle("Add New Title");

buttonsPanel.add(addBookBt);
buttonsPanel.add(viewAllBt);
buttonsPanel.add(addJournalBt);

contentPanel.add(buttonsPanel,BorderLayout.SOUTH);

mainPanel.add(idLb);
mainPanel.add(idTf);
mainPanel.add(titleLb);
mainPanel.add(titleTf);
mainPanel.add(authEdLb);
mainPanel.add(authEdTf);

contentPanel.add(mainPanel , BorderLayout.CENTER);
}

public void viewAllActionPerformed() {

}

public void addJurnalActionPerformed() {

	int id = Integer.parseInt(idTf.getText());
	String title = titleTf.getText();
	String author = authEdTf.getText();
	Jurnal j = new Jurnal(id, title, author);
	library.addTitle(j);
	
}

public void addBookActionPerformed() {
		
	int id = Integer.parseInt(idTf.getText());
	String title = titleTf.getText();
	String author = authEdTf.getText();
	Book b = new Book(id, title, author);
	library.addTitle(b);
}

@Override
public void actionPerformed(ActionEvent e) {


}

}