# kotlin-logging 1.12.1 import issue

Works ok with kotlin-logging 1.12.0:

```
./mvnw clean compile
```

If you upgrade `kotlin-logging` to 1.12.1 in `pom.xml` and run the command above again you get this error:

```
[INFO] --- kotlin-maven-plugin:1.4.31:compile (compile) @ kotlin-tryout ---
[ERROR] /Users/breun/Projects/kotlin-tryout/src/main/kotlin/nl/breun/Tryout.kt: (3, 11) Unresolved reference: KotlinLogging
[ERROR] /Users/breun/Projects/kotlin-tryout/src/main/kotlin/nl/breun/Tryout.kt: (5, 22) Unresolved reference: KotlinLogging
```