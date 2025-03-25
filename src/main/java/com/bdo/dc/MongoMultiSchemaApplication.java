package com.bdo.dc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bdo.dc.db1.repositories.DcBatchDetailsRepo;
import com.bdo.dc.db2.repositories.AmUserMasterRepo;
import com.bdo.dc.models.AmUserMaster;
import com.bdo.dc.models.DcBatchDetails;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class MongoMultiSchemaApplication implements CommandLineRunner{

	@Autowired
	private DcBatchDetailsRepo dcBatchDetailsRepo;
	
	@Autowired
	private AmUserMasterRepo amUserMasterRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(MongoMultiSchemaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		log.info("************************************************************");
		
		log.info("Start printing batch Details");
		
		log.info("--------------------------------------------------------------");
		
		List<DcBatchDetails> dcList = this.dcBatchDetailsRepo.findAll();
		for(DcBatchDetails dcBatch: dcList) {
			log.info(dcBatch.toString());
		}
		
		log.info("--------------------------------------------------------------");
		
		List<AmUserMaster> amList = this.amUserMasterRepo.findAll();
		for(AmUserMaster amBatch: amList) {
			log.info(amBatch.toString());
		}
		
		
		log.info("************************************************************");
	}

}
