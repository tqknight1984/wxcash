package com.gx.dao;

import com.gx.model.ObjUserComplaintProduct;
import com.gx.model.ObjUserComplaintProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjUserComplaintProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_complaint_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int countByExample(ObjUserComplaintProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_complaint_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int deleteByExample(ObjUserComplaintProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_complaint_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_complaint_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int insert(ObjUserComplaintProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_complaint_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int insertSelective(ObjUserComplaintProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_complaint_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    List<ObjUserComplaintProduct> selectByExample(ObjUserComplaintProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_complaint_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    ObjUserComplaintProduct selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_complaint_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int updateByExampleSelective(@Param("record") ObjUserComplaintProduct record, @Param("example") ObjUserComplaintProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_complaint_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int updateByExample(@Param("record") ObjUserComplaintProduct record, @Param("example") ObjUserComplaintProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_complaint_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int updateByPrimaryKeySelective(ObjUserComplaintProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_complaint_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int updateByPrimaryKey(ObjUserComplaintProduct record);
}