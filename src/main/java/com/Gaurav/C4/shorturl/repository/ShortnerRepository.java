package com.Gaurav.C4.shorturl.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ShortnerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int countUrlEntries() {
        String sql = "select count(*) from urldata;";
        Integer countRes = jdbcTemplate.queryForObject(sql, Integer.class);
        return (countRes != null) ? countRes : 0;
    }


}
