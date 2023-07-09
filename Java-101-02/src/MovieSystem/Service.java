package MovieSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Service {

    private ArrayList<Film> films = new ArrayList<>();
    private ArrayList<Category> categories = new ArrayList<>();
    public Scanner scanner = new Scanner(System.in);
    public void login() {
        boolean running = true;
        while (running) {
            System.out.println("Welcome to Movie System\n" +
                    "Please Choose Credentials:\n" +
                    "1- Admin\n" +
                    "2- User\n" +
                    "3- Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Admin Menu\n" +
                            "1- Add Film\n" +
                            "2- Add Category\n" +
                            "3- Exit");
                    int choiceAdmin = scanner.nextInt();
                    switch (choiceAdmin) {
                        case 1:
                            System.out.println("-- Add Film --\n" +
                                    "Enter film title: ");
                            String title = scanner.nextLine();
                            System.out.println("Enter release year: ");
                            int releaseYear = Integer.valueOf(scanner.nextLine());
                            System.out.println("Enter platform: ");
                            String platform = scanner.nextLine();
                            System.out.println("Enter duration: ");
                            int duration = Integer.valueOf(scanner.nextLine());
                            System.out.println("Enter categories (Separate with only space): ");
                            String[] categories = scanner.nextLine().split(" ");
                            System.out.println("Film successfully added!");
                            this.films.add(new Film(title, releaseYear, platform, duration, categories));
                            break;
                        case 2:
                            System.out.println("-- Add Category --\n" +
                                    "Enter category name: ");
                            String name = scanner.nextLine();
                            System.out.println("Enter movie count: ");
                            int movieCount = Integer.valueOf(scanner.nextLine());
                            if (movieCount > 0) {
                                this.categories.add(new Category(name, movieCount));
                            }
                            else {
                                this.categories.add(new Category(name));
                            }
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Invalid input.");
                            break;
                    }
                    break;
                case 2:
                    boolean exit = false;
                    while (!exit) {
                        System.out.println("Welcome to Movie System!");
                        System.out.println("1- View Films\n" +
                                "2- View Categories" +
                                "3- Exit");
                        int userChoice = Integer.valueOf(scanner.nextLine());
                        switch (userChoice) {
                            case 1:
                                for (Film film : films) {
                                    System.out.println(film);
                                }
                                break;
                            case 2:
                                for (Category category : categories) {
                                    System.out.println(category);
                                }
                                break;
                            case 3:
                                exit = true;
                                break;
                            default:
                                System.out.println("Invalid input.");
                                break;
                        }
                    }
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
    }
}
