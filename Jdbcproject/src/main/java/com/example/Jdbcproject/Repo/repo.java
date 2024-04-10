package com.example.Jdbcproject.Repo;

import com.example.Jdbcproject.alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class repo {


    private JdbcTemplate template;
    public JdbcTemplate getTemplate() {
        return template;
    }

    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(alien a)
    {
        String str = "insert into alien (id,name) values(?,?)";
        int i= template.update(str,a.getId(),a.getName());
        System.out.println(i+"rows affected");

    }


}
