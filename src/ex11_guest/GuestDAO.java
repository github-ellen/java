package ex11_guest;

import java.util.List;

public interface GuestDAO {
	//데이터 추가
	int insert(GuestBookDTO gdto);
	//수정
	int update(GuestBookDTO gdto);
	//삭제 -> PK 사용하여 삭제
	int delete(int seq);
	//한 건 조회 -> PK 사용하여 조회
	//내용을 담아서 반환할 것이기 때문에 GuestBookDTO형
	GuestBookDTO selectOne(int seq);
	//전체 조회
	List<GuestBookDTO> selectList();
}
