import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String args[])  //static method
    {
        int app = 1;
        String[] fileArray = null;
        Scanner sc= new Scanner(System.in);
        while (app == 1) {
            System.out.println("This is an application for the assignment1, for Company Lockers Pvt. Ltd. This project is called LockedMe.com");
            System.out.println("This application is developed by Karahan Tatlıdede");
            System.out.println("This application will display the information based on user interaction");
            System.out.print("Enter 1 if you want to display the current files, enter 2 if you want to display the details of the user interface, or enter 3 if you want to close the application");
            int a = sc.nextInt();

            if(a == 1){
                System.out.println("This screen will display the current files");
                System.out.println(fileArray);
                break;
            }

            if(a == 2){
                System.out.println("In this section, user has the options to add a file, delete a file, search for file or option to navigate to the main context");
                System.out.println("Enter 1 for add a file, enter 2 for delete a user, enter 3 for search a user, enter 4 for navigate to main context");
                int b = sc.nextInt();
                if (b == 1){
                    System.out.println("Enter a file you want to add");
                    String str = sc.nextLine();
                    fileArray[0] = str;
                    Arrays.stream(fileArray).sorted();
                    break;
                }
                if (b == 2){
                    System.out.println("Enter the user you want to delete");
                    String user = sc.nextLine();
                    user.toLowerCase(Locale.ROOT);
                    for(int i = 0; i<fileArray.length; i++){
                        if(fileArray[i].toLowerCase()==user){
                            fileArray[i] = null;
                        }
                    }
                    Arrays.stream(fileArray).sorted();
                    break;
                }

                if(b == 3){
                    System.out.println("Enter the user you want to find");
                    String user = sc.nextLine();
                    user.toLowerCase(Locale.ROOT);
                    int x = -1;
                    for(int i = 0; i<fileArray.length; i++){
                        if(fileArray[i].toLowerCase()==user){
                            x = i;
                        }
                    }
                    if(x !=-1){
                        System.out.println("Successful operation!");
                    }
                    else if(x ==-1){
                        System.out.println("Unsuccessful operation!");
                    }
                    break;
                }

                if(b == 4){
                    System.out.println("You are directed to the main context.");
                    break;
                }
                else {
                    System.out.println("You have entered a wrong input, please try again.");
                    break;
                }
            }

            if(a==3){
                System.out.println("Application closed, have a nice day");
                app = 0;
                break;
            }

            else {
                System.out.println("You have entered a wrong input, please try again.");
                break;
            }
        }
    }
}
