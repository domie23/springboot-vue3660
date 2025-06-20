package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 销售用户：(SalesUser)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "SalesUser")
public class SalesUser implements Serializable {

    // SalesUser编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sales_user_id")
    private Integer sales_user_id;

    // 销售工号
    @Basic
    private String sales_job_number;
    // 销售姓名
    @Basic
    private String sales_name;
    // 销售性别
    @Basic
    private String sales_gender;












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
