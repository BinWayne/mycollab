package com.mycollab.module.project.domain;

import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
public class BugWithBLOBs extends Bug {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_bug.detail
     *
     * @mbg.generated Fri Apr 12 22:39:46 CDT 2019
     */
    @Length(max=16777215, message="Field value is too long")
    @Column("detail")
    private String detail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_bug.description
     *
     * @mbg.generated Fri Apr 12 22:39:46 CDT 2019
     */
    @Length(max=16777215, message="Field value is too long")
    @Column("description")
    private String description;

    private static final long serialVersionUID = 1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_bug.detail
     *
     * @return the value of m_prj_bug.detail
     *
     * @mbg.generated Fri Apr 12 22:39:46 CDT 2019
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_bug
     *
     * @mbg.generated Fri Apr 12 22:39:46 CDT 2019
     */
    public BugWithBLOBs withDetail(String detail) {
        this.setDetail(detail);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_bug.detail
     *
     * @param detail the value for m_prj_bug.detail
     *
     * @mbg.generated Fri Apr 12 22:39:46 CDT 2019
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_bug.description
     *
     * @return the value of m_prj_bug.description
     *
     * @mbg.generated Fri Apr 12 22:39:46 CDT 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_bug
     *
     * @mbg.generated Fri Apr 12 22:39:46 CDT 2019
     */
    public BugWithBLOBs withDescription(String description) {
        this.setDescription(description);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_bug.description
     *
     * @param description the value for m_prj_bug.description
     *
     * @mbg.generated Fri Apr 12 22:39:46 CDT 2019
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public enum Field {
        id,
        name,
        assignuser,
        createdtime,
        createduser,
        severity,
        priority,
        lastupdatedtime,
        status,
        duedate,
        environment,
        resolution,
        projectid,
        resolveddate,
        originalestimate,
        remainestimate,
        saccountid,
        milestoneid,
        startdate,
        enddate,
        percentagecomplete,
        detail,
        description;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}