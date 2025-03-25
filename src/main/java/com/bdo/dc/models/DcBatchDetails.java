package com.bdo.dc.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "DC_BATCH_DETAILS")
public class DcBatchDetails {

	@Field("dc_batch_no")
	private String dcBatchNo;
	
	@Field("pan_no")
	private String panNo;
}
