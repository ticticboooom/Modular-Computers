package ticticboooom.modularcomputers.engine;

import jdk.nashorn.api.scripting.NashornScriptEngineFactory;
import jdk.nashorn.internal.runtime.linker.NashornGuards;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;

public class ScriptManager {
    private static final String[] BLOCKED_FUNCTIONS = {
            "print",
            "load",
            "loadWithNewGlobal",
            "exit",
            "quit"
    };
    public void init(){
        ScriptEngine engine = new NashornScriptEngineFactory().getScriptEngine(s -> false);

        ScriptContext context = engine.getContext();

        for (String blocked : BLOCKED_FUNCTIONS) {
            context.removeAttribute(blocked, context.getAttributesScope(blocked));
        }
    }
}
