package com.persotuto.testgit.impl;

import junit.framework.TestCase;
import com.persotuto.testgit.Bean;

public class BeanImplTest extends TestCase {

    public void testBeanIsABean() {
	Bean aBean = new BeanImpl();
        assertTrue(aBean.isABean());
        // change A+C
    }

}