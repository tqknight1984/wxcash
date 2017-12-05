package com.gx.model;

import java.util.Date;

public class ObjUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_user.uid
     *
     * @mbggenerated Mon Dec 04 18:13:22 CST 2017
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_user.uname
     *
     * @mbggenerated Mon Dec 04 18:13:22 CST 2017
     */
    private String uname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_user.openid
     *
     * @mbggenerated Mon Dec 04 18:13:22 CST 2017
     */
    private String openid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_user.up_tm
     *
     * @mbggenerated Mon Dec 04 18:13:22 CST 2017
     */
    private Date up_tm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_user.nick
     *
     * @mbggenerated Mon Dec 04 18:13:22 CST 2017
     */
    private String nick;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_user.uid
     *
     * @return the value of obj_user.uid
     *
     * @mbggenerated Mon Dec 04 18:13:22 CST 2017
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_user.uid
     *
     * @param uid the value for obj_user.uid
     *
     * @mbggenerated Mon Dec 04 18:13:22 CST 2017
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_user.uname
     *
     * @return the value of obj_user.uname
     *
     * @mbggenerated Mon Dec 04 18:13:22 CST 2017
     */
    public String getUname() {
        return uname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_user.uname
     *
     * @param uname the value for obj_user.uname
     *
     * @mbggenerated Mon Dec 04 18:13:22 CST 2017
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_user.openid
     *
     * @return the value of obj_user.openid
     *
     * @mbggenerated Mon Dec 04 18:13:22 CST 2017
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_user.openid
     *
     * @param openid the value for obj_user.openid
     *
     * @mbggenerated Mon Dec 04 18:13:22 CST 2017
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_user.up_tm
     *
     * @return the value of obj_user.up_tm
     *
     * @mbggenerated Mon Dec 04 18:13:22 CST 2017
     */
    public Date getUp_tm() {
        return up_tm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_user.up_tm
     *
     * @param up_tm the value for obj_user.up_tm
     *
     * @mbggenerated Mon Dec 04 18:13:22 CST 2017
     */
    public void setUp_tm(Date up_tm) {
        this.up_tm = up_tm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_user.nick
     *
     * @return the value of obj_user.nick
     *
     * @mbggenerated Mon Dec 04 18:13:22 CST 2017
     */
    public String getNick() {
        return nick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_user.nick
     *
     * @param nick the value for obj_user.nick
     *
     * @mbggenerated Mon Dec 04 18:13:22 CST 2017
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_user
     *
     * @mbggenerated Mon Dec 04 18:13:22 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", uname=").append(uname);
        sb.append(", openid=").append(openid);
        sb.append(", up_tm=").append(up_tm);
        sb.append(", nick=").append(nick);
        sb.append("]");
        return sb.toString();
    }
}