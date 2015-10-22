package gradesearchprogram;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 이성한 map 자료구조를 가지고 다음의 기능들을 완성한다.
 */
public class GradeServiceImple implements GradeServiceInter {
	Map<String, Object> map = new HashMap<String, Object>();
	Grade grade = new Grade();
	DescMethodGet dsort = new DescMethodGet();
	AscNameMethodGet Assort = new AscNameMethodGet(); 
	@Override
	public void input(String name, String hak, int kor, int eng, int math) { // 학적부
																				// 입력하기.
		grade.setName(name);
		grade.setHak(hak);
		grade.setKor(kor);
		grade.setEng(eng);
		grade.setMath(math);
		grade.getTotal();
		map.put(hak, grade);
	}

	@Override
	public Map<String, Object> searchAllList() { // 전체 학적부 출력
		return map;

	}

	@Override
	public Object searchHak(String hak) { // 학번으로 검색하기
		return map.get(hak);
	}

	@Override
	public String searchName(String name) { // 이름으로 검색하기
		String result = null;
		if (map.containsValue(name)) { // 그 이름값이 존재한다면?
			result = "검색하신" + name + "학생의 상세정보입니다." + map.get(grade.getHak());
		}
		return result;
	}

	@Override
	public void descGradeoutput() { // 성적 상위 순부터 순위 출력 (comparator를 implements해서 해보기)
//		Collections.sort(map, dsort); // 앞의 "" 부분으로 가서, dsort의 방법으로 정렬해라 -> 왜 작동이 안될까?
		Grade temp1 = new Grade();
		Grade temp2 = new Grade();
		Grade tempspace = new Grade();
		for (int i = 0; i < 999999; i++) {
			for (int j = 0; j < 999999; j++) {
				temp1 = (Grade) map.get(i);	//map.get(i)에 존재하는 total을 가져와야 함.
				temp2 = (Grade) map.get(j);
				tempspace = null;
				if (temp1.getTotal()<temp2.getTotal()) {
					tempspace = temp1;
					temp1 = temp2;
					temp2 = tempspace;
				}
			}
		}
	}

	@Override
	public void ascGradeoutput() { // 성적 하위 순부터 순위 출력
		Grade temp1 = new Grade();
		Grade temp2 = new Grade();
		Grade tempspace = new Grade();
		for (int i = 0; i < 999999; i++) {
			for (int j = 0; j < 999999; j++) {
				temp1 = (Grade) map.get(i);	//map.get(i)에 존재하는 total을 가져와야 함.
				temp2 = (Grade) map.get(j);
				tempspace = null;
				if (temp1.getTotal()>temp2.getTotal()) {
					tempspace = temp1;
					temp1 = temp2;
					temp2 = tempspace;
				}
			}
		}
	}

	@Override
	public void ascNameoutput() {
//		Collections.sort(map, Assort);

	}
	
	@Override
	public String countAll(){
	return "학적부에 등록된 전체 학생 수는" + map.size();	
	}

}
