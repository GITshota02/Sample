package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//標準入力でSystem.inを指定する
		Scanner scanner = new Scanner(System.in);
		//入力された内容を取得する
	    String name = scanner.nextLine();
	    //標準入力でRandam()指定する
	    Random rand = new Random();
	    //文字列を『、』で区切り配列に格納する
		String[] select = name.split("、");
		//カウントの変数を宣言する
		int i = 0;
	    //最大台数の変数を宣言する
	    int max = 11;
	    //残りの台数の変数を宣言する
	    int zan = 0;
		//入力された商品の台数を出力する拡張for文
		for(String names : select) {
			//入力された商品の台数をランダムな数値として受け取る
		    int dai = rand.nextInt(11);
		    //swich文の条件式
			switch(names) {
			//パソコンの場合
			case("パソコン"):
				//以下の内容を出力する
				System.out.println("パソコンの残り台数は" + dai + "台です");
				//処理を終了する
				break;
			//冷蔵庫の場合
			case("冷蔵庫"):
				//以下の内容を出力する
				System.out.println("冷蔵庫の残り台数は" + dai + "台です");
				//処理を終了する
				break;
			//扇風機の場合	
			case("扇風機"):
				//以下の内容を出力する
				System.out.println("扇風機の残り台数は" + dai + "台です");
				//処理を終了する
				break;
			//洗濯機の場合	
			case("洗濯機"):
				//以下の内容を出力する
				System.out.println("洗濯機の残り台数は" + dai + "台です");
				//処理を終了する
				break;
			//加湿器の場合	
			case("加湿器"):
				//以下の内容を出力する
				System.out.println("加湿器の残り台数は" + dai + "台です");
				//処理を終了する
				break;
			//テレビの場合	
			case("テレビ"):
			//ディスプレイの場合	
			case("ディスプレイ"):
				//処理をカウントする
				i++;
				//入力された内容がテレビのみかテレビとディスプレイかで処理を分ける
				String one = (i == 1)? names + "の残り台数は" + dai + "台です" : names + "の残り台数は" + (max - zan) + "台です";
				//上記内容を出力する
				System.out.println(one);
				//入力された台数を別の変数に格納する
				zan = dai;
				//処理を終了する
				break;
			//その他の商品の場合	
			case("その他の商品"):
				//以下の内容を出力する
				System.out.println("その他の商品の残り台数は" + dai + "台です");
				//処理を終了する
				break;
			//入力された値が対象外の場合	
			default:
				//以下の内容を出力する
				System.out.println("『受け取った値』は指定の商品ではありません");
			}
		}
	}
}
