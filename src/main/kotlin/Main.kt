package org.example

import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.cache.normalized.apolloStore
import org.example.foo.Foo
import org.example.foo.bar

fun main() {
  val foo = Foo()
  val bar = foo.bar
  val bar2 = foo.bar()

  val apolloClient = ApolloClient.Builder().build()
  val apolloStore = apolloClient.apolloStore
  val apolloStore2 = apolloClient.apolloStore()
}
