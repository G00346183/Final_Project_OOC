package gmit.final_project;

public class Note
{
	public String forModule;
	public String noteName;
	public String contents;

	public Note(String m, String name)
	{
		forModule = m;
		noteName = name;
	}
	public Note(String m, String name,String c)
	{
		forModule = m;
		noteName = name;
		contents = c;
	}
	public String getNoteName()
	{
		return noteName;
	}
	public String getNoteContents()
	{
		return contents;
	}
	public String getModuleName()
	{
		return forModule;
	}
	public void setNoteContents(String c)
	{
		contents = c;
	}
	public String fullNote()
	{
		String full="";
		full+= this.getNoteName() + "\t" + this.getModuleName() + "\n" + this.getNoteContents();
		return full;
	}
}