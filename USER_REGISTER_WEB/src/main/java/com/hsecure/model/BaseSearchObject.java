package com.hsecure.model;

/**
 * 검색 모델 객체
 */
public class BaseSearchObject extends BaseObject {
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -688544270753013524L;

    /** 검색시작일 */
    private String searchBgnDe = "";
    
    /** 검색종료일 */
    private String searchEndDe = "";
    
    /** 검색조건 */
    private String searchCnd = "";
    
    /** 검색단어 */
    private String searchWrd = "";
    
    /** 검색IP */
    private String searchIp = "";
    
    /** 정렬컬럼 */
    private String sortColumn = "";
   
    /** 정렬순서(DESC,ASC) */
    private String sortOrdr = "";

    /** 검색사용여부 */
    private String searchUseYn = "";
    
    /** 검색분류(카테고리,유형, 조건(=,like)) */
    private String searchType = "";
    
    /** 현재페이지 */
    private int pageIndex = 1;

    /** 페이지갯수 */
    private int pageUnit = 10;

    /** 페이지사이즈 */
    private int pageSize = 10;

    /** 첫페이지 인덱스 */
    private int firstIndex = 1;

    /** 마지막페이지 인덱스 */
    private int lastIndex = 1;

    /** 페이지당 레코드 개수 */
    private int recordCountPerPage = 10;

    /** 레코드 번호 */
    private int rowNo = 0;
    
    /** 레코드 총 갯수 */
    private int cnt = 0;
    
	public String getSearchBgnDe() {
        return searchBgnDe;
    }
    public void setSearchBgnDe(String searchBgnDe) {
        this.searchBgnDe = searchBgnDe;
    }
    public String getSearchEndDe() {
        return searchEndDe;
    }
    public void setSearchEndDe(String searchEndDe) {
        this.searchEndDe = searchEndDe;
    }
    public String getSearchCnd() {
        return searchCnd;
    }
    public void setSearchCnd(String searchCnd) {
        this.searchCnd = searchCnd;
    }
    public String getSearchWrd() {
        return searchWrd;
    }
    public void setSearchWrd(String searchWrd) {
        this.searchWrd = searchWrd;
    }
    public String getSearchIp() {
        return searchIp;
    }
    public void setSearchIp(String searchIp) {
        this.searchIp = searchIp;
    }
    public String getSortColumn() {
        return sortColumn;
    }
    public void setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
    }
    public String getSortOrdr() {
        return sortOrdr;
    }
    public void setSortOrdr(String sortOrdr) {
        this.sortOrdr = sortOrdr;
    }
    public String getSearchUseYn() {
        return searchUseYn;
    }
    public void setSearchUseYn(String searchUseYn) {
        this.searchUseYn = searchUseYn;
    }
    public String getSearchType() {
        return searchType;
    }
    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }
    public int getPageIndex() {
        return pageIndex;
    }
    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }
    public int getPageUnit() {
        return pageUnit;
    }
    public void setPageUnit(int pageUnit) {
        this.pageUnit = pageUnit;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getFirstIndex() {
        return firstIndex;
    }
    public void setFirstIndex(int firstIndex) {
        this.firstIndex = firstIndex;
    }
    public int getLastIndex() {
        return lastIndex;
    }
    public void setLastIndex(int lastIndex) {
        this.lastIndex = lastIndex;
    }
    public int getRecordCountPerPage() {
        return recordCountPerPage;
    }
    public void setRecordCountPerPage(int recordCountPerPage) {
        this.recordCountPerPage = recordCountPerPage;
    }
    public int getRowNo() {
        return rowNo;
    }
    public void setRowNo(int rowNo) {
        this.rowNo = rowNo;
    }
    public int getCnt() {
        return cnt;
    }
    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}