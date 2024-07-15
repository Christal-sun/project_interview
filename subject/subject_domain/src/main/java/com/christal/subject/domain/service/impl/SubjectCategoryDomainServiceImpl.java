package com.christal.subject.domain.service.impl;

import com.alibaba.fastjson.JSON;
import com.christal.subject.domain.convert.SubjectCategoryConverter;
import com.christal.subject.domain.entity.SubjectCategoryBO;
import com.christal.subject.domain.service.SubjectCategoryDomainService;
import com.christal.subject.infra.basic.entity.SubjectCategory;
import com.christal.subject.infra.basic.service.SubjectCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther christal
 * @date 2024年07月15日    16:31
 */

@Service
@Slf4j
public class SubjectCategoryDomainServiceImpl implements SubjectCategoryDomainService {

    @Resource
    private SubjectCategoryService subjectCategoryService;

    @Override
    public void add(SubjectCategoryBO subjectCategoryBO) {
        if(log.isInfoEnabled()){
            log.info("SubjectCategoryController.add.bo:{}", JSON.toJSONString(subjectCategoryBO));
        }
        SubjectCategory subjectCategory = SubjectCategoryConverter.INSTANCE
                .convertBoToCategory(subjectCategoryBO);
        subjectCategoryService.insert(subjectCategory);
    }

    @Override
    public List<SubjectCategoryBO> queryPrimaryCategory() {
        List<SubjectCategory> subjectCategoryList = subjectCategoryService.queryPrimaryCategory();
        List<SubjectCategoryBO> boList = SubjectCategoryConverter.INSTANCE
                .convertBoToCategory(subjectCategoryList);
        if(log.isInfoEnabled()){
            log.info("SubjectCategoryController.queryPrimaryCategory.boList:{}",
                    JSON.toJSONString(boList));
        }
        return boList;
    }
}
