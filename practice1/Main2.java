public class Main2 {
	public static void main(String[] args) {
		//1 １から10までの乱数を発生させ、その数を表示した後、forループを用いて、その数だけ*マークを表示するプログラムを作りなさい。
		int num1 = (int)(Math.random() * 10) + 1;
		System.out.println("num1 = " + num1);
		for (int i = 0; i < num1; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		//2 上と同じ処理を、while文で作ったループで行いなさい。
		int i2 = 0;
		int num2 = (int)(Math.random() * 10) + 1;
		System.out.println("num2 = " + num2);
		while (i2 < num2) {
			i2++;
			System.out.print("*");
		}
		System.out.println();
		
		//3 上と同じ処理を、do～while文を用いたループで行いなさい。
		int i3 = 0;
		int num3 = (int)(Math.random() * 10) + 1;
		System.out.println("num3 = " + num3);
		do {
			i3++;
			System.out.print("*");
		} while (i3 < num3);
		System.out.println();
		
		//4 while文を用いて、整数型変数 a を、以下のように変更し、表示するプログラムを作りなさい。
		int a = 0;
		while (a <= 3) {
			System.out.println("a = " + a);
			a++;
		}
		
		//5 上と同じ処理を、for文を用いて作りなさい。
		for (int i = 0; i < 4; i++) {
			System.out.println("a = " + i);
		}
		
		//6 while文を用いて、整数型変数 a を、以下のように変更し、表示するプログラムを作りなさい。
		int a6 = 3;
		while (a6 >= 0) {
			System.out.println("a = " + a6);
			a6--;
		}
		
		//7 上と同じ処理を、for文を用いて作りなさい。
		for (int i = 3; i >= 0; i--) {
			System.out.println("a = " + i);
		}
		
		//8 whileの無限ループを作り、その中で、１から１０までの乱数を発生させて、表示しなさい。その際、値が１０になったら、ループを抜け、”終了します”と表示してプログラムを終えるようにしなさい。
		while (true) {
			int i8 = (int)(Math.random() * 10) + 1;
			System.out.println("i8 = " + i8);
			if (i8 ==10) {
				break;
			}
		}
		System.out.println("終了します");
		
		//9 whileの無限ループを作り、その中で、１から１００までの乱数を発生させ、表示しなさい。その際、値が１０の倍数であれば、ループを抜け、”終了します”と表示して、プログラムを終了しなさい。
		while (true) {
			int i9 = (int)(Math.random() * 100) + 1;
			System.out.println("i9 = " + i9);
			if (i9 % 10 == 0) {
				break;
			}
		}
		System.out.println("終了します");
		
		//10 forループを用いて、１から100までの乱数を５回発生させ、表示させなさい。
		for (int i = 0; i < 5; i++) {
			int num10 = (int)(Math.random() * 100) + 1;
			System.out.println("num10 = " + num10);
		}
		
		//11 forループを用いて、１から100までの乱数を５回発生させ、表示し、終了後その中の最大値を表示しなさい。
		int max = 0;
		for (int i = 0; i < 5; i++) {
			int num11 = (int)(Math.random() * 100) + 1;
			System.out.println("num11 = " + num11);
			max = Math.max(max, num11);
		}
		System.out.println("max = " + max);
		
		//12 forループを用いて、１から１００までの乱数を５回発生させ、表示し、終了後その中の最小値を表示しなさい。
		int min = 100;
		for (int i = 0; i < 5; i++) {
			int num12 = (int)(Math.random() * 100) + 1;
			System.out.println("num12 = " + num12);
			min = Math.min(min, num12);
		}
		System.out.println("min = " + min);
		
		//13 １から10までの乱数を発生させ、もしも5以上だったら、その数だけ*マークを表示し、5未満だったら、その数を表示するプログラムを作りなさい。
		int num13 = (int)(Math.random() * 10) + 1;
		if (num13 >= 5) {
			for (int i = 0; i < num13; i++) {
				System.out.print("*");
			}
			System.out.println("");
		} else if (num13 < 5) {
			System.out.println("num13 = " + num13);
		}
		
		//14 1から10までの乱数を発生させ、偶数なら、+を、奇数なら-を、それぞれ発生した数の文だけ表示するプログラムを作りなさい。
		int num14 = (int)(Math.random() * 10) + 1;
		System.out.println("num14 = " + num14);
		for (int i = 0; i < num14; i++) {
			if (num14 % 2 == 0) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}
		}
		
		//15
	}
}