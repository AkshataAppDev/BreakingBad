// Generated by Dagger (https://dagger.dev).
package com.example.breakingbad.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideRetrofitInstanceFactory implements Factory<Retrofit> {
  private final AppModule module;

  public AppModule_ProvideRetrofitInstanceFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Retrofit get() {
    return provideRetrofitInstance(module);
  }

  public static AppModule_ProvideRetrofitInstanceFactory create(AppModule module) {
    return new AppModule_ProvideRetrofitInstanceFactory(module);
  }

  public static Retrofit provideRetrofitInstance(AppModule instance) {
    return Preconditions.checkNotNull(instance.provideRetrofitInstance(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
