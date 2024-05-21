plugins {
    id("java")
    id("application")
}

application {
    mainClass.set("com.wiktormalyska.Website")
}

group = "com.wiktormalyska"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}