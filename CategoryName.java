class CategoryName
{
public static void main(String[] name)
{
String[] dish={"Idli","vada","Dosa","Puri","Gobi","Panipuri","Kachori","Biriyani","Kabab","Noodles"};
String[] CricketPlayerNames={"Sachin","Ms Dhoni","Dravid"," virat k","Rohit Sharma","KL Rahul","Hardik pandya","Ravindra Jadeja"};
String[] footballPlayerNames={"Lionel Messi","Neymar","Robert","Sergio","Eden Hazard","Harry kane","Thiago silva","sunil","anirudh","sandesh","Gurpreet singh"};
String[] programmingLanguage={"A+","B","C","C++","Java","Dart","C#","python","Ruby","Tea","Tom","vala","R","Q#","Q","Red","RPL","Rust","SA-C","Sed"};

Category.getNamesOfDish(dish);
System.out.println("*********************************");
Category.getNamesOfCricket(CricketPlayerNames);
System.out.println("*********************************");
Category.getNamesOfFootBallPlayer(footballPlayerNames);
System.out.println("*********************************");
Category.getProgrammingLangauge(programmingLanguage);
}}