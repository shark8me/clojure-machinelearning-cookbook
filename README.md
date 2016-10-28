# Clojure Machine Learning Cookbook

A set of recipes/notes that I developed or used for Clojure, in Machine Learning applications.
These recipes are not tied to a single library or platform.

### Using Clojure for Machine Learning on Apache Spark

  A [short introduction](goo.gl/E8PfcD) to Machine Learning on Apache Spark with Clojure, based on support I added to the [Sparkling project](http://github.com/gorillalabs/sparkling). Sparkling is an open source project that enables using Clojure for Spark, since the "default" languages supported by Spark are limited to Java, Scala, Python and R.
  Currently, it has capabilities to
  1. train an ML classifier using some of the classifiers available on Spark
  1. Use multi-fold cross validation to evaluate scores on different validation sets
  1. Use train-test splits to evaluate scores on a single validation set, with different percentage splits
  1. Use Grid-search to find the combination of hyper parameters that achieves the lowest error on the desired metric

### Word similarity analysis using Word2Vec

 Word2Vec is a tool that converts words into high-dimension vectors. Here's a [short introduction](https://github.com/Bridgei2i/clojure-word2vec/blob/master/doc/intro.md) that uses an implementation available at the [Bridgei2i Github repo](https://github.com/Bridgei2i/clojure-word2vec).

### Displaying Core.matrix datasets as HTML tables in Gorilla-repl

Gorilla-repl is an extremely useful tool for Data Analysis in Clojure. Since I work a lot with [core.matrix](https://github.com/mikera/core.matrix), I need to eyeball the data-set as it goes through data transformations. I developed [a plugin to view core.matrix datasets as HTML tables](https://github.com/shark8me/core-matrix-gorilla), with options to control the number of rows and columns that are displayed. An example gorilla-repl worksheet is [at this link](http://viewer.gorilla-repl.org/view.html?source=github&user=shark8me&repo=clojure-machinelearning-cookbook&path=core.matrix-gorilla/ws/coremat.cljw). 
