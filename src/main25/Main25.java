package main25;

import java.util.Scanner;

import character25.Adventurer;

public class Main25 {

    public static void main(String[] args) {
        //スキャナーのオブジェクトを作成する
        Scanner scanner = new Scanner(System.in);
        //以下の内容を出力する
        System.out.print("名前を入力してください: ");
        //入力された内容を取得する
        String name = scanner.nextLine();
        //Adventurerクラスを使ってキャラクターを作成する
        Adventurer adventurer = new Adventurer(name);
        //ステータスを表示する
        adventurer.displayStatus();
        //スキャナーを閉じる
        scanner.close();
    }

}
