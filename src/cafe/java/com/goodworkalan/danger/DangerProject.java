package com.goodworkalan.danger;

import com.goodworkalan.cafe.ProjectModule;
import com.goodworkalan.cafe.builder.Builder;
import com.goodworkalan.cafe.outline.JavaProject;

/**
 * Builds the project definition for Danger.
 *
 * @author Alan Gutierrez
 */
public class DangerProject implements ProjectModule {
    /**
     * Build the project definition for Danger.
     *
     * @param builder
     *          The project builder.
     */
    public void build(Builder builder) {
        builder
            .cookbook(JavaProject.class)
                .produces("com.github.bigeasy.danger/danger/0.3.0.0")
                .depends()
                    .development("org.testng/testng-jdk15/5.10")
                    .end()
                .end()
            .end();
    }
}
