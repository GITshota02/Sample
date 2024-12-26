package curriculum_B;
//コンソールの入力を受け取る
import java.util.Random;
import java.util.Scanner;
public class Qes1_3 {
	/*
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//問1 ログイン時の入力チェックシステムを下記条件で作成してください

		//newScannerで初期化する
		Scanner scanner = new Scanner(System.in);
		
		//繰り返しの入力受付
		while(true) {
			//入力した値の受け取り処理
			String name = scanner.nextLine();
			//条件式の詳細　ユーザー名の文字数が10文字より大きい場合の処理
			if(name.length() > 10) {
				//「名前を10文字以内にしてください」と出力
				System.out.println("「名前を10文字以内にしてください」");
				//ユーザー名の文字数が0文字以下もしくはnullの場合の処理
			} else if(name == null || name.length() == 0) {
				//「名前を入力してください」と出力してください
				System.out.println("「名前を入力してください」");
				//上記条件に該当しない(ユーザー名が正常な値だった場合の処理
			} else {
				//「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
				System.out.println("「ユーザー名「" + name + "」を登録しました」" );
			}
		}
		
		//問2 ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力
		//条件式の詳細　ユーザー名の文字数が10文字より大きい場合
		if(name.length() > 10) {
			//「名前を10文字以内にしてください」と出力
			System.out.println("「名前を10文字以内にしてください」");
			//ユーザー名の文字数が0文字以下もしくはnullの場合
		} else if(name == null || name.length() == 0) {
			//「名前を入力してください」と出力してください
			System.out.println("「名前を入力してください」");
			//ユーザー名が半角英数字以外の場合
		} else if(name.matches("[^0-9a-zA-Z]+")){
			//「半角英数字のみで名前を入力してください」と出力
			System.out.println("「半角英数字のみで入力してください」");
			//上記条件に該当しない(ユーザー名が正常な値だった場合)
		} else {
			//「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
			System.out.println("「ユーザー名「" + name + "」を登録しました」" );
		}
		
	}
	
	 */
	
	//問3
	//じゃんけんゲーム全体のメソッド処理
	public static void main(String[] arg) {
		//勝つまでにかかった回数を格納する変数の初期値を宣言
		int count = 0;
		//ユーザー名を格納する変数の初期値を宣言
		String name = null;
		//じゃんけんの結果について変数宣言
		String[] jhan = {"グー", "チョキ", "パー"};
		//乱数を定義する
		Random rand = new Random();
		//キーボードから入力を受ける
		Scanner scanner = new Scanner(System.in);
		//ユーザー名入力における繰り返しの条件式
		while(true) {
			//ユーザー名の入力内容を受け取る
			name = scanner.nextLine();
			//条件式の詳細　ユーザー名の文字数が10文字より大きい場合の処理
			if(name.length() > 10) {
				//「名前を10文字以内にしてください」と出力
				System.out.println("「名前を10文字以内にしてください」");
				//ユーザー名の文字数が0文字以下もしくはnullの場合
			} else if(name == null || name.length() == 0) {
				//「名前を入力してください」と出力してください
				System.out.println("「名前を入力してください」");
				//ユーザー名が半角英数字以外の場合
			} else if(name.matches("[^0-9a-zA-Z]+")){
				//「半角英数字のみで名前を入力してください」と出力
				System.out.println("「半角英数字のみで入力してください」");
				//上記条件に該当しない(ユーザー名が正常な値だった場合)
			} else {
				//「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
				System.out.println("「ユーザー名「" + name + "」を登録しました」" );
				//ユーザー名が正常に入力されたため繰り返し処理を終了する
				break;
			}
		}
		//じゃんけんにおける繰り返しの条件式
		while(true) {
			//パソコン側のじゃんけん入力として0,1,2のどれかの値を取得
			int pc = rand.nextInt(3);
			//ユーザー側のじゃんけんの入力内容を受け取る
			int user = scanner.nextInt();
			//ユーザー側の入力が3以上の場合
			if (user >= 3) {
				//以下の内容を出力する
				System.out.println("0-2で入力してください");
				//上記以外の場合
			} else {
				//ユーザー側のじゃんけんの内容を出力する
				System.out.println(name + "は" + jhan[user] + "です");
				//パソコン側のじゃんけんの内容を出力する
				System.out.println("相手の手は" + jhan[pc] + "です");
				//繰り返しの処理回数をカウントする
				count++;
				//じゃんけんの勝敗に関する条件式（ユーザーがチョキでじゃんけんに負けた場合）
				if (user == 1 && pc == 0){
					//以下の内容を出力する
					System.out.println("俺の勝ち！\n負けは次に繋がるチャンスです!\nネバーギブアップ");
					//繰り返しの条件を続けて行う
					continue;
				//ユーザーがパーでじゃんけんに負けた場合の条件式
				} else if (user == 2 && pc == 1){
					//以下の内容を出力する
					System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、僕が勝ちますよ");
					//繰り返しの条件を続けて行う
					continue;
				//ユーザーがグーでじゃんけんに負けた場合の条件式
				} else if (user == 0 && pc == 2){
					//以下の内容を出力する
					System.out.println("俺の勝ち！\n何で負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです");
					//繰り返しの条件を続けて行う
					continue;
				//じゃんけんの結果があいこだった場合の条件式
				} else if (user == pc) {
					//以下の内容を出力する
					System.out.println("DRAW あいこ もう一回しましょう！");
					//繰り返しの条件を続けて行う
					continue;
				//ユーザーが勝った時の条件式
				} else {
					//以下の内容を出力する
					System.out.println("やるやん。\n次は俺にリベンジさせて");
					//以下の内容を出力する
					System.out.println("勝つまでにかかった回数は" + count + "回です");
					//ユーザーが勝利したために、繰り返しの条件式を終了する
					break;
				}
			}
		}
	}
}
