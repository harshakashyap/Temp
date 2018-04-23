/*import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class FileToJTable {

    public static void main(String[] args) {
        Runnable r = new Runnable() {

            public void run() {
                new FileToJTable().createUI();
            }
        };

        EventQueue.invokeLater(r);
    }

    private void createUI() {

        try {
            JFrame frame = new JFrame();
            frame.setLayout(new BorderLayout());
            JTable table = new JTable();

            String readLine = null;

            TimeTableModel tableModel = new TimeTableModel();
            File file = new File("TimeTable.txt");

            FileReader reader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(reader);

            List<TimeTable> timeTableList = new ArrayList<TimeTable>();
            while((readLine = bufReader.readLine()) != null) {
                String[] splitData = readLine.split(";");

                TimeTable timetable = new TimeTable();
                timetable.setDay(splitData[0]);
                timetable.setTime(splitData[1]);
                timetable.setSubject(splitData[2]);

                timeTableList.add(timetable);
            }

            tableModel.setList(timeTableList);
            table.setModel(tableModel);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new JScrollPane(table));
            frame.setTitle("File to JTable");
            frame.pack();
            frame.setVisible(true);

        } catch(IOException ex) {}
 
    }
}*/