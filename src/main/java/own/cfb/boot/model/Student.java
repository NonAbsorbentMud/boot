package own.cfb.boot.model;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer stuCode;//学生编号
    private String stuName;//学生名称
    private Integer teaCode;//教师编号

    public Integer getStuCode() {
        return stuCode;
    }

    public void setStuCode(Integer stuCode) {
        this.stuCode = stuCode;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getTeaCode() {
        return teaCode;
    }

    public void setTeaCode(Integer teaCode) {
        this.teaCode = teaCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuCode=" + stuCode +
                ", stuName='" + stuName + '\'' +
                ", teaCode=" + teaCode +
                '}';
    }
}
