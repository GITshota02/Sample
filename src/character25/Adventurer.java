package character25;

import java.util.Random;

public class Adventurer extends Character25 {

	    public Adventurer(String name) {
	        // ランダムなステータス値を生成する(generateRandomStatメソッドを呼び出し最小値と最大値を設定する)
	        super(name, generateRandomStat(700, 1000), generateRandomStat(700, 1000),
	                generateRandomStat(300, 400), generateRandomStat(900, 1000), generateRandomStat(10, 30));
	    }

	    // ランダムな数値を生成するメソッドを作成する
	    private static int generateRandomStat(int min, int max) {
	    	//Randomのオブジェクトを生成する
	        Random rand = new Random();
	        //最小値から最大値の範囲で乱数の値を返す
	        return rand.nextInt((max - min) + 1) + min;
	    }
	    //オーバーライドを定義する
	    @Override
	    //親クラスのメソッドを継承する
	    public void displayStatus() {
	    	//親クラスのメソッドをそのまま呼び出す
	        super.displayStatus();
	    }
}

