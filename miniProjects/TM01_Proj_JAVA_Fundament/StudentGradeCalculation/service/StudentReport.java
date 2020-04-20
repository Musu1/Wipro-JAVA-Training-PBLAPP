package service;
import bean.Student;
import exception.NullMarksArrayException;
import exception.NullNameException;
import exception.NullStudentException;
public class StudentReport {
	public String findGrade(Student studentObject) {
		int[] m=studentObject.marks;
		if((m[0]<35)||(m[1]<35)||(m[2]<35)){
			return "F";
		}
		else {
			int sum=m[0]+m[1]+m[2];
			if(sum<=150) {
				return "D";
			}
			else if(sum>150 && sum<=200) {
				return "C";
			}
			else if(sum>200 && sum<=250) {
				return "B";
			}
			else if(sum>250 && sum<=300) {
				return "A";
			}
		}		
	 return "Not able to calculate grade";
	}
	
	public String validate(Student studentObject) throws NullStudentException,NullNameException,NullMarksArrayException {
		if(studentObject==null) {
			throw new NullStudentException();
		}
		else {
			if(studentObject.name==null) {
				throw new NullNameException();
			}
			else if(studentObject.marks==null) {
				throw new NullMarksArrayException();
			}
			else {
				return findGrade(studentObject);
			}
			
		}
	}
}
