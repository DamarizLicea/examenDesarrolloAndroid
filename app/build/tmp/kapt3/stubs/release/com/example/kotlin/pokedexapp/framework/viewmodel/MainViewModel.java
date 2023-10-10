package com.example.kotlin.pokedexapp.framework.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fR\u001f\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/kotlin/pokedexapp/framework/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "movieListLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/examendesarrollo/data/network/model/movie/Result;", "getMovieListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "popularListRequirement", "Lcom/example/examendesarrollo/domain/usecase/MovieListRequirement;", "fetchAllPopularMovies", "", "app_release"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.examendesarrollo.data.network.model.movie.Result>> movieListLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.examendesarrollo.domain.usecase.MovieListRequirement popularListRequirement = null;
    
    public MainViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.examendesarrollo.data.network.model.movie.Result>> getMovieListLiveData() {
        return null;
    }
    
    public final void fetchAllPopularMovies() {
    }
}