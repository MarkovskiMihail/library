
public class Jurnal extends Title {
	private String editor;

	public Jurnal(int id, String title, String editor) {
		super(id, title);
		this.editor = editor;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	@Override
	public String toString() {
		return "Jurnal [editor=" + editor + ", toString()=" + super.toString() + "]";
	}

	
}
