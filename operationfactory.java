public class operationfactory {
  private  static  final operation addion =new addion() ;
  private static  final operation sub=new sub();  
  private static final operation multi=new multi();
  
  
  public  static operation getobject(char operator){
  if(operator=='+'){
    return addion;
  }
  else if(operator=='-'){
    return sub;
  }
  else  {
    return multi;
   }

}
}