class Solution {
    public static int removeElement(int[] nums, int val) {
        int count = 0;  // Счетчик для отслеживания новой длины массива numsNew

        // Подсчет количества элементов, отличных от val
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                count++;
            }
        }

        // Обновление массива nums без элемента val
        int index = 0;  // Индекс для заполнения массива nums

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return count;
    }
}
