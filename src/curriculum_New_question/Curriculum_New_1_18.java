package curriculum_New_question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Curriculum_New_1_18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//問1のメソッドを呼び出す
		test1("Hello" , "JavaSE" , 11);
		//問2のメソッドを呼び出す
		test2(5 , 3);
		//値を受け取る
		int[] x = {1 , 2 , 3};
		//問3のメソッドを呼び出す
		test3(x);
		//問4のメソッドを呼び出す
		test2(10.5 , 20.5);
		//問5のメソッドを呼び出してIntegerに格納する
		List<Integer> num = test4(4);
		//問6のメソッドを呼び出してdoubleに格納する
		double z = test5(num);
		//問7のメソッドを呼び出す
		test6(z);
	}
	
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	//引数に文字列型と整数型を入れたメソッドを定義する
	public static void test1(String a , String b , int c) {
		//以下の内容を出力する
		System.out.println(a + " " + b + " " + c);
	}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	//引数にそれぞれの整数型を入れたメソッドを定義する
	public static void test2(int a , int b) {
		//値同士を乗算した内容を格納する変数を宣言する
		int x = a * b;
		//以下の内容を出力する
		System.out.println(x);
	}
		
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	//引数に整数型の配列を入れたメソッドを定義する
	public static void test3(int[] a) {
		//繰り返し値を保存する文を作成する
		for(int x : a) {
			//以下の内容を繰り返すごとに出力する
			System.out.println(x);
		}
	}
	
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	//引数にそれぞれの浮動小数点型を入れたメソッドを定義する
	public static void test2(double a , double b) {
		//値同士を乗算した内容を格納する変数を宣言する
		double x = a + b;
		//以下の内容を出力する
		System.out.println(x);
	}
	
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	//引数に整数型を入れ、かつ戻り値を整数型とするメソッドを定義する
	public static List<Integer> test4(int n) {
		//Listのオブジェクトを生成する
		List<Integer> number = new ArrayList<>();
		//Randomのオブジェクトを生成する
		Random rand = new Random();
		//整数型の配列の変数を初期化する
		int[] w;
		//配列の大きさを調べる変数を宣言
		w = new int[n];
		//拡張for文を作成する
		for(int y : w) {
			//以下の内容を繰り返すごとに出力する
			int dai = rand.nextInt(99) + 1;
			//ランダムで生成された内容が0出ない場合
			if(dai != 0) {
				//Listに追加する
				number.add(dai);
			}
			//以下の内容を出力する
			System.out.println(dai);
		}
		//格納した配列を返す
		return number;
	}
	
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	//引数に整数型を入れ、かつ戻り値を浮動小数点型とするメソッドを定義する
	public static double test5(List<Integer> number) {
		//合計値を格納する変数を宣言する
        double sum = 0;
        //配列の要素を取り出す拡張for文を作成する
        for (int num : number) {
        	//各数値を代入演算子で加算し変数に格納する
            sum += num;
        }
        //浮動小数点型に合計値を要素数で割った平均値を格納する
        double ave = sum / number.size();
        //以下の内容を出力する
        System.out.println(ave);
        //平均値を格納した変数を返す
		return ave;
    }
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
    public static void test6(double ave) {
    	//問6の返り値を受け取り、50以上ならtrue、それ以外はfalseを返すブーリアン型の変数を宣言し格納する
        boolean result = ave >= 50;
        //以下の内容を出力する
        System.out.println(result);
    }
}
