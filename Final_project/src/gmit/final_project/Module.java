package gmit.final_project;

public class Module
{
	public String moduleName;
	public String moduleShortName;

	public Module(String m, String sn)
	{
		moduleName = m;
		moduleShortName = sn;
	}
	public String getModuleName()
	{
		return moduleName;
	}
	public String getModuleShortName(){
		return moduleShortName;
	}
	
}