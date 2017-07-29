class 人测试类 {
  public static void main (String[] 参数) throws 听不懂例外 {
    人类 无名 = new 人类("", -1);
    应该相等("我记住了", 无名.回答("秘密哦"), "秘密应该记住");
    应该相等("你猜? 答案长度是3", 无名.回答("?"), "遇到问题就让猜秘密");
    System.out.println("测试通过");
  }
  
  private static void 应该相等(Object 期望值, Object 实际值, String 反馈信息) {
    assert 实际值.equals(期望值) : 反馈信息 + ", 但是实际值是: \"" +实际值 + "\"而期望值是: \"" + 期望值 + "\"";
  }
}
