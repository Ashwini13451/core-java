class TharRunner {

    public static void main(String[] args) {

        Thar t1 = new Thar();
        t1.tharId = 1;
        t1.model = "AX";
        t1.color = "Black";

        Thar t2 = new Thar();
        t2.tharId = 2;
        t2.model = "LX";
        t2.color = "White";

        Thar t3 = new Thar();
        t3.tharId = 3;
        t3.model = "AX";
        t3.color = "Red";

        Thar t4 = new Thar();
        t4.tharId = 4;
        t4.model = "LX";
        t4.color = "Blue";

        Thar t5 = new Thar();
        t5.tharId = 5;
        t5.model = "AX";
        t5.color = "Grey";

        Thar t6 = new Thar();
        t6.tharId = 6;
        t6.model = "LX";
        t6.color = "Green";

        Thar t7 = new Thar();
        t7.tharId = 7;
        t7.model = "AX";
        t7.color = "Yellow";

        Thar t8 = new Thar();
        t8.tharId = 8;
        t8.model = "LX";
        t8.color = "Orange";

        Thar t9 = new Thar();
        t9.tharId = 9;
        t9.model = "AX";
        t9.color = "Purple";

        Thar t10 = new Thar();
        t10.tharId = 10;
        t10.model = "LX";
        t10.color = "Brown";

        Thar t11 = new Thar();
        t11.tharId = 11;
        t11.model = "AX";
        t11.color = "Black";

        Thar t12 = new Thar();
        t12.tharId = 12;
        t12.model = "LX";
        t12.color = "White";

        Thar t13 = new Thar();
        t13.tharId = 13;
        t13.model = "AX";
        t13.color = "Red";

        Thar t14 = new Thar();
        t14.tharId = 14;
        t14.model = "LX";
        t14.color = "Blue";

        Thar t15 = new Thar();
        t15.tharId = 15;
        t15.model = "AX";
        t15.color = "Grey";

        Thar[] thars = new Thar[15];

        thars[0] = t1;
        thars[1] = t2;
        thars[2] = t3;
        thars[3] = t4;
        thars[4] = t5;
        thars[5] = t6;
        thars[6] = t7;
        thars[7] = t8;
        thars[8] = t9;
        thars[9] = t10;
        thars[10] = t11;
        thars[11] = t12;
        thars[12] = t13;
        thars[13] = t14;
        thars[14] = t15;

        for (Thar t : thars) {
            System.out.println(t.tharId);
            System.out.println(t.model);
            System.out.println(t.color);
        }
    }
}