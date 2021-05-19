package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.
// 1. Open up the file, Student.java, and add all of the necessary getters and setters.
public class Student {
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa = 0.0;

    public void setName(String name) {
        this.name = name;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
    public String getName() {
        return name;
    }
    public int getStudentId() {
        return studentId;
    }
    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public double getGpa() {
        return gpa;
    }
    public static String getGradeLevel(int credits) {
        if (credits <= 29) {
            return "freshman";
        } else if (credits <= 59) {
            return "sophomore";
        } else if (credits <= 89) {
            return "junior";
        } else {
            return "senior";
        }
    }
    public void addGrade(int courseCredits, double grade) {
        // Calculate current total quality score using gpa * numberOfCredits
        double totalQualityScore = this.gpa * this.numberOfCredits;
        // Use new course grade and course credits to update student's total quality score
        totalQualityScore += courseCredits * grade;
        // Update the student's total numberOfCredits
        this.numberOfCredits += courseCredits;
        // Compute the student's new gpa
        this.gpa = totalQualityScore/this.numberOfCredits;
    }

    public String toString() {
        String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", this.name, this.getGradeLevel(this.numberOfCredits), this.getNumberOfCredits(), this.getGpa());
        return studentReport;
    }

    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != getClass()) {
            return false;
        }
        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();
    }

}



// Need to finish 5.5.3 toString and equals for Course class