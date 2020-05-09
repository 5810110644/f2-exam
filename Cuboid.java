public class Cuboid extends Shape3D{
    private double width;
    private double height;
    private double depth;

	public Cuboid(String name, double width, double height,double depth){
		super(name);
		this.width = width;
        this.height = height;
        this.depth = depth;
	}

	public double getWidth(){
		return width;
	}

	public void setWidth(double width){
		this.width = width;
	}

	public double getHeight(){
		return height;
	}

	public void setHeight(double height){
		this.height = height;
    }
    
    public double getDepth(){
        return depth;
    }

    public void setDepth(double depth){
        this.depth = depth;
    }

	public double getArea(){
		return width * height * depth;
    }
    
    public double getVolume(){
        return (2 * width * height )+(2 * height * depth)+(2 * width * depth);
    }

	public void zoom(double factor){
		width = width * factor;
        height = height * factor;
        depth = depth * factor;
	}
}