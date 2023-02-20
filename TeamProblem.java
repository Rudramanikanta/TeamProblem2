import java.util.*;

public class TeamProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>al=new ArrayList<>();
        ArrayList<Object>a=new ArrayList<>();
        ArrayList<HashMap<String,String>>hs=new ArrayList<>();
        al.add("team1");
        al.add("team2");
        al.add("team3");
        al.add("team4");
        al.add("team5");
        match m1=new match(al.get(0));
        match m2=new match(al.get(1));
        match m3=new match(al.get(2));
        match m4=new match(al.get(3));
        match m5=new match(al.get(4));
        a.add(m1);
        a.add(m2);
        a.add(m3);
        a.add(m4);
        a.add(m5);

            new match(a);
    }
}
class match{
    String str;

match(String str)
{
    this.str=str;
}
public  String  toString()
    {
        return str;
    }
match(ArrayList<Object> ab){
    for(int i=0;i<=ab.size()-1;i++){
        for(int j=0;j<ab.size()/2;j++){
            int t1=(i+j)%(ab.size()-1);
            int t2=(ab.size()-1-j+i)%(ab.size()-1);
            if(j==0){
                t2=ab.size()-1;
            }
            System.out.println(ab.get(t1)+"\tvs\t"+ab.get(t2));
        }
    }

}
}