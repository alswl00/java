class Animal_Test{
public static void main(String ar[]) {

	Animal cat=new Animal(); //��ü ����
	cat.name="�����";
	cat.owner="Mike";

	System.out.println(cat.name);
	System.out.println(cat.owner);
	
	cat.bark();
	cat.eat();

	
	Animal dog=new Animal();
	dog.name="��";
	dog.owner="Sally";

	System.out.println(dog.name);
	System.out.println(dog.owner);

	dog.bark();
	dog.eat();


	Animal bird=new Animal();
	bird.name="��";
	bird.owner="andy";

	System.out.println(bird.name);
	System.out.println(bird.owner);

	bird.bark();
	bird.eat();

	}
}