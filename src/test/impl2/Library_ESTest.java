/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 13 16:07:54 GMT 2022
 */

package ir.ramtung.impl2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ir.ramtung.impl2.Library;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Library_ESTest extends Library_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Library library0 = new Library();
      library0.addProfMember(" (.Aa6");
      library0.timePass(3401);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Library library0 = new Library();
      try { 
        library0.timePass((-182));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // days cant be negative
         //
         verifyException("ir.ramtung.impl2.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Library library0 = new Library();
      library0.addBook("magazine`s number is incorrect", 0);
      List<String> list0 = library0.availableTitles();
      assertFalse(list0.contains("magazine`s number is incorrect"));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Library library0 = new Library();
      library0.addMagazine("x~x%\"9w~QxA-", 6992, 6979, 6992);
      List<String> list0 = library0.availableTitles();
      assertTrue(list0.contains("x~x%\"9w~QxA-"));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Library library0 = new Library();
      library0.addProfMember("");
      int int0 = library0.getTotalPenalty("");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Library library0 = new Library();
      library0.addProfMember(" (.Aa6");
      int int0 = library0.getTotalPenalty("z&!]ky3%lO");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Library library0 = new Library();
      library0.addProfMember("q2bi9Ej:%C(/RDr");
      library0.returnDocument("ir.ramtung.impl2.Reference", "ir.ramtung.impl2.Book");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Library library0 = new Library();
      library0.addProfMember("");
      library0.returnDocument("", "ir.ramtung.impl2.Book");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Library library0 = new Library();
      library0.addProfMember("~d)r-ukX*");
      library0.extend("~d)r-ukX*", "ir.ramtung.sts01.LibraryException");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Library library0 = new Library();
      library0.addStudentMember("ir.ramtung.impl2.Prof", "ir.ramtung.impl2.Prof");
      library0.extend("x~x%\"9w~QxA-", "S_!mfbw1@y@&z.nrE");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Library library0 = new Library();
      library0.addMagazine("x~x%\"9w~QxA-", 6992, 6979, 6992);
      library0.addStudentMember("ir.ramtung.impl2.Prof", "ir.ramtung.impl2.Prof");
      library0.borrow("ir.ramtung.impl2.Prof", "ir.ramtung.impl2.Prof");
      library0.borrow("ir.ramtung.impl2.Prof", "W5:VN/PYa2~nc");
      try { 
        library0.borrow("ir.ramtung.impl2.Prof", "ir.ramtung.impl2.Person");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // the member cant borrow any more
         //
         verifyException("ir.ramtung.impl2.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Library library0 = new Library();
      library0.addStudentMember("ir.ramtung.impl2.Prof", "ir.ramtung.impl2.Prof");
      library0.borrow("x~x%\"9w~QxA-", "x~x%\"9w~QxA-");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Library library0 = new Library();
      library0.addReference("", 0);
      try { 
        library0.borrow("", "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // this book doesnt exist
         //
         verifyException("ir.ramtung.impl2.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Library library0 = new Library();
      library0.addMagazine("x~x%\"9w~QxA-", 6992, 6979, 6992);
      library0.borrow("x~x%\"9w~QxA-", "x~x%\"9w~QxA-");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Library library0 = new Library();
      library0.addBook("_()vsjs", 0);
      library0.addReference("book name is empty", 0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Library library0 = new Library();
      try { 
        library0.addReference(" ", 4456);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // reference name is empty
         //
         verifyException("ir.ramtung.impl2.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Library library0 = new Library();
      library0.addReference("c", 0);
      try { 
        library0.addReference("c", 0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // the reference has already added
         //
         verifyException("ir.ramtung.impl2.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Library library0 = new Library();
      try { 
        library0.addMagazine("", (-3920), (-1214), (-3920));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // magazine`s year is incorrect
         //
         verifyException("ir.ramtung.impl2.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Library library0 = new Library();
      library0.addBook("@?F9(w/<pO", 367);
      try { 
        library0.addMagazine("#$Pi2d`3-K;YiATvX", 367, 0, 367);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // magazine`s number is incorrect
         //
         verifyException("ir.ramtung.impl2.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Library library0 = new Library();
      library0.addBook("@EFRYzWH(Oy*qo=UX|", (-1));
      try { 
        library0.addMagazine("@EFRYzWH(Oy*qo=UX|", (-1), (-1), (-1));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // the magazine has already added
         //
         verifyException("ir.ramtung.impl2.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Library library0 = new Library();
      try { 
        library0.addMagazine(" ", 1421, 0, 0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // magazine name is empty
         //
         verifyException("ir.ramtung.impl2.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Library library0 = new Library();
      library0.addBook("magazine`s number is incorrect", 0);
      try { 
        library0.addBook("magazine`s number is incorrect", 0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // the book has already added
         //
         verifyException("ir.ramtung.impl2.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Library library0 = new Library();
      library0.addMagazine("x~x%\"9w~QxA-", 6992, 6979, 6992);
      library0.addBook("ir.ramtung.sts01.LibraryException", 6992);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Library library0 = new Library();
      try { 
        library0.addBook(" ", (-133));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // book name is empty
         //
         verifyException("ir.ramtung.impl2.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Library library0 = new Library();
      library0.addProfMember("");
      try { 
        library0.addProfMember("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // the member has already added
         //
         verifyException("ir.ramtung.impl2.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Library library0 = new Library();
      library0.addStudentMember("{+TVd", "q[0H <");
      library0.addProfMember("fX9#zQm");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Library library0 = new Library();
      try { 
        library0.addProfMember(" ");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // prof name is empty
         //
         verifyException("ir.ramtung.impl2.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Library library0 = new Library();
      library0.addStudentMember("ir.ramtung.impl2.Prof", "ir.ramtung.impl2.Prof");
      library0.addStudentMember("ir.ramtung.impl2.Prof", "ir.ramtung.sts01.LibraryException");
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Library library0 = new Library();
      library0.addStudentMember("fH 8xtl^zmZ*c$", "fH 8xtl^zmZ*c$");
      try { 
        library0.addStudentMember("fH 8xtl^zmZ*c$", "fH 8xtl^zmZ*c$");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // the member has already added
         //
         verifyException("ir.ramtung.impl2.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Library library0 = new Library();
      try { 
        library0.addStudentMember("r0\";k(tVB8`iC+T!", "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // student name is empty
         //
         verifyException("ir.ramtung.impl2.Library", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Library library0 = new Library();
      try { 
        library0.addStudentMember("", "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // student id is empty
         //
         verifyException("ir.ramtung.impl2.Library", e);
      }
  }
}
