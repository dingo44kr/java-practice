package abstractionExample;

import java.util.Scanner;

public class AbsExtends extends Abstraction {

	public static void main(String[] args) {
	AbsExtends absExtends = new AbsExtends();
	Scanner scanner = new Scanner(System.in);
	System.out.println("입력하시오");
	System.out.println(absExtends.plus(scanner.nextInt(), scanner.nextInt()));		
}


@Override
	public int plus(int a, int b) { //외부의 값 a,b 를 받아와 super.ab(입력받은 값, 입력받은 값)를 반환해줌.
	//자동으로 plus 메서드를 실행, plus 메서드의 반환값을 반환해줌
		return super.plus(a, b);
	}



@Override
public int a(int one, int two) {
	return 0;
}



}
