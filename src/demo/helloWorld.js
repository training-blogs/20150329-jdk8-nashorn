
var HelloHelper = Java.type("demo.HelloHelper");
var helper = new HelloHelper();

function sayHelloImpl(name) {
    return helper.getPrefix() + ", " + name;
}

function newHelloWorld() {
    return new Packages.demo.HelloWorld() {
        sayHello: sayHelloImpl
    };
}

newHelloWorld();
