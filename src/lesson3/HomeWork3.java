package lesson3;

public class HomeWork3 {
    public static void main(String[] args) {
        int[][] numbers = new int[21][21];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i + j == numbers.length - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println("~~~~~~~~~");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i == numbers.length / 2 || j == numbers[i].length / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println("~~~~~~~~~");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if ((i - j <= numbers.length / 2) && (i - j >= -numbers.length / 2) &&
                        (i + j >= numbers.length / 2) && (i + j < (numbers.length + numbers.length / 2))) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println("~~~~~~~~~");

        // или такой вариант

        int[][] arr = new int[21][21];
        int b = arr.length / 2;
        int c = b;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(j > b || j < c ? "* " : arr[i][j] + " ");  //if (j > b || j < c) { System.out.print ("* ")} else { System.out.print (arr[i][j] + " ")}
            }
            System.out.println();
            if (i < arr.length / 2) {
                b++;
                c--;
            } else {
                b--;
                c++;
            }
        }
        System.out.println();


//        для текста /*Так как в самом начале StringBuffer инициализируется строкой "Java", то его емкость составляет 4 + 16 = 20 символов. Затем мы увеличиваем емкость буфера с помощью вызова strBuffer */
//        1) посчитать количество букв без пробела
        String text = "Так как в самом начале StringBuffer инициализируется строкой \"Java\", то его емкость составляет 4 + 16 = 20 символов. Затем мы увеличиваем емкость буфера с помощью вызова strBuffer ";

        int simvolSumma = 0;
        for (int i = 0; i < text.length(); i++) {
            char simvol = text.charAt(i);
            if (simvol != ' ') {
                simvolSumma++;
            }
        }
        System.out.print("1) Всего символов за исключением пробела: " + simvolSumma);

        //2 вариант
//        System.out.println(text.replaceAll("\\s+", "").length());
//        System.out.println();

//      2) посчитать количество английских букв
        System.out.print("\n\n2) Английских букв: ");
        int engSimNumber = 0;
        for (int i = 0; i < text.length(); i++) {
            char engSim = text.charAt(i);
            if (engSim == 'a' || engSim == 'b' || engSim == 'c' || engSim == 'd' || engSim == 'e' || engSim == 'f' || engSim == 'g' || engSim == 'h' || engSim == 'i' || engSim == 'j' || engSim == 'k' ||
                    engSim == 'l' || engSim == 'm' || engSim == 'n' || engSim == 'o' || engSim == 'p' || engSim == 'q' || engSim == 'r' || engSim == 's' || engSim == 't' || engSim == 'u' || engSim == 'v' ||
                    engSim == 'w' || engSim == 'x' || engSim == 'y' || engSim == 'z' || engSim == 'A' || engSim == 'B' || engSim == 'C' || engSim == 'D' || engSim == 'E' || engSim == 'F' || engSim == 'G' ||
                    engSim == 'H' || engSim == 'I' || engSim == 'J' || engSim == 'K' || engSim == 'L' || engSim == 'M' || engSim == 'N' || engSim == 'O' || engSim == 'P' || engSim == 'Q' || engSim == 'R' ||
                    engSim == 'S' || engSim == 'T' || engSim == 'U' || engSim == 'V' || engSim == 'W' || engSim == 'X' || engSim == 'Y' || engSim == 'Z') {
                engSimNumber++;
            }
        }
        System.out.print(engSimNumber);

//      3) все цифры заменить на звездочку (*)
        System.out.print("\n\n3) ");
        for (int i = 0; i < text.length(); i++) {
            char number = text.charAt(i);
            if (number == '0' || number == '1' || number == '2' || number == '3' || number == '4' || number == '5' || number == '6' || number == '7' || number == '8' || number == '9') {
                number = '*';
            }
            System.out.print(number);
        }

//      4) после каждой точки или запятой перходить на новую строчку
        System.out.print("\n\n4) ");
        for (int i = 0; i < text.length(); i++) {
            char paragraph = text.charAt(i);
            if (paragraph == '.' || paragraph == ',') {
                System.out.print(paragraph + "\n");
            } else System.out.print(paragraph);
        }

//      5)вывести все с заглавной буквы
        System.out.print("\n\n5) ");
        String text2 = "";
        String[] words = text.split(" ");   //разбиваем текст по пробелам на массив, сотоящий из слов
        for (int i = 0; i < words.length; i++) {
            String letter1 = words[i].substring(0, 1).toUpperCase();   //первую букву слова делаем заглавной
            String letter2 = words[i].substring(1);          //записываем остальные буквы слова
            text2 = letter1 + letter2 + " ";                          //соединяем первую букву с остальными и добавляем пробел
            System.out.print(text2);
        }

//      6)(***) вывести каждое второе слово
        System.out.print("\n\n6) ");
        String text3 = "";
        for (int i = 0; i < text.length(); i++) {   //оставляем в тексте только буквы и пробелы
            char words2 = text.charAt(i);
            if (words2 == 'a' || words2 == 'b' || words2 == 'c' || words2 == 'd' || words2 == 'e' || words2 == 'f' || words2 == 'g' || words2 == 'h' || words2 == 'i' || words2 == 'j' || words2 == 'k' ||
                    words2 == 'l' || words2 == 'm' || words2 == 'n' || words2 == 'o' || words2 == 'p' || words2 == 'q' || words2 == 'r' || words2 == 's' || words2 == 't' || words2 == 'u' || words2 == 'v' ||
                    words2 == 'w' || words2 == 'x' || words2 == 'y' || words2 == 'z' || words2 == 'A' || words2 == 'B' || words2 == 'C' || words2 == 'D' || words2 == 'E' || words2 == 'F' || words2 == 'G' ||
                    words2 == 'H' || words2 == 'I' || words2 == 'J' || words2 == 'K' || words2 == 'L' || words2 == 'M' || words2 == 'N' || words2 == 'O' || words2 == 'P' || words2 == 'Q' || words2 == 'R' ||
                    words2 == 'S' || words2 == 'T' || words2 == 'U' || words2 == 'V' || words2 == 'W' || words2 == 'X' || words2 == 'Y' || words2 == 'Z' || words2 == ' ' || words2 == 'й' || words2 == 'Й' ||
                    words2 == 'а' || words2 == 'б' || words2 == 'в' || words2 == 'г' || words2 == 'д' || words2 == 'е' || words2 == 'ё' || words2 == 'ж' || words2 == 'з' || words2 == 'и' || words2 == 'к' ||
                    words2 == 'л' || words2 == 'м' || words2 == 'н' || words2 == 'о' || words2 == 'п' || words2 == 'р' || words2 == 'с' || words2 == 'т' || words2 == 'у' || words2 == 'ф' || words2 == 'х' ||
                    words2 == 'ц' || words2 == 'ч' || words2 == 'ш' || words2 == 'щ' || words2 == 'ъ' || words2 == 'ы' || words2 == 'ь' || words2 == 'э' || words2 == 'ю' || words2 == 'я' || words2 == 'А' ||
                    words2 == 'Б' || words2 == 'В' || words2 == 'Г' || words2 == 'Д' || words2 == 'Е' || words2 == 'Ё' || words2 == 'Ж' || words2 == 'З' || words2 == 'И' || words2 == 'К' || words2 == 'Л' ||
                    words2 == 'М' || words2 == 'Н' || words2 == 'О' || words2 == 'П' || words2 == 'Р' || words2 == 'С' || words2 == 'Т' || words2 == 'У' || words2 == 'Ф' || words2 == 'Х' || words2 == 'Ц' ||
                    words2 == 'Ч' || words2 == 'Ш' || words2 == 'Щ' || words2 == 'Ъ' || words2 == 'Ы' || words2 == 'Ь' || words2 == 'Э' || words2 == 'Ю' || words2 == 'Я') {
                text3 = text3 + Character.toString(words2);
            }
        }
        String text4 = "";      //убираем лишние пробелы
        for (int i = 0; i < text3.length() - 1; i++) {
            if (text3.charAt(i) == ' ' && text3.charAt(i + 1) == ' ') {

            } else text4 = text4 + text3.charAt(i);
        }

        String[] words2Text4 = text4.split(" ");  //создаём массив, каждая ячейка которого отдельное слово
        for (int i = 0; i < words2Text4.length; i++) {
            if (i % 2 != 0) {
                System.out.print(words2Text4[i] + " ");
            }
        }
    }
}

