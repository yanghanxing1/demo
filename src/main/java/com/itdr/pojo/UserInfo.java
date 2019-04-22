package com.itdr.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@ToString
public class UserInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_user.id
     *
     * @mbggenerated
     */
    private Integer id;

    private String userIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_user.username
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_user.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_user.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_user.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_user.question
     *
     * @mbggenerated
     */
    private String question;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_user.answer
     *
     * @mbggenerated
     */
    private String answer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_user.role
     *
     * @mbggenerated
     */
    private Integer role;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_user.create_time
     *
     * @mbggenerated
     */
    private Date create_Time;


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_user.update_time
     *
     * @mbggenerated
     */
    private Date update_Time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_user.id
     *
     * @return the value of neuedu_user.id
     *
     * @mbggenerated
     */


}
