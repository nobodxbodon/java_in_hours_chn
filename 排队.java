class 排队 {
  public static void main(String[] 参数) {
    人[] 一队 = {new 人("小明",14), new 人("小红", 5), new 人("大黄", 12), new 人("阿牛", 9)};
    
    人[] 二队 = new 人[10];
    二队[0] = new 人("阿狗", 11);
    二队[1] = new 人("阿猫", 10);
    // 2空着
    二队[3] = new 人("阿猪", 9);
    
    java.util.Arrays.sort(一队, new java.util.Comparator<人>() {
      @Override
      public int compare(人 甲, 人 乙) {
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