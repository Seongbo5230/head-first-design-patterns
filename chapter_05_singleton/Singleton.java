public class Singleton {
  private volatile static Singleton uniqueInstance;

  private Singleton() {}

  
  public static Singleton getInstance() {
    if (uniqueInstance == null) {
      synchronized (Singleton.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new Singleton();
        }
      }
    }
  }
}

// synchronized keyword forces every thread to wait its turn before it can 
// enter the method - multithreading issue

// volatile keyword ensures that multiple threads handle the uniqueInstance
// variable correctly when it is being initialized to the Singleton instance
