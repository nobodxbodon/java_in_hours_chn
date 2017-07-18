class 投资回报循环类 {
  public static void main (String[] 参数) {
    float 账户余额 = 1000f;
    float 回报率 = 0.08f;
    int 年限 = 20;
    int 年份 = 0;
    
    while (年份 < 年限) {
      if (账户余额 > 2000) {
        break;
      }
      年份 = 年份 + 1;
      账户余额 = (1 + 回报率) * 账户余额;
    }
    System.out.println(年份 + "年后变成" + 账户余额 + "元");
  }
}
