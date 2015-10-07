package com.persotuto.testgit.impl;

import junit.framework.TestCase;
import com.persotuto.testgit.Bean;

public class BeanImplTest extends TestCase {

    public void testBeanIsABean() {
    	//Change B
	Bean aBean = new BeanImpl();
        assertTrue(aBean.isABean());

        // change A+C+B
        // CHange in master 4

    }

}
