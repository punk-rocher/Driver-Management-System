import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Formula1ChampionshipManager method = new Formula1ChampionshipManager();

        Scanner scann = new Scanner(System.in);
        System.out.println("How many drivers participating in to the season : ");
        int NumofDrivers = scann.nextInt();


        Formula1Driver[] arr = new Formula1Driver[NumofDrivers];


        while (true) {

            System.out.println("<<<<<<<<       Formula 1 racing car championship       >>>>>>>>");
            System.out.println("<<<<<<<< - - - - - - - - - - >>>>>>>>\n");
            System.out.println("A: Create a new driver" + ".");
            System.out.println("D: Delete the driver.");
            System.out.println("C: Change the driver.");
            System.out.println("B: Display statistics of the existing driver. ");
            System.out.println("E: Display the all drivers statistics.");
            System.out.println("R: Add a race.");
            System.out.println("S: Store program data in to file.");
            System.out.println("L: Load program data from file.\n");
            System.out.println("<<<<<<<< - - - - - - - - - - >>>>>>>>\n");

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter to Get stared -: ");

            char menu = scan.next().charAt(0);

            switch (menu) {
                case 'A':
                case 'a':
                    method.createDriver(arr);
                    break;
                case 'D':
                case 'd':
                    method.deleteDriver(arr);
                    break;
                case 'C':
                case 'c':
                    method.changeDriver();
                    break;
                case 'B':
                case 'b':
                    method.exstatsDriver();
                    break;
                case 'E':
                case 'e':
                    method.displaydriverStats(arr);
                    break;
                case 'R':
                case 'r':
                    method.addaRace();
                    break;
                case 'S':
                case 's':
                    method.storeProgram(arr);
                    break;
                case 'L':
                case 'l':
                    method.loadPrograme(arr);
                    break;
                default:
                    System.out.println(" Invalid Character ");
                    break;
            }
        }
    }
}
