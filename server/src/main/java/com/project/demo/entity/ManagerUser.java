package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 经理用户：(ManagerUser)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ManagerUser")
public class ManagerUser implements Serializable {

    // ManagerUser编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manager_user_id")
    private Integer manager_user_id;

    // 经理工号
    @Basic
    private String manager_job_number;
    // 经理姓名
    @Basic
    private String manager_name;
    // 经理性别
    @Basic
    private String manager_gender;












    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;


    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
