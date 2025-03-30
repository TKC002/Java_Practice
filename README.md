# Java_Practice
## コンパイル
- -sourcepathはどこをルートにするか(この場合src)
- -dはクラスファイルをどこに出すか(この場合bin)
```
javac -sourcepath src -d bin src/*.java
```

## 実行
- -cpはクラスファイルがどこにあるか(この場合はbin)
```
java -cp bin Main
```