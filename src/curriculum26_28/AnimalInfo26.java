package curriculum26_28;

import java.util.Scanner;

public class AnimalInfo26 {

    public static void main(String[] args) {
        //コンソールに入力を促すメッセージを表示する
        System.out.println("コンソールに文字を入力してください");
        
        //入力用のScannerオブジェクトを作成する
        Scanner scanner = new Scanner(System.in);
        
        //ユーザーからの入力を受け取る（この入力は動物情報のカンマ区切りの文字列）
        String input = scanner.nextLine();
        
        //入力されたデータをカンマ（,）で分割する
        String[] animals = input.split(",");
        
        //各動物の情報を格納したマップを作成する
        for (String animal : animals) {
            //各動物の情報をコロン（:）で分割する
            String[] info = animal.split(":");
            
            //動物名を抽出する
            String name = info[0];
            //体調を抽出する
            double length = Double.parseDouble(info[1]);
            //速度を抽出する
            int speed = Integer.parseInt(info[2]);
            
            //入力された内容によって学名を設定する
            String scientificName = getScientificName(name);
            
            //動物名を出力する
            System.out.println("動物名：" + name);
            //体長を出力する
            System.out.println("体長：" + length + "m");
            //速度を出力する
            System.out.println("速度：" + speed + "km/h");
            //学名を出力する
            System.out.println("学名：" + scientificName);
            //改行を入れる
            System.out.println();
        }
        
        //Scannerを閉じる
        scanner.close();
    }
    
    //動物名に基づいて学名を返すメソッドを作成する
    public static String getScientificName(String name) {
    	//switch文で入力された内容から学名を返す
        switch (name) {
        	//ライオンの場合
            case "ライオン":
            	//以下の学名を返す
                return "パンテラ レオ";
            //ゾウの場合
            case "ゾウ":
            	//以下の学名を返す
                return "ロキソドンタ・サイクロティス";
            //パンダの場合
            case "パンダ":
            	//以下の学名を返す
                return "アイルロポダ・メラノレウカ";
            //チンパンジーの場合
            case "チンパンジー":
            	//以下の学名を返す
                return "パン・トゥログロディテス";
            //シマウマの場合
            case "シマウマ":
            	//以下の学名を返す
                return "チャップマンシマウマ";
            //インコの場合
            case "インコ":
            	//以下の学名を返す
                return "不明";
            //上記以外の場合
            default:
            	//以下の学名を返す
                return "不明";
        }
    }
}
