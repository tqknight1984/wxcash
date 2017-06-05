package com.gx.dao;

import com.gx.model.ObjIndUser;
import com.gx.model.ObjIndUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjIndUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_ind_user
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int countByExample(ObjIndUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_ind_user
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int deleteByExample(ObjIndUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_ind_user
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int deleteByPrimaryKey(Long uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_ind_user
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int insert(ObjIndUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_ind_user
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int insertSelective(ObjIndUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_ind_user
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    List<ObjIndUser> selectByExample(ObjIndUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_ind_user
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    ObjIndUser selectByPrimaryKey(Long uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_ind_user
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int updateByExampleSelective(@Param("record") ObjIndUser record, @Param("example") ObjIndUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_ind_user
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int updateByExample(@Param("record") ObjIndUser record, @Param("example") ObjIndUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_ind_user
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int updateByPrimaryKeySelective(ObjIndUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_ind_user
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    int updateByPrimaryKey(ObjIndUser record);
}