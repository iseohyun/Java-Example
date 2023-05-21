package b_Component;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class E_List extends Frame implements ItemListener {
    Panel p1 = new Panel();
    Panel p2 = new Panel();

    Panel p2_1 = new Panel();
    Panel p2_2 = new Panel();

    List list1 = new List(3, true);
    List list2 = new List(5);
    List list3 = new List(10);

    E_List() {
        setLayout(new FlowLayout());

        add(p1);
        add(p2);
        p2.add(p2_1);
        p2.add(p2_2);

        p1.add(list1);
        p2_1.add(list2);
        p2_2.add(list3);

        list1.add("사과");
        list1.add("배");
        list1.add("포도");
        list1.add("귤");
        list1.add("레몬");

        list2.add("짜장면");
        list2.add("울면");
        list2.add("라면");
        list2.add("볶음면");
        list2.add("짬짜면");

        list1.addItemListener(this);
        list2.addItemListener(this);

        addWindowListener(new WindowExit(this));

        setSize(300, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new E_List();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource().equals(list1)) {
            String[] items = list1.getSelectedItems();
            System.out.print("중복 리스트" + e.getItem() + ((e.getStateChange() == 1) ? "(선택)" : "(해제)") + " : ");
            for (String item : items) {
                System.out.print(item + ", ");
            }
            System.out.println();
        } else if (e.getSource().equals(list2)) {
            System.out.println("리스트 일반 (" + e.getItem() + ") : " + list2.getSelectedItem());
            list3.add(list2.getSelectedItem());
        }
    }
}

// 실습과제 : "감"을 추가해 봅니다.
// 실습과제 : 리스트 3에는 리스트2(짜장면, 울면.. ) 에서 선택된 리스트가 계속해서 추가됩니다.
// 일종의 주문서와 같습니다. 리스트에 추가하려고 할 때, 이미 해당 메뉴가 있다면, 해당 메뉴에 숫자를 추가하는 방식으로 수정해보세요.
// 예 ) 짜장면 -> 짜장면2 -> 짜장면3
// list3.getItemCount()
// list3.replaceItem()
// 실습과제 : 리스트 3에서 메뉴를 클릭하면 하나씩 취소하는 기능을 추가해 주세요.