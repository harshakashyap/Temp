/*
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

class TimeTableModel extends AbstractTableModel {

        private List<TimeTable> list = new ArrayList<TimeTable>();
        private String[] columnNames = {"Day", "Time","Subject"};

        public void setList(List<TimeTable> list) {
            this.list = list;
            fireTableDataChanged();
        }

        @Override
        public String getColumnName(int column) {
            return columnNames[column];
        }

        public int getRowCount() {
            return list.size();
        }

        public int getColumnCount() {
            return columnNames.length;
        }

        public Object getValueAt(int rowIndex, int columnIndex) {
            switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getDay();
            case 1:
                return list.get(rowIndex).getTime();
            case 2:
            	 return list.get(rowIndex).getSubject();
            default:
                return null;
            }
        }
}
*/