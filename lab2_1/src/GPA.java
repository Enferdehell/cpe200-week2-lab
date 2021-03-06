/**
 * Implement grading system.
 */
public class GPA {
    private float sumGrade = 0;
    private int sumCredit = 0;
    public void addGrade(int credit, float grade) {
        sumCredit += credit;
        sumGrade += grade*credit;
    }


    public float get() {
        if (sumCredit != 0) {
            return sumGrade/sumCredit;
        }
        return 0;
    }
    public static void main(String[] args) {
        GPA gpa = new GPA();
        System.out.println("Add data");
        gpa.addGrade(3, 4);     // Got A for 3 credits class
        gpa.addGrade(3, 3.5f);   // Got B+ for 3 credits class
        gpa.addGrade(2, 2);     // Got C for a 2 credits class
        System.out.printf("My GPS is %f\n", gpa.get());
    }
}
