import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simulate login
        System.out.println("Welcome to Task Management System!");
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (!username.equals("Lauren") || !password.equals("FLAPACHA")) {
            System.out.println("Invalid username or password. Exiting...");
            return;
        }

        System.out.println("\nWelcome, Lauren!");

        // Create a new project
        System.out.print("Enter the name of the new project: ");
        String projectName = scanner.nextLine();

        // Initialize the system and project
        TaskManagementSystem taskManagementSystem = new TaskManagementSystem(
            "Task Management",
            new TeamMembers[]{}, // No team members yet
            "Lauren"
        );

        System.out.println("\nProject '" + projectName + "' created successfully!");

        // Add team members
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter name for team member " + i + ": ");
            String teamMemberName = scanner.nextLine();
            System.out.print("Enter email for " + teamMemberName + ": ");
            String teamMemberEmail = scanner.nextLine();

            TeamMembers newMember = new TeamMembers(teamMemberName, teamMemberEmail);
            taskManagementSystem.addTeamMember(newMember);
            System.out.println(teamMemberName + " has been added to the team.");
        }

        // Assign the project to a team member
        System.out.println("\nTeam Members:");
        int index = 1;
        for (TeamMembers member : taskManagementSystem.getTeamMembers()) {
            System.out.println(index++ + ". " + member.getUsername());
        }
        System.out.print("\nEnter the number of the team member to assign the project to: ");
        int memberChoice = scanner.nextInt();
        scanner.nextLine(); // Clear newline

        TeamMembers chosenMember = taskManagementSystem.getTeamMembers().get(memberChoice - 1);
        System.out.println("Project assigned to " + chosenMember.getUsername() + ".");

        // Set project priority
        System.out.print("\nIs this project a top priority? (yes/no): ");
        String priorityInput = scanner.nextLine();
        boolean isTopPriority = priorityInput.equalsIgnoreCase("yes");
        System.out.println("Priority set: " + (isTopPriority ? "Top Priority" : "Normal Priority"));

        // Menu for further actions
        while (true) {
            System.out.println("\nWhat would you like to do next?");
            System.out.println("1. Update project or team");
            System.out.println("2. Remove a team member");
            System.out.println("3. Add a new project");
            System.out.println("4. Delete current project");
            System.out.println("5. Add a new team member to the project");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear newline

            switch (choice) {
                case 1:
                    System.out.println("Updating project or team... (This is a placeholder)");
                    break;
                case 2:
                    System.out.println("Removing a team member...");
                    System.out.println("Team Members:");
                    index = 1;
                    for (TeamMembers member : taskManagementSystem.getTeamMembers()) {
                        System.out.println(index++ + ". " + member.getUsername());
                    }
                    System.out.print("\nEnter the number of the team member to remove: ");
                    int removeChoice = scanner.nextInt();
                    scanner.nextLine(); // Clear newline
                    TeamMembers removedMember = taskManagementSystem.getTeamMembers().remove(removeChoice - 1);
                    System.out.println(removedMember.getUsername() + " has been removed from the team.");
                    break;
                case 3:
                    System.out.print("Enter the name of the new project: ");
                    String newProjectName = scanner.nextLine();
                    System.out.println("New project '" + newProjectName + "' created successfully!");
                    break;
                case 4:
                    System.out.println("Deleting current project... (This is a placeholder)");
                    break;
                case 5:
                    System.out.print("Enter the name of the new team member: ");
                    String newMemberName = scanner.nextLine();
                    System.out.print("Enter email for " + newMemberName + ": ");
                    String newMemberEmail = scanner.nextLine();
                    TeamMembers additionalMember = new TeamMembers(newMemberName, newMemberEmail);
                    taskManagementSystem.addTeamMember(additionalMember);
                    System.out.println(newMemberName + " has been added to the project.");
                    break;
                case 6:
                    System.out.println("Exiting Task Management System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
