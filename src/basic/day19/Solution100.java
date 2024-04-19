package basic.day19;

/**
 * <h2>문제 : 커피 심부름</h2>
 * <p>
 * 팀의 막내인 철수는 아메리카노와 카페 라테만 판매하는 카페에서 팀원들의 커피를 사려고 합니다.
 * 아메리카노와 카페 라테의 가격은 차가운 것과 뜨거운 것 상관없이 각각 4500, 5000원입니다.
 * 각 팀원에게 마실 메뉴를 적어달라고 하였고, 그 중에서 메뉴만 적은 팀원의 것은 차가운 것으로 통일하고 "아무거나"를 적은 팀원의 것은 차가운 아메리카노로 통일하기로 하였습니다.
 * <p>
 * 각 직원이 적은 메뉴가 문자열 배열 order로 주어질 때, 카페에서 결제하게 될 금액을 return 하는 solution 함수를 작성해주세요.
 * order의 원소는 아래의 것들만 들어오고, 각각의 의미는 다음과 같습니다.
 * </p>
 */
public class Solution100 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"cafelatte", "americanoice", "hotcafelatte", "anything"}));
        System.out.println(solution(new String[]{"americanoice", "americano", "iceamericano"}));
    }

    private static int solution(String[] order) {
        int totalPrice = 0;

        for (String menu : order) {
            if (menu.contains("americano")) totalPrice += 4500;
            else if (menu.contains("cafelatte")) totalPrice += 5000;
            else if(menu.contains("anything")) totalPrice += 4500;
        }
        return totalPrice;
    }
}