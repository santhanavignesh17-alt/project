public class calculator {
  public int calculate(int a,int b,char op){
    operation operation=operationfactory.getobject(op);
    return operation.calculate(a, b);
  }
}
