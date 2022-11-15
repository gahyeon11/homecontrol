package java_middle;

public class Control {

	int[] status = new int[] {0,0,0,0,0,0,0,0};
	  //기본 상태는 모두 off로 설정
	String enter;
	String sec;
	int lightnum;

    
    
      void onoroff(){    //상태 출력을 위한 메소드
       
    	  if(status[0] == 0) {
       	   if(status[1] == 0) {System.out.print("보안: 재실 ,");}
       	   else if(status[1] == 1) System.out.print("보안: 잠시 외출 ,");
          }if(status[0] == 1) {
       	   if(status[1] == 0) {System.out.print("보안: 단기외출 ,");}
        	else if(status[1] == 1) System.out.print("보안: 장기 외출 ,");
          }
    	  for(int i=2; i<5;i++) {
    	   if(status[i] == 0) {
    	    System.out.print("전등" + (i-1) + ": OFF ,");
    	   }else System.out.print("전등" + (i-1) + ": ON ,");
    	   }

    	   if(status[5] == 0) {
    	    System.out.print("커튼" + ": OFF ,");
    	   }else System.out.print("커튼" + ": ON ,");
    	   if(status[6] == 0) {
       	    System.out.print("티비" + ": OFF ,");
       	   }else System.out.print("티비" + ": ON ,");
    	   if(status[7] == 0) {
       	    System.out.print("가스" + ": OFF ");
       	   }else System.out.print("가스" + ": ON ");
    	   }
       
       
      void security() {
       	  if(sec.equals("재실")) {
       		status[0]=0;
       		status[1]=0;
       	  }
       	  else if(sec.equals("잠시외출")) {
       		status[0]=0;
       		status[1]=1;
     	  }
       	 else if(sec.equals("단기외출")) {
       		status[0]=1;
       		status[1]=0;
   	    }
       	 else if(sec.equals("장기외출")) {
       		status[0]=1;
       		status[1]=1;
   	    }
      } 
      void light() {
    	  status[(lightnum+1)] = (1-status[(lightnum+1)]);
      }
      void curtain() {
    	  status[5]=(1-status[5]);
      }
      void tv() {
    	  status[6]=(1-status[6]);
      }
      void gas() {
    	  status[7]=(1-status[7]);
   	  
      }
        
}
