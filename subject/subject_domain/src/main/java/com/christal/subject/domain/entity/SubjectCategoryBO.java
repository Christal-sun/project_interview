package com.christal.subject.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 题目分类(SubjectCategory)实体类
 *
 * @author makejava
 * @since 2024-07-08 20:07:20
 */
@Data
public class SubjectCategoryBO implements Serializable {
//    private static final long serialVersionUID = 621618379391885238L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 分类名称
     */
    private String categoryName;
    /**
     * 分类的类型
     */
    private Integer categoryType;
    /**
     * 图标链接
     */
    private String imageUrl;
    /**
     * 父级id
     */
    private Long parentId;

}

