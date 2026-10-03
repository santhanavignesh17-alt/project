 class div implements operation {

  @Override
  public int calculate(int a, int b) {
    // TODO Auto-generated method stub
    if(b==0){
      throw new ArithmeticException("Division by zero is not allowed");
    }
   return  a/b;
  }
  
}
