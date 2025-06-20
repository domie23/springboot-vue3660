package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 客户信息：(CustomerInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CustomerInformation")
public class CustomerInformation implements Serializable {

    // CustomerInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_information_id")
    private Integer customer_information_id;

    // 销售信息
    @Basic
    private Integer sales_information;
    // 销售工号
    @Basic
    private String sales_job_number;
    // 销售姓名
    @Basic
    private String sales_name;
    // 客户姓名
    @Basic
    private String customer_name;
    // 客户性别
    @Basic
    private String customer_gender;
    // 客户年龄
    @Basic
    private String customer_age;
    // 客户电话
    @Basic
    private String customer_telephone;
    // 意向车型
    @Basic
    private String intended_model;
    // 意向详情
    @Basic
    private String details_of_intention;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
