package school;
/**
 * �б� ���������� �л�,���� ������
 * ���,���� ����� �׽�Ʈ�ϴ� Ŭ�����̴�
 * @author win10
 *
 */
public class SchoolTest{

	public static void main(String[] args) {
		//1.����, 2.�ʱ�ȭ
		Attendance[] attends = new Attendance[3];
		attends[0] = new Student("S001","ȫ�浿",19,"����");
		attends[1] = new Student("T002","���",46,"����");
		attends[2] = new Student("E001","����ƹ�",51,"���ü");
		
		//3.���
		for (Attendance attendance : attends) {
			//��� �������� ������ ���
			System.out.println(attendance.attend());
			//�� �������� �ٽ� PersonŸ���̹Ƿ�
			//Person�� ����Ʈ ����� ���� �ʹٸ� ���� ����ȯ
			((Person)attendance).print();
			
			//Employee�� LessonŸ���� �ƴϹǷ� �� �˻�
			if(attendance instanceof Lesson) {
				//Student,Teacher�� Lesson �������̽��� �����ϹǷ�
				//if������ ����Ͽ� lesson()��ɵ� ����� �� �ִ�.
				String lessonStr = ((Lesson)attendance).lesson();
				System.out.println(lessonStr);
			}
		}
	}

}
