public class CreditCard {

    private int evenSum;
    private int oddSum;
    private int sum;
    private String ccNumber;
    private String company;



    public boolean isDivisibleBy10() {
        return (getSum() % 10 == 0);
    }

    public boolean isValid() {
        return (validateCompany() && validateLength() && validateSums());
    }

    public boolean validateCompany() {
        if (ccNumber.charAt(0) == '4') {
            company = "Visa";
            return true;
        }

        if (ccNumber.charAt(0) == '5') {
            company = "MasterCard";
            return true;
        }

        if ((ccNumber.charAt(0) == '3') && (ccNumber.charAt(0) == '7')){
            company = "American Express";
            return true;
        }

        if (ccNumber.charAt(0) == '6') {
            company = "Discover";
            return true;
        }


        return false;
    }

    public boolean validateLength() {
        return ((ccNumber.length() >= 13) && (ccNumber.length() <= 16));
    }

    public boolean validateNumber() {
        return false;
    }

    public boolean validateSums() {
        sum = evenSum + oddSum;
        return isDivisibleBy10();
    }

    public CreditCard(String num) {
        this.ccNumber = num;
        evenSum = getEvenSum();
        oddSum = getOddSum();
        sum = getSum();
    }

    private int numericValue(char c) {
        return Character.getNumericValue(c);
    }

    private int lunSum(int num) {
        if (num < 10)
            return num;

        if (num == 10)
            return 1;

        int num1 = num / 10;
        int num2 = num % 10;

        return lunSum(num1 + num2);
    }

    public int getEvenSum() {
        int s = 0;
        for (int i=ccNumber.length() - 1; i>=0; i--) {
            int numIndex = ccNumber.length() - i;
            if (numIndex % 2 == 0) {
                int numericValue = numericValue(ccNumber.charAt(i));
                int lunSumValue = lunSum(2*numericValue);
                s = s + lunSumValue;
            }
        }
        return s;
    }

    public int getOddSum() {
        int s = 0;
        for (int i=ccNumber.length() - 1; i>=0; i--) {
            int numIndex = ccNumber.length() - i;
            if (numIndex % 2 == 1) {
                int numericValue = numericValue(ccNumber.charAt(i));

                s = s + numericValue;
            }
        }
        return s;
    }

    public int getSum() {
        return getEvenSum() + getOddSum();
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public String getCompany() {
        return company;
    }
}
