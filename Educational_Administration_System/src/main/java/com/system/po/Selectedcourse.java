package com.system.po;

public class Selectedcourse {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column selectedcourse.courseID
     *
     * @mbggenerated Thu Feb 22 18:42:25 CST 2018
     */
    private Integer courseid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column selectedcourse.studentID
     *
     * @mbggenerated Thu Feb 22 18:42:25 CST 2018
     */
    private String studentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column selectedcourse.mark
     *
     * @mbggenerated Thu Feb 22 18:42:25 CST 2018
     */
    private Integer mark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column selectedcourse.courseID
     *
     * @return the value of selectedcourse.courseID
     *
     * @mbggenerated Thu Feb 22 18:42:25 CST 2018
     */
    public Integer getCourseid() {
        return courseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column selectedcourse.courseID
     *
     * @param courseid the value for selectedcourse.courseID
     *
     * @mbggenerated Thu Feb 22 18:42:25 CST 2018
     */
    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column selectedcourse.studentID
     *
     * @return the value of selectedcourse.studentID
     *
     * @mbggenerated Thu Feb 22 18:42:25 CST 2018
     */
    public String getStudentid() {
        return studentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column selectedcourse.studentID
     *
     * @param studentid the value for selectedcourse.studentID
     *
     * @mbggenerated Thu Feb 22 18:42:25 CST 2018
     */
    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column selectedcourse.mark
     *
     * @return the value of selectedcourse.mark
     *
     * @mbggenerated Thu Feb 22 18:42:25 CST 2018
     */
    public Integer getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column selectedcourse.mark
     *
     * @param mark the value for selectedcourse.mark
     *
     * @mbggenerated Thu Feb 22 18:42:25 CST 2018
     */
    public void setMark(Integer mark) {
        this.mark = mark;
    }
}