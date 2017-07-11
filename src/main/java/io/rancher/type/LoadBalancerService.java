package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;
import java.util.List;
import java.util.Map;

public class LoadBalancerService extends AbstractType {

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
    
    public String getEnvironmentLink() {
        return this.links.get("environment");
    }
    
    public String getInstancesLink() {
        return this.links.get("instances");
    }
    

    
    private String accountId;
    
    private Boolean assignServiceIpAddress;
    
    private List<String> certificateIds;
    
    private String created;
    
    private Integer currentScale;
    
    private String defaultCertificateId;
    
    private String description;
    
    private String environmentId;
    
    private String externalId;
    
    private String fqdn;
    
    private String healthState;
    
    private String kind;
    
    private LaunchConfig launchConfig;
    
    private LoadBalancerConfig loadBalancerConfig;
    
    private Map<String, Object> metadata;
    
    private String name;
    
    private List<PublicEndpoint> publicEndpoints;
    
    private String removed;
    
    private Boolean retainIp;
    
    private Integer scale;
    
    private ScalePolicy scalePolicy;
    
    private String selectorLink;
    
    private Boolean startOnCreate;
    
    private String state;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private Integer transitioningProgress;
    
    private ServiceUpgrade upgrade;
    
    private String uuid;
    
    private String vip;
    
    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
      this.accountId = accountId;
    }
    
    public Boolean getAssignServiceIpAddress() {
        return this.assignServiceIpAddress;
    }

    public void setAssignServiceIpAddress(Boolean assignServiceIpAddress) {
      this.assignServiceIpAddress = assignServiceIpAddress;
    }
    
    public List<String> getCertificateIds() {
        return this.certificateIds;
    }

    public void setCertificateIds(List<String> certificateIds) {
      this.certificateIds = certificateIds;
    }
    
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
      this.created = created;
    }
    
    public Integer getCurrentScale() {
        return this.currentScale;
    }

    public void setCurrentScale(Integer currentScale) {
      this.currentScale = currentScale;
    }
    
    public String getDefaultCertificateId() {
        return this.defaultCertificateId;
    }

    public void setDefaultCertificateId(String defaultCertificateId) {
      this.defaultCertificateId = defaultCertificateId;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public void setEnvironmentId(String environmentId) {
      this.environmentId = environmentId;
    }
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
    }
    
    public String getFqdn() {
        return this.fqdn;
    }

    public void setFqdn(String fqdn) {
      this.fqdn = fqdn;
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
    
    public LaunchConfig getLaunchConfig() {
        return this.launchConfig;
    }

    public void setLaunchConfig(LaunchConfig launchConfig) {
      this.launchConfig = launchConfig;
    }
    
    public LoadBalancerConfig getLoadBalancerConfig() {
        return this.loadBalancerConfig;
    }

    public void setLoadBalancerConfig(LoadBalancerConfig loadBalancerConfig) {
      this.loadBalancerConfig = loadBalancerConfig;
    }
    
    public Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
      this.metadata = metadata;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public List<PublicEndpoint> getPublicEndpoints() {
        return this.publicEndpoints;
    }

    public void setPublicEndpoints(List<PublicEndpoint> publicEndpoints) {
      this.publicEndpoints = publicEndpoints;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public Boolean getRetainIp() {
        return this.retainIp;
    }

    public void setRetainIp(Boolean retainIp) {
      this.retainIp = retainIp;
    }
    
    public Integer getScale() {
        return this.scale;
    }

    public void setScale(Integer scale) {
      this.scale = scale;
    }
    
    public ScalePolicy getScalePolicy() {
        return this.scalePolicy;
    }

    public void setScalePolicy(ScalePolicy scalePolicy) {
      this.scalePolicy = scalePolicy;
    }
    
    public String getSelectorLink() {
        return this.selectorLink;
    }

    public void setSelectorLink(String selectorLink) {
      this.selectorLink = selectorLink;
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
    
    public ServiceUpgrade getUpgrade() {
        return this.upgrade;
    }

    public void setUpgrade(ServiceUpgrade upgrade) {
      this.upgrade = upgrade;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public String getVip() {
        return this.vip;
    }

    public void setVip(String vip) {
      this.vip = vip;
    }
    
}
