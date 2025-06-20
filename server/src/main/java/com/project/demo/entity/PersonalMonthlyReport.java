package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 个人月报：(PersonalMonthlyReport)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "PersonalMonthlyReport")
public class PersonalMonthlyReport implements Serializable {

    // PersonalMonthlyReport编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personal_monthly_report_id")
    private Integer personal_monthly_report_id;

    // 工作月份
    @Basic
    private String working_month;
    // 销售信息
    @Basic
    private Integer sales_information;
    // 销售工号
    @Basic
    private String sales_job_number;
    // 销售姓名
    @Basic
    private String sales_name;
    // 任务数量
    @Basic
    private String number_of_tasks;
    // 完成数量
    @Basic
    private String completed_quantity;
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
