    //Executable class
public class DateClassTest{
    public static void main(String[] args){
        //Create a DateClass Object
    DateClass matricdate = new DateClass ();
    DateClass graddate = new DateClass ();

    //Set a date using the "setDate" SET method
    matricdate.setDate( 2018, 06, 23);
    graddate.setDate(2021, 12, 23);

    System.out.print("My Matriculation date was ");
            //Print out the date using GET methods
        System.out.println(matricdate.getYear() + "/" + matricdate.getMonth() + "/" + matricdate.getDay());
        System.out.print("My Graduation date is ");
            //Print out the date using GET methods
        System.out.println(graddate.getYear() + "/" + graddate.getMonth() + "/" + graddate.getDay());
}
}