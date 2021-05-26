package com.java.pojo;

/**
 * @ClassName Emp
 * @Description:
 * @Author :lmk
 * @Date 2021/5/23
 * @Version V1.0
 **/
public class Emp {
    private Long id;
    private String empName;
    private float salary;
    private String profession;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", profession='" + profession + '\'' +
                '}';
    }
}