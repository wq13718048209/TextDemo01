package com.zgcw.wangqiang.myapplication;

/**
 * Created by wangqiang on 16/5/17.
 */
public class Dog implements Pet {

    private int id;
    private String name;


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

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (id != dog.id) return false;
        return name != null ? name.equals(dog.name) : dog.name == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public Dog() {
    }

    public Dog(int id, String name) {
        this.id = id;
        this.name = name;
    }



    @Override
    public void play() {

    }
}
