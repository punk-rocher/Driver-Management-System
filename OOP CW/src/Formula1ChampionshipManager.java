import java.io.*;
import java.util.Scanner;


public class Formula1ChampionshipManager implements ChampionshipManager {

    public void createDriver(Formula1Driver[] arr) {

        for (int x = 0; x < arr.length; x++) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the driver name : ");
            String driverName = input.next();

            System.out.println("Enter the driver location: ");
            String location = input.next();

            System.out.println("Enter the driver team: ");
            String team = input.next();

            System.out.println("Enter the current points: ");
            int CurrentPoints = input.nextInt();

            System.out.println("How many races do driver participated: ");
            int participatedRaces = input.nextInt();

            System.out.println("How many first positions do driver achieved: ");
            int firstPosition = input.nextInt();

            System.out.println("How many second positions do driver achieved: ");
            int secondPosition = input.nextInt();

            System.out.println("How many third positions do driver achieved: ");
            int thirdPosition = input.nextInt();

            arr[x] = new Formula1Driver(driverName, location, team, CurrentPoints, firstPosition, secondPosition, thirdPosition, participatedRaces);

        }
    }

    public void deleteDriver(Formula1Driver[] arr) {

        System.out.println("Driver Names are");
        for (int i = 0; i < arr.length; i++){

            System.out.println(" Driver " + i + " Named by : " + arr[i].getDriverName());
        }

        Scanner input = new Scanner(System.in);
        String deldriver;
        System.out.println("Enter the  driver name want to delete:");
        deldriver = input.next();
        int driverpo = 0;
        boolean examining = false;

        for (int x = 0; x < arr.length; x++) {
            if (deldriver.equals(arr[x].getDriverName())) {

                driverpo =x;

                arr[driverpo].setLocation("");
                arr[driverpo].setTeam("");
                arr[driverpo].setCurrentPoints(0);
                arr[driverpo].setParticipatedRaces(0);
                arr[driverpo].setFirstPosition(0);
                arr[driverpo].setParticipatedRaces(0);

                System.out.println(" driver in list  " + x);
                examining = true;
            }
        }
        if (!examining) {
            System.out.println("There are no driver on that name \n Please enter the correct name again ! \n");
        }
    }

    public void changeDriver() {







    }

    public void exstatsDriver() {










    }

    public void displaydriverStats(Formula1Driver[] arr ) {

        for (int x = 0; x < arr.length; x++) {

            System.out.println();
            System.out.println(" Driver " + x + " Named by : " + arr[x].getDriverName());
            System.out.println(" Driver " + x + " Location by : " + arr[x].getLocation());
            System.out.println(" Driver " + x + " teamed by : " + arr[x].getTeam());
            System.out.println(" Driver " + x + " Current points : " + arr[x].getCurrentPoints());
            System.out.println(" Driver " + x + " Races the driver participated: " + arr[x].getParticipatedRaces());
            System.out.println(" Driver " + x + " First places archived : " + arr[x].getFirstPosition());
            System.out.println(" Driver " + x + " Second places archived: " + arr[x].getSecondPosition());
            System.out.println(" Driver " + x + " Third places archived : " + arr[x].getThirdPosition());
            System.out.println();

        }
    }

    public void addaRace() {









    }

    public void storeProgram(Formula1Driver[] arr) {

        try (PrintWriter out = new PrintWriter(new FileWriter(  "E:\\driver.txt"))) {
            int x;
            for (x = 0; x < arr.length; x++) {

                out.println(" Driver name : " + arr[x].getDriverName() + "at: " + x);
                out.println(" Driver Location :" + arr[x].getLocation());
                out.println(" Driver Team : " + arr[x].getTeam());
                out.println(" Driver Current Position: " + arr[x].getCurrentPoints());
                out.println(" Races the driver participated: " + arr[x].getParticipatedRaces());
                out.println(" Driver First Position Archived: " + arr[x].getFirstPosition());
                out.println(" Driver Second Position Archived: " + arr[x].getSecondPosition());
                out.println(" Driver Third Position Archived: " + arr[x].getThirdPosition());
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("All drivers have been Saved.");
    }


    public void loadPrograme(Formula1Driver[]arr) {

        try {

            File myObj = new File("E:\\driver.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }

        catch (FileNotFoundException e) {
            System.out.println(" Error .");
            e.printStackTrace();
        }
    }
}
