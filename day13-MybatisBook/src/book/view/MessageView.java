package book.view;

public class MessageView implements BookView {

	@Override
	public void display(Object object) {
		 String massage = (String)object;
		 System.out.println(massage);
	}

}
