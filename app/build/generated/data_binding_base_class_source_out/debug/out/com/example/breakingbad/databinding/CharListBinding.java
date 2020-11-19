// Generated by data binding compiler. Do not edit!
package com.example.breakingbad.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.breakingbad.R;
import com.example.breakingbad.viewmodel.MainViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class CharListBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView charRecyclerView;

  @NonNull
  public final SearchView characterSearch;

  @NonNull
  public final LinearLayout countryContentId;

  @NonNull
  public final ProgressBar progress;

  @Bindable
  protected MainViewModel mViewModel;

  protected CharListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView charRecyclerView, SearchView characterSearch, LinearLayout countryContentId,
      ProgressBar progress) {
    super(_bindingComponent, _root, _localFieldCount);
    this.charRecyclerView = charRecyclerView;
    this.characterSearch = characterSearch;
    this.countryContentId = countryContentId;
    this.progress = progress;
  }

  public abstract void setViewModel(@Nullable MainViewModel viewModel);

  @Nullable
  public MainViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static CharListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.char_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CharListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CharListBinding>inflateInternal(inflater, R.layout.char_list, root, attachToRoot, component);
  }

  @NonNull
  public static CharListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.char_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CharListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CharListBinding>inflateInternal(inflater, R.layout.char_list, null, false, component);
  }

  public static CharListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static CharListBinding bind(@NonNull View view, @Nullable Object component) {
    return (CharListBinding)bind(component, view, R.layout.char_list);
  }
}
