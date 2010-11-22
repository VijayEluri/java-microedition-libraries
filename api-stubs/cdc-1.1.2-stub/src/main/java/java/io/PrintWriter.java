package java.io;

public class PrintWriter extends Writer {
    protected Writer out;

    public PrintWriter(Writer out) {}
    public PrintWriter(Writer out, boolean autoFlush) {}
    public PrintWriter(OutputStream out) {}
    public PrintWriter(OutputStream out, boolean autoFlush) {}

    public boolean checkError() {
        return false;
    }

    public void close() {}

    public void flush() {}

    public void print(boolean b) {}

    public void print(char c) {}

    public void print(int i) {}

    public void print(long l) {}

    public void print(float f) {}

    public void print(double d) {}

    /**
     * @throws NullPointerException
     */
    public void print(char[] s) {}

    public void print(String s) {}

    public void print(Object obj) {}

    public void println() {}

    public void println(boolean x) {}

    public void println(char x) {}

    public void println(int x) {}

    public void println(long x) {}

    public void println(float x) {}

    public void println(double x) {}

    public void println(char[] x) {}

    public void println(String x) {}

    public void println(Object x) {}

    protected void setError() {}

    public void write(int c) {}

    public void write(char[] buf, int off, int len) {}

    public void write(char[] buf) {}

    public void write(String s, int off, int len) {}

    public void write(String s) {}

}
