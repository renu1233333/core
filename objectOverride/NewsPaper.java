package com.xworkz.objectoverride;

public class NewsPaper {

	
	private String name;
	private String language;
	private int since;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLanguage() {
		return language;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
		{
			return false;
			
		}
		
		if(obj instanceof NewsPaper)
		{
			NewsPaper newsPaperRef=(NewsPaper)obj;
			String nameRef=newsPaperRef.name;
			String languageRef=newsPaperRef.language;
			if(name.equals(nameRef)&& language.equals(languageRef))
			{
				return true;
			}
		}
		return false;
	}
}
