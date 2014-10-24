package de.marco.patterns.abstrakefabrik;

public class TextTableFactory extends TableFactory {

	@Override
	public Table createTable() {
		// TODO Auto-generated method stub
		return new TextTable();
	}

	@Override
	public Row createRow() {
		// TODO Auto-generated method stub
		return new TextRow();
	}

	@Override
	public Cell createCell(String content) {
		// TODO Auto-generated method stub
		return new TextCell(content);
	}

}
