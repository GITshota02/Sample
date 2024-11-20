package curriculum_B;

//コンソールの入力を受け取る
import java.util.Scanner;
public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//問1 ログイン時の入力チェックシステムを下記条件で作成してください

		//newScannerで初期化
		Scanner scanner = new Scanner(System.in);
		
		//繰り返しの入力受付
		while(true) {
			//入力した値の受け取り
			String name = scanner.nextLine();
			//条件式の詳細　ユーザー名の文字数が10文字より大きい場合
			if(name.length() > 10) {
				//「名前を10文字以内にしてください」と出力
				System.out.println("「名前を10文字以内にしてください」");
				//ユーザー名の文字数が0文字以下もしくはnullの場合
			} else if(name == null || name.length() == 0) {
				//「名前を入力してください」と出力してください
				System.out.println("「名前を入力してください」");
				//上記条件に該当しない(ユーザー名が正常な値だった場合)
			} else {
				//「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
				System.out.println("「ユーザー名「" + name + "」を登録しました」" );
			}
		}
		
		/*
		
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
		*/

		//問3 
	}
}
