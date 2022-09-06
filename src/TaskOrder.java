import java.io.InputStream;
import javax.microedition.rms.RecordStore;

// 
// Decompiled by Procyon v0.5.36
// 

public final class TaskOrder
{
    public int taskId;
    public int count;
    public int maxCount;
    public String name;
    public String description;
    public int killId;
    public int mapId;
    
    public TaskOrder() {
    }
    
    public static void save(final String obj, final byte[] array) {
        try {
            final RecordStore openRecordStore;
            if ((openRecordStore = RecordStore.openRecordStore("vj".concat(String.valueOf(obj)), true)).getNumRecords() > 0) {
                openRecordStore.setRecord(1, array, 0, array.length);
            }
            else {
                openRecordStore.addRecord(array, 0, array.length);
            }
            openRecordStore.closeRecordStore();
        }
        catch (Exception ex) {}
    }
    
    public static byte[] Loaddata(final String obj) {
        byte[] record;
        try {
            final RecordStore openRecordStore;
            record = (openRecordStore = RecordStore.openRecordStore("vj".concat(String.valueOf(obj)), (boolean)(0 != 0))).getRecord(1);
            openRecordStore.closeRecordStore();
        }
        catch (Exception ex) {
            return null;
        }
        return record;
    }
    
    public static void Class1(final String s, final int n) {
        try {
            save(s, new byte[] { (byte)n });
        }
        catch (Exception ex) {}
    }
    
    public static void Class1(final String s, final String s2) {
        try {
            save(s, s2.getBytes("UTF-8"));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static String Class2(String loaddata) {
        if ((loaddata = (String)(Object)Loaddata(loaddata)) == null) {
            return null;
        }
        try {
            return new String((byte[])(Object)loaddata, "UTF-8");
        }
        catch (Exception ex) {
            return new String((byte[])(Object)loaddata);
        }
    }
    
    public static int Class3(final String s) {
        final byte[] loaddata;
        if ((loaddata = Loaddata(s)) == null) {
            return -1;
        }
        return loaddata[0];
    }
    
    private static void Class4(final String obj) {
        try {
            RecordStore.deleteRecordStore("vj".concat(String.valueOf(obj)));
        }
        catch (Exception ex) {}
    }
    
    public static void Class2(final String obj, final byte[] array) {
        try {
            final RecordStore openRecordStore;
            if ((openRecordStore = RecordStore.openRecordStore("vj".concat(String.valueOf(obj)), true)).getNumRecords() > 0) {
                openRecordStore.setRecord(1, array, 0, array.length);
            }
            else {
                openRecordStore.addRecord(array, 0, array.length);
            }
            openRecordStore.closeRecordStore();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void Class1() {
        Class4("nj_arrow");
        Class4("nj_effect");
        Class4("nj_image");
        Class4("nj_part");
        Class4("nj_skill");
        Class4("data");
        Class4("dataVersion");
        Class4("map");
        Class4("mapVersion");
        Class4("skill");
        Class4("killVersion");
        Class4("item");
        Class4("itemVersion");
    }
    
    public TaskOrder(final byte taskId, final int count, final int maxCount, final String name, final String description, final int killId, final int mapId) {
        this.count = count;
        this.maxCount = maxCount;
        this.taskId = taskId;
        this.name = name;
        this.description = description;
        this.killId = killId;
        this.mapId = mapId;
    }
    
    public static InputStream Game1(final String name) {
        return "".getClass().getResourceAsStream(name);
    }
}
