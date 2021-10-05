class NewsPaperRunner
{
public static void main(String[] arg)
{
String name="Prajavani";
String ownerName="K.N. Guruswamy";
NewspaperLanguage lang=NewspaperLanguage.KANNADA;
NewsPaperConstructor paper=new NewsPaperConstructor(name,ownerName,lang);
NewspaperType news=NewspaperType.DAILY;
paper.type=news;
paper.editorName="K.N. Shanth Kumar";
System.out.println(paper.name);
System.out.println(paper.ownerName);
System.out.println(paper.editorName);
System.out.println(paper.lang);
System.out.println(paper.lang.price);
System.out.println(paper.type);
System.out.println(paper.type.price);


NewsPaperConstructor paper1=new NewsPaperConstructor("The Hindu","The Hindu Group, and Kasturi and Sons Limited",NewspaperLanguage.ENGLISH);
news=NewspaperType.DAILY;
paper1.type=news;
paper1.editorName="Suresh Nambath";
System.out.println(paper1.name);
System.out.println(paper1.ownerName);
System.out.println(paper1.editorName);
System.out.println(paper1.lang);
System.out.println(paper1.lang.price);
System.out.println(paper1.type);
System.out.println(paper1.type.price);


NewsPaperConstructor paper2=new NewsPaperConstructor("Panchjanya","Rashtriya Swayamsevak Sangh ",NewspaperLanguage.HINDI);
news=NewspaperType.WEEKLY;
paper2.type=news;
paper2.editorName="Suresh Nambath";
System.out.println(paper2.name);
System.out.println(paper2.ownerName);
System.out.println(paper2.editorName);
System.out.println(paper2.lang);
System.out.println(paper2.lang.price);
System.out.println(paper2.type);

System.out.println(paper2.type.price);

NewsPaperConstructor paper3=new NewsPaperConstructor("New Delhi Times","Govind Narain Srivastav ",NewspaperLanguage.ENGLISH);
news=NewspaperType.WEEKLY;
paper3.type=news;
paper3.editorName="Dr. Ankit Srivastava ";
System.out.println(paper3.name);
System.out.println(paper3.ownerName);
System.out.println(paper3.editorName);
System.out.println(paper3.lang);
System.out.println(paper3.lang.price);
System.out.println(paper3.type);
System.out.println(paper3.type.price);

NewsPaperConstructor paper4=new NewsPaperConstructor("New Delhi Times","Govind Narain Srivastav ",NewspaperLanguage.ENGLISH);
news=NewspaperType.WEEKLY;
paper4.type=news;
paper4.editorName="Dr. Ankit Srivastava ";
System.out.println(paper4.name);
System.out.println(paper4.ownerName);
System.out.println(paper4.editorName);
System.out.println(paper4.lang);
System.out.println(paper4.lang.price);
System.out.println(paper4.type);
System.out.println(paper4.type.price);


}
}