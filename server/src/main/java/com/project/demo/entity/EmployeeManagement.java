package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 员工管理：(EmployeeManagement)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "EmployeeManagement")
public class EmployeeManagement implements Serializable {

    // EmployeeManagement编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_management_id")
    private Integer employee_management_id;

    // 员工工号
    @Basic
    private String employee_id;
    // 员工姓名
    @Basic
    private String employee_name;
    // 员工性别
    @Basic
    private String employee_gender;
    // 所属部门
    @Basic
    private String department;
    // 部门职位
    @Basic
    private String department_position;
    // 员工照片
    @Basic
    private String employee_photo;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
