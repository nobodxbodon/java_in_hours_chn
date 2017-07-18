class 投资回报类 {
  public static void main (String[] 参数) {
    float 账户余额 = 1000f;
    float 回报率 = 0.08f;

    // 第一年
    账户余额 = (1 + 回报率) * 账户余额;

    // 第二年
    账户余额 = (1 + 回报率) * 账户余额;

    // 第三年
    账户余额 = (1 + 回报率) * 账户余额;
    System.out.println("三年后变成" + 账户余额 + "元");
  }
}
