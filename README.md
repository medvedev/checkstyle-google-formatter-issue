This project demonstrates a case when checkstyle with "google_checks.xml" fails to validate code formatted with latest google-java-formatter  

!!! Java 8 is required by latest google java formatter.

To observe the issue, please checkout code and run:  
`./gradlew googleJavaFormat checkstyleMain`

Output errors (full paths replaced with "..."):
`[ant:checkstyle] [WARN] .../AnnotatedClass.java:7: 'initParams' has incorrect indentation level 2, expected level should be 4. [Indentation]
 [ant:checkstyle] [WARN] .../AnnotatedClass.java:12: '}' has incorrect indentation level 2, expected level should be 4. [Indentation]
`