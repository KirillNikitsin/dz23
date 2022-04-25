import java.util.*;
//как сделать несколько одинаковых ключей в Мар я не разобрался

public class dz23 {
    static class Slova {
        String slova;

        public Slova(String slova) {
            this.slova = slova;
        }

        @Override
        public String toString() {
            return slova;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Slova)) return false;
            Slova other = (Slova) obj;
            return slova == other.slova;
        }

        @Override
        public int hashCode() {
            return Objects.hash(slova);
        }

    }
    static class Names {
        String names;
        int number;
        public Names(String names) {
            this.names = names;
            this.number = number;
        }

        @Override
        public String toString() {
            return names;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Slova)) return false;
            Slova other = (Slova) obj;
            return names == other.slova;
        }

        @Override
        public int hashCode() {
            return Objects.hash(names);
        }

    }

    public static void main(String[] args) {
        Slova[] sl = {new Slova("yabloko"), new Slova("shpagat"), new Slova("yabloko"), new Slova("chelovek"), new Slova("kokos"), new Slova("pydel"), new Slova("vinograd"), new Slova("mandarin"), new Slova("apelsin"), new Slova("yabloko")};
        List<Slova> sp = new ArrayList<>(Arrays.asList(sl));
        System.out.println(sp);
        Set<Slova> set = new LinkedHashSet<>(Arrays.asList(sl));
        System.out.println(set);
        Map<String, Integer> povtori = new HashMap<>();
        for (int i = 0; i < sp.size(); i++) {
            String temp = String.valueOf(sp.get(i));

            if (!povtori.containsKey(temp)) {
                povtori.put(temp, 1);
            } else {
                povtori.put(temp, povtori.get(temp) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : povtori.entrySet()) {
            System.out.println("Slovo = " + entry.getKey() + ", Povtorov = " + entry.getValue());
        }

        Map<String, Integer> phone = new HashMap<>();
        phone.put("Ivanov",1235457);
        phone.put("Petrov", 7654321);
        phone.put("Sidorov", 3214650);
        phone.put("Hartly", 6016682);
        phone.put("Haniball", 2338323);
        phone.put("Putin", 5066577);
        phone.put("Medvedev", 6031891);
        phone.put("Pingvin", 6547861);
        phone.put("Wiskas", 2324643);
        phone.put("Ivanov", 2468465);

        System.out.println(phone);
        System.out.println(phone.get("Petrov"));
        Set<String> a = phone.keySet();
        String l = "Ivanov";
        for(String k: a){
            if(l == k){
                System.out.printf("%d",phone.get(k));
            }
        }
    }
}