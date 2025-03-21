package basicClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

	public static void main(String[] args) {
		//Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		//Dogクラスのインスタンスを生成し、動物の名前を出力する
		//Dogクラスのインスタンスを生成する
		Dog dog1 = new Dog();
		//animalNameフィールドの値を出力する
		System.out.println("動物の名前" + dog1.animalName);

		//Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		//Dogクラスのインスタンスを生成し、動物の数を出力する
		//動物の数を5としてインスタンスを生成する
		Dog dog2 = new Dog(5);
		//animalCountフィールドの値を出力する
		System.out.println("動物の数" + dog2.animalNum);

		//現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		//現在の日時を取得して、指定された形式で出力する
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		//現在の日時を指定の形式で取得する
		String DateTime = sdf.format(new Date());
		//日時をコンソールに出力する
		System.out.println("現在の日時" + DateTime);
	}
}