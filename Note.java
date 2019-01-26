package t06;


import java.util.Scanner;

public class Note {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        NoteData list = new NoteData();
        printMenu();
        int menuChoice = scan.nextInt();
        while (menuChoice != 0) {
            switch (menuChoice) {
                case 1:
                    System.out.println(" Please enter a task to add");
                    scan.nextLine();
                    String task1 = scan.nextLine();
                    System.out.println(" Please enter a date to add");
                    String date1 = scan.nextLine();
                    list.addMessage(task1, date1);
                    System.out.println(" Please enter your choice 0- 4");
                    menuChoice = scan.nextInt();
                    break;
                case 2:
                    System.out.println(" Please enter a task to delete");
                    scan.nextLine();
                    String task2 = scan.nextLine();
                    list.deleteMessage(task2);
                    System.out.println(" Please enter your choice 0- 4");
                    menuChoice = scan.nextInt();
                    break;
                case 3:
                    System.out.println(" Please enter a task to edit");
                    scan.nextLine();
                    int i = scan.nextInt();
                    String task3 = scan.nextLine();
                    list.editMessage(i, task3);
                    System.out.println(" Please enter your choice 0- 4");
                    menuChoice = scan.nextInt();
                    break;
                case 4:
                    list.print();
                    System.out.println("Please enter your choice 0- 4");
                    menuChoice = scan.nextInt();
                    break;
                default:
                    menuChoice = 0;
            }


        }
    }


    public static void printMenu() {

        System.out.println("Choose the option:\n" +
                "1 - add  \n" +
                "2 - delete \n" +
                "3 - edit \n" +
                "4 - print \n" +
                "0 - exit " +
                "After your choice press ENTER4"

        );
    }
}