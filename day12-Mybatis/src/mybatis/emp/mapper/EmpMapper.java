package mybatis.emp.mapper;

import java.util.List;
import java.util.Map;

import mybatis.emp.vo.Emp;

/**
 * EmpMapper.xml�� ���ǵǾ� �ִ�
 * �� ���� ���̵� �޼ҵ�� �����ϴ� �������̽�
 * @author win10
 *
 */
public interface EmpMapper {
	/**emp���̺��� ��ü ��� ��ȸ 
	 * emp��ü�� map���� ����
	 * 
	 * @return
	 */
	public abstract List<Map<String,Object>> selectAll();
	/**
	 * �Ű������� �Էµ� empno�� �ش��ϴ� �����Ѹ���
	 * ��� ������ ��ȸ
	 * @param empno
	 * @return ���� 1���� ������
	 */
	public abstract Emp selectOne(int empno);
	/**
	 * ������ ���� 1���� insert
	 * 
	 * @param emp : �߰��� ������ ��� emp��ü
	 * @return : �߰��� ������ ���� ����
	 */
	
	public abstract int insert(Emp emp);
}
