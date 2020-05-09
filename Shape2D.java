public abstract class Shape2D extends Sprite implements Zoomable{

	public Shape2D(String name){
		super(name);
	}

	public abstract double getArea();
}