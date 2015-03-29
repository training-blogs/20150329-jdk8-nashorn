package demo;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornDemo {

    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine engine = scriptEngineManager.getEngineByName("nashorn");

        HelloWorld helloWorld = loadHelloWorld(engine);

        String hello = helloWorld.sayHello("Nashorn");

        System.out.println(hello);
    }

    private static HelloWorld loadHelloWorld(ScriptEngine engine) throws ScriptException {
        return (HelloWorld) engine.eval("load('src/demo/helloWorld.js')");
    }

}
