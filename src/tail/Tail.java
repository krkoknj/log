package tail;

import java.io.File;

public class Tail implements LogFileTailerListener     // LogFiletailerListener 상속
{
    /**
     * The log file tailer
     */
    private LogFileTailer tailer;

    /**
     * Creates a new Tail instance to follow the specified file
     */
    public Tail( String filename )
    {
        tailer = new LogFileTailer( new File( filename ), 1000, false );  // LogFileTailer 를 호출한다.
        tailer.addLogFileTailerListener( this );
        tailer.start(); //
    }

    /**
     * A new line has been added to the tailed log file
     *
     * @param line   The new line that has been added to the tailed log file
     */
    public void newLogFileLine(String line)  // 인터페이스 메소드임으로 반드시 구현되어야 한다.
    {
        System.out.println( line );   // 새로운 값이 입력되면 화면에 출력한다.
    }

    /**
     * Command-line launcher
     */

}
