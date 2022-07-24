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
	}
}