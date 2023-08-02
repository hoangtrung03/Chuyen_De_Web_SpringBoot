package com.example.cdwebbe.payload;

import com.example.cdwebbe.model.Genres;
import com.example.cdwebbe.model.ProductionCompany;
import com.example.cdwebbe.model.ProductionCountries;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;
import java.util.List;
@Getter
@Setter
public class MovieRequest {
    @NotNull
    private String slug;
    @NotNull
    private String title;
    @Nullable
    private String posterUrl;
    @Nullable
    private String backdropUrl;
    @Nullable
    private List<Genres> genres;
    @Nullable
    private String releaseDate;
    @Nullable
    private String overview;
    @Nullable
    private List<ProductionCompany> productionCompanies;
    @Nullable
    private List<ProductionCountries> productionCountries;
    @NotNull
    private String url;


}
