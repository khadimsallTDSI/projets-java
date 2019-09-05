package pack2;
public class Principale {
	public static void main(String[] args){
Employe[] t=new Employe [5];
t[0] =new Agent(101, "Agent1", 160, 15.5);
t[1]=new Medecin(501,"Medecin1",1);
t[2]=new Agent(102,"Agent2",80,22);
t[3]=new Medecin(502,"Medecin2",2);
t[4]=new Medecin(503,"Medecin3",3);
for(int i=0;i<5;i++){
System.out.println(t[i].resumePaye()+" ");
     }
	 }
     }

