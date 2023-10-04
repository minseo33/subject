package com.intern.backend.backend.ot.support;

public class PagingDTO {
    private int page; // 현재 페이지
    private int perPage; // 페이지당 노출 수

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }
}
