package com.example.Jdbcproject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

    @Component
    @Scope("prototype")
    public class alien {

        int  id ;
        String name;
        public int getId() {
            return id;
        }
        @Override
        public String toString() {
            return "alien [id=" + id + ", name=" + name + "]";
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }


    }

