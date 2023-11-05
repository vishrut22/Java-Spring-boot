# Java-Spring-boot
Spring boot with all core concepts

## Enable devtools
Do follow this link https://stackoverflow.com/questions/69449905/how-to-enable-spring-boot-live-dev-tools-on-intellij-2021-2-to-rebuild-classes-a
And add following dependency
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-devtools</artifactId>
<optional>true</optional>
</dependency>

Applications that use spring-boot-devtools automatically restart whenever files on the classpath change. This can be a useful feature when working in an IDE, as it gives a very fast feedback loop for code changes. By default, any entry on the classpath that points to a directory is monitored for changes

If you want that after every save your application should not be restarted but there should be some trigger hich helps spring edev tools to detect the restart you can use following props.
spring.devtools.restart.trigger-file=.reloadtrigger

currently commented this in application.props to get initla undderstanding.