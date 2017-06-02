// ScriptTool.groovy
//
// Copyright 2004 Mac Radigan
// All Rights Reserved

  package org.radigan.system.interpreter

  import org.radigan.system.tools.AbstractTool
  import org.apache.bsf.BSFManager
  import org.apache.bsf.util.IOUtils

  public class ScriptTool extends AbstractTool {

    public String getName() {
      return "script"
    }

    public String getDescription() {
      return "Runs the script interpreter."
    }

    public void initialize() {
      cli.usage = "${getName()} -f <filename> [-h]"
      cli.with {
          h longOpt: 'help',   'show usage information'
          g longOpt: 'debug',  'turn debugging on'
          f longOpt: 'file',   'file',  args:1, argName:'file', required:true
      }
    }

    public int run() {
      BSFManager.registerScriptingEngine("groovy", "org.codehaus.groovy.bsf.GroovyEngine", ["groovy", "gy", "g", "java"] as String[])
      def manager = new BSFManager()
      def language = manager.getLangFromFilename(opt.f)
      def script = IOUtils.getStringFromReader(new FileReader(opt.f))
      manager.exec(language, opt.f, 0, 0, script)
      return 0
    }

  }

/* *EOF* */
