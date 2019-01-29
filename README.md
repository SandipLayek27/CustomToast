# CustomToast
Show Success, Error, Warning, Question and Info Toast Easily. 

## Developed
[![Sandip](https://avatars1.githubusercontent.com/u/31722942?v=4&u=18643bfaaba26114584d27693e9891db26bcb582&s=39) Sandip](https://github.com/SandipLayek27)  
# ★ Gradle Dependency
Add Gradle dependency in the build.gradle file of your application module (app in the most cases) :
First Tab:

```sh
allprojects{
    repositories{
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```

AND

```sh
dependencies {
   implementation 'com.github.SandipLayek27:CustomToast:1.1'
}
```

# ★ Features are
1. SUCCESS TOAST.
2. ERROR TOAST.
3. INFO TOAST.
4. WARNING TOAST.
5. QUESTION TOAST.


# ★ Uses
```sh
String message = "Hello World";
❆ 1 SUCCESS TOAST:-
        CustomToast.getSuccessToast(MainActivity.this,message);
❆ 2 ERROR TOAST:-
        CustomToast.getErrorToast(MainActivity.this,message);
❆ 3 INFO TOAST:-
        CustomToast.getInfoToast(MainActivity.this,message);
❆ 4 WARNING TOAST:-
        CustomToast.getWarningToast(MainActivity.this,message);
❆ 5 QUESTION TOAST:-
      CustomToast.getQuestionToast(MainActivity.this,message);
```
