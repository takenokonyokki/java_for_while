public class Main1 {
	public static void main(String[] args) {
		//4-1 １から10までの乱数を発生させ、その数を表示した後、forループを用いて、その数だけ■マークを表示するプログラムを作りなさい。
		int num1 = (int)(Math.random() * 10) + 1;
		System.out.println("数 : " + num1);
		for (int i = 0; i < num1; i++) {
			System.out.print("a");
		}
		
		System.out.println("");
		
		//4-2 4-1と同じ処理を、while文で作ったループで行いなさい。
		int num2 = (int)(Math.random() * 10) + 1;
		System.out.println("数 : " + num2);
//		while (0 < num2) {
//			System.out.print("b");
//			num2--;
//		}
		//下記の方がわかりやすい
		int j = 0;
		while (j < num2) {
			System.out.print("b");
			j++;
		}
		
		System.out.println("");
		
		//4-3 4-1と同じ処理を、do～while文を用いたループで行いなさい。
		int num3 = (int)(Math.random() * 10) + 1;
		System.out.println("数 : " + num3);
		int i2 = 0;
		do {
			System.out.print("c");
			i2++;
		} while (i2 < num3);
		
		System.out.println("");
		
		//4-4 while文を用いて、整数型変数 a を、以下のように変更し、表示するプログラムを作りなさい。
		/*期待される実行結果
			a = 0
			a = 1
			a = 2
			a = 3 */
		int a = 0;
		while (a <= 3) {
			System.out.println("a = " + a);
			a++;
		}
		
		//4-5 4-4と同じ処理を、for文を用いて作りなさい。
		int a2 = 0;
		for (int i = 0; i < 4; i++) {
			System.out.println("a2 = " + a2);
			a2++;
		}
		
		//4-6 while文を用いて、整数型変数 a を、以下のように変更し、表示するプログラムを作りなさい。
		/*期待される実行結果
			a = 3
			a = 2
			a = 1
			a = 0 */
		int a3 = 3;
		while (0 <= a3) {
			System.out.println("a3 = " + a3);
			a3--;
		}
		
		//4-7 4-6と同じ処理を、for文を用いて作りなさい。
		for (int a4 = 3; a4 >= 0; a4--) {
			System.out.println("a4 = " + a4);
		}
		
		//4-8 whileの無限ループを作り、その中で、１から１０までの乱数を発生させて、表示しなさい。その際、値が１０になったら、ループを抜け、”終了します”と表示してプログラムを終えるようにしなさい。
		/* 期待される実行結果
			5
			3
			2
			1
			9
			10   ← 10が発生したので、ループから抜ける。
			終了します */
		while (true) {
			int num4 = (int)(Math.random() * 10) + 1;
			System.out.println("num4 = " + num4);
			if (num4 == 10) {
				break;
			}
		}
		System.out.println("終了します");
		
		//4-9 whileの無限ループを作り、その中で、１から１００までの乱数を発生させ、表示しなさい。その際、値が１０の倍数であれば、ループを抜け、”終了します”と表示して、プログラムを終了しなさい。
		/* 期待される実行結果
			87
			23
			9
			65
			90   ← 10の倍数が発生したので、ループから抜ける。
			終了します */
		while (true) {
			int num5 = (int)(Math.random() * 100) + 1;
			System.out.println("num5 = " + num5);
			if (num5 % 10 == 0) {
				break;
			}
		}
		System.out.println("終了します");
		
		//4-10 forループを用いて、１から100までの乱数を５回発生させ、表示させなさい。
		/* 期待される実行結果の例
			1
			88
			82
			32
			51 */
		for (int i = 0; i < 5; i++) {
			int num6 = (int)(Math.random() * 100) + 1;
			System.out.println("num6 = " + num6);
		}
		
		//4-11 forループを用いて、１から100までの乱数を５回発生させ、表示し、終了後その中の最大値を表示しなさい。
		/* 期待される実行結果の例
			1
			88
			82
			32
			51
			最大値：88 */
		int max = 0;
		for (int i = 0; i < 5; i++) {
			int num7 = (int)(Math.random() * 100) + 1;
			System.out.println("num7 = " + num7);
			max = Math.max(max, num7); //maxメソッド（2つの引数を比較し、大きいほうを取得するメソッド）
			}
		System.out.println("max : " + max);
		
		//4-12 forループを用いて、１から１００までの乱数を５回発生させ、表示し、終了後その中の最小値を表示しなさい。
		/* 期待される実行結果の例
			1
			88
			82
			32
			51
			最小値：1 */
		int min = 100; //0で初期化するとnum8は0と比較することになり、0を取得してしまうので、乱数の最大値である100で初期化している
		for (int i = 0; i < 5; i++) {
			int num8 = (int)(Math.random() * 100) + 1;
			System.out.println("num8 = " + num8);
			min = Math.min(min, num8); //minメソッド（2つの引数を比較し、小さいほうを取得するメソッド）
		}
		System.out.println("min : " + min);
		
		//4-13 １から10までの乱数を発生させ、もしも5以上だったら、その数だけeを表示し、5未満だったら、その数を表示するプログラムを作りなさい。
		/* 期待される実行結果の例①（発生した数値が7）
			eeeeeee
			期待される実行結果の例②（発生した数値が3）
			発生した数値：3 */
		int num9 = (int)(Math.random() * 10) + 1;
		System.out.println("num9 = " + num9);
		if (5 <= num9) {
			for (int i = 0; i < num9; i++) {
				System.out.print("e");
			}
		} else {
			System.out.println("発生した数値 : " + num9);
		}
		
		System.out.println("");
		
		//4-14 1から10までの乱数を発生させ、偶数なら、fを、奇数ならgを、それぞれ発生した数の文だけ表示するプログラムを作りなさい。
		int num10 = (int)(Math.random() * 10) + 1;
		System.out.println("num10 = " + num10 );
		for (int i = 0; i < num10; i++) {
			if (num10 % 2 == 0) {
				System.out.print("f");
			} else {
				System.out.print("g");
			}
		}
		
		System.out.println("");
		
		//4-15 ループを用いて、１から100までの数字を表示しなさい。ただし、このとき、数は10ごとに改行すること。
		/* 改行は、System.out.println()を用いる。10で割り切れる数だったときに改行を行うとよい。
			期待される実行結果
			1 2 3 4 5 6 7 8 9 10
			11 12 13 14 15 16 17 18 19 20
			21 22 23 24 25 26 27 28 29 30
			・・・・・（中略）・・・・・
			81 82 83 84 85 86 87 88 89 90
			91 92 93 94 95 96 97 98 99 100 */
		for (int i = 1; i < 101; i++) {
			System.out.print(" " + i);
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		//4-16 forの二重ループを用いて、以下のように九九の表を作りなさい。
		/* 期待される実行結果
			1*1=1 2*1=2 3*1=3 4*1=4 5*1=5 6*1=6 7*1=7 8*1=8 9*1=9
			1*2=2 2*2=4 3*2=6 4*2=8 5*2=10 6*2=12 7*2=14 8*2=16 9*2=18
			1*3=3 2*3=6 3*3=9 4*3=12 5*3=15 6*3=18 7*3=21 8*3=24 9*3=27
			1*4=4 2*4=8 3*4=12 4*4=16 5*4=20 6*4=24 7*4=28 8*4=16 9*4=36
			1*5=5 2*5=10 3*5=15 4*5=20 5*5=25 6*5=30 7*5=35 8*5=49 9*5=45
			1*6=6 2*6=12 3*6=18 4*6=24 5*6=30 6*6=36 7*6=42 8*6=48 9*6=54
			1*7=7 2*7=14 3*7=21 4*7=28 5*7=35 6*7=42 7*7=49 8*7=56 9*7=63
			1*8=8 2*8=16 3*8=24 4*8=32 5*8=40 6*8=48 7*8=56 8*8=54 9*8=72
			1*9=9 2*9=18 3*9=27 4*9=36 5*9=45 6*9=54 7*9=63 8*9=72 9*9=81 */
		for (int i = 1; i < 10; i++) {
			for (int k = 1; k < 10; k++) {
				System.out.print(k + "*" + i + "=" + (i * k) + "  ");
				if (k == 9) {
					System.out.println();
				}
			}
		}
		
		//4-17 forの二重ループを用いて、以下のような図形を表示させるプログラムを作りなさい。
		/* ヒント：ループに用いる変数iとjの大きさの関係に注目する。
			期待される実行結果
			■□□□□□□□□□
			■■□□□□□□□□
			■■■□□□□□□□
			■■■■□□□□□□
			■■■■■□□□□□
			■■■■■■□□□□
			■■■■■■■□□□
			■■■■■■■■□□
			■■■■■■■■■□
			■■■■■■■■■■ */
		for (int i = 0; i < 10; i++) { //行
			for (int k = 0; k < 10; k++) { //列
				if (k <= i) { //列の値が行の値と等しいか、小さいときは、
					System.out.print("@");
				} else {
					System.out.print("a");
				}
			}
			System.out.println(); //列のfor文が終了したら改行を挟む
		}
		
		//4-18 forの二重ループを用いて、以下のような図形を表示させるプログラムを作りなさい。
		/* 期待される実行結果
			□■■■■■■■■■
			■□■■■■■■■■
			■■□■■■■■■■
			■■■□■■■■■■
			■■■■□■■■■■
			■■■■■□■■■■
			■■■■■■□■■■
			■■■■■■■□■■
			■■■■■■■■□■
			■■■■■■■■■□　*/
		for (int i = 0; i < 10; i++) { //行
			for (int k = 0; k < 10; k++) { //列
				if (k == i) { //行と列の値が等しいとき
					System.out.print("@");
				} else {
					System.out.print("a");
				}
			}
			System.out.println(); //列のfor文が終了したら改行を挟む
		}
		
		
		
	}
}