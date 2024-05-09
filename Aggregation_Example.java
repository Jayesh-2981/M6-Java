class University
{
	String name;
	String universityCode;
	int noOfColleges;
	String type;
	int establishedYear;
	int course;
	College college;

	University(String name, String universityCode, int noOfColleges, String type, int establishedYear, int course)
	{
		this.name = name;
		this.universityCode = universityCode;
		this.noOfColleges = noOfColleges;
		this.type = type;
		this.establishedYear = establishedYear;
		this.course = course;
	}

	public void displayUniversity()
	{
		System.out.println();
		System.out.println(" * * * UNIVERSITY DETAILS * * * ");
		System.out.println();
		System.out.println("Name : "+this.name);
		System.out.println("University Code : "+this.universityCode);
		System.out.println("Number of colleges : "+this.noOfColleges);
		System.out.println("Type : "+this.type);
		System.out.println("Established Year : "+this.establishedYear);
		System.out.println("Number of courses : "+this.course);
	}

	public void createInstanceOfCollege(String name, String collegeCode, String address, int noOfDepartments, int staffCount, char grade)
	{
		college = new College(name, collegeCode,address,noOfDepartments,staffCount,grade);
	}
}


class College
{
	String name;
	String collegeCode;
	String address;
	int noOfDepartments;
	int staffCount;
	char grade;
	Department department;

	College(String name, String collegeCode, String address, int noOfDepartments, int staffCount, char grade)
	{
		this.name = name;
		this.collegeCode = collegeCode;
		this.address = address;
		this.noOfDepartments = noOfDepartments;
		this.staffCount = staffCount;
		this.grade = grade;
	}

	public void displayCollage()
	{
		System.out.println();
		System.out.println();
		System.out.println(" * * * COLLEGE DETAILS * * * ");
		System.out.println();
		System.out.println("Name : "+this.name);
		System.out.println("College Code : "+this.collegeCode);
		System.out.println("Address of college : "+this.address);
		System.out.println("Number of Departments : "+this.noOfDepartments);
		System.out.println("Number of Staff : "+this.staffCount);
		System.out.println("Grade : "+this.grade + "+");
	}

	public void createInstanceOfDepartment(String name, String hodName, int classroom, int noOfStaff, int noOfSubjects)
	{
		department = new Department(name,hodName,classroom,noOfStaff,noOfSubjects);
	}
}


class Department 
{
	String name;
	String hodName;
	int classroom;
	int noOfStaff;
	int noOfSubjects;
	Teacher teacher;

	Department(String name, String hodName, int classroom, int noOfStaff, int noOfSubjects)
	{
		this.name = name;
		this.hodName = hodName;
		this.classroom = classroom;
		this.noOfStaff = noOfStaff;
		this.noOfSubjects = noOfSubjects;
	}

	public void displayDepartment()
	{
		System.out.println();
		System.out.println();
		System.out.println(" * * * DEPARTMENT DETAILS * * * ");
		System.out.println();
		System.out.println("Department Name : "+this.name);
		System.out.println("HOD Name : "+this.hodName);
		System.out.println("Number of Classrooms : "+this.classroom);
		System.out.println("Number of Staff : "+this.noOfStaff);
		System.out.println("Number of Subjects : "+this.noOfSubjects);
	}

	public void createInstanceOfTeacher(String name, String subject, long phoneNumber, String qualification, double experience)
	{
		teacher = new Teacher(name,subject,phoneNumber,qualification,experience);
	}
}


class Teacher
{
	String name;
	String subject;
	long phoneNumber;
	String qualification;
	double experience;

	Teacher(String name, String subject, long phoneNumber, String qualification, double experience)
	{
		this.name = name;
		this.subject = subject;
		this.phoneNumber = phoneNumber;
		this.qualification = qualification;
		this.experience = experience;
	}

	public void displayTeacher()
	{
		System.out.println();
		System.out.println();
		System.out.println(" * * * TEACHER DETAILS * * * ");
		System.out.println();
		System.out.println("Teacher Name : "+name);
		System.out.println("Subject Name : "+subject);
		System.out.println("Phone Number : "+phoneNumber);
		System.out.println("Qualification of Teacher : "+qualification);
		System.out.println("Experience of Teaching : "+experience + " Years");
	}
}


class Aggregation_Example
{
	public static void main(String[] args) 
	{
		University obj = new University("SPPU","UNI-123",1100,"Government",1950,300);
		obj.displayUniversity();
		obj.createInstanceOfCollege("Modern Collage","MCSPPU-123","Shivajinagar, Pune",10,110,'A');
		obj.college.displayCollage();
		obj.college.createInstanceOfDepartment("AI and ML","R. R. Bane",8,8,48);
		obj.college.department.displayDepartment();
		obj.college.department.createInstanceOfTeacher("R. B. Pawar","Java",9561242084l,"MTECH",5.5);
		obj.college.department.teacher.displayTeacher();
	}
}