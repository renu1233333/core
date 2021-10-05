class Parent{
void show(){
System.out.println("Parent class");
}}
class Child extends Parent{
void show(){
System.out.println("Child class");
}
}
class Override{
public static void main(String[] val){
Parent p=new Parent();
Child c=new Child();

p.show();
c.show();
} }