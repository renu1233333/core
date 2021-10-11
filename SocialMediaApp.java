class SocialMediaApp
{
String name;
float size;
String language;
String platform;
String version;
SocialMediaCompany company;
/*
SocialMediaApp(String name,float size,String language,String platform,String version)
{
	this.name=name;
	this.size=size;
	this.language=language;
	this.platform=platform;
	this.version=version;
	
}
*/
void setName(String name)
{
	this.name=name;
	
}

void setSize(float size)
{
	this.size=size;
}
void setLanguage(String language)
{
	this.language=language;
}
void setPlatform(String platform)
{
	this.platform=platform;
}

void setVersion(String version)
{
	this.version=version;
}

void setCompany(SocialMediaCompany company)
{
	this.company=company;
}

	
/*
void displayDetails()


{
	
	System.out.println(this.name);
	System.out.println(this.size);
	System.out.println(this.language);
	System.out.println(this.platform);
	System.out.println(this.version);
}*/
}