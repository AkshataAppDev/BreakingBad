package com.example.breakingbad.di.main;

import com.example.breakingbad.ui.CharacterListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      MainFragmentBuildersModule_ContributeCharListFragment.CharacterListFragmentSubcomponent.class
)
public abstract class MainFragmentBuildersModule_ContributeCharListFragment {
  private MainFragmentBuildersModule_ContributeCharListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(CharacterListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CharacterListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface CharacterListFragmentSubcomponent
      extends AndroidInjector<CharacterListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CharacterListFragment> {}
  }
}
