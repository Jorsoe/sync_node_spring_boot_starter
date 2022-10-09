package org.sync;

import org.apache.tomcat.jni.User;
import org.junit.Test;
import org.rkzl.sync.enums.MetadataType;
import org.rkzl.sync.node.Sync;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Autowired
    private Sync<User> syncNode;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        syncNode.sourceType(MetadataType.DB)
                .destinationType(MetadataType.ES)
                .start();
    }
}
