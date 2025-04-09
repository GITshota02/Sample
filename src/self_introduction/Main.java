package self_introduction;

public class Main {

	public static void main(String[] args) {
		//インスタンスを生成する
		Person person1 = new Person("鈴木太郎", 20, 1.7,60);
		//Personクラスの名前を呼び出す
		System.out.println(person1.getName());
		//Personクラスの年を呼び出す
		System.out.println(person1.getAge());
		//Personクラスの身長を呼び出す
		System.out.println(person1.getHeight());
		//改行を入れる
		System.out.println();
		//printメソッドを呼び出す
		person1.print();
	}
	
}
