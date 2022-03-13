package com.baidu.lsqm.console.crm.util;

import com.baidu.lsqm.console.service.external.productcenter.bean.ProductSpecs;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
class CrmFilterUtilTest {

    @Test
    void testEPCFilter() {
        List<ProductSpecs> list = new ArrayList<>();
        ProductSpecs productSpecs1 = new ProductSpecs();
        productSpecs1.setProductSpecs("测试1");

        ProductSpecs productSpecs2 = new ProductSpecs();
        productSpecs2.setProductSpecs("物理套餐测试");
        list.add(productSpecs1);
        list.add(productSpecs2);
        list = CrmFilterUtil.ePCFilter(list, "EPC");
        Assert.assertEquals(1,list.size());

    }
}
