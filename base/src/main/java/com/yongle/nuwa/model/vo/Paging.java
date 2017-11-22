package com.yongle.nuwa.model.vo;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author weinh
 */
public class Paging<T> {
    private int start;
    private int limit;
    private int pages;
    private long total;
    private List<T> list;

    public Paging() {

    }

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
