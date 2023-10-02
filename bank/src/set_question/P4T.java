package set_question;

import java.io.FileWriter;

public class P4T {
    public static void main(String[] args) {
        int ea = 20;

        String part[] = new String[ea];
        String name[] = new String[ea];
        String exp[] = new String[ea];

        part[0]="DB"; name[0]="RTO"; exp[0]="복구되어 가동될 때 까지의 소요시간";
        part[1]="DB"; name[1]="RPO"; exp[1]="데이터를 복구할 수 있는 기점";
        part[2]="DB"; name[2]="DAC"; exp[2]="데이터에 접근하는 사용자의 신원에 따라 권한 부여";
        part[3]="DB"; name[3]="MAC"; exp[3]="주체와 객체의 등급을 비교";
        part[4]="DB"; name[4]="RBAC"; exp[4]="사용자의 역할에 따라 접근 권한 부여";
        part[5]="DB"; name[5]="DAS"; exp[5]="서버와 저장장치 전용 케이블로 직접 연결";
        part[6]="DB"; name[6]="NAS"; exp[6]="서버 - 저장장치 네트워크로 연결, 별도의 파일 관리 가능";
        part[7]="DB"; name[7]="SAN"; exp[7]="서버와 저장장치를 연결하는 전용 네트워크 별도 구성";
        part[8]="DB"; name[8]="Redo"; exp[8]="데이터베이스 비정상 종료 시 트랙잭션의 시작(Start)과 완료(Commit)에 대한 기록이 있는 작업을 재작업";
        part[9]="DB"; name[9]="Undo"; exp[9]="시작(Start)은 있지만 완료(Commit)에 대한 기록은 없는 트랜잭션들이 작업한 변경 내용들 모두 취소";
        part[10]="DB"; name[10]="즉각 갱신 기법"; exp[10]="트랙잭션이 부분 완료되기 전이라도 즉시 데이터베이스 반영";
        part[11]="DB"; name[11]="교착상태"; exp[11]="서로 다른 프로세스가 점유하고 있는 자원을 요구하며 무한정 기다리는 현상";
        part[12]="DB"; name[12]="Locking Granularity"; exp[12]="병행제어에서 한꺼번에 로킹할 수 있는 객체의 크기";
        part[13]="DB"; name[13]="타임스탬프 순서"; exp[13]="시간표를 부여하여 부여된 시간에 따라 트랜잭션 작업을 수행";
        part[14]="DB"; name[14]="로킹"; exp[14]="접근한 데이터에 대한 연산을 마칠 때 까지 추가적인 접근을 제한, 상호배타적으로 접근하여 작업을 수행하도록 하는 병행제어 기법";
        part[15]="DB"; name[15]="트랜잭션의 원자성"; exp[15]="트랜잭션의 연산은 데이터베이스에 모두 반영되도록 완료(Commit) 또는 전혀 반영되지 않도록 복구(Rollback)";
        part[16]="DB"; name[16]="트랜잭션의 일관성"; exp[16]="트랜잭션이 실행을 성공적으로 완료하면 언제나 일관성 있는 데이터베이스 상태로 변환";
        part[17]="DB"; name[17]="트랜잭션의 독립성"; exp[17]="둘 이상의 트랜잭션 병행 실행되는 경우, 어느 하나의 트랜잭션 실행 중에 다른 트랜잭션의 연산이 끼어들 수 없음";
        part[18]="DB"; name[18]="트랜잭션의 지속성"; exp[18]="성공적으로 완료된 트랜잭션의 결과는 시스템이 고장나도 영구 반영";
        part[19]="DB"; name[19]="시스템 카탈로그"; exp[19]="시스템 자신이 필요로 하는 스키마 및 여러가지 객체에 관한 정보를 포함하고 있는 시스템 데이터 베이스\n" +
                "\n" +
                "DBMS가 스스로 생성하고 유지";
//        part[2]="DB"; name[2]=""; exp[2]="";

        int num_ex = 3;
        int ex_num[] = new int[num_ex];

        for(int op1 = 0; op1 < num_ex; op1++){
            ex_num[op1] = (int) (Math.random() * ea);
            for(int op2 = 0; op2 < op1; op2++){
                if(op1 > 0 && ex_num[op1] == ex_num[op2]){
                    op1--;
                    continue;
                }
            }
        }
        String problem = "";
        String answer = "";
        for(int op1 = 0; op1 < num_ex; op1++){
            problem += "[" + (op1+1) + "번 문제]\n"
            + "<" + part[ex_num[op1]] + ">\n";
            answer += "[" + (op1+1) + "번 문제]\n"
            + "<" + part[ex_num[op1]] + ">\n";
            int ran = (int)(Math.random()*2);
            if(ran == 0){
                problem += "문제 : " + name[ex_num[op1]] + "\n\n\n";
                answer += "문제 : " + name[ex_num[op1]] + "\n답 : " + exp[ex_num[op1]] + "\n\n";
            }else{
                problem += "문제 : " + exp[ex_num[op1]] + "\n\n\n";
                answer += "문제 : " + exp[ex_num[op1]] + "\n답 : " + name[ex_num[op1]] + "\n\n";
            }
        }
        try{
            FileWriter fw_p = new FileWriter("D:\\dev\\idea\\bank\\src\\set_question\\problem.txt");
            FileWriter fw_a = new FileWriter("D:\\dev\\idea\\bank\\src\\set_question\\answer.txt");

            fw_p.write(problem);
            fw_a.write(answer);

            fw_p.close();
            fw_a.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(problem);
    }
}
