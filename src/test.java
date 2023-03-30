//public class test {
//    public static void thirdRealisation(){
//        Runnable sum5 = ()->Branch.sum+=5;
//        Runnable sum10 = ()->Branch.sum+=10;
//        Runnable sum50 = ()->Branch.sum+=50;
//        Runnable y1 = ()-> {
//            System.out.println("Возврат" + Branch.sum);
//            Branch.sum=0;
//        };
//        Runnable y2 = ()-> {
//            System.out.println("Напиток и сдача " + (Branch.sum-15));
//            Branch.sum=0;
//        };
//        Branch[][] table = new Branch[4][5];
//        table[0][0] = new Branch(1,sum5);
//        table[0][1] = new Branch(1,sum10);
//        table[0][2] = new Branch(3,sum50);
//        table[1][0] = new Branch(2,sum5);
//        table[1][1] = new Branch(2,sum10);
//        table[1][2] = new Branch(2,sum50);
//        table[1][3] = new Branch(0,y1);
//        table[3][3] = new Branch(0,y1);
//        table[3][4] = new Branch(0,y2);
//        int state = 0;
//        while (true){
//            switch (state) {
//                case 0 ->
//                        System.out.println("Напиток стоит 15р.Ожидание внесения суммы. Допустимы деньги наминалом 5,10,50.");
//                case 1 ->
//                        System.out.println("Напиток стоит 15р.Ожидание внесения суммы. Допустимы деньги наминалом 5,10,50. Вы также можете вернуть деньгы, которые находятся на балансенажав \"Сброс\". Текущий баланс: " + Branch.sum);
//                case 3 ->
//                        System.out.println("Вы можете вернуть деньгы, которые находятся на балансе нажав \"Сброс\" или получить напиток и сдачу нажав \"Налить\". Текущий баланс: " + Branch.sum);
//            }
//
//            int x = next()-1;
//            table[state][x].getFunc().run();
//            state = table[state][x].getNextState();
//            if(state == 2)
//                state = Branch.sum>=15?3:1;
//        }
//    }
//import java.util.function.Consumer;
//import java.util.function.Supplier;
//
//    public class Branch {
//        public static int sum = 0;
//        private final Runnable func;
//
//        private final int nextState;
//
//        public Branch(int nextState,Runnable func) {
//            this.func = func;
//            this.nextState = nextState;
//        }
//
//        public int getNextState() {
//            return nextState;
//        }
//
//
//        public Runnable getFunc() {
//            return func;
//        }
//
//    }
//
//}
