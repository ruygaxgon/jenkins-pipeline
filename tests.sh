#!/bin/sh

#Test case 1
test $(curl localhost:8090/sum?a=5&b=5) -eq 10
