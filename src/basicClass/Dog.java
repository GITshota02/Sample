package basicClass;

public class Dog {

	//Q1：フィールドに動物の名前の変数を定義してください。
	//動物の名前を格納する変数を宣言する。
	public String animalName;
	//Q2：フィールドに動物の数の変数を定義してください。
	//動物の数を格納する変数を宣言する
	public int animalNum;
	//Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	//コンストラクタで「犬」を動物の名前に代入する
	public Dog() {
		//animalNameに「犬」を代入する
		this.animalName = "犬";
	}
	//Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	//コンストラクタで動物の数を引数で受け取る
	public Dog(int animalNum) {
		//animalNumに引数を代入する
		this.animalNum = animalNum;
	}
}

