public class Marks{
  public static void main(String args[]){
    int i=0;
    int marks[];
    marks=new int[5];
    marks[i]=33;
    marks[++i]=40;
    marks[++i]=49;
    marks[++i]=25;
    marks[++i]=20;
    String students[];
    students =new String[5];
    i=0;
    students[i]="Damon";
    students[++i]="Davina";
    students[++i]="Klaus";
    students[++i]="Elena";
    students[++i]="Bonnie";
    if(marks[0]>35){
      System.out.println(students[0]+"="+marks[0]);
    }
    if(marks[1]>35){
      System.out.println(students[1]+"="+marks[1]);
    }
    if(marks[2]>35){
      System.out.println(students[2]+"="+marks[2]);
    }
    if(marks[3]>35){
      System.out.println(students[3]+"="+marks[3]);
    }
    if(marks[4]>35){
      System.out.println(students[4]+"="+marks[4]);
    }
  }
}