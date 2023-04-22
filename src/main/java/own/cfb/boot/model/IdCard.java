package own.cfb.boot.model;

import java.io.Serializable;
import java.util.Date;

public class IdCard implements Serializable {

    private String idCard;//身份证号
    private String userName;//用户姓名
    private String nation;//民族
    private String address;//家庭地址
    private Date birthday;//出生日期
    private String sex;//性别
    private Date startDate;//开始日期
    private Date endDate;//结束日期
    private String frontImg;//正面照
    private String backImg;//身份证信息

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getFrontImg() {
        return frontImg;
    }

    public void setFrontImg(String frontImg) {
        this.frontImg = frontImg;
    }

    public String getBackImg() {
        return backImg;
    }

    public void setBackImg(String backImg) {
        this.backImg = backImg;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "idCard='" + idCard + '\'' +
                ", userName='" + userName + '\'' +
                ", nation='" + nation + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", frontImg='" + frontImg + '\'' +
                ", backImg='" + backImg + '\'' +
                '}';
    }
}
