import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public abstract class Finder {

	public static void find(Map<String, List<String>> lists, File dir) {
        for (File f : dir.listFiles()) {
            if (f.isDirectory()) {
                find(lists, f);
            } else {
                    String hash = f.getName() + f.length();
                    List<String> list = lists.get(hash);
                    if (list == null) {
                        list = new LinkedList<String>();
                        lists.put(hash, list);
                    }
                    list.add(f.getAbsolutePath());
                }
            }
        }      
}