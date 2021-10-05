class Music
{
static int numberOfInstance=0;
MusicType type;
String Musicname="Billie Jean";
String MusicDirector;
String[] instruments;

Music(MusicType type,String[] instruments)
{numberOfInstance++;
	this.type=type;
	this.instruments=instruments;
}
}