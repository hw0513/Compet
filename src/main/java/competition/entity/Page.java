package competition.entity;

public class Page {
    private Integer pageCode;//页码
    private Integer limit;//每页大小
    private Integer start_items;//开始的数据项

    public Integer getStart_items() {
        return start_items;
    }

    public void setStart_items(Integer start_items) {
        this.start_items = start_items;
    }

    public Integer getPageCode() {
        return pageCode;
    }

    public void setPageCode(Integer pageCode) {
        this.pageCode = pageCode;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
