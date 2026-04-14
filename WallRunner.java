class WallRunner {

    public static void main(String[] args) {

        Wall wallOne = new Wall();
        wallOne.wallId = 1;
        wallOne.wallType = "Cement";
        wallOne.wallColour = "Blue";

        Wall wallTwo = new Wall();
        wallTwo.wallId = 2;
        wallTwo.wallType = "brick";
        wallTwo.wallColour = "White";

        Wall wallThree = new Wall();
        wallThree.wallId = 3;
        wallThree.wallType = "";
        wallThree.wallColour = "Green";

        Wall wallFour = new Wall();
        wallFour.wallId = 4;
        wallFour.wallType = "";
        wallFour.wallColour = "Black";

        Wall wallFive = new Wall();
        wallFive.wallId = 5;
        wallFive.wallType = "";
        wallFive.wallColour = "Black";

        Wall wallSix = new Wall();
        wallSix.wallId = 6;
        wallSix.wallType = "";
        wallSix.wallColour = "Black";

        Wall wallSeven = new Wall();
        wallSeven.wallId = 7;
        wallSeven.wallType = "";
        wallSeven.wallColour = "Purple";

        Wall wallEight = new Wall();
        wallEight.wallId = 8;
        wallEight.wallType = "";
        wallEight.wallColour = "Red";

        Wall wallNine = new Wall();
        wallNine.wallId = 9;
        wallNine.wallType = "";
        wallNine.wallColour = "Dark Green";

        Wall wallTen = new Wall();
        wallTen.wallId = 10;
        wallTen.wallType = "";
        wallTen.wallColour = "Dark Blue";

        Wall wallEleven = new Wall();
        wallEleven.wallId = 11;
        wallEleven.wallType = "";
        wallEleven.wallColour = "Black";

        Wall wallTwelve = new Wall();
        wallTwelve.wallId = 12;
        wallTwelve.wallType = "";
        wallTwelve.wallColour = "Black";

        Wall wallThirteen = new Wall();
        wallThirteen.wallId = 13;
        wallThirteen.wallType = "";
        wallThirteen.wallColour = "Purple";

        Wall wallFourteen = new Wall();
        wallFourteen.wallId = 14;
        wallFourteen.wallType = "";
        wallFourteen.wallColour = "Red";

        Wall wallFifteen = new Wall();
        wallFifteen.wallId = 15;
        wallFifteen.wallType = "";
        wallFifteen.wallColour = "Red";

        Wall[] walls = new Wall[15];

        walls[0] = wallOne;
        walls[1] = wallTwo;
        walls[2] = wallThree;
        walls[3] = wallFour;
        walls[4] = wallFive;
        walls[5] = wallSix;
        walls[6] = wallSeven;
        walls[7] = wallEight;
        walls[8] = wallNine;
        walls[9] = wallTen;
        walls[10] = wallEleven;
        walls[11] = wallTwelve;
        walls[12] = wallThirteen;
        walls[13] = wallFourteen;
        walls[14] = wallFifteen;

        for (Wall wall : walls) {
            System.out.println(wall.wallId);
            System.out.println(wall.wallType);
            System.out.println(wall.wallColour);
        }
    }
}