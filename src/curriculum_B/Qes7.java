package curriculum_B;

import java.util.Scanner;
public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//標準入力でSystem.inを指定する
		Scanner scanner = new Scanner(System.in);
		//生徒の人数の変数を宣言する
		int stu = 0;
		//生徒の人数入力に関するループ文を作成する
		while (true) {
			//以下の内容を出力する
			System.out.print("生徒の人数を入力してください（2以上）: ");
			//入力内容を取得する
			stu = scanner.nextInt();
			//生徒の人数が2以上の場合
			if (stu >= 2) {
				//処理を終了する
				break;
			//それ以外の場合
			} else {
				//以下の内容を出力する
				System.out.println("生徒の人数は2人以上でなければなりません。再度入力してください。");
			}
		}
		//生徒の各テストの点数を格納する配列を宣言する
		int[][] scores = new int[stu][4];
		//入力された生徒の人数に応じたfor文を作成する
		for (int i = 0; i < stu; i++) {
			//以下の内容を出力する
			System.out.print((i + 1) + "人目の『英語』の点数を入力してください：");
			//入力された内容を0番目に取得する
			scores[i][0] = scanner.nextInt();
			//以下の内容を出力する
			System.out.print((i + 1) + "人目の『数学』の点数を入力してください：");
			//入力された内容を1番目に取得する
			scores[i][1] = scanner.nextInt();
			//以下の内容を出力する
			System.out.print((i + 1) + "人目の『理科』の点数を入力してください：");
			//入力された内容を2番目に取得する
			scores[i][2] = scanner.nextInt();
			//以下の内容を出力する
			System.out.print((i + 1) + "人目の『社会』の点数を入力してください：");
			//入力された内容を3番目に取得する
			scores[i][3] = scanner.nextInt();
		}
		//各生徒の平均点のfor文を作成する
		for (int i = 0; i < stu; i++) {
			//各生徒の平均点の変数を宣言する
            double studentAverage = (scores[i][0] + scores[i][1] + scores[i][2] + scores[i][3]) / 4.0;
            //各生徒の平均点を出力する
            System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), studentAverage);
        }
		//各教科の平均点を計算する変数を宣言する
        double totalEnglish = 0, totalMath = 0, totalScience = 0, totalSocial = 0;
        ///各教科の平均点を計算するfor文を作成する
        for (int i = 0; i < stu; i++) {
        	//各英語の点数を格納する
            totalEnglish += scores[i][0];
            //各英語の数学を格納する
            totalMath += scores[i][1];
            //各理科の点数を格納する
            totalScience += scores[i][2];
            //各社会の点数を格納する
            totalSocial += scores[i][3];
        }
        //各英語の平均点数を格納する変数を宣言する
        double avgEnglish = totalEnglish / stu;
        //各数学の平均点数を格納する変数を宣言する
        double avgMath = totalMath / stu;
        //各理科の平均点数を格納する変数を宣言する
        double avgScience = totalScience / stu;
        //各社会の平均点数を格納する変数を宣言する
        double avgSocial = totalSocial / stu;
        
        //各英語の平均点の出力する
        System.out.printf("英語の平均点は%.2f点です。\n", avgEnglish);
        //各数学の平均点の出力する
        System.out.printf("数学の平均点は%.2f点です。\n", avgMath);
        //各理科の平均点の出力する
        System.out.printf("理科の平均点は%.2f点です。\n", avgScience);
        //各社会の平均点の出力する
        System.out.printf("社会の平均点は%.2f点です。\n", avgSocial);
        
        // 全体の平均点を計算する変数を宣言する
        double totalPoints = totalEnglish + totalMath + totalScience + totalSocial;
        //全体の教科の点数を生徒数で割り変数に格納する
        double overallAverage = totalPoints / (stu * 4);
        
        // 全体の平均点の出力する
        System.out.printf("全体の平均点は%.2f点です。\n", overallAverage);
	}
}
