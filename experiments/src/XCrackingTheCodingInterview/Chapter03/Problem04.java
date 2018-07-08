package XCrackingTheCodingInterview.Chapter03;


import java.util.Stack;

class MyQueue<T>{
   Stack<T> stackNewest, stackOldest;

   public MyQueue(){
       stackNewest = new Stack<>();
       stackOldest = new Stack<>();
   }

   public int size(){
       return stackNewest.size()+stackOldest.size();
   }

   public void add(T value){
       stackNewest.push(value);
   }

   private void shiftStacks(){
       if(stackOldest.isEmpty()){
           while(!stackNewest.isEmpty()){
               stackOldest.push(stackNewest.pop());
           }
       }
   }

   public T peek(){
       shiftStacks();
       return stackOldest.peek();
   }

    public T remove(){
        shiftStacks();
        return stackOldest.pop();
    }
}

public class Problem04 {
}
