package HouseRent.view;

import HouseRent.domain.House;
import HouseRent.service.HouseService;
import HouseRent.utils.Utility;

/**
 * 1.显示界面
 * 2.接受用户的输入
 * 3.调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {

    private boolean loop = true; //控制显示菜单
    private char key = ' ';//接受用户输入的值
    //想用类里的方法首先要创建这个类的对象
    //用HouseService中的list方法,需要创建HouseService对象
    private HouseService houseService = new HouseService(10);//初始化数组值为10个


    //根据id修改房屋信息
    public void update() {
        System.out.println("==========修改房屋信息==========");
        System.out.println("请选择待修改房屋编号(-1表示退出)");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("取消修改房屋");
            return;
        }

        //根据输入得到的updateId,查找对象
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("修改房屋信息编号不存在在");
            return;
        }

        System.out.println("姓名(" + house.getName() + "):");
        String name = Utility.readString(8, "");//如果用户直接回车表示不修改信息,默认""
        if (!"".equals(name)) {//如果传入的不是空字符就把name的值赋给house
            house.setName(name);
        }

        System.out.println("电话(" + house.getPhone() + "):");
        String phone = Utility.readString(12, "");
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }

        System.out.println("地址(" + house.getAddress() + "):");
        String address = Utility.readString(12, "");
        if (!"".equals(address)) {
            house.setAddress(address);
        }

        System.out.println("月租(" + house.getRent() + "):");
        int rent = Utility.readInt(12);
        if (rent != -1) {
            house.setRent(rent);
        }

        System.out.println("地址(" + house.getState() + "):");
        String state = Utility.readString(3, "");
        if (!"".equals(state)) {
            house.setState(state);
        }

    }

    //查找功能
    public void findHouse() {
        System.out.println("==========查找房屋信息==========");
        System.out.println("请输入要查找的id");
        int findId = Utility.readInt();
        //调用方法
        House house = houseService.findById(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("没有查找到相应信息");
        }
    }

    //编写exit推出功能,需要用户确认
    public void exit() {
        System.out.println("是否退出房屋系统");
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            loop = false;
        }

    }

    //编写delHouse()接收输入的ID,调用Service 的 del方法
    public void delHouse() {
        System.out.println("==========删除房屋==========");
        System.out.print("请输入待删除房屋的ID(-1推出)");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("放弃删除房屋");
            return;
        }
        //注意该方法本身就有循环判断的逻辑,必须输出Y/N
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            //del(delId)  del方法  形参delId
            if (houseService.del(delId)) {
                System.out.println("==========删除房屋成功==========");
            } else {
                System.out.println("==========删除房屋不存在==========");
            }
        } else {
            System.out.println("==========放弃删除房屋==========");
        }


    }

    //编写addHouse()接收输入,创建House对象,调用add方法
    public void addHouse() {
        System.out.println("==========添加房屋==========");
        System.out.println("姓名:");
        String name = Utility.readString(3);
        System.out.println("电话:");
        String phone = Utility.readString(11);
        System.out.println("地址");
        String address = Utility.readString(10);
        System.out.println("月租");
        int rent = Utility.readInt();
        System.out.println("状态(已出租/未出组)");
        String state = Utility.readString(3);
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("==========添加房屋成功==========");
        } else {
            System.out.println("==========添加房屋失败==========");
        }

    }

    public void listHouses() {
        System.out.println("==========房屋列表==========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();//得到所有的房屋信息
        for (int i = 0; i < houses.length; i++) {
            //结果为null的不显示
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("==========房屋列表显示完毕==========");
    }

    public void mainMenu() {
        //显示主菜单
        do {
            System.out.println("==========房屋出租系统菜单==========");
            System.out.println("\t\t\t1.新增房源");
            System.out.println("\t\t\t2.查找房屋");
            System.out.println("\t\t\t3.删除房屋");
            System.out.println("\t\t\t4.修改房屋信息");
            System.out.println("\t\t\t5.房屋列表");
            System.out.println("\t\t\t6.退   出");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);
    }
}
