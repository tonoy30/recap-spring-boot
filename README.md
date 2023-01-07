java bean:

1. no args constructor

2. getter and setter of properties

3. Implements serializable interface

pojo:

1. plan old java object

spring bean:

1. instance of a class managed by spring container/context

2. if multiple bean found make one primary by using @Primary annotation

---

@Component

1. can be used in nay class

2. very easy just add the annotation

3. field, fetter or constructor injection used for @Autowaring

4. spring framework create the bean

5. most recommended approach

@Bean

1. Typically used on methods in spring configuration classes

2. you have to write all the code

3. method call or method parameters used for @Autowaring

4. used write the bean creation code

5. custom business  logic and instantiating third party bean 