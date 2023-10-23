# Methods
--

## Method Parts

```java

modifier <method-type> return-type methodName(optional params){
    body
}

```
--

|modifier|details|
|---|---|
|private|Only the class in which it is declared can see and access the method. This is the most restrictive access level.|
|protected|Protected access gives subclasses a chance to use the method, while preventing a non-related class from trying to use it.|
|public|Every class everywhere has access to the method.|

--
## method type

`static` makes the method a **class** method.

--

## return type

The data type of what comes after the `return` keyword in the body of your function.
--

```java

public static String returnString(){
    return "My data type is this method's return type.";
}


