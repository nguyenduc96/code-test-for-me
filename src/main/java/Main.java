import org.codehaus.plexus.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.nio.Buffer;
import java.text.Normalizer;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException, IOException, InterruptedException {
//        List<Long> list = new ArrayList<>();
//        for (long i = 1; i <= 10000000L; i++) {
//            list.add(i);
//        }

//        var var = "Hello everyone";
//        System.out.println(var);
//        long startTimeFor = System.currentTimeMillis();
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 ==0)
//            System.out.print(list.get(i));
//        }
//        long endTimeFor = System.currentTimeMillis();
//        System.out.println("\n\nFor : " + (endTimeFor - startTimeFor));

//        long startTimeForEach = System.currentTimeMillis();
//        list.stream().filter(x -> x % 2 == 0).forEach(System.out::print);
//        long endTimeForEach = System.currentTimeMillis();
//        System.out.println("\n\nForEach : " + (endTimeForEach - startTimeForEach));
//

//        Scanner sc = new Scanner(System.in);
//        int max = 1;
//        do {
//            System.out.println("Min");
//            int min = sc.nextInt();
//            System.out.println("Max");
//            max = sc.nextInt();
//
//            System.out.println("result: " + random(min, max));
//        } while (max > 0);

//       String number = "087654321";
//        System.out.println(number.length() !=10);
//        System.out.println(!number.startsWith("0"));
//        ClassAA classAA = new ClassAA();
//        ClassAA classAA1 = (ClassAA) classAA.clone();
//        String s = "null";
//        System.out.println(StringUtils.isNotBlank(s));
//        for (int i = 0; i < 1000000; i++) {
//            Set<String> strings = new HashSet<>();
//            for (int j = 0; j < 3; j++) {
//                String s = getRandomNumber(8);
//                if (s.length() != 8) {
//                    break;
//                }
//                strings.add(s);
//            }
//            if (strings.size() != 3) {
//                System.out.println(i);
//                break;
//            }
////            System.out.println(strings.size());
//        }
//        System.out.println("OK");
//        CharSequence x = "xxx";
//        System.out.println(x);

//        String name = "Đức";
//
//        String name2 = "Duc";
//
//        System.out.println(removeAccentV2(name));
//
//        System.out.println(removeAccentV2(name).equalsIgnoreCase(removeAccentV2(name2)));


//        System.out.println(generateOtp());

        // n >= 0 && n<= 10
        // n = 0, 1 ,2 -> 0;
        // n >= 3 && n <= 10;

//        InetAddress inetAddress = InetAddress.getLocalHost();
//        NetworkInterface networkInterface = NetworkInterface.getByInetAddress(inetAddress);
//        byte[] hr = networkInterface.getHardwareAddress();
//
//        String[] hexa = new String[hr.length];
//        for (int i = 0; i < hr.length; i ++) {
//            hexa[i] = String.format("%02X", hr[i]);
//        }
//        String mac = String.join("-", hexa);
//        System.out.println(mac);

//        System.out.println(String.format("Hồ sơ của khách hàng %s, case number %d, đã hủy", "Nguyễn Huỳnh Đức", 1234));
//        System.out.println(String.format("Hello %s", null));

//        int[] ns = ns(10);
//
//        System.out.println(Arrays.toString(ns));

//        System.out.println(findDay(11, 7, 2022));
        System.out.println(fibonacci(10000));
    }

    private static  Long fibonacci(int num) {
        long a = 1, b = 0, temp;
        while (num > 0) {
            temp = a;
            a = b + a;
            b = temp;
            num --;
        }
        return b;
    }
    private static  Long fibonacci2(int num) {

        return Math.round(
                Math.pow((1 + Math.sqrt(5)) / 2, num)
                - Math.pow(-2 / Math.sqrt(5), num) / Math.sqrt(5)
        );
    }

    private static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        System.out.println(calendar.getTime());
        String rs = calendar.getTime().toString().substring(0,3);
        switch (rs) {
            case "Sun": return "SUNDAY";
            case "Mon": return "MONDAY";
            case "Tue": return "TUESDAY";
            case "Wed": return "WEDNESDAY";
            case "Thu": return "THURSDAY";
            case "Fri": return "FRIDAY";
            case "Sat": return "SATURDAY";
            default: return null;
        }
    }

    private static int[] ns(int n) {
        int[] ns = new int[n];
        for (int i = 0; i < n ; i ++) {
            if (i == 0) {
                ns[i] = 1;
            } else {
                ns[i] = ns[i - 1] * 2 + 5;
            }
        }
        return ns;
    }

    public static String generateOtp() {
        Double rdNum = Math.random() * 1000000;
        if (rdNum > 100000) {
            return rdNum.toString().substring(0, 6);
        } else if (rdNum > 10000){
            return "0" + rdNum.toString().substring(0, 5);
        } else {
            return "0" + rdNum.toString().substring(0, 5) + "5";
        }
    }

     static  String ccc(String gender) {
        return gender.substring(0, 1).toUpperCase() + gender.substring(1).toLowerCase();
    }

    public static String removeAccentV2(String s) {
        if(StringUtils.isEmpty(s)) return "";
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("").replace("đ","d").replace("Đ", "D");
    }

    static String getRandomNumber(int size) {
        String var1 = String.valueOf(getNumber()).replaceAll("\\D*", "");
        String var2 = String.valueOf(getNumber()).replaceAll("\\D*", "");
        String var3 = String.valueOf(getNumber()).replaceAll("\\D*", "");
        int rd = random(1,3);
        int rd1 = random(2,4);
        String str1 = getString(rd, var1);
        String str2 = getString(rd1, var2);
        String str3 = getString(size - rd - rd1, var3);
        return str1 + str2 + str3;
    }

    static String getString(int size, String numberStr) {
        return getString(size, numberStr, 1);
    }

    static String getString(int size, String numberStr, int min) {
        int rd = random(min, numberStr.length());
        if (rd + size >= numberStr.length()) {
            if (rd - size < 0) {
                return numberStr.substring(0, size);
            } else {
                return numberStr.substring(rd - size, rd);
            }
        } else {
            if (rd + size > numberStr.length()) {
                return numberStr.substring(numberStr.length() - size);
            } else {
                return numberStr.substring(rd, rd + size);
            }
        }
    }

    static long getNumber() {
        return new Random().ints().limit(10).asLongStream().filter(l -> l > 1000000 || l < -1000000).findAny().getAsLong();
    }

    private static int random(int min, int max) {
        if (max < min) {
            int t = max;
            max = min;
            min = t;
        }
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
}
