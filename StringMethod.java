public class NaufalTampanApp {
    public static void main(String[] args) {
        String str = "Naufal Tampan";

        // string length
        System.out.printf("📏 %-29s: %s karakter.\n", "Panjang", str.length());

        // Substring
        System.out.printf("✂️ %-29s: %s\n", "Substring", str.substring(0, 6));

        // CharAt
        System.out.printf("🔍 %-29s: '%s'\n", "Karakter kedua", str.charAt(1));

        // toLowerCase
        System.out.printf("🔡 %-29s: %s\n", "Huruf kecil", str.toLowerCase());

        // toUpperCase
        System.out.printf("🔠 %-29s: %s\n", "Huruf besar", str.toUpperCase());

        // string Replace
        System.out.printf("🔄 %-29s: %s\n", "Ganti 'N' dengan 'B'", str.replace('N', 'B'));

        // string Contains
        System.out.printf("🔎 %-29s: %s\n", "Mengandung 'Naufal Jelek'?", str.contains("Naufal Jelek"));

        // string Equals
        System.out.printf("✅ %-29s: %s\n", "Sama dengan 'Naufal Tampan'?", str.equals("Naufal Tampan"));

        // EqualsIgnoreCase
        System.out.printf("✅ %-29s: %s\n", "Sama dengan 'naufal tampan' (ignore case)?", str.equalsIgnoreCase("naufal tampan"));

        // EndWithp
        System.out.printf("🏁 %-29s: %s\n", "Berakhir dengan 'Naufal Tampan'?", "apa yang kamu tahu tentang Naufal Tampan".endsWith("Naufal Tampan"));
    }
}
