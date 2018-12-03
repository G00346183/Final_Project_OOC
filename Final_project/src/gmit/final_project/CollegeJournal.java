package gmit.final_project;

import java.util.ArrayList;
public class CollegeJournal
{
	public static ArrayList <Module> modules = new ArrayList<Module>();
	public static ArrayList <Note> notes   = new ArrayList<Note>();
	
	public static void main(String [] args)
	{
		Module m1 = new Module("Programming","P");
		Module m2 = new Module("Testing","T");
		Module m3 = new Module("Maths","M");

		modules.add(m1);
		modules.add(m2);
		modules.add(m3);

		createModule("French", "FR");
		createModule("Business", "BS");
		createModule("Tech Drawing", "TD");

		/*for(int i=0;i<modules.size();i++)
		{
			System.out.println(modules.get(i).getModuleName() + "\t" + modules.get(i).getModuleShortName());
		}*/

		Note n1 = new Note("Programming","Lecture 1");
		Note n2 = new Note("Testing","Lab 1");
		Note n3 = new Note("Programming","Lab 3");
		Note n4 = new Note("Testing","Tutorial 2");


		n3.setNoteContents("This is an example note to see if this works");
		n4.setNoteContents("Another example note to see if this works");

		//System.out.println(n3.fullNote());
		//System.out.println(n4.fullNote());

		createNote("Programming", "Lecture 2000", "Today i learned about inner loops and FX");
		createNote("Testing", "XXXXXXXXXX", "Going to test this note app");

		for(int i=0;i<notes.size();i++){
			System.out.println(notes.get(i).fullNote() +"\n");
		}
	}
	public static void createModule(String mn, String sn)
	{
		boolean exists = false;
		for(int i=0;i<modules.size();i++){
			if(mn==modules.get(i).getModuleName() || sn==modules.get(i).getModuleShortName())
			{
				System.out.println("Module name or shortname already exists, Module not created");
				exists = true;
			}
		}
		if(!exists){
			Module temp = new Module(mn, sn);
			modules.add(temp);
			//System.out.println("Module Successfully Added to ArrayList");
		} else {
			System.out.println("Not Created");
		}
	}
	public static void createNote(String mn, String nn, String c)
	{
		for(int i=0;i<notes.size();i++)
		{
			if(mn == notes.get(i).getModuleName() && nn == notes.get(i).getNoteName())
			{
				System.out.println("Note with the same title already exists in the module\n-Copy added to name for distinction");
				nn+=" -Copy";

			}
		}
		Note temp = new Note(mn, nn, c);
		notes.add(temp);
		System.out.println("Note " + nn + " added successfully");
	}
}