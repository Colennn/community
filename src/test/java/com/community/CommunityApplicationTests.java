package com.community;

import com.community.dto.PaginationDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommunityApplicationTests {

	@Test
	public void contextLoads() {
		PaginationDTO paginationDTO = new PaginationDTO();

		//(12,2,5)预期结果：pages=[1,2,3]
		//paginationDTO.setPagination(12,2,5);
		//(21,2,5)预期结果：pages=[1,2,3,4,5]
		//paginationDTO.setPagination(21,2,5);
		//(1,2,5)预期结果：page=1,pages=[1]
		//paginationDTO.setPagination(1,2,5);
		//(50,5,5)预期结果：page=5,pages=[2,3,4,5,6,7,8]
		//paginationDTO.setPagination(50,5,5);
		//(50,8,5)预期结果：page=5,pages=[5,6,7,8,9,10],showEndPage=false
		//paginationDTO.setPagination(50,8,5);
		//(50,2,5)预期结果：page=5,pages=[1,2,3,4,5],showFirstPage=flase
		//paginationDTO.setPagination(50,2,5);
		//(50,1,5)预期结果：page=5,pages=[1,2,3,4],showPrevious=false
		//paginationDTO.setPagination(50,1,5);
		//(15,5,5)预期结果：page=5,pages=[1,2,3]
		//paginationDTO.setPagination(15,5,5);
		//(4,5,5)预期结果：page=1,pages=[1]
		paginationDTO.setPagination(4,5,5);
		System.out.println(paginationDTO.toString());
	}

}
