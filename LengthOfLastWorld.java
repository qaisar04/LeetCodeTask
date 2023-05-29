class Solution {
    public int lengthOfLastWord(String s) {
        char[] charArray = s.toCharArray(); // превращаем строку в массив

        int length = 0;
        boolean foundWord = false;

        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] != ' ') {
                // Если найден непробельный символ, увеличиваем длину слова
                length++;

                if (!foundWord) {
                    // Если это первый непробельный символ с конца, значит мы нашли последнее слово
                    foundWord = true;
                }
            } else if (foundWord) {
                // Если найден пробельный символ после последнего слова, прекращаем итерацию
                break;
            }
        }

        return length;
    }
}
