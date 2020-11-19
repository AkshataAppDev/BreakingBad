package com.example.breakingbad.di;

import com.example.breakingbad.di.main.MainFragmentBuildersModule;
import com.example.breakingbad.di.main.MainModule;
import com.example.breakingbad.di.main.MainScope;
import com.example.breakingbad.di.main.MainViewModelModule;
import com.example.breakingbad.ui.MainActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent.class
)
public abstract class ActivityBuildersModule_ContributeMainActivity {
  private ActivityBuildersModule_ContributeMainActivity() {}

  @Binds
  @IntoMap
  @ClassKey(MainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Factory builder);

  @Subcomponent(
    modules = {MainModule.class, MainFragmentBuildersModule.class, MainViewModelModule.class}
  )
  @MainScope
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}
  }
}
