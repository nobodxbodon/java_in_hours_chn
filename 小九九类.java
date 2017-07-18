import java.util.HashMap;

/**
 * 运行示例
 * $ java 小九九 6 4
 * 6乘4得24
 */
class 小九九类 {
  private static final HashMap<String, Integer> 乘法表 = new HashMap<>();
  
  // 构建整个乘法表, 包括反序, 比如2_8和8_2都有
  static {
    for (int 数一 = 1; 数一 < 10; 数一++) {
      for (int 数二 = 1; 数二 < 10; 数二++) {
        乘法表.put(数一 + "" + 数二, 数一 * 数二);
      }
    }
  }
  
  public static void main(String[] 参数) {
    String 数一 = 参数[0];
    String 数二 = 参数[1];
    System.out.println(数一 + "乘" + 数二 + "得" + 乘法表.get(数一 + 数二));
  }
}