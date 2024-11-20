package curriculum_B;

//コンソールの入力を受け取る
import java.util.Scanner;
public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//newScannerで初期化
		Scanner scanner = new Scanner(System.in);
		//入力した値の受け取り
		String name = scanner.nextLine();

		if(name.length() > 10) {
			System.out.println("「名前を10文字以内にしてください」");
		} else if(name == null || name.length() == 0) {
			System.out.println("「名前を入力してください」");
		} else {
			System.out.println("「ユーザー名「" + name + "」を登録しました」" );
		}
		
	}

}
