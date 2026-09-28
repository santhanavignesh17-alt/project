public class operationfactory {
  private  static  final operation addion =new addion() ;
  private static  final operation sub=new sub();  
  private static final operation multi=new multi();
  private static final operation div=new div();
  
  public  static operation getobject(char operator){
  if(operator=='+'){
    return addion;
  }
  else if(operator=='-'){
    return sub;
  }
  else if(operator=='/'){ 
    return div;
   }
else{
  return multi;
}
}
}