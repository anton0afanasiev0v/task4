package t1.course.task4.config.bootstrap;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class BootstrapComponent {

    private final List<BootstrappingBean> bootstrappingBeanList;
    private final ApplicationContext applicationContext;

    @EventListener(ApplicationStartedEvent.class)
    public void init() {
        for (BootstrappingBean bootstrappingBean : bootstrappingBeanList) {
            try {
                bootstrappingBean.init();
            } catch (Exception e) {
                log.error(e.getMessage(), e);
                ((ConfigurableApplicationContext) applicationContext).close();
            }
        }
    }
}
