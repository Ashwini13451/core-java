class StudentRunner {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.studentId = 1;
        s1.studentName = "Rahul";
        s1.course = "Java";

        Student s2 = new Student();
        s2.studentId = 2;
        s2.studentName = "Anu";
        s2.course = "Python";

        Student s3 = new Student();
        s3.studentId = 3;
        s3.studentName = "Ravi";
        s3.course = "C++";

        Student s4 = new Student();
        s4.studentId = 4;
        s4.studentName = "Sneha";
        s4.course = "Java";

        Student s5 = new Student();
        s5.studentId = 5;
        s5.studentName = "Kiran";
        s5.course = "Python";

        Student s6 = new Student();
        s6.studentId = 6;
        s6.studentName = "Pooja";
        s6.course = "C";

        Student s7 = new Student();
        s7.studentId = 7;
        s7.studentName = "Arjun";
        s7.course = "Java";

        Student s8 = new Student();
        s8.studentId = 8;
        s8.studentName = "Meena";
        s8.course = "Python";

        Student s9 = new Student();
        s9.studentId = 9;
        s9.studentName = "Vijay";
        s9.course = "C++";

        Student s10 = new Student();
        s10.studentId = 10;
        s10.studentName = "Divya";
        s10.course = "Java";

        Student s11 = new Student();
        s11.studentId = 11;
        s11.studentName = "Manoj";
        s11.course = "Python";

        Student s12 = new Student();
        s12.studentId = 12;
        s12.studentName = "Asha";
        s12.course = "C";

        Student s13 = new Student();
        s13.studentId = 13;
        s13.studentName = "Ramesh";
        s13.course = "Java";

        Student s14 = new Student();
        s14.studentId = 14;
        s14.studentName = "Priya";
        s14.course = "Python";

        Student s15 = new Student();
        s15.studentId = 15;
        s15.studentName = "Suresh";
        s15.course = "C++";

        Student[] students = new Student[15];

        students[0]=s1; students[1]=s2; students[2]=s3; students[3]=s4; students[4]=s5;
        students[5]=s6; students[6]=s7; students[7]=s8; students[8]=s9; students[9]=s10;
        students[10]=s11; students[11]=s12; students[12]=s13; students[13]=s14; students[14]=s15;

        for (Student s : students) {
            System.out.println(s.studentId);
            System.out.println(s.studentName);
            System.out.println(s.course);
        }
    }
}
