package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SetProjectMembersInput;

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

public interface SetProjectMembersInputService {

  @GET("setProjectMembersInput")
  Call<TypeCollection<SetProjectMembersInput>> list();

  @GET("setProjectMembersInput")
  Call<TypeCollection<SetProjectMembersInput>> list(@QueryMap Filters<String, String> filters);

  @GET("setProjectMembersInput/{id}")
  Call<SetProjectMembersInput> get(@Path("id") String id);

  @POST("setProjectMembersInput")
  Call<SetProjectMembersInput> create(@Body SetProjectMembersInput setProjectMembersInput);

  @PUT("setProjectMembersInput/{id}")
  Call<SetProjectMembersInput> update(@Path("id") String id, @Body SetProjectMembersInput setProjectMembersInput);

  @DELETE("setProjectMembersInput/{id}")
  Call<ResponseBody> delete(@Path("id") String id);
  

  
}
