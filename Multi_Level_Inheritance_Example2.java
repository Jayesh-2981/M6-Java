class University 
{
    String universityName;
	String universityCode;
	int noOfColleges;
	String type;
	int establishedYear;
	int noOfCourse;

    University(String universityName, String universityCode, int noOfColleges, String type, int establishedYear, int noOfCourse) 
    {
    	super();
        this.universityName = universityName;
        this.universityCode = universityCode;
        this.noOfColleges = noOfColleges;
        this.type = type;
        this.establishedYear = establishedYear;
        this.noOfCourse = noOfCourse;
    }

    void displayUniversity() 
    {
    	System.out.println();
    	System.out.println("******* University Details *******");
    	System.out.println();
        System.out.println("University Name: " + this.universityName);
        System.out.println("University Code : " + this.universityCode);
        System.out.println("Number of Colleges : " + this.noOfColleges);
        System.out.println("University Type : " + this.type);
        System.out.println("Established Year : " + this.establishedYear);
        System.out.println("Number of Courses : " + this.noOfCourse);
        System.out.println();
    }
}

class College extends University 
{
    String collegeName;
    String collegeCode;
	String address;
	int noOfDepartments;
	int staffCount;
	char grade;

    College(String universityName, String universityCode, int noOfColleges, String type, int establishedYear, int noOfCourse, String collegeName,String collegeCode,String address,int noOfDepartments,int staffCount, char grade) 
    {
        super(universityName,universityCode,noOfColleges,type,establishedYear,noOfCourse);
        this.collegeName = collegeName;
        this.collegeCode = collegeCode;
        this.address = address;
        this.noOfDepartments = noOfDepartments;
        this.staffCount = staffCount;
        this.grade = grade;
    }

    void displayCollege() 
    {
    	System.out.println();
    	System.out.println("******* College Details *******");
    	System.out.println();
        System.out.println("College Name: " + this.collegeName);
        System.out.println("College Code : " + this.collegeCode);
        System.out.println("College Address : " + this.address);
        System.out.println("Number of Departments : " + this.noOfDepartments);
        System.out.println("Number of Staffs : " + this.staffCount);
        System.out.println("Grade : " + this.grade + "+");
        System.out.println();
    }
}

class Department extends College 
{
    String departmentName;
    String hodName;
	int classroom;
	int noOfStaff;
	int noOfSubjects;

    Department(String universityName, String universityCode, int noOfColleges, String type, int establishedYear, int noOfCourse, String collegeName,String collegeCode,String address,int noOfDepartments,int staffCount, char grade, String departmentName,String hodName, int classroom, int noOfStaff, int noOfSubjects) 
    {
        super(universityName, universityCode, noOfColleges, type, establishedYear, noOfCourse, collegeName, collegeCode, address, noOfDepartments, staffCount, grade);
        this.departmentName = departmentName;
        this.hodName = hodName;
        this.classroom = classroom;
        this.noOfStaff = noOfStaff;
        this.noOfSubjects = noOfSubjects;

    }

    void displayDepartment() 
    {
    	System.out.println();
    	System.out.println("******* Department Details *******");
    	System.out.println();
        System.out.println("Department Name: " + this.departmentName);
        System.out.println("Head Of Department : " + this.hodName);
        System.out.println("Number of Classrooms : "+this.classroom);
		System.out.println("Number of Staff : "+this.noOfStaff);
		System.out.println("Number of Subjects : "+this.noOfSubjects);
		System.out.println();
    }
}

class Teacher extends Department 
{
    String teacherName;
	String subject;
	long phoneNumber;
	String qualification;
	double experience;

    Teacher(String universityName, String universityCode, int noOfColleges, String type, int establishedYear, int noOfCourse, String collegeName,String collegeCode,String address,int noOfDepartments,int staffCount, char grade, String departmentName,String hodName, int classroom, int noOfStaff, int noOfSubjects,String teacherName, String subject, long phoneNumber, String qualification, double experience) 
    {
        super(universityName, universityCode, noOfColleges, type, establishedYear, noOfCourse, collegeName, collegeCode, address, noOfDepartments, staffCount, grade, departmentName, hodName, classroom, noOfStaff, noOfSubjects);
        this.teacherName = teacherName;
		this.subject = subject;
		this.phoneNumber = phoneNumber;
		this.qualification = qualification;
		this.experience = experience;
    }

    void displayTeacher() 
    {
        System.out.println();
        System.out.println("******* Teacher Details *******");
        System.out.println();
        System.out.println("Teacher Name : "+this.teacherName);
		System.out.println("Subject Name : "+this.subject);
		System.out.println("Phone Number : "+this.phoneNumber);
		System.out.println("Qualification of Teacher : "+this.qualification);
		System.out.println("Experience of Teaching : "+this.experience + " Years");
    }
}

class Multi_Level_Inheritance_Example2
{
    public static void main(String[] args) 
    {
    	Teacher obj = new Teacher("SPPU", "UNI-123", 1000, "Government", 1950, 500, "Modern Collage", "CLG-123", "Shivajinagar, Pune", 10, 110,'A',"Full Stack", "R. R. Bane", 8, 8, 48, "R. B. Pawar", "Java", 9561242084l, "MTECH", 5.5);
    	obj.displayUniversity();
    	obj.displayCollege();
    	obj.displayDepartment();
    	obj.displayTeacher(); 
    }
}


/*
OUTPUT :-

******* University Details *******

University Name: SPPU
University Code : UNI-123
Number of Colleges : 1000
University Type : Government
Established Year : 1950
Number of Courses : 500


******* College Details *******

College Name: Modern Collage
College Code : CLG-123
College Address : Shivajinagar, Pune
Number of Departments : 10
Number of Staffs : 110
Grade : A+


******* Department Details *******

Department Name: Full Stack
Head Of Department : R. R. Bane
Number of Classrooms : 8
Number of Staff : 8
Number of Subjects : 48


******* Teacher Details *******

Teacher Name : R. B. Pawar
Subject Name : Java
Phone Number : 9561242084
Qualification of Teacher : MTECH
Experience of Teaching : 5.5 Years

*/
