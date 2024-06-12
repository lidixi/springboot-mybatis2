package com.example.medical.mapper;

import com.example.medical.domain.MedicalOrder;

import org.apache.ibatis.annotations.*;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface MedicalOrderMapper {

    //根据序号和指定时间查询所在时间段的医嘱
    @Select("SELECT * FROM medical_order WHERE order_no = #{orderNo} AND start_time <= #{time} AND end_time >= #{time}")
    List<MedicalOrder> findByOrderNoAndTime(@Param("orderNo") String order_no, @Param("time") LocalDateTime time);

    //根据主键id查询医嘱
    @Select("SELECT * FROM medical_order WHERE id = #{id}")
    MedicalOrder findById(@Param("id") Long id);

    //增加或更新医嘱
    @Insert("INSERT INTO medical_order(order_no, sub_order_no, medical_content, start_time, end_time) " +
            "VALUES(#{orderNo}, #{subOrderNo}, #{medicalContent}, #{startTime}, #{endTime}) " +
            "ON DUPLICATE KEY UPDATE medical_content = #{medicalContent}, start_time = #{startTime}, end_time = #{endTime}")
    boolean saveOrUpdate(MedicalOrder medicalOrder);

    //模糊查询医嘱内容
    @Select("SELECT * FROM medical_order WHERE medical_content LIKE CONCAT('%', #{medicalContent}, '%')")
    List<MedicalOrder> findByContentLike(@Param("medicalContent") String medicalContent);

    //查询所有医嘱
    @Select("SELECT * FROM medical_order")
    List<MedicalOrder> findAll();
}
