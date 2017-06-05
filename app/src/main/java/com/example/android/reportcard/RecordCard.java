package com.example.android.reportcard;

/**
 * Created by ursum on 05/06/2017.
 */

public class RecordCard {
    private String studentName;
    private int studentphoto;
    private String grade;

    public RecordCard(){
        super();
    }
    public String getStudentName(){

        return this.studentName;
    }
    public void setStudentName() {
       //sets student
    }
    public String getGrade(){

        return this.grade;
    }

    public void setGrade(){
        //sets student grade
    }

    public int getStudentPhoto(){
        return this.studentphoto;
    }

    public void setStudentPhoto(){
        //sets student photo
    }

    public RecordCard(int icon, String subjectName, String grade) {
        super();
        this.studentphoto = icon;
        this.studentName = subjectName;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student got \n" + grade+ " Grade in "+ studentName;
    }

}
//test upload