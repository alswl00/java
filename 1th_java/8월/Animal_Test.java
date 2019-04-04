class Animal_Test{
public static void main(String ar[]) {

	Animal cat=new Animal(); //객체 생성
	cat.name="고양이";
	cat.owner="Mike";

	System.out.println(cat.name);
	System.out.println(cat.owner);
	
	cat.bark();
	cat.eat();

	
	Animal dog=new Animal();
	dog.name="개";
	dog.owner="Sally";

	System.out.println(dog.name);
	System.out.println(dog.owner);

	dog.bark();
	dog.eat();


	Animal bird=new Animal();
	bird.name="새";
	bird.owner="andy";

	System.out.println(bird.name);
	System.out.println(bird.owner);

	bird.bark();
	bird.eat();

	}
}