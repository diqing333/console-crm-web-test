package com.baidu.lsqm.console.crm.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CrmConfigUtilsTest {

    @InjectMocks
    CrmConfigUtils crmConfigUtils;

    @Test
    public void testGetContractFlowPerformers() {
        List<String> perfomers = crmConfigUtils.getContractFlowPhaseThreePerformer();
        Assert.assertNotNull(perfomers);

        crmConfigUtils.setContractFlowPerformers("[\"daikangjie01\"]");
        perfomers = crmConfigUtils.getContractFlowPhaseThreePerformer();
        Assert.assertNotNull(perfomers);
    }

    @Test
    public void testGetContractOperators() {
        List<String> operators = crmConfigUtils.getContractOperators();
        Assert.assertNotNull(operators);

        crmConfigUtils.setContractOperators("[\"daikangjie01\"]");
        operators = crmConfigUtils.getContractOperators();
        Assert.assertNotNull(operators);
    }

    @Test
    public void testGetContractOrderExcludeProducts() {
        List<String> products = crmConfigUtils.getContractOrderExcludeProducts();
        Assert.assertNotNull(products);

        crmConfigUtils.setContractOrderExcludeProducts("XDB;BIGPIPE");
        products = crmConfigUtils.getContractOrderExcludeProducts();
        Assert.assertNotNull(products);
    }

    @Test
    public void testGetDiffSpecProducts() {
        List<String> products = crmConfigUtils.getDiffSpecProducts();
        Assert.assertNotNull(products);

        crmConfigUtils.setDiffSpecProducts("XDB;BIGPIPE");
        products = crmConfigUtils.getDiffSpecProducts();
        Assert.assertNotNull(products);
    }
}
