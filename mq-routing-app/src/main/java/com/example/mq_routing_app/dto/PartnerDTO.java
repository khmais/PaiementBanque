package com.example.mq_routing_app.dto;

public class PartnerDTO {

	private Long id;
    private String alias;
    private String type;
    private String direction;
    private String application;
    private String processedFlowType;
    private String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public String getProcessedFlowType() {
		return processedFlowType;
	}
	public void setProcessedFlowType(String processedFlowType) {
		this.processedFlowType = processedFlowType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
