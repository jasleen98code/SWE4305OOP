import java.util.ArrayList;
import java.util.Scanner;

public class FootballLeague {
    private ArrayList<Game> games;

    public FootballLeague() {
        games = new ArrayList<>();
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public void getTeamPerformance(String team) {
        int wins = 0, losses = 0, draws = 0;

        for (Game game : games) {
            boolean isHome = game.getHomeTeam().equalsIgnoreCase(team);
            boolean isAway = game.getAwayTeam().equalsIgnoreCase(team);

            if (!isHome && !isAway) continue;

            int scored = isHome ? game.getHomeScore() : game.getAwayScore();
            int conceded = isHome ? game.getAwayScore() : game.getHomeScore();

            if (scored > conceded) {
                wins++;
            } else if (scored < conceded) {
                losses++;
            } else {
                draws++;
            }
        }
        System.out.println("Team: " + team);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
    }

    public  void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nFootball League System");
            System.out.println("1. Add Game");
            System.out.println("2. Team Performance");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter home team: ");
                    String home = scanner.nextLine();
                    System.out.print("Enter away team: ");
                    String away = scanner.nextLine();
                    System.out.print("Enter home score: ");
                    int homeScore = scanner.nextInt();
                    System.out.print("Enter away score: ");
                    int awayScore = scanner.nextInt();
                    addGame(new Game(home, away, homeScore, awayScore));
                    break;

                case 2:
                    System.out.print("Enter team name: ");
                    String team = scanner.nextLine();
                    getTeamPerformance(team);
                    break;
                case 0:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
