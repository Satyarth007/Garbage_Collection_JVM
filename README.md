# Garbage_Collection_JVM

### In Java, GC is a feature which runs as daemon thread by JVM to clean useless objects. It prevents from OOM exceptions.

### Ways to make Object eligible for GC:- 
#### - Nullifying the object
        - Student s1 = new Student();
        - s1 = null;

#### - Re-assigning the reference variable
        - s1 = new student();
        - s2 = s1;

#### - Objects created inside a methods
        - look for java files with prefix names as GC_method_3_

#### - Islands of Isolation
        - look for java files with prefix names as IOI_


### Ways to Request JVM to execute GC for us: 
#### - By using System class
        - System class has gc() method 

#### - By using Runtime Class
        - Runtime r = Runtime.getRuntime();
        - r.freeMemory() -> Tells  stats of free memory in machine
        - r.totalMemory() -> Tells stats of total memory in machine
        - r.gc() -> runs the garbage collection

### Note: Performance wise use `Runtime.getRuntime().gc()` becuase internally System class gc() is nothing but `Runtime.getRuntime().gc()` only.

### ⭐ Finalization: 

#### - Just before destroying an Object, GC call finalize() method to perform cleanup activities like removing sessions, db connectivity, etc.
#### - `protected void finalize() throws Throwable` 
#### - finalize() is present in Object class
#### - we can override the finalize() in our own class to define custom cleanup activiy.

### Cases associated with Finalize() :- 
#### - Case1: For which object you are calling finalize() matters the most. See Java file - *FinalizeCase1.java*
#### - Case2: We can call finalize() explicitly, then it will be called as normal function and object won't be destroyed. See Java file - *FinalizeCase2.java*
#### - Case3: GC runs finalize() method on a particular object only once, even if the same object is available for GC multiple times. See Java file - *FinalizeCase3.java*
#### - Case4: We can't expect exact beaviour of GC, it is varied from JVM to JVM. See Java file - *FinalizeCase4.java*


### ⭐ Memory Leaks: 
#### - Object which are not usable in our programme and also not eligible for GC, such type of objects are called *Memory Leaks*
#### - Causes OOM's

