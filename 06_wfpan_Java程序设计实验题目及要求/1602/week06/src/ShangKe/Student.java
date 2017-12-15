package ShangKe;

import java.util.ArrayList;
import java.util.Arrays;



public class Student {

	private String SName;
	private int SAge;
	private String SSex;
	private ArrayList<Float> score;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String sName, int sAge, String sSex, ArrayList<Float> score) {
		super();
		SName = sName;
		SAge = sAge;
		SSex = sSex;
		this.score = score;
	}

	public ArrayList<Float> getScore() {
		return score;
	}
	public void setScore(ArrayList<Float> score) {
		this.score = score;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public int getSAge() {
		return SAge;
	}
	public void setSAge(int sAge) {
		SAge = sAge;
	}
	public String getSSex() {
		return SSex;
	}
	public void setSSex(String sSex) {
		SSex = sSex;
	}
	
	public int getSum(int[] grade) {
		int sum = 0;
		for(int i=0;i<grade.length;i++) {
			sum += grade[i];
		}
		return sum;
	}
	@Override
	public String toString() {
		return "Student [SName=" + SName + ", SAge=" + SAge + ", SSex=" + SSex + ", score=" + score + "]";
	}
	
	
	
}
