package gradesearchprogram;

import java.util.Map;

/**
 * @author 이성한
 * 1:성적등록  2:학적부리스트보기  3:학번으로 검색  4:이름으로 검색  "
 * 				+ "5:성적 상위순으로 순위출력 6.성적 하위순으로 순위출력(스왑) 7:이름 오름차순 출력  8:종료"
 */
public interface GradeServiceInter {
	public void input (String name, String hak, int kor, int eng, int math); // 성적등록
	public Map<String, Object> searchAllList(); // 전체 학적부 리스트
	public Object searchHak(String hak); // 학번으로 찾기
	public String searchName(String name); // 이름으로 찾기
	public void descGradeoutput(); //상위 순으로 순위 출력 (300,250,200 ...)
	public void ascGradeoutput(); //성적을 하위 순부터 출력 (150, 200, 250...)
	public void ascNameoutput(); // 이름을 오름차순으로 출력
	public String countAll(); // 학적부에 등록된 전체 학생 수
	
}
