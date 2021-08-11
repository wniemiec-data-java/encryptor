![](https://github.com/wniemiec-data-java/encryptor/blob/master/docs/img/logo/logo.jpg)

<h1 align='center'>Encryptor</h1>
<p align='center'>Text encryptor.</p>
<p align="center">
	<a href="https://github.com/wniemiec-data-java/encryptor/actions/workflows/windows.yml"><img src="https://github.com/wniemiec-data-java/encryptor/actions/workflows/windows.yml/badge.svg" alt=""></a>
	<a href="https://github.com/wniemiec-data-java/encryptor/actions/workflows/macos.yml"><img src="https://github.com/wniemiec-data-java/encryptor/actions/workflows/macos.yml/badge.svg" alt=""></a>
	<a href="https://github.com/wniemiec-data-java/encryptor/actions/workflows/ubuntu.yml"><img src="https://github.com/wniemiec-data-java/encryptor/actions/workflows/ubuntu.yml/badge.svg" alt=""></a>
	<a href="https://codecov.io/gh/wniemiec-data-java/encryptor"><img src="https://codecov.io/gh/wniemiec-data-java/encryptor/branch/master/graph/badge.svg?token=R2SFS4SP86" alt="Coverage status"></a>
	<a href="http://java.oracle.com"><img src="https://img.shields.io/badge/java-11+-D0008F.svg" alt="Java compatibility"></a>
	<a href="https://mvnrepository.com/artifact/io.github.wniemiec-data-java/encryptor"><img src="https://img.shields.io/maven-central/v/io.github.wniemiec-data-java/encryptor" alt="Maven Central release"></a>
	<a href="https://github.com/wniemiec-data-java/encryptor/blob/master/LICENSE"><img src="https://img.shields.io/github/license/wniemiec-data-java/encryptor" alt="License"></a>
</p>
<hr />

## ❇ Introduction
Encrypts texts in a simple way.

## ❓ How to use
1. Add one of the options below to the pom.xml file: 

#### Using Maven Central (recomended):
```
<dependency>
  <groupId>io.github.wniemiec-data-java</groupId>
  <artifactId>encryptor</artifactId>
  <version>LATEST</version>
</dependency>
```

#### Using GitHub Packages:
```
<dependency>
  <groupId>wniemiec.data.java</groupId>
  <artifactId>encryptor</artifactId>
  <version>LATEST</version>
</dependency>
```

2. Run
```
$ mvn install
```

3. Use it
```
[...]

import wniemiec.data.java.Encryptors;
import wniemiec.data.java.Encryptor;

[...]

Encryptor md5Encryptor = Encryptors.md5();

System.out.println( md5Encryptor.encrypt("Hello World") );
```

## 📖 Documentation
|        Property        |Type|Description|Default|
|----------------|-------------------------------|-----------------------------|--------|
|encrypt |`text: String`|Text to be encripted| - |

## 🚩 Changelog
Details about each version are documented in the [releases section](https://github.com/williamniemiec/wniemiec-data-java/encryptor/releases).

## 🤝 Contribute!
See the documentation on how you can contribute to the project [here](https://github.com/wniemiec-data-java/encryptor/blob/master/CONTRIBUTING.md).

## 📁 Files

### /
|        Name        |Type|Description|
|----------------|-------------------------------|-----------------------------|
|dist |`Directory`|Released versions|
|docs |`Directory`|Documentation files|
|src     |`Directory`| Source files|
