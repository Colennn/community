package com.community.dto;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

/**
 * PaginationDTO class
 *
 * @author: Administrator
 * @date: 2019/9/12 16:13
 * Description:
 */
@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private Integer totalPage;
    private List<Integer> pages = new LinkedList<>();

    public void setPagination(Integer totalCount, Integer page, Integer size) {

        //totalPage
        this.totalPage = totalCount % size == 0 ? totalCount / size : totalCount / size + 1;
        page = page > this.totalPage ? 1 : page;
        this.page = page;

        //pages
        Integer listSize = 7 / 2;
        pages.add(page);
        for (int i = 1; i <= listSize && page - i != 0; i++) {
            pages.add(0, page - i);
        }
        for (int i = 1; i <= listSize && page + i <= totalPage; i++) {
            pages.add(page + i);
        }

        //showPrevious
        this.showPrevious = page == 1 ? false : true;

        //showNext
        this.showNext = page.equals(totalPage) ? false : true;

        //showFirstPage 当列表中不包含第一页的时候显示
        this.showFirstPage = pages.contains(1) ? false : true;

        //showEndPage 当列表中不包含最后一页的时候显示
        this.showEndPage = pages.contains(totalPage) ? false : true;

    }
}
