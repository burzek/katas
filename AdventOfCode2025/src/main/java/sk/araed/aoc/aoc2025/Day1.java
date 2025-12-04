package sk.araed.aoc.aoc2025;


public class Day1 {

  public static void main(String[] args) {
    Day1 day1 = new Day1();
    String[] input = AocHelper.readInputToLines("/day1.input");
    System.out.println("day1(1) = " + day1.runPart1(input));
    System.out.println("day1(2) = " + day1.runPart2(input));
  }

  private long runPart1(final String[] input) {
    int val = 50;
    int pwd = 0;
    for (String line : input) {
      boolean left = line.charAt(0) == 'L';
      int tick = Integer.parseInt(line.substring(1));
      val = left ? (val - tick) : (val + tick);
      val = (val < 0 ? 100 + ( val % 100) : val);
      val = (val >= 100 ? val % 100 : val);
      pwd += (val == 0 ? 1 : 0);
      System.out.printf("%s : %d%n", line, val);
    }
    return pwd;
  }

  private long runPart2(final String[] input) {
    int val = 50;
    int pwd = 0;
    for (String line : input) {
      boolean left = line.charAt(0) == 'L';
      int tick = Integer.parseInt(line.substring(1));
      val = left ? (val - tick) : (val + tick);
      pwd += (val < 0 ? 1 + Math.abs(val / 100) : 0);
      pwd += (val > 100 ? Math.abs(val / 100) : 0);

      val = (val < 0 ? 100 + ( val % 100) : val);
      val = (val >= 100 ? val % 100 : val);
      pwd += (val == 0 ? 1 : 0);
      System.out.printf("%s : %d%n", line, val);
    }
    return pwd;
  }





}
