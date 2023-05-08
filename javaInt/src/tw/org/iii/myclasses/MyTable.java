package tw.org.iii.myclasses;

import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;

public class MyTable extends JTable{
	private FoodDB foodDB;
	private MyModel mymodel;
	public MyTable() throws Exception {
		foodDB =new FoodDB();
		foodDB.queryData(foodDB.SQL_QUERY); ///多次呼叫
		
		mymodel =new MyModel();
		setModel(mymodel);
		mymodel.setColumnIdentifiers(foodDB.getHeader());
	}
	public void delRow() {
	
	    int[] delSelect =new int[getSelectedRowCount()];
		for(int i=0;i<getSelectedRowCount();i++) {
			delSelect[i]=getSelectedRows()[i];
		}
		for(int i=0;i<delSelect.length;i++) {
			for(int j=delSelect.length-1;j>i;j--) {
				if(delSelect[j]>delSelect[i]) {
					int temp;
					temp=delSelect[j];
					delSelect[j]=delSelect[i];
					delSelect[i]=temp;			
				}
			}
		}
	
		for(int i=0;i<getSelectedRowCount();i++) {
			mymodel.removeRow(delSelect[i]);
		}
		repaint();
	}
	private class MyModel extends DefaultTableModel{
		///非主動
		@Override
		public void removeRow(int row) {
			foodDB.delRow(row+1);
		}

		@Override
		public int getRowCount() {
			return foodDB.getRows();
		}

		@Override
		public int getColumnCount() {
			return foodDB.getCols();
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			
			return column>0;
		}

		@Override
		public Object getValueAt(int row, int column) {
			return foodDB.getData(row+1, column+1);
		}

		@Override
		public void setValueAt(Object aValue, int row, int column) {
			foodDB.updateData(row+1, column+1, (String)aValue);
		}

		
		
		
}
}