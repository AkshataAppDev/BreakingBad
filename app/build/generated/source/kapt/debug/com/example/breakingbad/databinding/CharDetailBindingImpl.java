package com.example.breakingbad.databinding;
import com.example.breakingbad.R;
import com.example.breakingbad.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CharDetailBindingImpl extends CharDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CharDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private CharDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            );
        this.charDetail.setTag(null);
        this.characterImage.setTag(null);
        this.characterName.setTag(null);
        this.nicknameTv.setTag(null);
        this.occupationTv.setTag(null);
        this.seasonAppearanceTv.setTag(null);
        this.statusTv.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewmodel == variableId) {
            setViewmodel((com.example.breakingbad.viewmodel.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.example.breakingbad.viewmodel.MainViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelSelectedCharItem((androidx.lifecycle.LiveData<com.example.breakingbad.database.CharacterModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelSelectedCharItem(androidx.lifecycle.LiveData<com.example.breakingbad.database.CharacterModel> ViewmodelSelectedCharItem, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String seasonAppearanceTvAndroidStringSeasonAppearancesViewmodelSelectedCharItemAppearanceToString = null;
        java.util.List<java.lang.String> viewmodelSelectedCharItemOccupation = null;
        java.lang.String viewmodelSelectedCharItemImg = null;
        java.lang.String nicknameTvAndroidStringNicknameViewmodelSelectedCharItemNickName = null;
        boolean viewmodelSelectedCharItemAppearanceToStringJavaLangObjectNull = false;
        boolean viewmodelSelectedCharItemNameJavaLangObjectNull = false;
        java.lang.String viewmodelSelectedCharItemOccupationToString = null;
        androidx.lifecycle.LiveData<com.example.breakingbad.database.CharacterModel> viewmodelSelectedCharItem = null;
        java.lang.String viewmodelSelectedCharItemStatus = null;
        java.lang.String viewmodelSelectedCharItemAppearanceToString = null;
        int viewmodelSelectedCharItemStatusJavaLangObjectNullViewVISIBLEViewGONE = 0;
        boolean viewmodelSelectedCharItemOccupationJavaLangObjectNull = false;
        com.example.breakingbad.database.CharacterModel viewmodelSelectedCharItemGetValue = null;
        java.lang.String viewmodelSelectedCharItemName = null;
        java.lang.String statusTvAndroidStringStatusViewmodelSelectedCharItemStatus = null;
        int viewmodelSelectedCharItemImgJavaLangObjectNullViewVISIBLEViewGONE = 0;
        int viewmodelSelectedCharItemOccupationJavaLangObjectNullViewGONEViewVISIBLE = 0;
        int viewmodelSelectedCharItemNickNameJavaLangObjectNullViewGONEViewVISIBLE = 0;
        int viewmodelSelectedCharItemNameJavaLangObjectNullViewVISIBLEViewGONE = 0;
        boolean viewmodelSelectedCharItemImgJavaLangObjectNull = false;
        boolean viewmodelSelectedCharItemStatusJavaLangObjectNull = false;
        java.util.List<java.lang.Integer> viewmodelSelectedCharItemAppearance = null;
        boolean viewmodelSelectedCharItemNickNameJavaLangObjectNull = false;
        int viewmodelSelectedCharItemAppearanceToStringJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String occupationTvAndroidStringOccupationViewmodelSelectedCharItemOccupationToString = null;
        com.example.breakingbad.viewmodel.MainViewModel viewmodel = mViewmodel;
        java.lang.String viewmodelSelectedCharItemNickName = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.selectedCharItem
                    viewmodelSelectedCharItem = viewmodel.getSelectedCharItem();
                }
                updateLiveDataRegistration(0, viewmodelSelectedCharItem);


                if (viewmodelSelectedCharItem != null) {
                    // read viewmodel.selectedCharItem.getValue()
                    viewmodelSelectedCharItemGetValue = viewmodelSelectedCharItem.getValue();
                }


                if (viewmodelSelectedCharItemGetValue != null) {
                    // read viewmodel.selectedCharItem.getValue().occupation
                    viewmodelSelectedCharItemOccupation = viewmodelSelectedCharItemGetValue.getOccupation();
                    // read viewmodel.selectedCharItem.getValue().img
                    viewmodelSelectedCharItemImg = viewmodelSelectedCharItemGetValue.getImg();
                    // read viewmodel.selectedCharItem.getValue().status
                    viewmodelSelectedCharItemStatus = viewmodelSelectedCharItemGetValue.getStatus();
                    // read viewmodel.selectedCharItem.getValue().name
                    viewmodelSelectedCharItemName = viewmodelSelectedCharItemGetValue.getName();
                    // read viewmodel.selectedCharItem.getValue().appearance
                    viewmodelSelectedCharItemAppearance = viewmodelSelectedCharItemGetValue.getAppearance();
                    // read viewmodel.selectedCharItem.getValue().nickName
                    viewmodelSelectedCharItemNickName = viewmodelSelectedCharItemGetValue.getNickName();
                }


                if (viewmodelSelectedCharItemOccupation != null) {
                    // read viewmodel.selectedCharItem.getValue().occupation.toString()
                    viewmodelSelectedCharItemOccupationToString = viewmodelSelectedCharItemOccupation.toString();
                }
                // read viewmodel.selectedCharItem.getValue().occupation != null
                viewmodelSelectedCharItemOccupationJavaLangObjectNull = (viewmodelSelectedCharItemOccupation) != (null);
                // read viewmodel.selectedCharItem.getValue().img != null
                viewmodelSelectedCharItemImgJavaLangObjectNull = (viewmodelSelectedCharItemImg) != (null);
                // read @android:string/status
                statusTvAndroidStringStatusViewmodelSelectedCharItemStatus = statusTv.getResources().getString(R.string.status, viewmodelSelectedCharItemStatus);
                // read viewmodel.selectedCharItem.getValue().status != null
                viewmodelSelectedCharItemStatusJavaLangObjectNull = (viewmodelSelectedCharItemStatus) != (null);
                // read viewmodel.selectedCharItem.getValue().name != null
                viewmodelSelectedCharItemNameJavaLangObjectNull = (viewmodelSelectedCharItemName) != (null);
                // read @android:string/nickname
                nicknameTvAndroidStringNicknameViewmodelSelectedCharItemNickName = nicknameTv.getResources().getString(R.string.nickname, viewmodelSelectedCharItemNickName);
                // read viewmodel.selectedCharItem.getValue().nickName != null
                viewmodelSelectedCharItemNickNameJavaLangObjectNull = (viewmodelSelectedCharItemNickName) != (null);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelSelectedCharItemOccupationJavaLangObjectNull) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelSelectedCharItemImgJavaLangObjectNull) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelSelectedCharItemStatusJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelSelectedCharItemNameJavaLangObjectNull) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelSelectedCharItemNickNameJavaLangObjectNull) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
                if (viewmodelSelectedCharItemAppearance != null) {
                    // read viewmodel.selectedCharItem.getValue().appearance.toString()
                    viewmodelSelectedCharItemAppearanceToString = viewmodelSelectedCharItemAppearance.toString();
                }


                // read @android:string/occupation
                occupationTvAndroidStringOccupationViewmodelSelectedCharItemOccupationToString = occupationTv.getResources().getString(R.string.occupation, viewmodelSelectedCharItemOccupationToString);
                // read viewmodel.selectedCharItem.getValue().occupation != null ? View.GONE : View.VISIBLE
                viewmodelSelectedCharItemOccupationJavaLangObjectNullViewGONEViewVISIBLE = ((viewmodelSelectedCharItemOccupationJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read viewmodel.selectedCharItem.getValue().img != null ? View.VISIBLE : View.GONE
                viewmodelSelectedCharItemImgJavaLangObjectNullViewVISIBLEViewGONE = ((viewmodelSelectedCharItemImgJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewmodel.selectedCharItem.getValue().status != null ? View.VISIBLE : View.GONE
                viewmodelSelectedCharItemStatusJavaLangObjectNullViewVISIBLEViewGONE = ((viewmodelSelectedCharItemStatusJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewmodel.selectedCharItem.getValue().name != null ? View.VISIBLE : View.GONE
                viewmodelSelectedCharItemNameJavaLangObjectNullViewVISIBLEViewGONE = ((viewmodelSelectedCharItemNameJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewmodel.selectedCharItem.getValue().nickName != null ? View.GONE : View.VISIBLE
                viewmodelSelectedCharItemNickNameJavaLangObjectNullViewGONEViewVISIBLE = ((viewmodelSelectedCharItemNickNameJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read @android:string/season_appearances
                seasonAppearanceTvAndroidStringSeasonAppearancesViewmodelSelectedCharItemAppearanceToString = seasonAppearanceTv.getResources().getString(R.string.season_appearances, viewmodelSelectedCharItemAppearanceToString);
                // read viewmodel.selectedCharItem.getValue().appearance.toString() != null
                viewmodelSelectedCharItemAppearanceToStringJavaLangObjectNull = (viewmodelSelectedCharItemAppearanceToString) != (null);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelSelectedCharItemAppearanceToStringJavaLangObjectNull) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }


                // read viewmodel.selectedCharItem.getValue().appearance.toString() != null ? View.VISIBLE : View.GONE
                viewmodelSelectedCharItemAppearanceToStringJavaLangObjectNullViewVISIBLEViewGONE = ((viewmodelSelectedCharItemAppearanceToStringJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.characterImage.setVisibility(viewmodelSelectedCharItemImgJavaLangObjectNullViewVISIBLEViewGONE);
            com.example.breakingbad.util.BindingAdapterKt.bindImage(this.characterImage, viewmodelSelectedCharItemImg);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.characterName, viewmodelSelectedCharItemName);
            this.characterName.setVisibility(viewmodelSelectedCharItemNameJavaLangObjectNullViewVISIBLEViewGONE);
            this.nicknameTv.setVisibility(viewmodelSelectedCharItemNickNameJavaLangObjectNullViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nicknameTv, nicknameTvAndroidStringNicknameViewmodelSelectedCharItemNickName);
            this.occupationTv.setVisibility(viewmodelSelectedCharItemOccupationJavaLangObjectNullViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.occupationTv, occupationTvAndroidStringOccupationViewmodelSelectedCharItemOccupationToString);
            this.seasonAppearanceTv.setVisibility(viewmodelSelectedCharItemAppearanceToStringJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.seasonAppearanceTv, seasonAppearanceTvAndroidStringSeasonAppearancesViewmodelSelectedCharItemAppearanceToString);
            this.statusTv.setVisibility(viewmodelSelectedCharItemStatusJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statusTv, statusTvAndroidStringStatusViewmodelSelectedCharItemStatus);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.selectedCharItem
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
        flag 3 (0x4L): viewmodel.selectedCharItem.getValue().status != null ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewmodel.selectedCharItem.getValue().status != null ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewmodel.selectedCharItem.getValue().img != null ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewmodel.selectedCharItem.getValue().img != null ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewmodel.selectedCharItem.getValue().occupation != null ? View.GONE : View.VISIBLE
        flag 8 (0x9L): viewmodel.selectedCharItem.getValue().occupation != null ? View.GONE : View.VISIBLE
        flag 9 (0xaL): viewmodel.selectedCharItem.getValue().nickName != null ? View.GONE : View.VISIBLE
        flag 10 (0xbL): viewmodel.selectedCharItem.getValue().nickName != null ? View.GONE : View.VISIBLE
        flag 11 (0xcL): viewmodel.selectedCharItem.getValue().name != null ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewmodel.selectedCharItem.getValue().name != null ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewmodel.selectedCharItem.getValue().appearance.toString() != null ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewmodel.selectedCharItem.getValue().appearance.toString() != null ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}