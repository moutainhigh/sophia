package com.yz.sophia.insight.service;

import com.yz.sophia.business.api.entity.Page;
import com.yz.sophia.insight.dao.ProductInsightMapper;
import com.yz.sophia.insight.model.po.ProductInsight;
import com.yz.sophia.insight.model.po.ProductInsightExample;
import com.yz.sophia.insight.model.vo.LineChartDataVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class ProductInsightService {

    @Autowired
    private ProductInsightMapper productInsightMapper;

    public Page<ProductInsight> listProductInsight(String productCategory, String productBrand, String platForm, String productModel, String store, Integer evaluateType, String evaluateCategory, Date beginDate, Date endDate, String orderField, String orderType, Integer pageIndex, Integer pageSize){
        ProductInsightExample example = new ProductInsightExample();
        ProductInsightExample.Criteria criteria = example.createCriteria();

        pageIndex = pageIndex == null ? 1 : pageIndex;
        pageSize = pageSize == null ? 10 : pageSize;

        if(StringUtils.isNotBlank(productCategory)){
            criteria.andProductCategoryEqualTo(productCategory);
        }
        if(StringUtils.isNotBlank(productBrand)){
            criteria.andProductBrandEqualTo(productBrand);
        }
        if(StringUtils.isNotBlank(platForm)){
            criteria.andProductPlatformEqualTo(platForm);
        }
        if(StringUtils.isNotBlank(store)){
            criteria.andProductStoreEqualTo(store);
        }
        if(StringUtils.isNotBlank(productModel)){
            criteria.andProductModelLike("%" + productModel + "%");
        }

        if(beginDate != null){
            criteria.andEvaluateTimeGreaterThanOrEqualTo(beginDate);
        }
        if(endDate != null){
            criteria.andEvaluateTimeLessThanOrEqualTo(endDate);
        }


        int totalCount = productInsightMapper.countByExample(example);

        int offset = (pageIndex - 1) * pageSize;
        example.setOffset(offset);
        example.setPageSize(pageSize);
        if(StringUtils.isEmpty(orderField)){
            orderField = "evaluate_time";
        }
        if(StringUtils.isEmpty(orderType)){
            orderType = "desc";
        }
        example.setOrderByClause(orderField + " " + orderType);
        List<ProductInsight> list = productInsightMapper.selectPageByExample(example);

        Page<ProductInsight> pageInfo = new Page<ProductInsight>(pageIndex, pageSize, totalCount, list);
        return pageInfo;
    }

    public List<LineChartDataVo> productInsightLineChart(String productCategory, String productBrand, String platForm, String productModel, String store, Integer evaluateType, String evaluateCategory, Date beginDate, Date endDate, String timeUnit){
        ProductInsightExample example = new ProductInsightExample();
        ProductInsightExample.Criteria criteria = example.createCriteria();

        if(StringUtils.isNotBlank(productCategory)){
            criteria.andProductCategoryEqualTo(productCategory);
        }
        if(StringUtils.isNotBlank(productBrand)){
            criteria.andProductBrandEqualTo(productBrand);
        }
        if(StringUtils.isNotBlank(platForm)){
            criteria.andProductPlatformEqualTo(platForm);
        }
        if(StringUtils.isNotBlank(store)){
            criteria.andProductStoreEqualTo(store);
        }
        if(StringUtils.isNotBlank(productModel)){
            criteria.andProductModelLike("%" + productModel + "%");
        }

        if(beginDate != null){
            criteria.andEvaluateTimeGreaterThanOrEqualTo(beginDate);
        }
        if(endDate != null){
            criteria.andEvaluateTimeLessThanOrEqualTo(endDate);
        }

        List<LineChartDataVo> dataList = null;
        if(timeUnit.equalsIgnoreCase(TimeUnit.DAYS.name())){
            dataList = productInsightMapper.lineChartByExampleDay(example);
        }else {
            dataList = productInsightMapper.lineChartByExampleHour(example);
        }
        return dataList;
    }
}