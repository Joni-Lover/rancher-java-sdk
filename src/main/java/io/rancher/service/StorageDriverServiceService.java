package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.StorageDriverService;
import io.rancher.type.Account;
import io.rancher.type.AddRemoveServiceLinkInput;
import io.rancher.type.Instance;
import io.rancher.type.NetworkDriver;
import io.rancher.type.Service;
import io.rancher.type.ServiceExposeMap;
import io.rancher.type.ServiceLog;
import io.rancher.type.ServiceRestart;
import io.rancher.type.ServiceUpgrade;
import io.rancher.type.SetServiceLinksInput;
import io.rancher.type.Stack;
import io.rancher.type.StorageDriver;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface StorageDriverServiceService {

  @GET("storageDriverService")
  Call<TypeCollection<StorageDriverService>> list();

  @GET("storageDriverService")
  Call<TypeCollection<StorageDriverService>> list(@QueryMap Filters<String, String> filters);

  @GET("storageDriverService/{id}")
  Call<StorageDriverService> get(@Path("id") String id);

  @POST("storageDriverService")
  Call<StorageDriverService> create(@Body StorageDriverService storageDriverService);

  @PUT("storageDriverService/{id}")
  Call<StorageDriverService> update(@Path("id") String id, @Body StorageDriverService storageDriverService);

  @DELETE("storageDriverService/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("storageDriverService/{id}?action=activate")
  Call<Service> activate(@Path("id") String id);
  
  @POST("storageDriverService/{id}?action=addservicelink")
  Call<Service> addservicelink(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput);
  
  @POST("storageDriverService/{id}?action=cancelupgrade")
  Call<Service> cancelupgrade(@Path("id") String id);
  
  @POST("storageDriverService/{id}?action=continueupgrade")
  Call<Service> continueupgrade(@Path("id") String id);
  
  @POST("storageDriverService/{id}?action=deactivate")
  Call<Service> deactivate(@Path("id") String id);
  
  @POST("storageDriverService/{id}?action=finishupgrade")
  Call<Service> finishupgrade(@Path("id") String id);
  
  @POST("storageDriverService/{id}?action=remove")
  Call<Service> remove(@Path("id") String id);
  
  @POST("storageDriverService/{id}?action=removeservicelink")
  Call<Service> removeservicelink(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput);
  
  @POST("storageDriverService/{id}?action=restart")
  Call<Service> restart(@Path("id") String id, @Body ServiceRestart serviceRestart);
  
  @POST("storageDriverService/{id}?action=rollback")
  Call<Service> rollback(@Path("id") String id);
  
  @POST("storageDriverService/{id}?action=setservicelinks")
  Call<Service> setservicelinks(@Path("id") String id, @Body SetServiceLinksInput setServiceLinksInput);
  
  @POST("storageDriverService/{id}?action=upgrade")
  Call<Service> upgrade(@Path("id") String id, @Body ServiceUpgrade serviceUpgrade);
  

  
  @GET
  Call<Account> getLinkAccount(@Url String url );
  
  @GET
  Call<TypeCollection<Instance>> getLinkInstances(@Url String url );
  
  @GET
  Call<TypeCollection<NetworkDriver>> getLinkNetworkDrivers(@Url String url );
  
  @GET
  Call<TypeCollection<ServiceExposeMap>> getLinkServiceExposeMaps(@Url String url );
  
  @GET
  Call<TypeCollection<ServiceLog>> getLinkServiceLogs(@Url String url );
  
  @GET
  Call<Stack> getLinkStack(@Url String url );
  
  @GET
  Call<TypeCollection<StorageDriver>> getLinkStorageDrivers(@Url String url );
  
}
