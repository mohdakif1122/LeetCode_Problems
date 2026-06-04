class Solution {
    public int totalWaviness(int num1, int num2) {
        int waviness = 0;
        List<List<Integer>> res= new ArrayList<>();
        
        int idx = -1;
        for(int i = num1 ; i <= num2 ; i++){
            char[] digit = String.valueOf(i).toCharArray();
            int m = digit.length;
            if(m < 3) continue;
            idx++;
            res.add(new ArrayList<>());
            for(int j = 0 ; j < m ; j++){
                res.get(idx).add(Character.getNumericValue(digit[j]));
            }
        }

        for(int i = 0 ; i < res.size() ; i++){
            for(int j = 1 ; j < res.get(i).size() - 1 ; j++){
                 if (res.get(i).get(j - 1) < res.get(i).get(j) && res.get(i).get(j) > res.get(i).get(j + 1)) {
                    waviness += 1;
                }   
                if (res.get(i).get(j - 1) > res.get(i).get(j) && res.get(i).get(j) < res.get(i).get(j + 1)) {
                    waviness += 1;
                }
            }
        }
        return waviness;
    }
}