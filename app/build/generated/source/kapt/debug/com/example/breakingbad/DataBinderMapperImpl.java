package com.example.breakingbad;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.breakingbad.databinding.CharDetailBindingImpl;
import com.example.breakingbad.databinding.CharListBindingImpl;
import com.example.breakingbad.databinding.ItemCharacterBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_CHARDETAIL = 1;

  private static final int LAYOUT_CHARLIST = 2;

  private static final int LAYOUT_ITEMCHARACTER = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.breakingbad.R.layout.char_detail, LAYOUT_CHARDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.breakingbad.R.layout.char_list, LAYOUT_CHARLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.breakingbad.R.layout.item_character, LAYOUT_ITEMCHARACTER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_CHARDETAIL: {
          if ("layout/char_detail_0".equals(tag)) {
            return new CharDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for char_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_CHARLIST: {
          if ("layout/char_list_0".equals(tag)) {
            return new CharListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for char_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCHARACTER: {
          if ("layout/item_character_0".equals(tag)) {
            return new ItemCharacterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_character is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "charItem");
      sKeys.put(2, "clickListener");
      sKeys.put(3, "viewModel");
      sKeys.put(4, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/char_detail_0", com.example.breakingbad.R.layout.char_detail);
      sKeys.put("layout/char_list_0", com.example.breakingbad.R.layout.char_list);
      sKeys.put("layout/item_character_0", com.example.breakingbad.R.layout.item_character);
    }
  }
}
