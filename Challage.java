class stringchallenge {
    public static String sc(String text) {
        String answer;
        answer = text.trim();
        answer = answer.substring(0, 6);
        answer = answer.toUpperCase();

        return answer;
    }
}
