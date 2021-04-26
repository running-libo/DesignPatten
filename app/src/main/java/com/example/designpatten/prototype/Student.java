package com.example.designpatten.prototype;

/**
 * create by apple
 * create on 2021/4/26
 * description
 */

import androidx.annotation.NonNull;

/**
 * 需要进行克隆的类需要实现Cloneable
 */
class Student implements Cloneable {
    private int id;
    private String name;
    private String gender;
    private int[] array;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    /**
     * 重写clone方法，返回类型转为当前类
     * @return
     * @throws CloneNotSupportedException
     */
//    @NonNull
//    @Override
//    protected Student clone() throws CloneNotSupportedException {
//        return (Student) super.clone();
//    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        //要实现深克隆，需要重新创建一个数组对象，将原数组的值循环赋值给新数组
        Student student = (Student) super.clone();
        int[] array = new int[student.getArray().length];
        for (int i=0;i<array.length;i++) {
            array[i] = student.getArray()[i];
        }
        student.setArray(array);
        return student;
    }
}
