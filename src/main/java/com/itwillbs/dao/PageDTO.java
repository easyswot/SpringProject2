package com.itwillbs.dao;

public class PageDTO {
	private int pageSize;
	private String pageNum;
	private int currentPage;
	private int startRow;
	private int endRow;
	
	private int pageBlock;
	private int startPage;
	private int endPage;
	private int count;
	private int pageCount;
	
	public int pageDTO() {
		return pageSize;
	}
	
	public int getPageSize() {
		return pageSize;
	}

	public String getPageNum() {
		return pageNum;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public int getStartRow() {
		return startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public int getPageBlock() {
		return pageBlock;
	}

	public int getStartPage() {
		return startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public int getCount() {
		return count;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	public void setPageBlock(int pageBlock) {
		this.pageBlock = pageBlock;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	
}
