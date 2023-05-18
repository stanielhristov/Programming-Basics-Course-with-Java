package InterfacesAndAbstractionExercisesTelephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {

    private List<String> numbers;
    private List<String> urls;

    @Override
    public String browse() {
        StringBuilder builder = new StringBuilder();
        for (String url : urls) {
            if (isValidURL(url)) {
                builder.append(String.format("Invalid URL!%n"));
            } else {
                builder.append(String.format("Browsing: %s!%n", url));
            }
        }
        return builder.toString().trim();
    }

    @Override
    public String call() {
        StringBuilder builder = new StringBuilder();
        for (String number : numbers) {
            if (isValidPhoneNumber(number)) {
                builder.append(String.format("Invalid number!%n"));
            } else {
                builder.append(String.format("Calling... %s%n", number));
            }
        }
        return builder.toString().trim();
    }

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }
    public boolean isValidURL (String url) {
        for (char singleChar : url.toCharArray()) {
            if (Character.isDigit(singleChar)) {
                return true;
            }
        }
        return false;
    }
    public boolean isValidPhoneNumber (String number) {
        for (char singleChar : number.toCharArray()) {
            if (!Character.isDigit(singleChar)) {
                return true;
            }
        }
        return false;
    }

}
