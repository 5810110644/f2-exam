public abstract class Shape3D extends Sprite implements Zoomable{

	public Shape3D(String name){
		super(name);
	}

    public abstract double getArea();
    public abstract double getVolume();
}