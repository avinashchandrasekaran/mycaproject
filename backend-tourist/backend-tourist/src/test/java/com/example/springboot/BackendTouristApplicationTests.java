package com.example.springboot;



import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springboot.model.Tourist;
import com.example.springboot.repo.TouristRepo;




@SpringBootTest
class BackendTouristApplicationTests {

@Autowired
private TouristRepo repo;
@Test
public void testCreate()
{
	
	Tourist t=new Tourist();
	t.setId(6);
	t.setFirstName("shiva");
	t.setLastName("sankar");
	t.setGender("male");
	t.setAge("10");
	t.setFromPlace("chennai");
	t.setNoOfDays(3);
	repo.save(t);
	assertNotNull(repo.findById(6).get());
	}
@Test
public void testReadAll() {
	List<Tourist> list=repo.findAll();
	assertThat(list).size().isGreaterThan(0);
	
}

}
