package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//問1 変数宣言
		//バイト型の変数宣言
		byte by;
		//短整数型の変数宣言
		short sh;
		//整数型の変数宣言
		int in;
		//長整数型の変数宣言
		long lo;
		//単精度浮動小数点数型の変数宣言
		float fl;
		//倍精度浮動小数点数型の変数宣言
		double dou;
		//文字型の変数宣言
		char ch;
		//文字列型の変数宣言
		String st;
		//ブーリアン型の変数宣言
		boolean bo;
		
		//問2　宣言した変数に初期値の代入
		//バイト型の変数に初期値を代入
		by = 0;
		//短整数型の変数に初期値を代入
		sh = 0;
		//整数型の変数に初期値を代入
		in = 0;
		//長整数型の変数に初期値を代入
		lo = 0L;
		//単精度浮動小数点数型の変数に初期値を代入
		fl = 0.0F;
		//倍精度浮動小数点数型の変数に初期値を代入
		dou = 0.0;
		//文字型の変数に初期値を代入
		ch = '\u0000';
		//文字列型の変数に初期値を代入
		st = null;
		//ブーリアン型の変数に初期値を代入
		bo = false;
		
		//問3　値を再代入
		//バイト型変数に値を再代入
		by = 10;
		//短整数型変数に値を再代入
		sh = 100;
		//整数型変数に値を再代入
		in = 1000;
		//長整数型変数に値を再代入
		lo = 10000;
		//単精度浮動小数点数型変数に値を再代入
		fl = 9.5F;
		//倍精度浮動小数点数型変数に値を再代入
		dou = 10.5;
		//文字型変数に値を再代入
		ch = 'a';
		//文字列型変数に値を再代入
		st = "ハロー";
		//ブーリアン型変数に値を再代入
		bo = true;
		
		//問4　コンソールに提示内容を出力
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
		
		//問5　プログラムが正しく動作するように修正
		String num = "20";
		//String型からint型に変換した値をnum2に格納
		int num2 = Integer.parseInt(num);
		int num1 = 23;
		System.out.println("ハローJAVA" + (num2 + num1));
		
		//問6　ローカル変数に値を代入し、コンソールに問題文を出力
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
		
		//問7　BMIをコンソールに出力
		//計算に必要な数値を宣言
		int num_con = 100;
		//BMI計算式
		double bmi = (weight / Math.pow(height / num_con, 2));
		//BMIの出力
		System.out.println("BMIは" + Math.round(bmi) + "です");
		
		//問8　問6で宣言した変数に再代入しコンソールに出力
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
		
		//問9　年齢・身長・体重】の数値を和算で自己代入しコンソールに出力
		//【年齢・身長・体重】を和算し自己代入
		//問8の年齢に和算で自己代入
		age = age + 24;
		//問8の身長に和算で自己代入
		height = height + 168.5F;
		//問8の体重に和算で自己代入
		weight = weight + 64.2;
		//BMIの計算
		double bmi3 = (weight / Math.pow(height / num_con, 2));
		//情報の出力
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + String.format("%.2f",bmi3) + "です");
	
		//問10　8で使用した年齢が25歳以上ならtrueをコンソールに出力
		//問8で使用したageに値を再代入
		age = 24;
		//変数宣言
		boolean over25;
		//問8の年齢が25際以上の時の条件式
		over25 = (age >= 25);
		//結果の出力
		System.out.println(over25);
		
		//問11　8で使用した【年齢・身長・体重】を文字列型に型変換しコンソールに出力
		//問8で使用したheightに値を再代入
		height = 168.5F;
		//問8で使用したweightに値を再代入
		weight = 64.2;
		//問8の【年齢・身長・体重】を文字列型に変換
		String age_con = String.valueOf(age);
		String height_con = String.valueOf(height);
		String weight_con = String.valueOf(weight);
		//各文字を繋いで出力
		System.out.println(age_con + height_con + weight_con);
		
		//問12　8で使用した【年齢・身長・体重】を文字列型に型変換しコンソールに出力
		//問11の【年齢・身長】を整数型に変換
		int age_con2 = Integer.parseInt(age_con);
		float height_con2 = Float.parseFloat(height_con);
		//整数型に変換できたか出力で確認
		System.out.println(age_con2 + height_con2);
		
		//問13　12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueをコンソールに出力
		//変数宣言
		boolean over25or160;
		//条件式定義
		over25or160 = (age_con2 >= 25 || height_con2 >= 160);
		//結果の出力
		System.out.println(over25or160);
	}

}
