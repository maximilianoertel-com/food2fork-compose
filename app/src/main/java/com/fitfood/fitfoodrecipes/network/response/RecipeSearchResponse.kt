package com.fitfood.fitfoodrecipes.network.response

import com.fitfood.fitfoodrecipes.network.model.RecipeDto
import com.google.gson.annotations.SerializedName

data class RecipeSearchResponse(

        @SerializedName("count")
        var count: Int,

        @SerializedName("results")
        var recipes: List<RecipeDto>,
)