package com.intern.backend.backend.ot.api.board.support;

import lombok.Getter;
import lombok.Setter;

/**
 * PageNation 을 관리하는 클래스
 */
@Getter
@Setter
public class PageVo {
    private int page = 1; // 현재 페이지
    private int perPage = 10; // 페이지당 노출 개수
    private int perPaging = 5;
    private int totalCnt; // 총 데이터 수

    public int getStartPage(){
        int prev = this.perPaging / 2;
        if(getTotalPage() < this.perPaging){
            return 1;
        }
        if(getTotalPage() < this.page + prev){
            return Math.max(this.page - prev, 1) - (this.page + prev - getTotalPage());
        }
        return Math.max(this.page - prev, 1);
    }
    public int getTotalPage() {
        int totalPage = totalCnt / perPage;
        if ( totalCnt % perPage > 0){
            totalPage += 1;
        }
        return totalPage;
    }
    public int getEndPage(){
        int prev = this.perPaging / 2;
        int totalPage = getTotalPage();
        if(this.page + prev >= totalPage){
            return totalPage;
        }
        return Math.max(this.page + prev, this.perPaging);
    }

    public boolean isPrev(){
        return this.page -1 >= 1;
    }

    public boolean isBigPrev(){
        return this.page - perPaging >= 1;
    }

    public boolean isNext(){
        return this.page + 1 <= getTotalPage();
    }

    public boolean isBigNext(){
        return this.page + perPaging <= getTotalPage();
    }
}
