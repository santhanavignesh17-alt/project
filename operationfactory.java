public class operationfactory {
  private  static  final operation addion =new addion() ;
  private static  final operation sub=new sub();  
    
  
   public  static operation getobject(char operator){
  if(operator=='+'){
    return addion;
  }
  else {
    return sub;
  }

   }
}
