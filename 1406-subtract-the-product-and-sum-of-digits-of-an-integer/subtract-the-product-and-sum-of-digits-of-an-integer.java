class Solution {
    public int subtractProductAndSum(int n) {

        int sum = 0;
        int product = 1;

        while (n > 0) {

            int digit = n % 10;   // Get the last digit

            sum = sum + digit;    // Add digit to sum
            product = product * digit; // Multiply digit to product

            n = n / 10;           // Remove the last digit
        }

        return product - sum;
    }
}