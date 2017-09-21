package com.yongle.nuwa.model.vo;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 类 名 称：Paging.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月20日
 */
public class Paging<T> {
    private int start;
    private int limit;
    private int pages;
    private long total;
    private List<T> list;

    public Paging(PageInfo<T> pageInfo) {
        this.start = pageInfo.getPageNum();
        this.limit = pageInfo.getPageSize();
        this.total = pageInfo.getTotal();
        this.pages = pageInfo.getPages();
        this.list = pageInfo.getList();
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
