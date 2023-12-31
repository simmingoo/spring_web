package com.rpt.admin.domain;

/**
 * κ²?? λͺ¨λΈ κ°μ²΄
 */
public class BaseSearchObject extends BaseObject {
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -688544270753013524L;

    /** κ²?????Ό */
    private String searchBgnDe = "";
    
    /** κ²??μ’λ£?Ό */
    private String searchEndDe = "";
    
    /** κ²??μ‘°κ±΄ */
    private String searchCnd = "";
    
    /** κ²???¨?΄ */
    private String searchWrd = "";
    
    /** κ²??IP */
    private String searchIp = "";
    
    /** ? ? ¬μ»¬λΌ */
    private String sortColumn = "";
   
    /** ? ? ¬??(DESC,ASC) */
    private String sortOrdr = "";

    /** κ²???¬?©?¬λΆ? */
    private String searchUseYn = "";
    
    /** κ²??λΆλ₯(μΉ΄νκ³ λ¦¬,? ?, μ‘°κ±΄(=,like)) */
    private String searchType = "";
    
    /** ??¬??΄μ§? */
    private int pageIndex = 1;

    /** ??΄μ§?κ°?? */
    private int pageUnit = 10;

    /** ??΄μ§??¬?΄μ¦? */
    private int pageSize = 10;

    /** μ²«ν?΄μ§? ?Έ?±?€ */
    private int firstIndex = 1;

    /** λ§μ?λ§ν?΄μ§? ?Έ?±?€ */
    private int lastIndex = 1;

    /** ??΄μ§??Ή ? μ½λ κ°μ */
    private int recordCountPerPage = 10;

    /** ? μ½λ λ²νΈ */
    private int rowNo = 0;
    
    /** ? μ½λ μ΄? κ°?? */
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