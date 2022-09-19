package com.kushan.springbootdeployment;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class SpringbootDeploymentApplicationTests {

	@Test
	void contextLoads() {
		log.info("test cases executed..................");
		assert(true);
	}

}
