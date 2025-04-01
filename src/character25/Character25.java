package character25;

public class Character25 {
	//フィールドを定義する
	//名前を定義する
    private String name;
    //HPを定義する
    private int hp;
    //MPを定義する
    private int mp;
    //攻撃力を定義する
    private int attackPower;
    //素早さを定義する
    private int agility;
    //防御力を定義する
    private int defense;

    //コンストラクタで各変数に引数を代入するコンストラクタを作成する
    public Character25(String name, int hp, int mp, int attackPower, int agility, int defense) {
    	//nameに引数を代入する
        this.name = name;
        //hpに引数を代入する
        this.hp = hp;
        //mpに引数を代入する
        this.mp = mp;
        //attackPowerに引数を代入する
        this.attackPower = attackPower;
        //agilityに引数を代入する
        this.agility = agility;
        //defenceに引数を代入する
        this.defense = defense;
    }

    //ゲッター及びセッターメソッドを作成する
    //名前を取得するメソッドを作成する
    public String getName() {
    	//名前を返す
        return name;
    }
    //名前を設定するメソッドを作成する
    public void setName(String name) {
    	//名前を設定する
        this.name = name;
    }
    //HPを取得するメソッドを作成する
    public int getHp() {
    	//HPを返す
        return hp;
    }
    //HPを設定するメソッドを作成する
    public void setHp(int hp) {
    	//HPを設定する
        this.hp = hp;
    }
    //MPを取得するメソッドを作成する
    public int getMp() {
    	//MPを返す
        return mp;
    }
    //MPを設定するメソッドを作成する
    public void setMp(int mp) {
    	//MPを設定する
        this.mp = mp;
    }
    //攻撃力を取得するメソッドを作成する
    public int getAttackPower() {
    	//攻撃力を返す
        return attackPower;
    }
    //攻撃力を設定するメソッドを作成する
    public void setAttackPower(int attackPower) {
    	//攻撃力を設定する
        this.attackPower = attackPower;
    }
    //素早さを取得するメソッドを作成する
    public int getAgility() {
    	//素早さを返す
        return agility;
    }
    //素早さを設定するメソッドを作成する
    public void setAgility(int agility) {
    	//素早さを設定する
        this.agility = agility;
    }
    //防御力を取得するメソッドを作成する
    public int getDefense() {
    	//防御力を返す
        return defense;
    }
    //防御力を設定するメソッドを作成する
    public void setDefense(int defense) {
    	//防御力を設定する
        this.defense = defense;
    }
    //コンソールに表示するメソッドを作成する
    public void displayStatus() {
    	//名前を出力する
        System.out.println("こんにちは " + name + " さん");
        //「ステータス」を出力する
        System.out.println("ステータス");
        //HPを出力する
        System.out.println("HP：" + hp);
        //MPを出力する
        System.out.println("MP：" + mp);
        //攻撃力を出力する
        System.out.println("攻撃力：" + attackPower);
        //素早さを出力する
        System.out.println("素早さ：" + agility);
        //防御力を出力する
        System.out.println("防御力：" + defense);
        //「さあ冒険に出かけよう！」を出力する
        System.out.println("さあ冒険に出かけよう！");
    }
}
