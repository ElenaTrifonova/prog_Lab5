package commands;

import collection.Organization;
import worker.FileManager;

import java.time.LocalDateTime;


public class CommandMax {
    public static void max(FileManager man) {
        LocalDateTime max;
        Long maxKey;
        if (man.getCollection().size() > 0) {

            try {
                //Object[] array = man.getCollection().keySet().toArray();
                maxKey = man.getCollection().keySet().iterator().next();
                //String str = String.valueOf(array[1]);
                //maxKey = Long.parseLong(str);
                max = man.getCollection().get(maxKey).getCreationDate();

                for (Organization org : man.getCollection().values()) {

                    if (org.getCreationDate().isAfter(max)) {
                        maxKey = org.getId();
                        max = org.getCreationDate();
                    }
                }
                System.out.println("Information about organization with max creation date:" + man.getCollection().get(maxKey).toString() ); //ВОПРОС ПРО ВЫВОД
            }catch(NullPointerException e){
                System.out.println("null");
            }

        } else System.out.println("Collection is empty.");
    }
}
