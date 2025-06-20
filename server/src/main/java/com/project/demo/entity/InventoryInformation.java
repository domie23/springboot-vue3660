package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 库存信息：(InventoryInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "InventoryInformation")
public class InventoryInformation implements Serializable {

    // InventoryInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_information_id")
    private Integer inventory_information_id;

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
    // 库存数量
    @Basic
    private Integer inventory_quantity;
    // 存放位置
    @Basic
    private String storage_location;
    // 车辆图片
    @Basic
    private String vehicle_picture;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
