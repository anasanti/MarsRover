
public class MarsRover {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	

}

public class Moving{
	
	public String L;
	public String R;
	public String M;
	public String letter;
	
	public boolean move(String L){
		
		if ( letter.equals("L"))
		{
			return true;
		}
		else if (letter.equals("R")){
			return true;
		}
		else if (letter.equals("M")){
			return true;
		}
		else {
			return false;
		}
		
	}


	
	
}

public class Location{
	
	public int N;
	public int S;
	public int W;
	public int L;
	
	
	
}
