#!/bin/bash
source ../lib.sh

test_file=D:\standard.xml
num_iterations=1

print_header "TestJSoup.java" $test_file
timeit java -Xmx512m -server -jar benchmark.jar "$test_file" $num_iterations