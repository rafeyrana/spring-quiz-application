
// package com.rafey.quiz.application;

// import org.springframework.boot.CommandLineRunner;
// import org.springframework.stereotype.Component;
// import com.rafey.quiz.application.Dao.QuestionDao;

// @Component
// public class QuestionRepository implements CommandLineRunner {

//     private final QuestionDao questionDao;

//     public QuestionRepository(QuestionDao questionDao) {
//         this.questionDao = questionDao;
//     }

//     @Override
//     public void run(String... args) throws Exception {
//         // Create and insert sample data

//         // Python Category
//         Question pythonQuestion1 = new Question();
//         pythonQuestion1.setCategory("Python");
//         pythonQuestion1.setDifficulty("Easy");
//         pythonQuestion1.setQuestionTitle("What is the output of print(2 + 3)?");
//         pythonQuestion1.setOption1("5");
//         pythonQuestion1.setOption2("6");
//         pythonQuestion1.setOption3("2 + 3");
//         pythonQuestion1.setOption4("23");
//         pythonQuestion1.setCorrectOption("A");
//         questionDao.save(pythonQuestion1);

//         Question pythonQuestion2 = new Question();
//         pythonQuestion2.setCategory("Python");
//         pythonQuestion2.setDifficulty("Medium");
//         pythonQuestion2.setQuestionTitle("Which Python keyword is used to define a function?");
//         pythonQuestion2.setOption1("function");
//         pythonQuestion2.setOption2("def");
//         pythonQuestion2.setOption3("define");
//         pythonQuestion2.setOption4("fun");
//         pythonQuestion2.setCorrectOption("B");
//         questionDao.save(pythonQuestion2);

//         // Add more Python questions here...

//         // JavaScript Category
//         Question jsQuestion1 = new Question();
//         jsQuestion1.setCategory("JavaScript");
//         jsQuestion1.setDifficulty("Easy");
//         jsQuestion1.setQuestionTitle("What does 'JS' stand for in JavaScript?");
//         jsQuestion1.setOption1("Java Server");
//         jsQuestion1.setOption2("Java Source");
//         jsQuestion1.setOption3("JavaScript");
//         jsQuestion1.setOption4("Java Scripting");
//         jsQuestion1.setCorrectOption("C");
//         questionDao.save(jsQuestion1);

//         Question jsQuestion2 = new Question();
//         jsQuestion2.setCategory("JavaScript");
//         jsQuestion2.setDifficulty("Medium");
//         jsQuestion2.setQuestionTitle("Which of the following is not a JavaScript data type?");
//         jsQuestion2.setOption1("Number");
//         jsQuestion2.setOption2("Boolean");
//         jsQuestion2.setOption3("Function");
//         jsQuestion2.setOption4("String");
//         jsQuestion2.setCorrectOption("C");
//         questionDao.save(jsQuestion2);
//         Question cQuestion1 = new Question();
//         cQuestion1.setCategory("C");
//         cQuestion1.setDifficulty("Easy");
//         cQuestion1.setQuestionTitle("Which symbol is used for single-line comments in C?");
//         cQuestion1.setOption1("/* */");
//         cQuestion1.setOption2("//");
//         cQuestion1.setOption3("<!-- -->");
//         cQuestion1.setOption4("#");
//         cQuestion1.setCorrectOption("B");
//         questionDao.save(cQuestion1);

//         Question cQuestion2 = new Question();
//         cQuestion2.setCategory("C");
//         cQuestion2.setDifficulty("Medium");
//         cQuestion2.setQuestionTitle("What is the value of a in 'int a = 5 + 3 / 2;'?");
//         cQuestion2.setOption1("2");
//         cQuestion2.setOption2("3");
//         cQuestion2.setOption3("4");
//         cQuestion2.setOption4("5");
//         cQuestion2.setCorrectOption("C");
//         questionDao.save(cQuestion2);

//         // C++ Category
//         Question cppQuestion1 = new Question();
//         cppQuestion1.setCategory("C++");
//         cppQuestion1.setDifficulty("Easy");
//         cppQuestion1.setQuestionTitle("Which header file is needed to use cin and cout in C++?");
//         cppQuestion1.setOption1("<stdio.h>");
//         cppQuestion1.setOption2("<iostream>");
//         cppQuestion1.setOption3("<stdlib.h>");
//         cppQuestion1.setOption4("<string>");
//         cppQuestion1.setCorrectOption("B");
//         questionDao.save(cppQuestion1);

//         Question cppQuestion2 = new Question();
//         cppQuestion2.setCategory("C++");
//         cppQuestion2.setDifficulty("Medium");
//         cppQuestion2.setQuestionTitle("What is the correct syntax for declaring a class in C++?");
//         cppQuestion2.setOption1("class MyClass");
//         cppQuestion2.setOption2("class:MyClass");
//         cppQuestion2.setOption3("class = MyClass");
//         cppQuestion2.setOption4("class => MyClass");
//         cppQuestion2.setCorrectOption("A");
//         questionDao.save(cppQuestion2);

//         // Java Category
//         Question javaQuestion1 = new Question();
//         javaQuestion1.setCategory("Java");
//         javaQuestion1.setDifficulty("Easy");
//         javaQuestion1.setQuestionTitle("Which keyword is used to declare a class in Java?");
//         javaQuestion1.setOption1("class");
//         javaQuestion1.setOption2("struct");
//         javaQuestion1.setOption3("type");
//         javaQuestion1.setOption4("classdef");
//         javaQuestion1.setCorrectOption("A");
//         questionDao.save(javaQuestion1);

//         Question javaQuestion2 = new Question();
//         javaQuestion2.setCategory("Java");
//         javaQuestion2.setDifficulty("Medium");
//         javaQuestion2.setQuestionTitle("Which method is called automatically when an object is created?");
//         javaQuestion2.setOption1("start()");
//         javaQuestion2.setOption2("create()");
//         javaQuestion2.setOption3("init()");
//         javaQuestion2.setOption4("constructor()");
//         javaQuestion2.setCorrectOption("D");
//         questionDao.save(javaQuestion2);

//         Question cQuestion3 = new Question();
//         cQuestion3.setCategory("C");
//         cQuestion3.setDifficulty("Hard");
//         cQuestion3.setQuestionTitle("What is the output of printf(\"%d %d\", sizeof(int), sizeof(float)); ?");
//         cQuestion3.setOption1("4 4");
//         cQuestion3.setOption2("2 4");
//         cQuestion3.setOption3("4 8");
//         cQuestion3.setOption4("8 4");
//         cQuestion3.setCorrectOption("A");
//         questionDao.save(cQuestion3);

//         // C++ Category
//         Question cppQuestion3 = new Question();
//         cppQuestion3.setCategory("C++");
//         cppQuestion3.setDifficulty("Hard");
//         cppQuestion3.setQuestionTitle(
//                 "What is the output of the following C++ code?\nint x = 5;\ncout << (++x) + (x++) << endl;");
//         cppQuestion3.setOption1("10");
//         cppQuestion3.setOption2("11");
//         cppQuestion3.setOption3("12");
//         cppQuestion3.setOption4("15");
//         cppQuestion3.setCorrectOption("B");
//         questionDao.save(cppQuestion3);

//         // Java Category
//         Question javaQuestion3 = new Question();
//         javaQuestion3.setCategory("Java");
//         javaQuestion3.setDifficulty("Hard");
//         javaQuestion3.setQuestionTitle("What is the purpose of the 'finally' block in a try-catch-finally statement?");
//         javaQuestion3.setOption1("It is used to handle exceptions.");
//         javaQuestion3.setOption2("It is used to execute code after the try block.");
//         javaQuestion3.setOption3("It is used to skip the catch block.");
//         javaQuestion3.setOption4("It is used to prevent exceptions.");
//         javaQuestion3.setCorrectOption("B");
//         questionDao.save(javaQuestion3);
//         Question cQuestion4 = new Question();
//         cQuestion4.setCategory("C");
//         cQuestion4.setDifficulty("Medium");
//         cQuestion4.setQuestionTitle("What is the purpose of the 'sizeof' operator in C?");
//         cQuestion4.setOption1("To find the size of a file.");
//         cQuestion4.setOption2("To find the size of a variable.");
//         cQuestion4.setOption3("To find the size of a pointer.");
//         cQuestion4.setOption4("To find the size of an array.");
//         cQuestion4.setCorrectOption("B");
//         questionDao.save(cQuestion4);

//         Question cQuestion5 = new Question();
//         cQuestion5.setCategory("C");
//         cQuestion5.setDifficulty("Easy");
//         cQuestion5.setQuestionTitle("Which of the following is a valid C identifier?");
//         cQuestion5.setOption1("123abc");
//         cQuestion5.setOption2("if");
//         cQuestion5.setOption3("_abc");
//         cQuestion5.setOption4("for loop");
//         cQuestion5.setCorrectOption("C");
//         questionDao.save(cQuestion5);

//         // C++ Category
//         Question cppQuestion4 = new Question();
//         cppQuestion4.setCategory("C++");
//         cppQuestion4.setDifficulty("Medium");
//         cppQuestion4.setQuestionTitle(
//                 "What is the output of the following C++ code?\nint arr[] = {2, 4, 6, 8, 10};\ncout << *(arr + 2);");
//         cppQuestion4.setOption1("2");
//         cppQuestion4.setOption2("4");
//         cppQuestion4.setOption3("6");
//         cppQuestion4.setOption4("8");
//         cppQuestion4.setCorrectOption("C");
//         questionDao.save(cppQuestion4);

//         Question cppQuestion5 = new Question();
//         cppQuestion5.setCategory("C++");
//         cppQuestion5.setDifficulty("Hard");
//         cppQuestion5.setQuestionTitle("In C++, what is the default access specifier for members of a class?");
//         cppQuestion5.setOption1("public");
//         cppQuestion5.setOption2("private");
//         cppQuestion5.setOption3("protected");
//         cppQuestion5.setOption4("default");
//         cppQuestion5.setCorrectOption("B");
//         questionDao.save(cppQuestion5);

//         // Java Category
//         Question javaQuestion4 = new Question();
//         javaQuestion4.setCategory("Java");
//         javaQuestion4.setDifficulty("Easy");
//         javaQuestion4.setQuestionTitle("Which of the following is a wrapper class in Java?");
//         javaQuestion4.setOption1("integer");
//         javaQuestion4.setOption2("Integer");
//         javaQuestion4.setOption3("int");
//         javaQuestion4.setOption4("float");
//         javaQuestion4.setCorrectOption("B");
//         questionDao.save(javaQuestion4);

//         Question javaQuestion5 = new Question();
//         javaQuestion5.setCategory("Java");
//         javaQuestion5.setDifficulty("Medium");
//         javaQuestion5.setQuestionTitle(
//                 "What is the output of the following Java code?\nString str = \"Hello\";\nstr.concat(\" World\");\nSystem.out.println(str);");
//         javaQuestion5.setOption1("Hello");
//         javaQuestion5.setOption2("World");
//         javaQuestion5.setOption3("Hello World");
//         javaQuestion5.setOption4("None of the above");
//         javaQuestion5.setCorrectOption("A");
//         questionDao.save(javaQuestion5);

//         Question cQuestion6 = new Question();
//         cQuestion6.setCategory("C");
//         cQuestion6.setDifficulty("Medium");
//         cQuestion6.setQuestionTitle("Which operator is used to access the value stored at a memory address in C?");
//         cQuestion6.setOption1("&");
//         cQuestion6.setOption2("*");
//         cQuestion6.setOption3("->");
//         cQuestion6.setOption4(".");
//         cQuestion6.setCorrectOption("B");
//         questionDao.save(cQuestion6);

//         Question cQuestion7 = new Question();
//         cQuestion7.setCategory("C");
//         cQuestion7.setDifficulty("Hard");
//         cQuestion7.setQuestionTitle(
//                 "What is the output of the following C code?\nint x = 5;\nprintf(\"%d\", x++ * ++x);");
//         cQuestion7.setOption1("10");
//         cQuestion7.setOption2("20");
//         cQuestion7.setOption3("30");
//         cQuestion7.setOption4("Error");
//         cQuestion7.setCorrectOption("A");
//         questionDao.save(cQuestion7);

//         // C++ Category
//         Question cppQuestion6 = new Question();
//         cppQuestion6.setCategory("C++");
//         cppQuestion6.setDifficulty("Easy");
//         cppQuestion6
//                 .setQuestionTitle("Which C++ header file should be included to work with input and output operations?");
//         cppQuestion6.setOption1("<string>");
//         cppQuestion6.setOption2("<iostream>");
//         cppQuestion6.setOption3("<stdio.h>");
//         cppQuestion6.setOption4("<fstream>");
//         cppQuestion6.setCorrectOption("B");
//         questionDao.save(cppQuestion6);

//         Question cppQuestion7 = new Question();
//         cppQuestion7.setCategory("C++");
//         cppQuestion7.setDifficulty("Medium");
//         cppQuestion7.setQuestionTitle("What is the output of the following C++ code?\nint x = 10;\nint y = x++ + x;");
//         cppQuestion7.setOption1("10");
//         cppQuestion7.setOption2("11");
//         cppQuestion7.setOption3("20");
//         cppQuestion7.setOption4("21");
//         cppQuestion7.setCorrectOption("C");
//         questionDao.save(cppQuestion7);

//         // Java Category
//         Question javaQuestion6 = new Question();
//         javaQuestion6.setCategory("Java");
//         javaQuestion6.setDifficulty("Medium");
//         javaQuestion6.setQuestionTitle("What is the purpose of the 'transient' keyword in Java?");
//         javaQuestion6.setOption1("To declare a variable as non-transient.");
//         javaQuestion6.setOption2("To make a variable thread-safe.");
//         javaQuestion6.setOption3("To mark a variable as non-static.");
//         javaQuestion6.setOption4("To indicate that a variable should not be serialized.");
//         javaQuestion6.setCorrectOption("D");
//         questionDao.save(javaQuestion6);

//         Question javaQuestion7 = new Question();
//         javaQuestion7.setCategory("Java");
//         javaQuestion7.setDifficulty("Hard");
//         javaQuestion7.setQuestionTitle("Which Java keyword is used to explicitly throw an exception?");
//         javaQuestion7.setOption1("try");
//         javaQuestion7.setOption2("catch");
//         javaQuestion7.setOption3("throw");
//         javaQuestion7.setOption4("throws");
//         javaQuestion7.setCorrectOption("C");
//         questionDao.save(javaQuestion7);
//         Question cQuestion8 = new Question();
//         cQuestion8.setCategory("C");
//         cQuestion8.setDifficulty("Medium");
//         cQuestion8.setQuestionTitle("Which data type is used to store a single character in C?");
//         cQuestion8.setOption1("char");
//         cQuestion8.setOption2("string");
//         cQuestion8.setOption3("character");
//         cQuestion8.setOption4("chr");
//         cQuestion8.setCorrectOption("A");
//         questionDao.save(cQuestion8);

//         Question cQuestion9 = new Question();
//         cQuestion9.setCategory("C");
//         cQuestion9.setDifficulty("Hard");
//         cQuestion9.setQuestionTitle("What is the value of a in 'int a = 5 / 2;'?");
//         cQuestion9.setOption1("2");
//         cQuestion9.setOption2("2.5");
//         cQuestion9.setOption3("2.0");
//         cQuestion9.setOption4("3");
//         cQuestion9.setCorrectOption("A");
//         questionDao.save(cQuestion9);

//         // C++ Category
//         Question cppQuestion8 = new Question();
//         cppQuestion8.setCategory("C++");
//         cppQuestion8.setDifficulty("Easy");
//         cppQuestion8.setQuestionTitle("Which operator is used to access the value stored at a memory address in C++?");
//         cppQuestion8.setOption1("&");
//         cppQuestion8.setOption2("*");
//         cppQuestion8.setOption3("->");
//         cppQuestion8.setOption4(".");
//         cppQuestion8.setCorrectOption("B");
//         questionDao.save(cppQuestion8);

//         Question cppQuestion9 = new Question();
//         cppQuestion9.setCategory("C++");
//         cppQuestion9.setDifficulty("Hard");
//         cppQuestion9.setQuestionTitle("What is the output of the following C++ code?\nint x = 5;\ncout << x++ << x;");
//         cppQuestion9.setOption1("55");
//         cppQuestion9.setOption2("65");
//         cppQuestion9.setOption3("56");
//         cppQuestion9.setOption4("66");
//         cppQuestion9.setCorrectOption("C");
//         questionDao.save(cppQuestion9);

//         // Java Category
//         Question javaQuestion8 = new Question();
//         javaQuestion8.setCategory("Java");
//         javaQuestion8.setDifficulty("Medium");
//         javaQuestion8.setQuestionTitle("What is the default value of a boolean variable in Java?");
//         javaQuestion8.setOption1("false");
//         javaQuestion8.setOption2("true");
//         javaQuestion8.setOption3("0");
//         javaQuestion8.setOption4("1");
//         javaQuestion8.setCorrectOption("A");
//         questionDao.save(javaQuestion8);

//         Question javaQuestion9 = new Question();
//         javaQuestion9.setCategory("Java");
//         javaQuestion9.setDifficulty("Hard");
//         javaQuestion9.setQuestionTitle(
//                 "What is the output of the following Java code?\nint x = 5;\nSystem.out.println(x++ + ++x);");
//         javaQuestion9.setOption1("10");
//         javaQuestion9.setOption2("11");
//         javaQuestion9.setOption3("12");
//         javaQuestion9.setOption4("15");
//         javaQuestion9.setCorrectOption("B");
//         questionDao.save(javaQuestion9);

//         // Add more JavaScript questions here...

//         // Add more categories (C, C++, Java) and questions here...

//         System.out.println("Sample data inserted into the database.");
//     }
// }
