package com.gx.model;

public class RefProductClass {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ref_product_class.id
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ref_product_class.name
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ref_product_class.path_level
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    private String path_level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ref_product_class.fatherid
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    private Integer fatherid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ref_product_class.show_level
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    private String show_level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ref_product_class.is_delete
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    private String is_delete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ref_product_class.id
     *
     * @return the value of ref_product_class.id
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ref_product_class.id
     *
     * @param id the value for ref_product_class.id
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ref_product_class.name
     *
     * @return the value of ref_product_class.name
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ref_product_class.name
     *
     * @param name the value for ref_product_class.name
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ref_product_class.path_level
     *
     * @return the value of ref_product_class.path_level
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    public String getPath_level() {
        return path_level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ref_product_class.path_level
     *
     * @param path_level the value for ref_product_class.path_level
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    public void setPath_level(String path_level) {
        this.path_level = path_level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ref_product_class.fatherid
     *
     * @return the value of ref_product_class.fatherid
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    public Integer getFatherid() {
        return fatherid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ref_product_class.fatherid
     *
     * @param fatherid the value for ref_product_class.fatherid
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    public void setFatherid(Integer fatherid) {
        this.fatherid = fatherid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ref_product_class.show_level
     *
     * @return the value of ref_product_class.show_level
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    public String getShow_level() {
        return show_level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ref_product_class.show_level
     *
     * @param show_level the value for ref_product_class.show_level
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    public void setShow_level(String show_level) {
        this.show_level = show_level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ref_product_class.is_delete
     *
     * @return the value of ref_product_class.is_delete
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    public String getIs_delete() {
        return is_delete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ref_product_class.is_delete
     *
     * @param is_delete the value for ref_product_class.is_delete
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    public void setIs_delete(String is_delete) {
        this.is_delete = is_delete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ref_product_class
     *
     * @mbggenerated Fri Sep 16 11:16:48 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", path_level=").append(path_level);
        sb.append(", fatherid=").append(fatherid);
        sb.append(", show_level=").append(show_level);
        sb.append(", is_delete=").append(is_delete);
        sb.append("]");
        return sb.toString();
    }
}