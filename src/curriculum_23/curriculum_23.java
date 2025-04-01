package curriculum_23;

public class curriculum_23 {
	
    public static void main(String[] args) {
        // Animalオブジェクトを作成（ライオン、体長2.1m、速度80km/h）
        Animal lion = new Animal("ライオン", 2.1, 80);
        // printInfoメソッドを呼び出して、コンソールに情報を出力する
        lion.printInfo();
    }

	// Animalクラスを定義する
	public static class Animal {
	    // フィールド（インスタンス変数）を定義する
		// 動物名を定義する
	    private String name;
	    // 体長を定義する
	    private double length;
	    // 速度を定義する
	    private int speed;

	    // コンストラクタでオブジェクト作成時に初期値を設定する
	    public Animal(String name, double length, int speed) {
	    	// 引数で渡されたnameをインスタンス変数に設定する
	        this.name = name;
	        // 引数で渡されたlengthをインスタンス変数に設定する
	        this.length = length;
	        // 引数で渡されたspeedをインスタンス変数に設定する
	        this.speed = speed;
	    }

	    // ゲッター、取得用メソッドを作成する
	    //動物名を取得するメソッドを作成する
	    public String getName() {
	    	// 動物名を返す
	        return name;
	    }
	    //体長を取得するメソッドを作成する
	    public double getLength() {
	    	// 体長を返す
	        return length;
	    }
	    //速度を取得するメソッドを作成する
	    public int getSpeed() {
	    	// 速度を返す
	        return speed;
	    }

	    // セッター、設定用メソッド
	    //動物名を設定するメソッドを作成する
	    public void setName(String name) {
	    	// 動物名を設定する
	        this.name = name;
	    }
	    //体長を設定するメソッドを作成する
	    public void setLength(double length) {
	    	// 体長を設定する
	        this.length = length;
	    }
	    //速度を設定するメソッドを作成する
	    public void setSpeed(int speed) {
	    	// 速度を設定する
	        this.speed = speed;
	    }

	    // 出力メソッド（コンソールに情報を出力）
	    public void printInfo() {
	    	// 動物名をコンソールに表示
	    	System.out.println("動物名：" + getName()); 
	    	// 体長をコンソールに表示
	        System.out.println("体長：" + getLength() + "m"); 
	        // 速度をコンソールに表示
	        System.out.println("速度：" + getSpeed() + "km/h"); 
	    }
	    
	}

}

//
