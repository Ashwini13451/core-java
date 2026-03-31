class FreelancerExecuter {
    public static void main(String[] args) {

        Client c1 = new Client();
        c1.clientId = 1;
        c1.clientName = "Aditya";
        c1.company = "AdityaBirla";
        c1.active = true;
        c1.project = "Web App";

        Freelancer f1 = new Freelancer();
        f1.freelancerId = 101;
        f1.name = "Kiran";
        f1.skill = "Java";
        f1.available = true;
        f1.client = c1;

        f1.getFreelancerDetails();
    }
}