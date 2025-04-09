package prefecture_sort28_29;

import java.util.Arrays;
import java.util.Scanner;

import prefecture28_29.Prefecture;

public class Sort {

    //都道府県の配列のインスタンスを作成する
    private static Prefecture[] prefectures = {
    	//北海道のインスタンスを作成する
        new Prefecture("北海道", "札幌市", 83424),
        //青森県のインスタンスを作成する
        new Prefecture("青森県", "青森市", 9646),
        //岩手県のインスタンスを作成する
        new Prefecture("岩手県", "盛岡市", 15275),
        //宮城県のインスタンスを作成する
        new Prefecture("宮城県", "仙台市", 7282),
        //秋田県のインスタンスを作成する
        new Prefecture("秋田県", "秋田市", 11638),
        //山形県のインスタンスを作成する
        new Prefecture("山形県", "山形市", 9323),
        //福島県のインスタンスを作成する
        new Prefecture("福島県", "福島市", 13784),
        //茨城県のインスタンスを作成する
        new Prefecture("茨城県", "水戸市", 6097),
        //栃木県のインスタンスを作成する
        new Prefecture("栃木県", "宇都宮市", 6408),
        //群馬県のインスタンスを作成する
        new Prefecture("群馬県", "前橋市", 6362)
    };
    
    // 昇順でソートするメソッドを作成する
    public static void sortAscending(int[] indices) {
    	//配列を昇順にソートする
        Arrays.sort(indices);
        //ソート後の都道府県を表示する
        displayPrefectures(indices);
    }

    // 降順でソートするメソッドを作成する
    public static void sortDescending(int[] indices) {
    	//配列を昇順にソートする
        Arrays.sort(indices);
        //配列を降順に並べ替えする
        reverseArray(indices);
        //ソート後の都道府県を表示
        displayPrefectures(indices);
    }

    // インデックスを表示するメソッドを作成する
    private static void displayPrefectures(int[] indices) {
    	//各インデックスに対応する都道府県を表示する
        for (int index : indices) {
        	//現在のインデックスに対応する都道府県オブジェクトを取得
            Prefecture p = prefectures[index];
            //都道府県オブジェクトを表示する
            System.out.println(p);
            //改行を入れる
            System.out.println();
        }
    }

    // 配列を逆順に並べ替えるメソッドを作成する
    private static void reverseArray(int[] array) {
    	//配列の先頭を定義する
        int left = 0;
        //配列の末尾を定義する
        int right = array.length - 1;
        //左と右が交差するまで入れ替えを繰り返すwhile文を作成する
        while (left < right) {
        	//左側の値を一時的に保持する
            int temp = array[left];
            //右側の値を左側に設定する
            array[left] = array[right];
            //一時的に保持した左側の値を右側に設定する
            array[right] = temp;
            //次の左側へ移行する
            left++;
            //次の右側へ移行する
            right--;
        }
    }

    // ユーザー入力を受け取り処理するメソッドを作成する
    public static void main(String[] args) {
    	//入力内容を受け取るScannerを作成する
        Scanner scanner = new Scanner(System.in);
        //「ソート順（昇順/降順）：」を出力する
        System.out.print("ソート順（昇順/降順）：");
        //入力されたソート順を取得する
        String order = scanner.nextLine().trim();
        //「インデックス（カンマ区切り）を入力：」を出力する
        System.out.print("インデックス（カンマ区切り）を入力：");
        //入力されたインデックスの文字列を取得する
        String input = scanner.nextLine().trim();

        // 入力されたインデックスを整数配列に変換する
        String[] inputArray = input.split(",");
        //インデックスの配列を整数型で初期化する
        int[] indices = new int[inputArray.length];
        //入力されたインデックスを整数に変換して配列に格納する
        for (int i = 0; i < inputArray.length; i++) {
        	//文字列のインデックスを整数に変換し、配列に格納する
            indices[i] = Integer.parseInt(inputArray[i].trim());
        }

        // 昇順か降順かを判断してソートする条件式を作成する
        if ("昇順".equals(order)) {
        	//昇順にソートする
            sortAscending(indices);
        //降順の場合
        } else if ("降順".equals(order)) {
        	//降順にソートする
            sortDescending(indices);
        //それ以外の場合
        } else {
        	//「無効な順序です。」を出力する
            System.out.println("無効な順序です。");
        }
    }

}
