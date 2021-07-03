package Interfaces;

public class Person implements Strudent,Youtuber{
    public static void main(String[] args) {
        Person obj=new Person();
        obj.study();
        obj.makevideo();

    }

    @Override
   public void study() {
        System.out.println("student");
    }

    @Override
    public void makevideo() {
        System.out.println("Person is  mam");
    }
}
