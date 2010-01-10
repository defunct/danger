package com.goodworkalan.danger.test;

import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.goodworkalan.danger.CodedDanger;

/**
 * A test exception for testing exceptions with coded messages.
 * 
 * @author Alan Gutierrez
 */
@SuppressWarnings("serial")
public class TestCodedDanger extends CodedDanger {
    /** The cache of message bundles. */
    private final static ConcurrentMap<String, ResourceBundle> bundles = new ConcurrentHashMap<String, ResourceBundle>();

    /**
     * Construct a test exception that wraps the given cause exception and and
     * the given error code.
     * 
     * @param code
     *            The error code.
     * @param cause
     *            The cause.
     */
    public TestCodedDanger(int code, Throwable cause) {
        super(bundles, code, cause);
    }
}
