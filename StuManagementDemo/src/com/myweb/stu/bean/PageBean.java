package com.myweb.stu.bean;

import java.util.List;

/*
* 这是一个封装了一个分页的数据
* 该页学生集合数据
* 总记录数
* 总页数
* 每页显示的记录数
* */
public class PageBean <T> {
    private int currentPage;//当前页
    private int totalPage;//总页数
    private int pageCount;//当前记录数
    private int totalCount;//总的记录数
    private List<T> list;//当前页的学生信息

    public PageBean() {
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
