package eraser.three;
/**
 * 칠판 지우개를 정의하는 클래스
 * -------------------------------------
 * 칠판 지우개의 속성을 정의하기 위해
 * 가로 : width  : double
 * 세로 : height : double
 * 높이 : depth  : double
 * 겹    : layer  : int
 * 네개의 변수를 선언
 * -------------------------------------
 * 기본 생성자 : 매개변수를 받지 않는 생성자
 * 매개변수를 받는 생성자 두개를 정의
 * 매개변수를 받는 생성자는 네 개의 필드 모두에 대해서
 * 매개변수를 받도록 정의한다
 * -------------------------------------
 * 칠판 지우개의 상태를 출력 : print() : void
 * 지우개의 한 겹을 제거 : peel() : void
 * -------------------------------------
 */
public class Eraser {
	//1.멤버 변수선언
	/*가로길이*/
	double width;
	/*세로길이*/
	double height;
	/*높이*/
	double depth;
	/*겹*/
	int layer;
	/*지우개 일련번호*/
	int serial;
	
	/*지우개의 일련 번호를 얻기위한 클래스 변수*/
	static int count = 0;
	
	
	//2.생성자 선언
	
	Eraser(){
		this.serial = ++count;
	}
	/**
	 * width필드만 초기화 하는 생성
	 */
	Eraser(double width){
		this();
		this.width = width;
	}
	
	/*width,height 필드만 초기화하는 생성자
	 * 
	 */
	Eraser(double width,double height){
		this(width);
		this.height = height;
	}
	/*
	 * width,height,depth
	 */
	Eraser(double width,double height,double depth){
		this(width,height);
		this.depth = depth;
	}
	/*
	 * 모든 필드 초기화하는 생성자
	 */
	Eraser(double width,double height,double depth,int layer){
		this(width,height,depth);
		//this()선언은 생성자 첫번째 줄에 생성해야하고 1회만 사용가능
		this.depth = layer;
	}
	
	
	
//	Eraser(double width, double height,double depth,int layer){
//		this.width = width;
//		this.height = height;
//		this.depth = depth;
//		this.layer = layer;
//	}
	
	//3.메소드 선언
	
	//지우개 한겹을 제거
	public void peer() {
		//남아있는 겹의 수가 -값이 될 수는 없으므로
		//if구문을 사용하여 값을 체크
		if(layer - 1 >= 0) {
			layer -= 1;
		}
	}
	public void print() {
		System.out.printf("일련번호 : %d,지우개 가로 : %4.2f, 세로 : %4.2f, 높이 : %4.2f, 남은 겹 : %d%n",serial,width,height,depth,layer);		
	}
}
