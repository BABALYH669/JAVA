package recursion;

public class recursion03 {
    public static void main(String[] args) {
        //老鼠迷宫 递归问题,
        int[][] marry = new int[8][7];
        //将上下左右都设置为1,使用for循环
        for (int i = 0; i < 7; i++) {
            marry[0][i] = 1;
            marry[7][i] = 1;
        }
        for (int i = 0; i < 8; i++) {
            marry[i][0] = 1;
            marry[i][6] = 1;
        }
        marry[3][1] = 1;
        marry[3][2] = 1;
        System.out.println("====初始的地图===");
        for (int i = 0; i < marry.length; i++) {
            for (int j = 0; j < marry[i].length; j++) {
                System.out.print(marry[i][j] + " ");
            }
            System.out.println();
        }
        T t1 = new T();
        t1.FindWay(marry,1,1);
        System.out.println("====走完的地图===");
        for (int i = 0; i < marry.length; i++) {
            for (int j = 0; j < marry[i].length; j++) {
                System.out.print(marry[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class T {
    public boolean FindWay(int[][] marry, int i, int j) {
        /*
        1·findy方法就是专门来找出迷宫的路径
        2.如果找到，就返回true）否则返回false
        3·map就是二维数组，即表示迷自
        4.i'j就是老鼠的位置，初始化的位置为（1）1）
        5.因为我们是递归的找路，所以我先规定map数组的各个值的含义
        6.0表示可以走1表示障碍物2表示可以走3表示走过，但是走不通是死路
        7.当map[6][5]=2就说明找到通路）就可以结束，否则就继续找·
        8.先确定老鼠找路策略下一>右一>上一>左*/
        if (marry[6][5] == 2) {
            //marry[6][5]是迷宫出口,走到这里就说明已经找到了出口
            return true;
        } else if (marry[i][j] == 0) {
            //假设能走
            marry[i][j] = 2;
            //找路策略下一>右一>上一>左
            if (FindWay(marry, i + 1, j)) {
                return true;
            } else if (FindWay(marry, i, j + 1)) {
                return true;
            } else if (FindWay(marry, i - 1, j)) {
                return true;
            } else if (FindWay(marry, i, j - 1)) {
                return true;
            }else {
                marry[i][j] = 3;
                return false;
            }
        } else {
            //marry[i][j]==1,3说明走不通返回false
            return false;
        }
    }
}