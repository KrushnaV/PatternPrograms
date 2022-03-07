class Rectangle{
	
	int l, b;
	
	public Rectangle(int l, int b){
	this. l = l;
	this. b= b;
	
	}
	
	public int area(){
	int a = l * b;
	return a;
	}
	
	public int perimeter(){
	
	int p = 2*(l + b);
	return p;
	}
}

class QuestionSix extends Rectangle{
	
	int d;
	
	QuestionSix(int l, int b, int d){
		super(l,b);
		this.d = d;
	}
	
	public int mainArea(){
		int mainAr = area()*d;
		return mainAr;
	}
	public int mainPerimeter(){
		int mainPerimtr = 4 *(l + b + d);
		return mainPerimtr;
	}
	
	public static void QuestionSix(String[] args){
		int area , perimeter;
		
		Rectangle r = new Rectangle(10,20);
		
		area = r.area();
		
		System.out.println("Area of Rectangleangle: "+ area);
		
		perimeter = r. perimeter();
		
		System.out.println("Perimeter of Rectangleangle : "+ perimeter );
		
		QuestionSix b = new QuestionSix(10,20,30);
		
		area = b.mainArea();
		
		System.out.println("Area of box : "+ area);
		
		perimeter = b.mainPerimeter();
		
		System.out.println("Perimeter of box: "+perimeter );
		
		
	}

}