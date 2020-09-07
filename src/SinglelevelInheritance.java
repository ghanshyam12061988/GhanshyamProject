class Fruit
{  
 void fruitname()
{  
 System.out.println("I am a Fruit");
}
}
class Mango extends Fruit
{
void taste()
{  
System.out.println("My taste is sweet");
}
}
public class SinglelevelInheritance {
public static void main(String args[])
{ 
 Mango obj = new Mango();
obj.fruitname();
obj.taste();
}
}
