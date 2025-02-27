package excercise1.ui.uitils;

import excercise1.sports.Sport;

public class GetSport {
  public static Sport get(int choice) {
    return switch (choice) {
      case 1 -> Sport.FOOTBALL;
      case 2 -> Sport.BASKETBALL;
      case 3 -> Sport.TENNIS;
      case 4 -> Sport.F1;
      case 5 -> Sport.MOTORCYCLE;
      default -> null;
    };
  }
}
