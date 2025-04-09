package self_introduction;

public class Person {

	// インスタンスフィールドを定義
	//名前を定義する
	private String name;
	//年齢を定義する
	private int age;
	//身長を定義する
	private double height;
	//体重を定義する
	private double weight;
	
	//コンストラクタを定義しインスタンスフィールドに値をセットする
	Person(String name , int age , double height , double weight){
		//コンストラクタで名前をセットする
		this.name = name;
		//コンストラクタで年齢をセットする
		this.age = age;
		//コンストラクタで身長をセットする
		this.height = height;
		//コンストラクタで体重をセットする
		this.weight = weight;
	}
	//ゲッターで名前を取得する
	public String getName() {
		//名前を返す
		return name;
	}
	//ゲッターで年を取得する
	public int getAge() {
		//年を返す
		return age;
	}
	//ゲッターで身長を取得する
	public double getHeight() {
		//身長を返す
		return height;
	}
	//ゲッターで体重を取得する
	public double getWeight() {
		//体重を返す
		return weight;
	}
	//BMIのメソッドを作成する
	public double bmi() {
        //BMI = 体重(kg) / 身長(m)^2、計算後の値を返す
		return this.weight / (this.height * this.height);
	}
	//出力メソッドを作成する
    public void print() {
        //BMIを計算して表示
        double bmiValue = this.bmi();
        //「名前は鈴木太郎です」を出力する
        System.out.println("名前は" + this.name + "です");
        //「年は20です」を出力する
        System.out.println("年は" + this.age + "です");
        //「BMIは20.0です」を出力する
        System.out.println("BMIは" + Math.floor(bmiValue) + "です");
        //「合計1人です」を出力する
        System.out.println("合計1人です");
    }

}
