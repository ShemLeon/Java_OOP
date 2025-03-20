package Exercices.EX1._6_Polymorphism;

class Point{
    int x = 0;
    int y = 0;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setY(int y){
        this.y = y;
    }
    public String toString() {
        return "X:"+x+" Y:"+y;
    }
}

class Vector {
    private Object[] elements;
    private int size;
    // Конструктор - создает пустой вектор размером 0
    public Vector(){
        elements = new Object[10]; // начальная емкость (она >3)
        size = 0;
    }

    // Метод добавления объекта в конец вектора
    public void addElement(Object obj){
        if (size < elements.length) {
            elements[size++] = obj;
        }
    }

    public Object elementAt(int index){
        if (index >= 0 && index < size)
            return elements[index];
        return null;
    }

    public int size(){
        return size;
    }
  }

  class MyPoints{
    public static void main(String[] args){
        Vector v = new Vector();

        // добавляем минимум 3 точки
        v.addElement(new Point(1,1));
        v.addElement(new Point(2,2));
        v.addElement(new Point(3,1));

        for (int i=0; i< v.size(); i++){
            Point p = (Point)v.elementAt(i);
            p.setY(0);
            System.out.println(p.toString());
        }
/*
        Так сделать нельзя - Метод elementAt возвращает тип Object, а не Exercices.EX1._6_Polymorphism.Point.
        Java не знает, что возвращаемый объект - это именно Exercices.EX1._6_Polymorphism.Point, и поэтому не может найти метод setY().
Нужно обязательно сделать приведение типов (cast)
        for (int i=0; i< v.size(); i++){
            v.elementAt(i).setY(0);
            System.out.println(v.elementAt(i).toString());
        }
*/
    }
  }


