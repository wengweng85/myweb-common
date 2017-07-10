package com.insigma.common.ipparser;

import org.junit.Assert;
import org.junit.Test;

public class IPSeekerUtilTest extends Assert {
	
	IPSeekerUtil util=new IPSeekerUtil();
	
	@SuppressWarnings("unused")
	@Test
	public void test() {
		String country=util.getIpCountry(null);
	}

}
