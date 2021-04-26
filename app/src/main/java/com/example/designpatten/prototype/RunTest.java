package com.example.designpatten.prototype;

/**
 * create by apple
 * create on 2021/4/26
 * description
 */
class RunTest {

    public static void main(String[] args) {

        //创建student对象并设置值
        Student student = new Student();
        student.setId(1);
        student.setName("小王");
        student.setGender("男");
        student.setArray(new int[] {0, 1, 2});

        //打印student信息，包括对象地址
        System.out.println(student.getId()+"");
        System.out.println(student.getName());
        System.out.println(student.getGender());
        System.out.println(student.getArray());
        System.out.println(student);

        //克隆出student2并打印信息，包括对象地址
        //clone方法需要抛出CloneNotSupportedException异常
        try {
            Student student2 = student.clone();

            System.out.println(student2.getId()+"");
            System.out.println(student2.getName());
            System.out.println(student2.getGender());
            System.out.println(student2.getArray());
            System.out.println(student2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
