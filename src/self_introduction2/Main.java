package self_introduction2;

public class Main {

	public static void main(String[] argos){
		//インスタンスを生成する
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		//鈴木太郎の情報を出力する
		person1.print();
		//インスタンスを生成する
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		//山田花子の情報を出力する
		person2.print();
		//合計人数を出力する
		System.out.println("合計" + Person.count + "人です");
		//合計人数を出力する
		Person.printCount();
	}
}
