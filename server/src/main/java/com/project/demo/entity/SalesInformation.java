package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 销售信息：(SalesInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "SalesInformation")
public class SalesInformation implements Serializable {

    // SalesInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sales_information_id")
    private Integer sales_information_id;

    // 销售信息
    @Basic
    private Integer sales_information;
    // 销售工号
    @Basic
    private String sales_job_number;
    // 销售姓名
    @Basic
    private String sales_name;
    // 订单编号
    @Basic
    private String order_no;
    // 车辆品牌
    @Basic
    private String vehicle_brand;
    // 车辆类型
    @Basic
    private String vehicle_type;
    // 车辆型号
    @Basic
    private String vehicle_model;
    // 车辆颜色
    @Basic
    private String vehicle_color;
    // 买家姓名
    @Basic
    private String buyers_name;
    // 买家电话
    @Basic
    private String buyer_phone;
    // 成交价格
    @Basic
    private String transaction_price;
    // 成交日期
    @Basic
    private Timestamp transaction_date;
    // 车辆图片
    @Basic
    private String vehicle_picture;
    // 备注详情
    @Basic
    private String note_details;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
