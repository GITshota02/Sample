package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//問1-3
		//バイト型宣言及び初期化と初期値の代入
		byte by = 10;
		//短整数型宣言及び初期化と初期値の代入
		short sh = 100;
		//整数型宣言及び初期化と初期値の代入
		int in = 1000;
		//長整数型宣言及び初期化と初期値の代入
		long lo = 10000;
		//単精度浮動小数点数型宣言及び初期化と初期値の代入
		float fl = 9.5F;
		//倍精度浮動小数点数型宣言及び初期化と初期値の代入
		double dou = 10.5;
		//文字型宣言及び初期化と初期値の代入
		char ch = 'a';
		//文字列型宣言及び初期化と初期値の代入
		String st = "ハロー";
		//ブーリアン型宣言及び初期化と初期値の代入
		boolean bo = true;
		
		//問4
		//11110出力
		System.out.println(lo + in + sh + by);
		//20出力
		System.out.println(by * 2);
		//aハローtrue出力
		System.out.println(ch + " " + st + " " + bo);
		//11130出力
		System.out.println(by + sh + in + lo + Math.round(fl + dou));
		//10000000000出力
		System.out.println(by * sh * in * lo);
		//0.105出力
		System.out.println(dou / sh);
		//-90出力
		System.out.println(by - sh);
		
		//問5
		String num = "20";
		//String型からint型に変換した値をnum2に格納
		int num2 = Integer.parseInt(num);
		int num1 = 23;
		System.out.println("ハローJAVA" + (num2 + num1));
		
		//問6
		//人の情報を各変数に格納
		String name = "山田太郎";
		int age = 18;
		float height = 170.5F;
		double weight = 62.2;
		String food = "寿司";
		//各変数の出力
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		
		//問7
		//計算に必要な数値を宣言
		int num_con = 100;
		//BMI計算式
		double bmi = (weight / Math.pow(height / num_con, 2));
		//BMIの出力
		System.out.println("BMIは" + Math.round(bmi) + "です");
		
		//問8
		//変数に再代入
		name = "鈴木一郎";
		age = 24;
		height = 168.5F;
		weight = 64.2;
		food = "オムライス";
		double bmi2 = (weight / Math.pow(height / num_con, 2));
		//情報の出力
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + String.format("%.1f",bmi2) + "です");
		
		//問9
		//【年齢・身長・体重】を和算し自己代入
		int age_num = age + age;
		float height_num = height + height;
		double weight_num = weight + weight;
		double bmi3 = (weight_num / Math.pow(height_num / num_con, 2));
		//情報の出力
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age_num + "歳です");
		System.out.println("身長は" + height_num + "cmです");
		System.out.println("体重は" + weight_num + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + String.format("%.2f",bmi3) + "です");
		
		//問10
		//変数宣言
		boolean over25;
		//問8の年齢が25際以上の時の条件式
		over25 = (age >= 25);
		//結果の出力
		System.out.println(over25);
		
		//問11
		//問8の【年齢・身長・体重】を文字列型に変換
		String age_con = String.valueOf(age);
		String height_con = String.valueOf(height);
		String weight_con = String.valueOf(weight);
		//各文字を繋いで出力
		System.out.println(age_con + height_con + weight_con);
		
		//問12
		//問11の【年齢・身長】を整数型に変換
		int age_con2 = Integer.parseInt(age_con);
		float height_con2 = Float.parseFloat(height_con);
		//整数型に変換できたか出力で確認
		System.out.println(age_con2 + height_con2);
		
		//問13
		//変数宣言
		boolean over25or160;
		//条件式定義
		over25or160 = (age_con2 >= 25 || height_con2 >= 160);
		//結果の出力
		System.out.println(over25or160);
	}

}
