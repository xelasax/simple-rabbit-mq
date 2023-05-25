package cc.alkkoomson.springrabbittemplate.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

@JsonSerialize
public class MallonDTO implements Serializable {
    public static final long serialVersionUID = 1L;

    public MallonDTO() {
    }

    public MallonDTO(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private String name;
    private String age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "MallonDTO{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
