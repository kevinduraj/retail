#!/bin/bash

sbt assembly
dse spark-submit --class Kevin target/scala-2.10/spark-retail-assembly-1.1.jar

