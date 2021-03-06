package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CatalogTemplate;

import retrofit2.Call;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface CatalogTemplateService {

  @GET("catalogTemplate")
  Call<TypeCollection<CatalogTemplate>> list();

  @GET("catalogTemplate")
  Call<TypeCollection<CatalogTemplate>> list(@QueryMap Filters<String, String> filters);

  @GET("catalogTemplate/{id}")
  Call<CatalogTemplate> get(@Path("id") String id);

  @POST("catalogTemplate")
  Call<CatalogTemplate> create(@Body CatalogTemplate catalogTemplate);

  @PUT("catalogTemplate/{id}")
  Call<CatalogTemplate> update(@Path("id") String id, @Body CatalogTemplate catalogTemplate);

  @DELETE("catalogTemplate/{id}")
  Call<ResponseBody> delete(@Path("id") String id);
  

  
}
