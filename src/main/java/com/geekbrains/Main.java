package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "80297706654", 52000, 30);
        workers[1] = new Worker("Suvorova Milana", "Manager", "suv.mila@mailbox.com", "80293455505", 42000, 24);
        workers[2] = new Worker("Latishev Yaroslav", "Economist", "latYaroslav@mailbox.com", "80294584838", 40000, 41);
        workers[3] = new Worker("Voronin Oleg", "Analyst", "oleg_vor@mailbox.com", "802534596281", 45000, 28);
        workers[4] = new Worker("Osipova Yulia", "Director", "os_yulia@mailbox.com", "80443535348", 90000, 45);

        for(int i = 0; i < workers.length; i++){
            if(workers[i].workerAge() > 40){
                System.out.println(workers[i].workerInf());
            }
        }
    }
}

class Worker {
        public String name;
        public String post;
        public String email;
        public String phone;
        public int wages;
        public int age;

        public Worker (String name, String post, String email, String phone, int wages, int age){
            this.name = name;
            this.post = post;
            this.email = email;
            this.phone = phone;
            this.wages = wages;
            this.age = age;
        }

        public String workerInf(){
            return (name + "\n-"+ post+ "\n-" + email+ "\n-" + phone+ "\n-" + wages+ "\n-" + age);
        }

        public int workerAge(){
            return age;
        }

}
