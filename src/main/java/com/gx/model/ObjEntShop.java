package com.gx.model;

public class ObjEntShop {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_ent_shop.eid
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    private Long eid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_ent_shop.eid
     *
     * @return the value of obj_ent_shop.eid
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    public Long getEid() {
        return eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_ent_shop.eid
     *
     * @param eid the value for obj_ent_shop.eid
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    public void setEid(Long eid) {
        this.eid = eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_ent_shop
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eid=").append(eid);
        sb.append("]");
        return sb.toString();
    }
}