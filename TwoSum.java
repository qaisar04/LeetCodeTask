public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
    // Это главный класс Main, который содержит метод main. 
    // В этом методе мы определяем массив nums, содержащий числа [2, 7, 11, 15], и переменную 
    // target, установленную на значение 9. Затем мы вызываем функцию twoSum(nums, target) и сохраняем 
    // результат в массив result. Наконец, мы выводим найденные индексы на экран.

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0;i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
//    Это функция twoSum, которая принимает массив чисел nums и целевое значение target в
//    качестве аргументов. Она выполняет двойной цикл for для проверки всех возможных комбинаций
//    чисел в массиве. Если сумма двух чисел равна target, то их индексы сохраняются в массиве
//    result. В конце функция возвращает этот массив.

}
