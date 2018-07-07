package Guara;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import org.junit.Test;

public class EventDemo {
    @Test
    public  void test(){
        final EventBus eventBus = new EventBus();
        eventBus.register(new Object() {
            @Subscribe
            public void lister(Integer integer) {
                System.out.printf("%s from int%n", integer);
                eventBus.post(2);
            }
            @Subscribe
            public void lister(Number integer) {
                System.out.printf("%s from Number%n", integer);
            }
            @Subscribe
            public void lister(Long integer) {
                System.out.printf("%s from long%n", integer);
            }
        });

       eventBus.post(1);
      // eventBus.post(1L);

    }

}
