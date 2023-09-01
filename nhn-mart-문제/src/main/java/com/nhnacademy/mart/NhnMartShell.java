package com.nhnacademy.mart;

import java.util.Scanner;

public class NhnMartShell {

    public static void main(String[] args) {
        NhnMart mart = new NhnMart();
        mart.prepareMart();

        BuyList buyList = inputBuyListFromShell();

        // TODO 본인이름 영어로 변수명 작성!
        // 본인이름을 각자 맞게 영어로 변경
        // 홍길동 학생
        // -> hongGilDong or gilDong
        Customer jeongwoo = new Customer(buyList);

        // 장바구니를 챙긴다.
        jeongwoo.bring(mart.provideBasket());

        // 식품을 담는다.
        jeongwoo.pickFoods(mart.getFoodStand());

        // 카운터에서 계산한다.
        jeongwoo.payTox(mart.getCounter());
    }

    private static BuyList inputBuyListFromShell() {
        // TODO Scanner 입력을 받아 buyList 만들기
        Scanner scanner = new Scanner(System.in);
        BuyList buyList = new BuyList();

        buyList.add(???);

        scanner.close();
        return null;
    }
}
