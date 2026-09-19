class Solution {
    public String convertDateToBinary(String date) {
        String[] parts = date.split("-");

        String year = Integer.toBinaryString(Integer.parseInt(parts[0]));    //Integer.parseInt(parts[0]) converts STRING array parts to INTEGER so that we can convert it into binary
        String month = Integer.toBinaryString(Integer.parseInt(parts[1]));
        String day = Integer.toBinaryString(Integer.parseInt(parts[2]));

        return year + "-" + month + "-" + day;
    }
}