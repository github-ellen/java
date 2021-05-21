package ex11_guest;

import java.util.List;

public interface GuestDAO {
	//������ �߰�
	int insert(GuestBookDTO gdto);
	//����
	int update(GuestBookDTO gdto);
	//���� -> PK ����Ͽ� ����
	int delete(int seq);
	//�� �� ��ȸ -> PK ����Ͽ� ��ȸ
	//������ ��Ƽ� ��ȯ�� ���̱� ������ GuestBookDTO��
	GuestBookDTO selectOne(int seq);
	//��ü ��ȸ
	List<GuestBookDTO> selectList();
}
