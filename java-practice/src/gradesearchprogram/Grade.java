package gradesearchprogram;
/**
 * 
 * @author 이성한
 * *1:성적등록  2:학적부리스트보기  3:학번으로 검색  4:이름으로 검색  "
					+ "5:성적 상위순으로 순위출력 6.성적 하위순으로 순위출력(스왑) 7:이름 오름차순 출력  8:종료"
 */
public class Grade {
	// map 자료구조로 성적등록 및 학적부 리스트 만들기
	private String name, hak;
	private int kor, eng, math, total;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = this.kor + this.eng + this.math;
	}
	@Override
	public String toString() {
		return "학적부 [이름:" + name + "\n 학번:" + hak + "\n 국어:" + kor + "\n 영어:" + eng + "\n 수학:" + math + "\n 전체성적:"
				+ total + "]";
	}
	
}
