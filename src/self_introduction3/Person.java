package self_introduction3;

public class Person {
	//カウントを定義しつつ初期化する
	public static int count = 0;
	//性を定義する
	public String firstName;
	//名を定義する
	public String lastName;
	//年を定義する
	public int age;
	//身長を体重を定義する
	public double height, weight;
	//コンストラクタを定義しインスタンスフィールドに値をセットする
	public Person(String firstName, String lastName, int age, double height, double weight){
		//性を取得する
		this.firstName = firstName;
		//名を取得する
		this.lastName = lastName;
		//年を取得する
		this.age = age;
		//身長を取得する
		this.height = height;
		//体重を得する
		this.weight = weight;
		//カウントする
		Person.count++;
	}
	//フルネームを作成するメソッドを作成する
	public String fullName(){
		//フルネームを返す
		return this.firstName + this.lastName;
	}
	//出力するメソッドを作成する
	public void print(){
		//名前を出力する
		System.out.println("名前は" + this.fullName() + "です");
		//年を出力する
		System.out.println("年は" + this.age + "です");
	}
	//BMIメソッドを作成する
	public double bmi(){
		//BMI = 体重(kg) / 身長(m)^2、計算後の値を返す
		return this.weight / this.height / this.height;
	}
	//合計人数を出力するメソッドを作成する
	public static void printCount(){
		//合計人数を出力する
		System.out.println("合計" + Person.count + "人です");
	}

}
