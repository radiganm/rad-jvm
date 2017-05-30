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
	mvn $@

## *EOF*
