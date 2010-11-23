package java.lang;

import java.io.InputStream;
import java.io.OutputStream;

public abstract class Process {
    public Process() {}

    public abstract void destroy();

    /**
     * @throws IllegalThreadStateException
     */
    public abstract int exitValue();

    public abstract InputStream getErrorStream();

    public abstract InputStream getInputStream();

    public abstract OutputStream getOutputStream();

    /**
     * @throws InterruptedException
     */
    public abstract int waitFor() throws InterruptedException;

}
