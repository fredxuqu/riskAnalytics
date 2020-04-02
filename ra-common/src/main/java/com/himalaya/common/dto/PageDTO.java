package com.himalaya.common.dto;

import lombok.Data;
import org.apache.commons.collections.CollectionUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * PageDTO
 * @param <T>
 */
@Data
public class PageDTO<T> implements Serializable {

    private List<T> datas;

    /**
     * record count
     */
    private Long count;

    /**
     * current page NO.
     */
    private Integer index;

    /**
     * for others
     */
    private String others;

    public PageDTO() {
    }

    public PageDTO(List<T> datas) {
        if (!CollectionUtils.isEmpty(datas)) {
            this.datas = new ArrayList<>(datas.size());
            this.datas.addAll(datas);
        } else {
            this.datas = new ArrayList<>();
        }
    }
}
