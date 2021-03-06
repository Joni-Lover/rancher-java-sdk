package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;
import java.util.List;
import java.util.Map;

public class Stack extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    
    public String getAccountLink() {
        return this.links.get("account");
    }
    
    public String getServicesLink() {
        return this.links.get("services");
    }
    
    public String getVolumeTemplatesLink() {
        return this.links.get("volumeTemplates");
    }
    
    public String getVolumesLink() {
        return this.links.get("volumes");
    }
    

    
    private String accountId;
    
    private Binding binding;
    
    private String created;
    
    private String description;
    
    private String dockerCompose;
    
    private Map<String, Object> environment;
    
    private String externalId;
    
    private String group;
    
    private String healthState;
    
    private String kind;
    
    private String name;
    
    private Map<String, Object> outputs;
    
    private Map<String, Object> previousEnvironment;
    
    private String previousExternalId;
    
    private String rancherCompose;
    
    private String removed;
    
    private List<String> serviceIds;
    
    private Boolean startOnCreate;
    
    private String state;
    
    private Boolean system;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private Integer transitioningProgress;
    
    private String uuid;
    
    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
      this.accountId = accountId;
    }
    
    public Binding getBinding() {
        return this.binding;
    }

    public void setBinding(Binding binding) {
      this.binding = binding;
    }
    
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
      this.created = created;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getDockerCompose() {
        return this.dockerCompose;
    }

    public void setDockerCompose(String dockerCompose) {
      this.dockerCompose = dockerCompose;
    }
    
    public Map<String, Object> getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(Map<String, Object> environment) {
      this.environment = environment;
    }
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
    }
    
    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
      this.group = group;
    }
    
    public String getHealthState() {
        return this.healthState;
    }

    public void setHealthState(String healthState) {
      this.healthState = healthState;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public Map<String, Object> getOutputs() {
        return this.outputs;
    }

    public void setOutputs(Map<String, Object> outputs) {
      this.outputs = outputs;
    }
    
    public Map<String, Object> getPreviousEnvironment() {
        return this.previousEnvironment;
    }

    public void setPreviousEnvironment(Map<String, Object> previousEnvironment) {
      this.previousEnvironment = previousEnvironment;
    }
    
    public String getPreviousExternalId() {
        return this.previousExternalId;
    }

    public void setPreviousExternalId(String previousExternalId) {
      this.previousExternalId = previousExternalId;
    }
    
    public String getRancherCompose() {
        return this.rancherCompose;
    }

    public void setRancherCompose(String rancherCompose) {
      this.rancherCompose = rancherCompose;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public List<String> getServiceIds() {
        return this.serviceIds;
    }

    public void setServiceIds(List<String> serviceIds) {
      this.serviceIds = serviceIds;
    }
    
    public Boolean getStartOnCreate() {
        return this.startOnCreate;
    }

    public void setStartOnCreate(Boolean startOnCreate) {
      this.startOnCreate = startOnCreate;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public Boolean getSystem() {
        return this.system;
    }

    public void setSystem(Boolean system) {
      this.system = system;
    }
    
    public String getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(String transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public Integer getTransitioningProgress() {
        return this.transitioningProgress;
    }

    public void setTransitioningProgress(Integer transitioningProgress) {
      this.transitioningProgress = transitioningProgress;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
