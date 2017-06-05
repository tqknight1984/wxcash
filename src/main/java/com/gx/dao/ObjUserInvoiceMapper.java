package com.gx.dao;

import com.gx.model.ObjUserInvoice;
import com.gx.model.ObjUserInvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjUserInvoiceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_invoice
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int countByExample(ObjUserInvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_invoice
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int deleteByExample(ObjUserInvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_invoice
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_invoice
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int insert(ObjUserInvoice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_invoice
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int insertSelective(ObjUserInvoice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_invoice
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    List<ObjUserInvoice> selectByExample(ObjUserInvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_invoice
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    ObjUserInvoice selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_invoice
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int updateByExampleSelective(@Param("record") ObjUserInvoice record, @Param("example") ObjUserInvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_invoice
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int updateByExample(@Param("record") ObjUserInvoice record, @Param("example") ObjUserInvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_invoice
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int updateByPrimaryKeySelective(ObjUserInvoice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_invoice
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int updateByPrimaryKey(ObjUserInvoice record);
}