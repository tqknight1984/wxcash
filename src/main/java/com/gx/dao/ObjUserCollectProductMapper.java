package com.gx.dao;

import com.gx.model.ObjUserCollectProduct;
import com.gx.model.ObjUserCollectProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjUserCollectProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_collect_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int countByExample(ObjUserCollectProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_collect_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int deleteByExample(ObjUserCollectProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_collect_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_collect_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int insert(ObjUserCollectProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_collect_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int insertSelective(ObjUserCollectProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_collect_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    List<ObjUserCollectProduct> selectByExample(ObjUserCollectProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_collect_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    ObjUserCollectProduct selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_collect_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int updateByExampleSelective(@Param("record") ObjUserCollectProduct record, @Param("example") ObjUserCollectProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_collect_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int updateByExample(@Param("record") ObjUserCollectProduct record, @Param("example") ObjUserCollectProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_collect_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int updateByPrimaryKeySelective(ObjUserCollectProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user_collect_product
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int updateByPrimaryKey(ObjUserCollectProduct record);
}