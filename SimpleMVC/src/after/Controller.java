package after;

public class Controller {

	// * Model 객체를 관리
	
	private Model vo; // = new Model();
	
	

	public Controller() {
		this.vo = new Model();
	}

	
	
	public String getInfo() {
		// "이름 : " + {name} 반환해야함
		if (vo != null) {
		return "이름 : " + vo.getName();
		} else {
			return "정보가 없습니다";
		}
	}
	
	
}
