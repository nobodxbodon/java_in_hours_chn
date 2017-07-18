class 排队类 {
  public static void main(String[] 参数) {
    人类[] 一队 = {
      new 人类("小明", 14),
      new 人类("小红", 5),
      new 人类("大黄", 12),
      new 人类("阿牛", 9)
    };
    
    人类[] 二队 = new 人类[10];
    二队[0] = new 人类("阿狗", 11);
    二队[1] = new 人类("阿猫", 10);
    // 2空着
    二队[3] = new 人类("阿猪", 9);
    
    java.util.Arrays.sort(一队, new java.util.Comparator<人类>() {
      @Override
      public int compare(人类 甲, 人类 乙) {
        return 甲.年龄 - 乙.年龄;
      }
    });
    
    for (int 序号 = 0; 序号 < 一队.length; 序号++) {
      if (一队[序号] != null) {
        一队[序号].自我介绍();
      }
    }
  }
}