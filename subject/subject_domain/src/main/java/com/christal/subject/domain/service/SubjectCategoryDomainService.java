package com.christal.subject.domain.service;

import com.christal.subject.domain.entity.SubjectCategoryBO;
import com.christal.subject.infra.basic.entity.SubjectCategory;

import java.util.List;

/**
 * @auther christal
 * @date 2024年07月15日    16:30
 */

public interface SubjectCategoryDomainService {

    void add(SubjectCategoryBO subjectCategoryBO);
    /**
     * 查询岗位大类
     */

    List<SubjectCategoryBO> queryPrimaryCategory();
}
