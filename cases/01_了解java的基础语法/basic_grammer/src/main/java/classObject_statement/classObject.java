package classObject_statement;

class bankAccount{
    int account; // 账户
    String name; // 姓名
    String address; // 地址
    private int balance; //余额
    static int minBalance = 100; //最小余额

    public bankAccount(int account, String name, String address, int balance ){
        this.account = account;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

        // 存款
    public void saveBalance(int balance){
        System.out.println("您当前的余额为:"+ this.balance + "元");
        this.balance += balance;
        System.out.println("您今日存款余额为:"+ balance + "元");
        System.out.println("最终存款余额为:"+ this.balance + "元");
    }
    // 取款
    public void redraw(int balance){
        int total = this.balance - balance;
        if(total < this.minBalance){
            System.out.println("不好意思，拒绝取款,至少保留"+ minBalance + "元");
            return;
        }
        this.balance -= balance;
        System.out.println("您剩余"+ this.balance + "元");
    }

    // 查询
    public void getAccountDetail(){
        System.out.println("您当前的账户为:"+ this.account);
        System.out.println("您姓名为:"+ this.name);
        System.out.println("您地址为:"+ this.address);
        System.out.println("您余额为:"+ this.balance);

    }

}
public class classObject {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("编写程序,模拟银行账户功能");
        bankAccount bk = new bankAccount(1234, "Jim", "佛山市" , 5000);
        System.out.println("---------------查询银行信息--------------");
        bk.getAccountDetail();
        System.out.println("---------------存款--------------");
        bk.saveBalance(2000);
        System.out.println("---------------取款--------------");
        bk.redraw(8000);
        bk.redraw(2000);
        System.out.println("=============================================");

    }
}
