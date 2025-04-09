package self_introduction4;

public class Main {

	public static void main(String[] args){
		//インスタンスを生成する
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		//鈴木太郎の情報を出力する
		person1.print();
		//インスタンスを生成する
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		//山田花子の情報を出力する
		person2.print();
		//合計人数を出力する
		Person.printCount();
		//Carクラスのインスタンスを生成する
		Car car = new Car();
		//Bicycleクラスのインスタンスを生成する
		Bicycle bicycle = new Bicycle();
		//Carの所有者を設定する、person1の名前をCarの所有者として設定する
		car.setOwner(person1.fullName());
		//Bicycleの所有者を設定する、person2の名前をBicycleの所有者として設定する
		bicycle.setOwner(person2.fullName());
		//Carの所有者を表示する、carの所有者名を出力する
		System.out.println(car.getOwner());
		//Bicycleの所有者を表示する、bicycleの所有者名を出力する
		System.out.println(bicycle.getOwner());
		//person1がCarを購入する、person1がCarを購入したことを表示する
		person1.buy(car);
		//person2がBicycleを購入する、person2がBicycleを購入したことを表示する
		person2.buy(bicycle);
	}

}
