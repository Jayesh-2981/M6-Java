class Human 
{
    String name;
    String gender;

    Human(String name, String gender) 
    {
        super();
        this.name = name;
        this.gender = gender;
    }

    void eat() 
    {
        System.out.println("Human can Eat");
    }

    void walk() 
    {
        System.out.println("Human can walk");
    }

    void speak() 
    {
        System.out.println("Human can Speak");
    }

    void think() 
    {
        System.out.println("Human can Think");
    }

    void displayHuman() 
    {
        System.out.println();
        System.out.println("* * * Human Details * * *");
        System.out.println();
        System.out.println("Name : " + this.name);
        System.out.println("Gender : " + this.gender);
        System.out.println();
    }
}

class Graduation extends Human 
{
    String course;
    int duration;
    String branch;
    String university;
    int yearOfPassing;

    Graduation(String course, int duration, String branch, String university, int yearOfPassing, String name, String gender) 
    {
        super(name, gender);
        this.course = course;
        this.duration = duration;
        this.branch = branch;
        this.university = university;
        this.yearOfPassing = yearOfPassing;
    }

    void displayGraduation() 
    {
        System.out.println();
        System.out.println("* * * Graduation Details * * *");
        System.out.println();
        System.out.println("Course Name : " + this.course);
        System.out.println("Course Duration : " + this.duration + " Years");
        System.out.println("Branch : " + this.branch);
        System.out.println("Name of University : " + this.university);
        System.out.println("Year of Passing : " + this.yearOfPassing);
        System.out.println();
    }
}

class Post_Graduation extends Graduation 
{
    String specialization;
    int post_Duration;
    int post_YOP;
    String post_University;

    Post_Graduation(String specialization, int post_Duration, int post_YOP, String post_University, String course, int duration, String branch, String university, int yearOfPassing, String name, String gender) 
    {
        super(course, duration, branch, university, yearOfPassing, name, gender);
        this.specialization = specialization;
        this.post_Duration = post_Duration;
        this.post_YOP = post_YOP;
        this.post_University = post_University;
    }

    void displayPostGraduation() 
    {
        System.out.println();
        System.out.println("* * * Post Graduation Details * * *");
        System.out.println();
        System.out.println("Specialization : " + this.specialization);
        System.out.println("Duration of Course : " + this.post_Duration + " Years");
        System.out.println("Year of Passing : " + this.post_YOP);
        System.out.println("Name of University : " + this.post_University);
        System.out.println();
    }
}

class Job extends Post_Graduation 
{
    String company;
    double salary;
    String designation;
    String location;

    Job(String company, double salary, String designation, String location, String specialization, int post_Duration, int post_YOP, String post_University, String course, int duration, String branch, String university, int yearOfPassing, String name, String gender) 
    {
        super(specialization, post_Duration, post_YOP, post_University, course, duration, branch, university, yearOfPassing, name, gender);
        this.company = company;
        this.salary = salary;
        this.designation = designation;
        this.location = location;
    }

    void displayJob() 
    {   
        System.out.println();
        System.out.println("* * * Job Details * * *");
        System.out.println();
        System.out.println("Company Name : " + this.company);
        System.out.println("Salary : " + this.salary + " Rs");
        System.out.println("Designation : " + this.designation);
        System.out.println("Location : " + this.location);
        System.out.println();
    }
}

class Multi_Level_Inheritance_Example1 
{
    public static void main(String[] args) 
    {
        Job obj = new Job("TCS", 25000, "Assistant Software Engineer", "Pune", "Full Stack - Java", 2, 2025, "SPPU", "Bachelor of Engineering", 4, "Computer Engineering", "University of Mumbai", 2023, "Jayesh Jadhav", "Male");
        obj.displayHuman();
        obj.eat();
        obj.walk();
        obj.speak();
        obj.think();
        obj.displayGraduation();
        obj.displayPostGraduation();
        obj.displayJob();
    }
}

/*
OUTPUT :-

* * * Human Details * * *

Name : Jayesh Jadhav
Gender : Male

Human can Eat
Human can walk
Human can Speak
Human can Think

* * * Graduation Details * * *

Course Name : Bachelor of Engineering
Course Duration : 4 Years
Branch : Computer Engineering
Name of University : University of Mumbai
Year of Passing : 2023


* * * Post Graduation Details * * *

Specialization : Full Stack - Java
Duration of Course : 2 Years
Year of Passing : 2025
Name of University : SPPU


* * * Job Details * * *

Company Name : TCS
Salary : 25000.0 Rs
Designation : Assistant Software Engineer
Location : Pune

*/