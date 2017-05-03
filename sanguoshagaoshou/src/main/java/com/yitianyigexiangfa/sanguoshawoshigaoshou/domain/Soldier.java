package com.yitianyigexiangfa.sanguoshawoshigaoshou.domain;

/**
 * Created by liubei on 2017/5/3.
 */
public class Soldier {
    private String uid;
    private int packageId;
    private String name;
    private String countryId;
    private String sex;
    private int bloodPoint;
    private String magicIds;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getBloodPoint() {
        return bloodPoint;
    }

    public void setBloodPoint(int bloodPoint) {
        this.bloodPoint = bloodPoint;
    }

    public String getMagicIds() {
        return magicIds;
    }

    public void setMagicIds(String magicIds) {
        this.magicIds = magicIds;
    }

//    @Override
//    public String toString() {
//        return "Soldier{" +
//                "uid='" + uid + '\'' +
//                ", packageId=" + packageId +
//                ", name='" + name + '\'' +
//                ", countryId='" + countryId + '\'' +
//                ", sex='" + sex + '\'' +
//                ", bloodPoint=" + bloodPoint +
//                ", magicIds='" + magicIds + '\'' +
//                '}';
//    }
}
