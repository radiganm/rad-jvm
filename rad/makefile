#!/usr/bin/make
## makefile
##
## Copyright 2005 Mac Radigan
## All Rights Reserved

.PHONY:
.DEFAULT_GOAL := default

default: install

install:
	mvn $@

package:
	mvn $@

clean:
	mvn $@

test:
	mvn $@

run:
	env LD_LIBRARY_PATH=/opt/local/lib java -jar target/rad-1.0.0-SNAPSHOT.jar

## *EOF*
