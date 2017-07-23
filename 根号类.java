class 根号类 {
  public static void main (String[] 参数) {
    int 数 = 0;
    try {
      数 = Integer.parseInt(参数[0]);
      System.out.println(数 + "的平方根是" + Math.sqrt(数));
    } catch (NumberFormatException e) {
      System.out.println(参数[0] + "看着不像整数");
      return;
    } finally {
      System.out.println("彩蛋");
    }
  }
}