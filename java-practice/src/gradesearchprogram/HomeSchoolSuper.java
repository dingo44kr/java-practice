package gradesearchprogram;

import java.util.Scanner;

/**
 * @author 이성한
 * 1:성적등록  2:학적부리스트보기  3:학번으로 검색  4:이름으로 검색  "
 * 				+ "5:성적 상위순으로 순위출력 6.성적 하위순으로 순위출력(스왑) 7:이름 오름차순 출력  8:종료"
 */
public class HomeSchoolSuper {
	public static void main(String[] args) {
		GradeServiceInter service = new GradeServiceImple();
		Scanner scanner = new Scanner(System.in);
		System.out.println("실행하실 업무를 선택하여 주세요."
				+ "\n 1:성적등록  2:학적부리스트보기  3:학번으로 검색  4:이름으로 검색  "
  				+ "5: 성적 상위순으로 순위출력 6: 성적 하위순으로 순위출력 7: 이름 오름차순 출력 8:종료 9:등록된 전체학생수");
		
		switch (scanner.nextInt()) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			return;

		default:
			break;
		}

	}
}
