package com.system.mapper;

import com.system.po.College;
import com.system.po.CollegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollegeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table college
     *
     * @mbggenerated Fri Feb 16 21:39:10 CST 2018
     */
    int countByExample(CollegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table college
     *
     * @mbggenerated Fri Feb 16 21:39:10 CST 2018
     */
    int deleteByExample(CollegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table college
     *
     * @mbggenerated Fri Feb 16 21:39:10 CST 2018
     */
    int deleteByPrimaryKey(Integer collegeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table college
     *
     * @mbggenerated Fri Feb 16 21:39:10 CST 2018
     */
    int insert(College record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table college
     *
     * @mbggenerated Fri Feb 16 21:39:10 CST 2018
     */
    int insertSelective(College record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table college
     *
     * @mbggenerated Fri Feb 16 21:39:10 CST 2018
     */
    List<College> selectByExample(CollegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table college
     *
     * @mbggenerated Fri Feb 16 21:39:10 CST 2018
     */
    College selectByPrimaryKey(Integer collegeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table college
     *
     * @mbggenerated Fri Feb 16 21:39:10 CST 2018
     */
    int updateByExampleSelective(@Param("record") College record, @Param("example") CollegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table college
     *
     * @mbggenerated Fri Feb 16 21:39:10 CST 2018
     */
    int updateByExample(@Param("record") College record, @Param("example") CollegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table college
     *
     * @mbggenerated Fri Feb 16 21:39:10 CST 2018
     */
    int updateByPrimaryKeySelective(College record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table college
     *
     * @mbggenerated Fri Feb 16 21:39:10 CST 2018
     */
    int updateByPrimaryKey(College record);
}