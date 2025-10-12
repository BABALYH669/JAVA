package HouseRent.service;

import HouseRent.domain.House;

/**
 * 业务层
 * 定义House[]数组保存house对象
 * 相应HouseView的调用
 * 完成对房屋信息的各种操作(增删改查)
 */
public class HouseService {
    private House[] houses;//保存House对象
    private int houseNum;//记录House数组里的对象的个数
    private int idCounter;//记录当前id增长到哪个值
    private int newHouseNum;

    public HouseService(int size) {
        //new houses
        houses = new House[size];//当创建HouseService对象时,指定数组大小

    }

    //list方法,返回houses
    public House[] list() {
        return houses;
    }


    //addHouse 方法添加房屋信息
    public boolean add(House newHouse) {
        //判断是否可以继续添加
        if (houseNum == houses.length) {
            System.out.println("已经添加满了,不能再添加了......");
            return false;
        }
        //添加房屋信息后自增
        houses[houseNum++] = newHouse;
        //ID自增长的机制,更新newHouse的id
        newHouse.setId(++idCounter);
        return true;
    }

    //delHouse 方法删除房屋信息
    public boolean del(int delId) {
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (delId == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            //说delId不存在
            System.out.println("删除的房屋不存在");
            return false;
        }
        //删除  1 2 3 4 -->  1 3 4 null  删除2,把三四往前挪,第四个为null
        for (int i = index; i < houseNum - 1; i++) {
            houses[i] = houses[i + 1];
            //把当前存在的房屋信息的最后一个为空
            houses[--houseNum] = null;
        }
        return true;
    }

    //findById 方法,返回House对象挥着null
    public House findById(int findId) {
        //遍历数组
        for (int i = 0; i < houseNum; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;

    }
}

