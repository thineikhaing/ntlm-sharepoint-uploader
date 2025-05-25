package org.tek.sharepoint.dms.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DmsFilePropertiesDto {
	@JsonProperty("formValues")
	private List<DmsFilePropertiesMetadataDto> metadata;
	@JsonProperty("bNewDocumentUpdate")
	private boolean bNewDocumentUpdate;
	
}
