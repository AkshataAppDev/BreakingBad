package com.example.breakingbad.di.main;

import com.example.breakingbad.ui.CharacterDetailFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      MainFragmentBuildersModule_ContributeCharDetailFragment.CharacterDetailFragmentSubcomponent
          .class
)
public abstract class MainFragmentBuildersModule_ContributeCharDetailFragment {
  private MainFragmentBuildersModule_ContributeCharDetailFragment() {}

  @Binds
  @IntoMap
  @ClassKey(CharacterDetailFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CharacterDetailFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface CharacterDetailFragmentSubcomponent
      extends AndroidInjector<CharacterDetailFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CharacterDetailFragment> {}
  }
}
