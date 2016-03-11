/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.module.tracker.dao;

import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import com.esofthead.mycollab.module.tracker.domain.Query;
import com.esofthead.mycollab.module.tracker.domain.QueryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface QueryMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_query
     *
     * @mbggenerated Thu Mar 10 00:40:05 ICT 2016
     */
    int countByExample(QueryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_query
     *
     * @mbggenerated Thu Mar 10 00:40:05 ICT 2016
     */
    int deleteByExample(QueryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_query
     *
     * @mbggenerated Thu Mar 10 00:40:05 ICT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_query
     *
     * @mbggenerated Thu Mar 10 00:40:05 ICT 2016
     */
    int insert(Query record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_query
     *
     * @mbggenerated Thu Mar 10 00:40:05 ICT 2016
     */
    int insertSelective(Query record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_query
     *
     * @mbggenerated Thu Mar 10 00:40:05 ICT 2016
     */
    List<Query> selectByExample(QueryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_query
     *
     * @mbggenerated Thu Mar 10 00:40:05 ICT 2016
     */
    Query selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_query
     *
     * @mbggenerated Thu Mar 10 00:40:05 ICT 2016
     */
    int updateByExampleSelective(@Param("record") Query record, @Param("example") QueryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_query
     *
     * @mbggenerated Thu Mar 10 00:40:05 ICT 2016
     */
    int updateByExample(@Param("record") Query record, @Param("example") QueryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_query
     *
     * @mbggenerated Thu Mar 10 00:40:05 ICT 2016
     */
    int updateByPrimaryKeySelective(Query record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_query
     *
     * @mbggenerated Thu Mar 10 00:40:05 ICT 2016
     */
    int updateByPrimaryKey(Query record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_query
     *
     * @mbggenerated Thu Mar 10 00:40:05 ICT 2016
     */
    Integer insertAndReturnKey(Query value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_query
     *
     * @mbggenerated Thu Mar 10 00:40:05 ICT 2016
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_query
     *
     * @mbggenerated Thu Mar 10 00:40:05 ICT 2016
     */
    void massUpdateWithSession(@Param("record") Query record, @Param("primaryKeys") List primaryKeys);
}