package com.himalaya.common.dto;

import java.io.Serializable;

public class Paging implements Serializable{

	private static final long serialVersionUID = 4879838516939903177L;
	
	/**
	 * 	页号
	 */
	private int pageNo;
	
	/**
	 * 	页大小
	 */
	private int pageSize;
	
	/**
	 * 	数据库起始下标，不包含
	 */
	private int offset;
	
	/**
	 * 	数据库起始下标，包含
	 */
	private int startRow;
	
	/**
	 * 	数据库结束下标，包含
	 */
	private int endRow;

	/**
	 * 	默认不分页
	 */
	public Paging() {
		this.pageNo = 1;
		this.pageSize = Integer.MAX_VALUE;
		cal();
	}
	
	/**
	 * 	提供起始页和页大小
	 */
	public Paging(int pageNo, int pageSize) {
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		cal();
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
		cal();
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		cal();
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	
	private void cal() {
		if ((this.pageNo > 0) && this.pageSize > 0) {
			int i = this.pageNo * this.pageSize;
			this.startRow = i - this.pageSize + 1;
			this.offset = i - this.pageSize;
			this.endRow = i;
		}
	}
}
