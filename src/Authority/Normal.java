package Authority;

/**
 * 顾客权限  订票，退票，查询，改签
 */
public interface Normal {
    public void order();
    public void refund();
    public void search();
    public void change();
}
