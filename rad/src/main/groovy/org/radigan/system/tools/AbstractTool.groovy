// AbstractTool.groovy
//
// Copyright 2004 Mac Radigan
// All Rights Reserved

  package org.radigan.system.tools

  import groovy.util.CliBuilder
  import groovy.util.OptionAccessor

  public abstract class AbstractTool implements Tool {
    public CliBuilder cli = new CliBuilder()
    public OptionAccessor opt = null
    public AbstractTool() {
      initialize()
    }
    public OptionAccessor parse(String[] args) {
      opt = cli.parse(args as String[])
      return opt
    }
    public int process(String[] args) {
      opt = parse(args)
      if(!opt) return 1
      if(opt.help) { cli.usage(); return 1 }
      return run()
    }
    public abstract void initialize()
    public abstract String getName()
    public abstract String getDescription()
    public abstract int run()
  }

// *EOF*
