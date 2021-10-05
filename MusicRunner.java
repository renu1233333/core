class MusicRunner
{
public static void main(String[] don)
{
MusicType type=MusicType.POP;
String[] inst={"Electric guitar","bass","guitars","drums"};
Music music=new Music(type,inst);
music.MusicDirector="Michel Jackson";


System.out.println(music.type);
System.out.println(music.Musicname);
System.out.println(music.MusicDirector);
System.out.println(music.instruments);
System.out.println(music.instruments[0]);
System.out.println(music.instruments[1]);
System.out.println(music.instruments[2]);
System.out.println(music.instruments[3]);

System.out.println(Music.numberOfInstance);
}
}