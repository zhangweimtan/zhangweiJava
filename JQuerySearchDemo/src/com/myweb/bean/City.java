package com.myweb.bean;

public class City {
    private int pid;
    private int id;
    private String cname;

    public City() {
    }

    public City(int pid, int id, String cname) {
        this.pid = pid;
        this.id = id;
        this.cname = cname;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
