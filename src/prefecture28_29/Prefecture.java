package prefecture28_29;

public class Prefecture {
	//フィールドを定義する
	//都道府県名を定義する
    private String name;
    //県庁所在地を定義する
    private String capital;
    //面積を定義する
    private double area;
    //コンストラクタで各変数に引数を代入するコンストラクタを作成する
    public Prefecture(String name, String capital, double area) {
    	//nameに変数を代入する
        this.name = name;
        //capitalに変数を代入する
        this.capital = capital;
        //areaに変数を代入する
        this.area = area;
    }
    //都道府県名を取得するメソッドを作成する
    public String getName() {
    	//都道府県名を返す
        return name;
    }
    //県庁所在地を取得するメソッドを作成する
    public String getCapital() {
    	//県庁所在地を返す
        return capital;
    }
    //面積を取得するメソッドを作成する
    public double getArea() {
    	//面積を返す
        return area;
    }
    //オーバーライドを定義する
    @Override
    //Prefectureクラスをオーバーライドし、toStringを利用して文字列を表示させる
    public String toString() {
    	//以下の文字列を返す
        return "都道府県名：" + name + "\n県庁所在地：" + capital + "\n面積：" + area + "km²";
    }
}
