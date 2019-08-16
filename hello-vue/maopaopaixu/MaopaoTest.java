public class MaopaoTest {
    public static void main(String[] args) {
        // 定义数组
        int data[] = {8, 5, 2, 6, 1};
        //获取数组的长度
        int len = data.length;
        //展示原数组
        System.out.println("原数组:");
        for (int k = 0; k < len; k++) {
            System.out.print(data[k] + " ");
        }
        System.out.println();
        //长度为len,循环len-1次
        for (int i = 0; i < len-1; i++) {
            //每次比较完毕之后，会得出一个当前最大值，下次只需比较前面的值即可,又因为数组下标从0开始，所以剩余比较次数为len-i-1
            for (int j = 0; j < len-i-1; j++) {
                //如果左边数据比右边数据大，则交换左右数据
                if (data[j] > data[j+1]) {
                    //设置一个中间变量temp来辅助两个数据的交换
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j + 1] = temp;
                }
            }
            System.out.println("第"+(i+1)+"次:");
            for (int k = 0; k < len; k++) {
                System.out.print(data[k] + " ");
            }
            System.out.println();

        }
        //输出结果
        System.out.println("排序完成结果:");
        for (int i = 0; i < len; i++) {
            System.out.print(data[i] + " ");
        }


    }
}

