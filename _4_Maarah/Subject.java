package Exercices.EX1._4_Maarah;

public class Subject {
    private String subName; // proffession name
    private int grade;

    public Subject(String subName, int grade) {
        this.subName = subName;
        this.grade = grade;
    }
    public int getGrade() {return grade;}
}

class ReportCard {
    private String stuname;
    private Subject[] subArray;

    public ReportCard(String stuname, Subject[] subArray) {
        this.stuname = stuname;
        this.subArray = subArray;
    }

    public ReportCard(String stuname, int num) {
        this.stuname = stuname;
        this.subArray = new Subject[num];
    }

    public double average() {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < subArray.length; i++) {
            if (subArray[i] != null) {
                sum += subArray[i].getGrade();
                count++;
            }
        }
        if (count == 0) return 0;
        return sum / count;
    }

    public Boolean isExcellent() {
        return average() >= 90;
    }

    public static void PrintExcellent(ReportCard[] reportCards) {
        for (int i = 0; i < reportCards.length; i++) {
            if (reportCards[i].isExcellent()) {
                System.out.println(reportCards[i].getStuname());
            }
        }
    }
    public String getStuname() {        return stuname;    }
}



class TestReportCard {
    public static void main(String[] args) {
        // Create subjects for student 1
        Subject[] subjects1 = {
                new Subject("Math", 95),
                new Subject("Physics", 90),
                new Subject("Chemistry", 88)
        };

        // Create subjects for student 2
        Subject[] subjects2 = {
                new Subject("Math", 85),
                new Subject("Physics", 75),
                new Subject("Chemistry", 80)
        };

        // Create subjects for student 3
        Subject[] subjects3 = {
                new Subject("Math", 98),
                new Subject("Physics", 92),
                new Subject("Chemistry", 96)
        };

        // Create ReportCard objects for each student
        ReportCard student1 = new ReportCard("Alice", subjects1);
        ReportCard student2 = new ReportCard("Bob", subjects2);
        ReportCard student3 = new ReportCard("Charlie", subjects3);

        // Create an array of ReportCard objects
        ReportCard[] reportCards = { student1, student2, student3 };

        // Print the names of students with excellent grades
        System.out.println("Students with excellent grades:");
        ReportCard.PrintExcellent(reportCards);
    }
}