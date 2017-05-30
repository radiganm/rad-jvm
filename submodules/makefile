#!/usr/bin/make
## makefile
## Copyright 2005 Mac Radigan
## All Rights Reserved

.PHONY: submodules clean clobber dox
.DEFAULT_GOAL := post-install

submodules: submodules
	(cd librad; ./configure)
	$(MAKE) -C librad

pre-install:
	(cd librad; ./bootstrap.sh)
	./update.sh

post-install: submodules

dox:
	$(MAKE) -C $@

clean:

clobber: clean

## *EOF*
