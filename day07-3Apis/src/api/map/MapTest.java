package api.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import api.object.Product;

/**
 * �����͸� key, value �� ������ �����ϴ� �ڷᱸ����
 * Map �� �׽�Ʈ �ϴ� Ŭ����
 * 
 * key   : �ߺ� ������� ����
 * value : �ߺ� �����
 * 
 * key, value : ��� Ÿ���� ������ ���� ����
 * @author PC38206
 *
 */
public class MapTest {

	public static void main(String[] args) {
		// 1. ���� : Map �������̽�
		Map map;
		
		// 2. �ʱ�ȭ : HashMap Ŭ����
		map = new HashMap();		
		
		// 3. ���
		// (1) map �� ������ �߰� : put(k, v)
		map.put("1", "�ȳ��ϼ���");
		map.put(2, "�ݰ�����~");
		map.put("three", "������ �౸ ������?");
		map.put(4.0, "��� ì�� ���ô� ��");
		
		//  ����� ���� Ÿ�� ���� ����
		Product product = new Product("P001", "MS-��ũ ��ġ ���콺", 51330, 36);
		map.put(5, product);
		
		//  (2) map ������ ���� : get(k)
		System.out.println(map.get("1"));
		System.out.println(map.get(5));
		
		// ��ü ������ ��� : foreach 
		// 1. ���� Ű ��ü�� ���� ���� ��
		// 2. ����� Ű�� get(k) �� �ݺ�����
		Set keySet = map.keySet();
		for (Object key: keySet) {
			System.out.printf("key=%s : value=%s%n"
					     , key.toString(), map.get(key).toString());
		}
	}

}









