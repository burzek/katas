package sk.araed.aoc.aoc2025;


public class Day3 {

  public static void main(String[] args) {
    Day3 day3 = new Day3();
    String[] input = AocHelper.readInputToLines("/day3.input");
    System.out.println("day1(1) = " + day3.runPart1(input));
    System.out.println("day1(2) = " + day3.runPart2(input));
  }

  private long runPart1(final String[] input) {
    int sum = 0;

    for (String line : input) {
      int i = 0;
      int pos = 0;
      while (i < line.length()) {
        if (line.charAt(i) > line.charAt(pos) && i < line.length() - 1) {
          pos = i;
        }
        i++;
      }

      int pos2 = pos + 1;
      i = pos + 1;
      while (i < line.length()) {
        if (line.charAt(i) > line.charAt(pos2)) {
          pos2 = i;
        }
        i++;
      }
      sum += (10 * (line.charAt(pos) - '0') + (line.charAt(pos2) - '0'));
    }
    return sum;
  }

  private long runPart2(final String[] input) {
    long count = 0;
    return count;
  }





}
