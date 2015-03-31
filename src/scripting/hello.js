
var name = "Duke";
function hello() {
    print("hey: ${name}");
}
hello();

var envs = $ENV;
for each(e in envs) {
    print("${e}");
}

$EXEC("whoami");
var result = $OUT;
print(result);

var date = new java.util.Date();
print(date);

var run = new java.lang.Runnable({
    run: function() {
        print('Execute me');
    }
});
run.run();
