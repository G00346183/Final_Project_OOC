package gmit.final_project;

public class CollegeJournal
{
	public static void main(String [] args)
	{
		Module m1 = new Module("Programming","P");
		Module m2 = new Module("Testing","T");
		Module m3 = new Module("Maths","M");
		Module m4 = new Module("English","E");

		//System.out.println(m1.getModuleName());
		//System.out.println(m2.getModuleName());

		//System.out.println(m3.getModuleShortName());
		//System.out.println(m4.getModuleShortName());

		Note n1 = new Note("Programming","Lecture 1");
		Note n2 = new Note("Testing","Lab 1");
		Note n3 = new Note("Programming","Lab 3");
		Note n4 = new Note("Testing","Tutorial 2");

		//System.out.println(n3.getModuleName() + "\t" + n3.getNoteName());
		//System.out.println(n4.getModuleName() + "\t" + n3.getNoteName());

		n3.setNoteContents("This is an example note to see if this works");
		n4.setNoteContents("Another example note to see if this works");

		System.out.println(n3.fullNote());
		System.out.println(n4.fullNote());
	}
}