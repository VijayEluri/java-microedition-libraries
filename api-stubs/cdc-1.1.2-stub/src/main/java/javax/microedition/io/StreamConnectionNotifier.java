package javax.microedition.io;

public interface StreamConnectionNotifier extends Connection {
    StreamConnection acceptAndOpen() throws IOException;

}
