import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    MyClass myClass=new MyClass("Gulzat","Shabdanova",18);
    String []lessons=new String[3];
        for (int i = 0; i < lessons.length ; i++) {
           lessons[i]= scanner.nextLine();
        }
    MyClass myClass1=new MyClass("Nurbek", "Aliev","lagman",25,lessons);

        System.out.println(myClass.getName()+"\n"+myClass.getSurname()+"\n"+myClass.getAge());
        System.out.println(myClass1.getName()+"\n"+myClass1.getSurname()+"\n"+myClass1.getFood()+"\n"+myClass.getAge());

        for (String lesson:lessons) {
            System.out.println(lesson);
        }
    }
}