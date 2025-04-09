package self_introduction2;

public class Person {
	//名前を定義する
	public String name;
	//年を定義する
	public int age;
	//身長を定義する
	public double height;
	//体重を定義する
	public double weight;
	//カウントを定義しつつ初期化する
	public static int count = 0;
	//コンストラクタを定義しインスタンスフィールドに値をセットする
	Person(String name, int age, double height, double weight){
		//コンストラクタで名前をセットする
		this.name = name;
		//コンストラクタで年をセットする
		this.age = age;
		//コンストラクタで身長をセットする
		this.height = height;
		//コンストラクタで体重をセットする
		this.weight = weight;
		//カウントをプラス1する
		count++;
	}

	//BMIのメソッドを作成する
	public double bmi(){
		//BMI = 体重(kg) / 身長(m)^2、計算後の値を返す
		return this.weight / this.height / this.height;
	}
	
	//合計人数を出力するメソッドを作成する
    public static void printCount(){
    	//合計人数を出力する
        System.out.println("合計" + count + "人です");
    }

    //名前と年を出力するメソッドを作成する
	public void print(){
		//名前を出力する
		System.out.println("名前は" + this.name + "です");
		//年を出力する
		System.out.println("年は" + this.age + "です");
	}
}
