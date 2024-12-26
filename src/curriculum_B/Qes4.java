package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//左辺の変数の初期値を入力する
		int i = 0;
		//右辺の変数の初期値を入力する
		int x = 0;
		//左辺の繰り返しの条件式を定義する
		for (i = 1; i < 10; i++) {
			//右辺の繰り返しの条件式を定義する
			for (x = 1; x < 10; x++) {
				//左辺の桁数を指定する
				String left = String.format("%02d", i);
				//右辺の桁数をしてする
				String right = String.format("%02d", x);
				//計算結果の桁数を指定する
				String result = String.format("%02d", (i * x));
				//計算結果を出力する
				System.out.print(left + " * " + right + " = " + result);
				//計算後に添付する内容を格納する変数を宣言する
				String sep;
				//三項演算子によって右辺が９の時とそれ以外における戻り値を設定する
				sep = (x == 9)? "\n" : " || ";
				//戻り値を出力する
				System.out.print(sep);
			}
		}
	}

}