package process;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sub {
	//現在の日時を格納する変数を宣言する
    private String currentDate;
    //コンストラクタで現在の日時を変数に代入する
    public Sub() {
        //現在の日時を取得し、フィールドにセット
        SimpleDateFormat forma = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //currentDateに現在の日時を代入する
        this.currentDate = forma.format(new Date());
    }
    //現在の日時を返すメソッドを作成する
    public String getCurrentDate() {
    	//現在の日時を返す
        return this.currentDate;
    }

}
