class 世界 {
  public static void main(String[] 参数) {
    大人 大白 = new 大人("大白", 30);
    小孩 小白 = new 小孩("小白", 5);
    
    大白.自我介绍();
    大白.生活();
    
    小白.自我介绍();
    小白.长大();
    System.out.println(小白.回答("这是咱俩的秘密"));
    System.out.println(小白.回答("你住哪里啊?"));
  }
}