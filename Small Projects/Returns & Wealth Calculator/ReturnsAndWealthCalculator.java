import java.util.Scanner;

class ReturnsAndWealthCalculator {

  // declare static variables for sharing between methods
  static double currentWealth;
  static double targetWealth;
  static double rateOfReturn;
  static double monthlySavings;
  static double monthlyExpense;
  static int lifeExpectancy;
  static int retirementAge;

  public static void calculateWealthByYear(
    double currentWealth,
    double rateOfReturn,
    double monthlySavings,
    int years
  ) {
    double totalSavings = currentWealth;
    for (int year = 1; year <= years; year++) {
      double interest = totalSavings * (rateOfReturn / 100);
      totalSavings += interest + (monthlySavings * 12);
      System.out.printf(
        "\033[0;1;35m" + "Year %d: Total wealth = ฿%.2f%n",
        year,
        totalSavings
      );
    }
  }

  public static void calculateFinanciallyFree(
    double monthlyExpense,
    int lifeExpectancy,
    int retirementAge
  ) {
    targetWealth = monthlyExpense * 12 * (lifeExpectancy - retirementAge);
    if (currentWealth > targetWealth) {
      System.out.print("\033[0;1;35m" + "You are already financially free!");
    } else {
      double savingsNeeded = targetWealth - currentWealth;
      System.out.printf(
        "\033[0;1;35m" +
        "You need to save an additional ฿%.2f to become financially independent.",
        savingsNeeded
      );
      calculateYearsTillFreedom_No(
        currentWealth,
        rateOfReturn,
        monthlySavings,
        targetWealth
      );
    }
  }

  public static void calculateYearsTillFreedom_Yes(
    double currentWealth,
    double rateOfReturn,
    double monthlySavings,
    double targetWealth
  ) {
    double totalSavings = currentWealth;
    int yearsToFreedom = 0;
    while (totalSavings <= targetWealth) {
      yearsToFreedom++;
      double interest = totalSavings * (rateOfReturn / 100);
      totalSavings += interest + (monthlySavings * 12);
    }
    System.out.printf(
      "\033[0;1;35m" +
      "You will reach financial freedom in %d years! Keep grinding! %n",
      yearsToFreedom
    );
  }

  public static void calculateYearsTillFreedom_No(
    double currentWealth,
    double rateOfReturn,
    double monthlySavings,
    double targetWealth
  ) {
    double totalFinanciallyFree =
      (monthlySavings * 12) * (lifeExpectancy - retirementAge);
    double totalSavings = currentWealth;
    int yearsToFreedom = 0;
    while (totalSavings <= totalFinanciallyFree) {
      yearsToFreedom++;
      double interest = totalSavings * (rateOfReturn / 100);
      totalSavings += interest + (monthlySavings * 12);
    }
    System.out.printf(
      "\033[0;1;35m" +
      "\nYou will reach financial freedom in %d years! Keep grinding! %n",
      yearsToFreedom
    );
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(
      "\033[0;1;32m" +
      "Which program would you like to run?\n" +
      "\033[0;22m" +
      "Type '1' for returns or '2' for determining financial freedom: "
    );
    String prog = scanner.nextLine();
    try {
      System.out.print(
        "\033[0;1;32m" + "Your current wealth: " + "\033[0;22m" + "฿"
      );
      currentWealth = Double.parseDouble(scanner.nextLine().trim());
      System.out.print(
        "\033[0;1;32m" + "Estimated rate of return (%): " + "\033[0;22m"
      );
      rateOfReturn = Double.parseDouble(scanner.nextLine().trim());
      System.out.print(
        "\033[0;1;32m" +
        "How much can/could you save per month?\n" +
        "\033[0;22m" +
        "\033[30;43;1m" +
        " Formula " +
        "\033[0;22m" +
        "\033[33m" +
        " monthlySavingsPercentage = [(totalIncome / timeframeInMonths) - (totalExpenses / timeframeInMonths)] / totalIncome x 100\n" +
        "\033[30;43;1m" +
        " Note " +
        "\033[0;22m" +
        "\033[33m" +
        "    This savings percentage represents the proportion of your income that you" +
        "\033[0;3;33m" +
        " actually saved.\n" +
        "\033[0;22m" +
        "→ ฿"
      );
      monthlySavings = Double.parseDouble(scanner.nextLine().trim());

      if (prog.equals("1")) {
        System.out.print(
          "\033[0;1;32m" + "Investment period in years: " + "\033[0;22m"
        );
        int years = Integer.parseInt(scanner.nextLine());
        calculateWealthByYear(
          currentWealth,
          rateOfReturn,
          monthlySavings,
          years
        );
      } else if (prog.equals("2")) {
        System.out.print(
          "\033[0;1;32m" +
          "Do you know much money do you need to be financially free? (y/n): " +
          "\033[0;22m"
        );
        String responseFinanciallyFree = scanner.nextLine().trim();
        if (responseFinanciallyFree.equalsIgnoreCase("y")) {
          System.out.print(
            "\033[0;1;32m" + "If so, how much? " + "\033[0;22m" + "฿"
          );
          targetWealth = Double.parseDouble(scanner.nextLine().trim());
          calculateYearsTillFreedom_Yes(
            currentWealth,
            rateOfReturn,
            monthlySavings,
            targetWealth
          );
        } else if (responseFinanciallyFree.equalsIgnoreCase("n")) {
          System.out.print(
            "\033[30;43;1m" +
            " Formula " +
            "\033[0;22m" +
            "\033[33m" +
            " moneyNeededToBeFinanciallyFree = monthlyExpense x 12 months x (lifeExpectancy - retirementAge) years\n" +
            "\033[0;22m"
          );
          System.out.print(
            "\033[0;1m" + "What is your monthly expense? " + "\033[0;22m" + "฿"
          );
          monthlyExpense = Double.parseDouble(scanner.nextLine().trim());
          System.out.print(
            "\033[0;1m" +
            "What is your country's life expectancy? " +
            "\033[0;22m"
          );
          lifeExpectancy = scanner.nextInt();
          System.out.print(
            "\033[0;1m" + "At what age do you plan to retire? " + "\033[0;22m"
          );
          retirementAge = scanner.nextInt();
          if (retirementAge < 0 || retirementAge > 120) {
            System.out.println(
              "\033[0;41m" +
              "Invalid input: Retirement age must be between 0 and 120."
            );
          }
          calculateFinanciallyFree(
            monthlyExpense,
            lifeExpectancy,
            retirementAge
          );
        }
      } else {
        System.out.println(
          "\033[0;41m" + "Invalid input: Enter either '1' or '2'!"
        );
      }
    } catch (NumberFormatException e) {
      System.out.println("\033[0;41m" + "Invalid input: Enter numbers only!");
    }
    scanner.close();
    System.out.println(
      "\033[30;43;1m" +
      " Note " +
      "\033[0;22m" +
      "\033[33m" +
      " Use the results as a starting point for financial planning and consult with a financial advisor for personalized advice." +
      "\033[0;22m"
    );
  }
}
