package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 销量报表：(SalesReport)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "SalesReport")
public class SalesReport implements Serializable {

    // SalesReport编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sales_report_id")
    private Integer sales_report_id;

    // 经理信息
    @Basic
    private Integer manager_information;
    // 经理工号
    @Basic
    private String manager_job_number;
    // 经理姓名
    @Basic
    private String manager_name;
    // 工作月份
    @Basic
    private String working_month;
    // 任务数量
    @Basic
    private String number_of_tasks;
    // 完成数量
    @Basic
    private String completed_quantity;
    // 热门车型
    @Basic
    private String popular_models;
    // 冷门车型
    @Basic
    private String cold_door_model;
    // 营业额度
    @Basic
    private String business_limit;
    // 工作总结
    @Basic
    private String work_summary;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
