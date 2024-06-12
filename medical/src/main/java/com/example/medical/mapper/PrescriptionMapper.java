package com.example.medical.mapper;

import com.example.medical.domain.Prescription;
import org.apache.ibatis.annotations.*;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface PrescriptionMapper {

    //根据序号和子序号查询处方
    @Select("SELECT * FROM prescription WHERE order_no = #{orderNo} AND sub_order_no = #{subOrderNo}")
    List<Prescription> findByOrderNoAndSubOrderNo(@Param("orderNo") String orderNo, @Param("subOrderNo") String subOrderNo);

    //根据主键id查询处方
    @Select("SELECT * FROM prescription WHERE id = #{id}")
    Prescription findById(@Param("id") Long id);

    //添加或更新处方
    @Insert("INSERT INTO prescription(order_no, sub_order_no, item_name, content, dosage) " +
            "VALUES(#{orderNo}, #{subOrderNo}, #{itemName}, #{prescriptionContent}, #{dosage}) " +
            "ON DUPLICATE KEY UPDATE item_name = #{itemName}, content = #{prescriptionContent}, dosage = #{dosage}")
    void saveOrUpdate(Prescription prescription);
}
