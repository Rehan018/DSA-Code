package SingleTons;

public class AppConfig
{
    AppConfig(){}

    //Wahh kiya seen hai:
    private static AppConfig obj=new AppConfig();
    public static AppConfig getInstance(){
        //O Bete moj kardi:
        if(obj==null){
            obj=new AppConfig();
        }
    return obj;
    }
}
