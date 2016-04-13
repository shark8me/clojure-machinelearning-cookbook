# Clojure Machine Learning Cookbook

A set of recipes/notes that I used Clojure for, in Machine Learning applications.
These recipes are not tied to a single library or platform.

### Using Clojure for Machine Learning on Apache Spark

  Here's a [short introduction that I wrote](goo.gl/E8PfcD), for Machine Learning on Apache Spark, based on support I added to the [Sparkling project](http://github.com/gorillalabls/sparkling). Sparkling is an open source project that enables using Clojure for Spark, since the "default" languages supported by Spark are limited to Java, Scala, Python and R.
  Currently, it has capabilities to
  1. train an ML classifier using some of the classifiers available on Spark
  1. Use multi-fold cross validation to evaluate scores on different validation sets
  1. Use train-test splits to evaluate scores on a single validation set, with different percentage splits
  1. Use Grid-search to find the combination of hyper parameters that achieves the lowest error on the desired metric

### Word similarity analysis using Word2Vec

 Word2Vec is a tool that converts words into high-dimension vectors. Here's a [short introduction](https://github.com/Bridgei2i/clojure-word2vec/blob/master/doc/intro.md) that uses an implementation available at the [Bridgei2i Github repo](https://github.com/Bridgei2i/clojure-word2vec).
