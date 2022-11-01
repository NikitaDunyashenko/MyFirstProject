package Classwork_drafts;

import java.util.Random;

public class test2 {

    public static void main(String[] args) {

        Student nikita = new Student("Nikita", "QA22");
        nikita.displayInfo();

        if (nikita.isPerfectStudent()){
            System.out.println("Nikita is a perfect Student");
        }

        if (nikita.isGoodStudent()){
            System.out.println("Nikita is a good Student");
        }

        if (nikita.isBadStudent()){
            System.out.println("Nikita is a bad Student");
        }
    }
}

class Student{
    String name;
    String group;
    int grade;

    Student(String name, String group){
        this.name = name;
        this.group = group;

        Random rand = new Random();
        this.grade = rand.nextInt(10) + 1;
    }

    boolean isPerfectStudent(){
        if (this.grade >= 9) {
            return true;
        } else{
            return false;
        }
    }

    boolean isGoodStudent(){
        if (this.grade < 9 && this.grade >= 6){
            return true;
        } else{
            return false;
        }
    }

    boolean isBadStudent(){
        if (this.grade < 6){
            return true;
        } else{
            return false;
        }
    }

    void displayInfo(){
        System.out.printf("Name: %10s \tgroup:  %s \tgrade: %d\n", name, group, grade);
    }
}