package sk.araed.aoc.aoc2025;


public class Day4 {

  public static void main(String[] args) {
    Day4 day4 = new Day4();
    char[][] input = AocHelper.readInputToMat("/day4.input");
    System.out.println("day4(1) = " + day4.runPart1(input));
    System.out.println("day4(2) = " + day4.runPart2(input));
  }

  private long runPart1(final char[][] input) {
    int count = 0;
    for (int c = 0; c < input.length; c++) {
      for (int r = 0; r < input[0].length; r++) {
        count += (isMoveable(input, c, r) ? 1 : 0);
      }
    }
    return count;
  }

  private long runPart2(final char[][] input) {
    return 0;
  }

  private boolean isMoveable(char[][] input, int c, int r) {
    int sibCount = 0;
    int maxC = input.length - 1;
    int maxR = input[0].length - 1;
    if (input[r][c] == '.') {
      return false;
    }
    //<
    sibCount += (c > 0 && input[r][c - 1] == '@' ? 1 : 0);
    //>
    sibCount += (c < maxC && input[r][c + 1] == '@' ? 1 : 0);
    //^
    sibCount += (r > 0 && input[r - 1][c] == '@' ? 1 : 0);
    //v
    sibCount += (r < maxR && input[r + 1][c] == '@' ? 1 : 0);
    //^<
    sibCount += (c > 0 && r > 0 && input[r - 1][c - 1] == '@' ? 1 : 0);
    //v<
    sibCount += (c > 0 && r < maxR && input[r + 1][c - 1] == '@' ? 1 : 0);
    //^>
    sibCount += (c < maxC && r > 0 && input[r - 1][c + 1] == '@' ? 1 : 0);
    //v>
    sibCount += (c < maxC && r < maxR && input[r + 1][c + 1] == '@' ? 1 : 0);
    return sibCount < 4;
  }





}
