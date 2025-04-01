package execution;

import process.Sub;

public class Main {
    //フィールドで文字列を宣言する
	//「こんにちは！ここは日本です！」を格納する文字列を宣言する
    private String greeting;
    //「この寿司はうまい」を格納する文字列を宣言する
    private String sushiDescription;
    //「寿司は和食です」を格納する文字列をを宣言する
    private String sushiType;
    //「今の現在日時は2023/03/09 10:23:39です」を格納する文字列を宣言する
    private String currentDate;
    //コンストラクタで各文字列にコンソールに出力する内容を代入する
    public Main() {
    	//「こんにちは！ここは日本です！」を代入する
        this.greeting = "こんにちは！ここは日本です！";
        //「この寿司はうまい」を代入する
        this.sushiDescription = "この寿司はうまい";
        //「寿司は和食です」を代入する
        this.sushiType = "寿司は和食です";
        // DateUtilクラスを使って現在の日時を取得
        Sub dateUtil = new Sub();
        //currentDateに現在の日時を代入する
        this.currentDate = dateUtil.getCurrentDate();
    }

    //出力処理を行うメソッドを作成する
    public void displayMessage() {
        //以下の内容をコンソールに出力する
        System.out.println(this.greeting);
        //以下の内容をコンソールに出力する
        System.out.println(this.sushiDescription);
        //以下の内容をコンソールに出力する
        System.out.println(this.sushiType);
        //以下の内容をコンソールに出力する
        System.out.println("今の現在日時は" + this.currentDate + "です");
    }
    //メッセージを表示するメソッドを作成する
    public static void main(String[] args) {
        //Mainクラスをインスタンス化してメッセージを表示
        Main main = new Main();
        //displayMessageの内容を呼び出す
        main.displayMessage();
    }

}
