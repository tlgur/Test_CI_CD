package com.skkud.shCiCd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class ShCiCdApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("테스트 확인코드입니다");
		System.out.println("깃허브 액션 테스트 확인코드입니다");
	}

}
