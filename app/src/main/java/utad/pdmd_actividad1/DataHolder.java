package utad.pdmd_actividad1;

import java.util.Calendar;

/**
 * Created by sergio on 14/11/17.
 */

public class DataHolder {

    static public DataHolder Instance = new DataHolder();
    final Calendar c = Calendar.getInstance();

    public String name="";
    public String email="";
    public String addr="";
    public String phone="";
    public int yy=c.get(Calendar.YEAR);
    public int mm=c.get(Calendar.MONTH);
    public int dd=c.get(Calendar.DAY_OF_MONTH);
}
