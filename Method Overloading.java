class area{
  
  void area(double a)
  {
   double res = 3.14*a*a;
   System.out.println("Area of circle = " + res);
  }
  
  void area(int a, int b)
  {
    int res=a*b;
    System.out.println("Area of rectangle = " + res);
  }
  void area(int a)
  {
   int res=a*a;
   System.out.println("Area of square = " + res);
  }
 } 
  
class pol{
  public static void main(String[] args){
    
  area cir=new area();
  area sqr=new area();
  area rec=new area();
  
  cir.area(3.6);
  sqr.area(5);
  rec.area(3,5);
 } 
  
}