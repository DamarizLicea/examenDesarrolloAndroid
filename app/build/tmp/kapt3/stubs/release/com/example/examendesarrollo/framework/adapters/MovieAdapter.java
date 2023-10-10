package com.example.examendesarrollo.framework.adapters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0004\u001a\u00020\u0005J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0012H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/example/examendesarrollo/framework/adapters/MovieAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/examendesarrollo/framework/adapters/viewholders/MovieViewHolder;", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "data", "", "Lcom/example/examendesarrollo/data/network/model/movie/Result;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getItemCount", "", "initCustomAdapter", "", "onBindViewHolder", "viewHolder", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "i", "app_release"})
public final class MovieAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.examendesarrollo.framework.adapters.viewholders.MovieViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.examendesarrollo.data.network.model.movie.Result> data;
    public android.content.Context context;
    
    public MovieAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.examendesarrollo.data.network.model.movie.Result> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.examendesarrollo.data.network.model.movie.Result> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    public final void initCustomAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.examendesarrollo.data.network.model.movie.Result> data, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.examendesarrollo.framework.adapters.viewholders.MovieViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup viewGroup, int i) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.examendesarrollo.framework.adapters.viewholders.MovieViewHolder viewHolder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
}