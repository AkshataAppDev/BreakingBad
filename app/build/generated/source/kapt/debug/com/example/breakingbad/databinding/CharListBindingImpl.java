package com.example.breakingbad.databinding;
import com.example.breakingbad.R;
import com.example.breakingbad.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CharListBindingImpl extends CharListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.country_content_id, 3);
        sViewsWithIds.put(R.id.characterSearch, 4);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CharListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private CharListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.appcompat.widget.SearchView) bindings[4]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.ProgressBar) bindings[2]
            );
        this.charRecyclerView.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.example.breakingbad.viewmodel.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.breakingbad.viewmodel.MainViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelCharItems((androidx.lifecycle.LiveData<java.util.List<com.example.breakingbad.database.CharacterModel>>) object, fieldId);
            case 1 :
                return onChangeViewModelStatus((androidx.lifecycle.LiveData<com.example.breakingbad.database.APIStatus>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCharItems(androidx.lifecycle.LiveData<java.util.List<com.example.breakingbad.database.CharacterModel>> ViewModelCharItems, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelStatus(androidx.lifecycle.LiveData<com.example.breakingbad.database.APIStatus> ViewModelStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        androidx.lifecycle.LiveData<java.util.List<com.example.breakingbad.database.CharacterModel>> viewModelCharItems = null;
        androidx.lifecycle.LiveData<com.example.breakingbad.database.APIStatus> viewModelStatus = null;
        java.util.List<com.example.breakingbad.database.CharacterModel> viewModelCharItemsGetValue = null;
        com.example.breakingbad.database.APIStatus viewModelStatusGetValue = null;
        com.example.breakingbad.viewmodel.MainViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.charItems
                        viewModelCharItems = viewModel.getCharItems();
                    }
                    updateLiveDataRegistration(0, viewModelCharItems);


                    if (viewModelCharItems != null) {
                        // read viewModel.charItems.getValue()
                        viewModelCharItemsGetValue = viewModelCharItems.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.status
                        viewModelStatus = viewModel.getStatus();
                    }
                    updateLiveDataRegistration(1, viewModelStatus);


                    if (viewModelStatus != null) {
                        // read viewModel.status.getValue()
                        viewModelStatusGetValue = viewModelStatus.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.example.breakingbad.util.BindingAdapterKt.bindRecyclerView(this.charRecyclerView, viewModelCharItemsGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.example.breakingbad.util.BindingAdapterKt.bindStatus(this.progress, viewModelStatusGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.charItems
        flag 1 (0x2L): viewModel.status
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}