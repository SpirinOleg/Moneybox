package com.example.moneybox.main

import android.app.Application
import android.util.Log
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Operation
import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.cache.http.HttpCachePolicy
import com.apollographql.apollo.cache.normalized.CacheKey
import com.apollographql.apollo.cache.normalized.CacheKeyResolver
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.io.File

class App: Application() {

    private val baseUrl = "http://moneybox.pro/graphql-playground"
    val apolloClient = ApolloClient.builder()
            .serverUrl(baseUrl)
            .build()

}