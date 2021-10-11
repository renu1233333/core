class SocialMediaAppRunner
{
public static void main(String[] jungles)
{
SocialMediaApp app=new SocialMediaApp();
app.setName("Instagram");
app.setSize(35f);
app.setLanguage("python");
app.setPlatform("phone");
app.setVersion("208.0");
app.setCompany(null);

System.out.println(app.name);
System.out.println(app.size);
System.out.println(app.language);
System.out.println(app.platform);
System.out.println(app.version);
System.out.println(app.company);


app.company=new SocialMediaCompany();
SocialMediaCompany comp=app.company;
comp.setName("FaceBook");
comp.setFounder("Kevin Systrom and Mike Krieger");
comp.setEstablishmentYear(2010);
comp.setNumberOfEmployee(5275);
comp.setHeadQuarter("Menlo Park,California");
comp.setRevenue(1801759200000.0d);
comp.setNumberOfBranches(7);


System.out.println(comp.name);
System.out.println(comp.founder);
System.out.println(comp.establishmentYear);
System.out.println(comp.numberOfEmployee);
System.out.println(comp.headQuarter);
System.out.println(comp.revenue);
System.out.println(comp.numberOfBranches);




}
}