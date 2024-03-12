package org.example.foo

class Foo

class Bar

val Foo.bar: Bar
  get() = Bar()

@Deprecated("Use bar instead", ReplaceWith("bar"))
fun Foo.bar() = bar
