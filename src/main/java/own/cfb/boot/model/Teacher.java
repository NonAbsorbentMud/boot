package own.cfb.boot.model;

import java.io.Serializable;

public class Teacher implements Serializable {
    private Integer teaCode;
    private String teaName;

    public Integer getTeaCode() {
        return teaCode;
    }

    public void setTeaCode(Integer teaCode) {
        this.teaCode = teaCode;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teaCode=" + teaCode +
                ", teaName='" + teaName + '\'' +
                '}';
    }
}
