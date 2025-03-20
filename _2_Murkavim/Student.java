package Exercices.EX1._2_Murkavim;

import Exercices.EX1._1_OverLoading.Date;

public class Student {
    private String name;    // student's name
    private String id;      // student's ID
    private char gender;    // gender (M/F)
    private Date birthDay;  // date of birth

    public Student(String name, String id, char gender, Date birthDay) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.birthDay = new Date(birthDay); // create a copy of the date
    }

    public String getId() {
        return id;
    }

    public char getGender() {
        return gender;
    }

    /* Method to get the date of birth
     * @return date of birth
     */
    public Date getBirthDay() {
        return new Date(birthDay); // return a copy of the date
    }

    /* Method to check if the date of birth is the same
     * @param otherStudent - another student to compare
     * @return true if the dates of birth match, false otherwise
     */
    public boolean twinBirth(Student otherStudent) {
        return this.birthDay.isTheSame(otherStudent.birthDay);
    }

    /* Method for string representation of the student
     * @return string with student information
     */
    public String toString() {
        return "Student: " + name +
                ", ID: " + id +
                ", Gender: " + gender +
                ", Exercices.EX1._0_Start.Date of Birth: " + birthDay;
    }

    public static void main(String[] args) {
        // 1. Create three students according to the table
        Student student1 = new Student("Tal", "111", 'F', new Date(15, 9, 2004));
        Student student2 = new Student("Ron", "222", 'M', new Date(3, 3, 2005));
        Student student3 = new Student("Ben", "333", 'M', new Date(15, 9, 2004));

        // 2. Print student information
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        // 3. Check if student1 and student3 were born on the same day
        if (student1.twinBirth(student3)) {
            System.out.println(student1.getId() + " and " + student3.getId() + " have the same birthday!");
        }
    }
}