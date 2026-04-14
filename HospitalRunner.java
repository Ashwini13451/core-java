class HospitalRunner {

    public static void main(String[] args) {

        Hospital h1 = new Hospital();
        h1.hospitalId = 1;
        h1.name = "Apollo";
        h1.location = "Bangalore";

        Hospital h2 = new Hospital();
        h2.hospitalId = 2;
        h2.name = "Fortis";
        h2.location = "Delhi";

        Hospital h3 = new Hospital();
        h3.hospitalId = 3;
        h3.name = "Manipal";
        h3.location = "Mysore";

        Hospital h4 = new Hospital();
        h4.hospitalId = 4;
        h4.name = "Aster";
        h4.location = "Chennai";

        Hospital h5 = new Hospital();
        h5.hospitalId = 5;
        h5.name = "Columbia";
        h5.location = "Hyderabad";

        Hospital h6 = new Hospital();
        h6.hospitalId = 6;
        h6.name = "Narayana";
        h6.location = "Bangalore";

        Hospital h7 = new Hospital();
        h7.hospitalId = 7;
        h7.name = "KIMS";
        h7.location = "Hubli";

        Hospital h8 = new Hospital();
        h8.hospitalId = 8;
        h8.name = "Sakra";
        h8.location = "Bangalore";

        Hospital h9 = new Hospital();
        h9.hospitalId = 9;
        h9.name = "Rainbow";
        h9.location = "Hyderabad";

        Hospital h10 = new Hospital();
        h10.hospitalId = 10;
        h10.name = "AIIMS";
        h10.location = "Delhi";

        Hospital h11 = new Hospital();
        h11.hospitalId = 11;
        h11.name = "Victoria";
        h11.location = "Bangalore";

        Hospital h12 = new Hospital();
        h12.hospitalId = 12;
        h12.name = "Bowring";
        h12.location = "Bangalore";

        Hospital h13 = new Hospital();
        h13.hospitalId = 13;
        h13.name = "ESI";
        h13.location = "Bangalore";

        Hospital h14 = new Hospital();
        h14.hospitalId = 14;
        h14.name = "Cloudnine";
        h14.location = "Chennai";

        Hospital h15 = new Hospital();
        h15.hospitalId = 15;
        h15.name = "Medanta";
        h15.location = "Gurgaon";

        Hospital[] hospitals = new Hospital[15];

        hospitals[0] = h1;
        hospitals[1] = h2;
        hospitals[2] = h3;
        hospitals[3] = h4;
        hospitals[4] = h5;
        hospitals[5] = h6;
        hospitals[6] = h7;
        hospitals[7] = h8;
        hospitals[8] = h9;
        hospitals[9] = h10;
        hospitals[10] = h11;
        hospitals[11] = h12;
        hospitals[12] = h13;
        hospitals[13] = h14;
        hospitals[14] = h15;

        for (Hospital h : hospitals) {
            System.out.println(h.hospitalId);
            System.out.println(h.name);
            System.out.println(h.location);
        }
    }
}