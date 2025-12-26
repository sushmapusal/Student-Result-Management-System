class Student {
    int roll;
    String name;
    int m1, m2, m3;
    int total;
    double average;
    String grade;

    // Constructor
    Student(int roll, String name, int m1, int m2, int m3) {
        this.roll = roll;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        calculateResult();
    }

    void calculateResult() {
        total = m1 + m2 + m3;
        average = total / 3.0;

        if (average >= 75)
            grade = "A";
        else if (average >= 60)
            grade = "B";
        else if (average >= 40)
            grade = "C";
        else
            grade = "Fail";
    }

    void display() {
        System.out.println("----------------------------------");
        System.out.println("Roll No : " + roll);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade   : " + grade);
        System.out.println("----------------------------------");
    }
}
