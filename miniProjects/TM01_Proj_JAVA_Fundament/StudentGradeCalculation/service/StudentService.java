package service;

import bean.Student;
public class StudentService {
	public int findNumberOfNullMarks(Student data[]){
		int sum=0;
		for(int i=0;i<data.length;i++) {
			if(data[i]!=null) {
			if(data[i].marks==null) {
				sum=sum+1;
			}}
		}
		return sum;
	}
	public int findNumberOfNullNames(Student data[]){
		int sum=0;
		for(int i=0;i<data.length;i++) {
			if(data[i]!=null) {
			if(data[i].name==null) {
				sum=sum+1;
			}}
		}
		return sum;
	}
	public int findNumberOfNullObjects(Student data[]){
		int sum=0;
		for(int i=0;i<data.length;i++) {
			if(data[i]==null) {
				sum=sum+1;
			}
		}
		return sum; 
	}
}
