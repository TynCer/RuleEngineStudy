package tyncer.study.ruleengine;

import lombok.extern.slf4j.Slf4j;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

@Slf4j
public class Main {
    public static void main(String[] args){


        while (true){
            KieServices services = KieServices.Factory.get();
            KieContainer container = services.newKieClasspathContainer();
            KieSession session = container.newKieSession("helloWorldSession");
            session.fireAllRules();
            session.dispose();
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                log.error("sleep exception");
            }
        }


    }
}

