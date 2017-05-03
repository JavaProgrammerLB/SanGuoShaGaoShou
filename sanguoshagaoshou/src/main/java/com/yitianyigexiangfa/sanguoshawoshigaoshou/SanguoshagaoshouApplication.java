package com.yitianyigexiangfa.sanguoshawoshigaoshou;

import com.yitianyigexiangfa.sanguoshawoshigaoshou.domain.Soldier;
import com.yitianyigexiangfa.sanguoshawoshigaoshou.mapper.SoldierMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SanguoshagaoshouApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SanguoshagaoshouApplication.class, args);
	}

	final private SoldierMapper soldierMapper;

	public SanguoshagaoshouApplication(SoldierMapper soldierMapper){
		this.soldierMapper = soldierMapper;
	}

	@Override
	public void run(String... strings) throws Exception {
		Soldier soldier = this.soldierMapper.findByName("刘备");
		System.out.print(soldier);
	}

}
