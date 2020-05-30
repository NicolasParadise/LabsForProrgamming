package by.bsu.task.triangle;
import by.bsu.task.triangle.Triangle;
import by.bsu.task.triangle.Point;

public class Search {
    private Triangle[] ListTr;

    public Search(Triangle[] ListTr1){
        ListTr = new Triangle[ListTr1.length];
        for(int i = 0; i< ListTr1.length; i++){
            ListTr[i] = ListTr1[i];
        }
    }

    public void SearchFunction(){
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for(int i=0;i<ListTr.length;i++){
            if(ListTr[i].getView().equals("Равносторонний")){
                count1++;
            }else if (ListTr[i].getView().equals("Равнобедренный")){
                count2++;
            }else if (ListTr[i].getView().equals("Прямоугольный")){
                count3++;
            }else{
                count4++;
            }
    }
        Triangle[] List1 = new Triangle[count1];
        Triangle[] List2 = new Triangle[count2];
        Triangle[] List3 = new Triangle[count3];
        Triangle[] List4 = new Triangle[count4];
        for(int i=0,i1 = 0,i2 = 0,i3 = 0,i4 = 0;i<ListTr.length;i++) {
            if (ListTr[i].getView().equals("Равносторонний")) {
                List1[i1] = new Triangle(ListTr[i]);
            } else if (ListTr[i].getView().equals("Равнобедренный")) {
                List2[i2] = new Triangle(ListTr[i]);
            } else if (ListTr[i].getView().equals("Прямоугольный")) {
                List3[i3] = new Triangle(ListTr[i]);
            } else {
                List4[i4] = new Triangle(ListTr[i]);
            }
        }

        System.out.println("Равносторонних : " + count1 + ". Равнобедренных : " + count2 + ". Прямоугольных : " + count3 + ". Произвольных : " + count4);



        if( count1!= 0 ) {
            double max = 0;
            for (int i = 0; i < count1; i++) {
                if (max < List1[i].getArea()) {
                    max = List1[i].getArea();
                }
            }
            System.out.println("Максимальная площадь среди равносторонних : " + max);
        } else {
            System.out.println("Равносторнних нет");
        }
        if(count2!= 0) {
            double max = 0;
            for (int i = 0; i < count2; i++) {
                if (max < List2[i].getArea()) {
                    max = List2[i].getArea();
                }
            }
            System.out.println("Максимальная площадь среди равнобедренных : " + max);
        }else {
            System.out.println("Равнобедренных нет");
        }
        if(count3!= 0) {
            double max = 0;
            for (int i = 0; i < count3; i++) {
                if (max < List3[i].getArea()) {
                    max = List3[i].getArea();
                }
            }
            System.out.println("Максимальная площадь среди прямоугольных : " + max);
        }else {
            System.out.println("Прямоугольных нет");
        }
        if(count4!= 0){
            double max = 0;
            for (int i = 0; i < count4; i++) {
                if (max < List4[i].getArea()) {
                    max = List4[i].getArea();
                }
            }
            System.out.println("Максимальная площадь среди произвольных : " + max);
    }else{
            System.out.println("Произольных нет");
        }
}
}
