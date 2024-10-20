import static org.junit.jupiter.api.Assertions.*;

//划分5个等价类：元素少于3个的数组，元素全是整数，元素全是负数，元素全是0，元素有正有负
class Solution11Test {

    @org.junit.jupiter.api.Test
    //测试元素个数少于3个的情况，测试用例：{1,2}
    void threeSum1() {
        int[] nums = {1,2};
        Solution11 a = new Solution11();
        assertEquals(0,a.threeSum(nums).size());
    }

    @org.junit.jupiter.api.Test
    //测试全是正数的情况，测试用例：{1，2，3}
    void threeSum2() {
        int[] nums = {1,2,3};
        Solution11 a = new Solution11();
        assertEquals(0,a.threeSum(nums).size());
    }

    @org.junit.jupiter.api.Test
    //测试全是负数的情况，测试用例：{-1，-2，-3}
    void threeSum3() {
        int[] nums = {-1,-2,-3};
        Solution11 a = new Solution11();
        assertEquals(0,a.threeSum(nums).size());
    }

    @org.junit.jupiter.api.Test
    //测试全是0的情况，测试用例：{0，0，0}
    void threeSum4() {
        int[] nums = {0,0,0};
        Solution11 a = new Solution11();
        assertEquals(1,a.threeSum(nums).size());
    }

    @org.junit.jupiter.api.Test
    //测试有正有负的情况，测试用例：{1，2，-1，0}
    void threeSum5() {
        int[] nums = {1,2,-1,0};
        Solution11 a = new Solution11();
        assertEquals(1,a.threeSum(nums).size());
    }
}