package OCPII.nest;

public class AnonymousClass {
    abstract class SaleTodayOnly{
        abstract int dollarsOff();
    }
    public int admission(int basePrice){

        //hier lijkt alsof je een abstracte klass instantieert maar eigenlijk declareer je
        //een anonieme klasse zonder naam die de interface implementeert
        //niet zoals bij local klasses kan je allebei interface en een klasse extenden

        SaleTodayOnly sale = new SaleTodayOnly(){
            public int dollarsOff(){
                return 3;
            }
            //hier op syntax letten van ;
        };
        return basePrice - sale.dollarsOff();
    }
}
