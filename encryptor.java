
import java.util.*;

class encryptor
{
    static int ctr2=0;
    public static void title()
    {
        System.out.println("dP    dP           a88888b.                              dP                     ");
        System.out.println("Y8.  .8P          d8'   `88                              88                     ");
        System.out.println(" Y8aa8P           88        88d888b. dP    dP 88d888b. d8888P .d8888b. 88d888b. ");
        System.out.println("d8'  `8b 88888888 88        88'  `88 88    88 88'  `88   88   88'  `88 88'  `88 ");
        System.out.println("88    88          Y8.   .88 88       88.  .88 88.  .88   88   88.  .88 88       ");
        System.out.println("dP    dP           Y88888P' dP       `8888P88 88Y888P'   dP   `88888P' dP       ");
        System.out.println("                                          .88 88                                ");
        System.out.println("                                      d8888P  dP              ");

    }

    public static void welcome()
    {
        int in=0;
        String name="";
        while(in==0)
        	{	
        	    System.out.println("Please enter your credentials and password");
        	    System.out.println();
        	    System.out.print("Login ID: ");
        	    String login=sc.nextLine();
        	    System.out.println();
        	    System.out.print("Password: ");
        	    String pass=sc.nextLine();
        	    System.out.println();
        	    
        	    if(login.equals("Agent X"))
        	    {
        	        if(pass.equals("pass@1234"))
        	        {
        	            name="Agent X";
        	            in=1;
        	           }
        	           else
        	           {
        	               System.out.println("Wrong Password. Please try again");  
        	               for(long lo=1;lo<=99999999;lo++);
        	           }
        	       }
        	       else if(login.equals("Agent Y"))
        	       {
        	           if(pass.equals("pass@1234"))
        	           {
        	               name="Agent Y";
        	               in=1;
        	           }
        	           else
        	           {
        	               System.out.println("Wrong password. Please try again");
        	               for(long lo=1;lo<=99999999;lo++);
        	           }
        	       }
        	       else
        	       {
        	           System.out.println("Wrong login ID. Please try again");
        	           for(long lo=1;lo<=99999999;lo++);
        	       }
        	}
        System.out.println();
        String s="Welcome "+name+".",s2="Please check your surroundings for onlookers as this is classified information.",s3="Thank you.";
        String s4="What would you like to use today?";
        String s5="Please keep in minfd that all these ciphers only take alphabets as their keys";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            for(long j=1;j<=99999999;j++);
            System.out.print(ch);
        }
        System.out.println();
        for(int j=0;j<s2.length();j++)
        {
            char ch2=s2.charAt(j);
            for(long k=1;k<=99999999;k++);
            System.out.print(ch2);
        }
        System.out.println();
        for(int k=0;k<s3.length();k++) 
        {
            char ch3=s3.charAt(k);
            for(long l=1;l<=99999999;l++);
            System.out.print(ch3);
        }
        System.out.println();
        for(int l=0;l<s4.length();l++)
        {
            char ch4=s4.charAt(l);
            for(long m=1;m<=99999999;m++);
            System.out.print(ch4);
        }
        System.out.println();
        for(int m=0;m<s5.length();m++)
        {
            char ch5=s5.charAt(m);
            for(long n=1;n<=99999999;n++);
            System.out.print(ch5);
        }
        System.out.println();
    }
    char[][] Anand=new char[4][26];

    static Scanner sc=new Scanner(System.in);
    public void playfairCipherPassword(String s2)
    {
        for(int ab=97;ab<=122;ab++)
        {
            Anand[1][ab-97]=(char)ab;
        }

        s2=s2.toLowerCase();

        int lenp=s2.length();

        int ctr=0,ar=1;
        String s4=""+s2.charAt(0);
        Anand[1][0]=s2.charAt(0);
        for(int a=1;a<lenp;a++)
        {
            char ch=s2.charAt(a);
            String s3=s2.substring(0,a);
            int b=s3.indexOf(ch);

            if(b==-1){
                Anand[1][ar]=ch;
                s4=s4+ch;
                ar++;
            }
        }
        //for(int x=0;x<26;x++)
        //System.out.print(Anand[x]);
        //System.out.println(s4);
        int c=s4.length();
        int e=97;
        int ar2=c;
        for(int d=c;d<26;d++)
        {
            char ch2=(char)e;
            int f=s4.indexOf(ch2);
            if(f==-1){
                Anand[1][ar2]=ch2;
                s4=s4+ch2;
                ar2++;
            }
            else
                d--;
            e++;
        }
        //for(int x=0;x<26;x++)
        //System.out.println(Anand[x]);

    }

    public void playfairCipherMessage(String s)
    {
        s=s.toLowerCase();
        int len=s.length();
        String s5="";
        for(int f=0;f<len;f++)
        {
            char ch3=s.charAt(f);
            int g=(int)ch3;
            switch(g)
            {

                case 97:{
                    ch3=Anand[1][0];    
                    s5+=ch3;
                }
                break;
                case 98:{
                    ch3=Anand[1][1];    
                    s5+=ch3;
                }
                break;
                case 99:{
                    ch3=Anand[1][2];    
                    s5+=ch3;
                }
                break;
                case 100:{
                    ch3=Anand[1][3];    
                    s5+=ch3;
                }
                break;
                case 101:{
                    ch3=Anand[1][4];    
                    s5+=ch3;
                }
                break;
                case 102:{
                    ch3=Anand[1][5];    
                    s5+=ch3;
                }
                break;
                case 103:{
                    ch3=Anand[1][6];    
                    s5+=ch3;
                }
                break;
                case 104:{
                    ch3=Anand[1][7];    
                    s5+=ch3;
                }
                break;
                case 105:{
                    ch3=Anand[1][8];    
                    s5+=ch3;
                }
                break;
                case 106:{
                    ch3=Anand[1][9];    
                    s5+=ch3;
                }
                break;
                case 107:{
                    ch3=Anand[1][10];    
                    s5+=ch3;
                }
                break;
                case 108:{
                    ch3=Anand[1][11];    
                    s5+=ch3;
                }
                break;
                case 109:{
                    ch3=Anand[1][12];    
                    s5+=ch3;
                }
                break;
                case 110:{
                    ch3=Anand[1][13];    
                    s5+=ch3;
                }
                break;
                case 111:{
                    ch3=Anand[1][14];    
                    s5+=ch3;
                }
                break;
                case 112:{
                    ch3=Anand[1][15];    
                    s5+=ch3;
                }
                break;
                case 113:{
                    ch3=Anand[1][16];    
                    s5+=ch3;
                }
                break;
                case 114:{
                    ch3=Anand[1][17];    
                    s5+=ch3;
                }
                break;
                case 115:{
                    ch3=Anand[1][18];    
                    s5+=ch3;
                }
                break;
                case 116:{
                    ch3=Anand[1][19];    
                    s5+=ch3;
                }
                break;
                case 117:{
                    ch3=Anand[1][20];    
                    s5+=ch3;
                }
                break;
                case 118:{
                    ch3=Anand[1][21];    
                    s5+=ch3;
                }
                break;
                case 119:{
                    ch3=Anand[1][22];    
                    s5+=ch3;
                }
                break;
                case 120:{
                    ch3=Anand[1][23];    
                    s5+=ch3;
                }
                break;

                case 121:{
                    ch3=Anand[1][24];    
                    s5+=ch3;
                }
                break;
                case 122:{
                    ch3=Anand[1][25];    
                    s5+=ch3;
                }
                break;
                default:s5+=ch3;
            }
        }
        System.out.println("Your secret encrypted message:");
        System.out.println(s5);
        for(long z=1;z<=99999999;z++);
        cont();
    }

    public void playfairCipherDecryptor(String s7)
    {
        int lenp2=s7.length();
        String s8="";
        String s9="";
        char []array2={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int g=0;g<26;g++)
        {
            s8+=Anand[1][g];
        }
        //System.out.println(s8);
        for(int h=0;h<lenp2;h++)
        {
            char ch4=s7.charAt(h);
            int i=s8.indexOf(ch4);
            if(i==-1)
                s9+=ch4;
            else
                s9+=array2[i];
        }
        System.out.println("Your secret decrypted message:");
        System.out.println(s9);
        for(long z=1;z<=99999999;z++);
        cont();
    }

    public void morseCode(String s10)
    {
        int len2=s10.length();
        s10=s10.toLowerCase();
        System.out.println("Your secret encrypted message:");
        for(int j=0;j<len2;j++)
        {
            char ch5=s10.charAt(j);
            switch(ch5)
            {
                case 'a':
                System.out.print(".-");
                break;
                case 'b':
                System.out.print("-...");
                break;
                case 'c':
                System.out.print("-.-.");
                break;
                case 'd':
                System.out.print("-..");
                break;
                case 'e':
                System.out.print(".");
                break;
                case 'f':
                System.out.print("..-.");
                break;
                case 'g':
                System.out.print("--.");
                break;
                case 'h':
                System.out.print("....");
                break;
                case 'i':
                System.out.print("..");
                break;
                case 'j':
                System.out.print(".---");
                break;
                case 'k':
                System.out.print("-.-");
                break;
                case 'l':
                System.out.print(".-..");
                break;
                case 'm':
                System.out.print("--");
                break;
                case 'n':
                System.out.print("-.");
                break;
                case 'o':
                System.out.print("---");
                break;
                case 'p':
                System.out.print(".--.");
                break;
                case 'q':
                System.out.print("--.-");
                break;
                case 'r':
                System.out.print(".-.");
                break;
                case 's':
                System.out.print("...");
                break;
                case 't':
                System.out.print("-");
                break;
                case 'u':
                System.out.print("..-");
                break;
                case 'v':
                System.out.print("...-");
                break;
                case 'w':
                System.out.print(".--");
                break;
                case 'x':
                System.out.print("-..-");
                break;
                case 'y':
                System.out.print("-.--");
                break;
                case 'z':
                System.out.print("--..");
                break;
                case '1':
                System.out.print(".----");
                break;
                case '2':
                System.out.print("..---");
                break;
                case '3':
                System.out.print("...--");
                break;
                case '4':
                System.out.print("....-");
                break;
                case '5':
                System.out.print(".....");
                break;
                case '6':
                System.out.print("-....");
                break;
                case '7':
                System.out.print("--...");
                break;
                case '8':
                System.out.print("---..");
                break;
                case '9':
                System.out.print("----.");
                break;
                case '0':
                System.out.print("-----");
                break;
                case ' ':
                System.out.print("       ");
                break;
                default:break;
            }
            System.out.print("   ");

        }
        System.out.println();
        for(long z=1;z<=99999999;z++);
        cont();
    }

    public void morseCodeDecryptor(String s11)
    {
        s11=s11+" ";
        int len3=s11.length();
        String w="";
        int white=0;
        System.out.println("Your secret decrypted message:");
        for(int i=0;i<len3;i++)
        {
            char ch6=s11.charAt(i);
            
            if(ch6==' ')
            {
                white++;
                if(white<2)
                {
                    switch(w)
                    {
                        case ".-":
                        System.out.print("a");
                        break;
                        case "-...":
                        System.out.print("b");
                        break;
                        case "-.-.":
                        System.out.print("c");
                        break;
                        case "-..":
                        System.out.print("d");
                        break;
                        case ".":
                        System.out.print("e");
                        break;
                        case "..-.":
                        System.out.print("f");
                        break;
                        case "--.":
                        System.out.print("g");
                        break;
                        case "....":
                        System.out.print("h");
                        break;
                        case "..":
                        System.out.print("i");
                        break;
                        case ".---":
                        System.out.print("j");
                        break;
                        case "-.-":
                        System.out.print("k");
                        break;
                        case ".-..":
                        System.out.print("l");
                        break;
                        case "--":
                        System.out.print("m");
                        break;
                        case "-.":
                        System.out.print("n");
                        break;
                        case "---":
                        System.out.print("o");
                        break;
                        case ".--.":
                        System.out.print("p");
                        break;
                        case "--.-":
                        System.out.print("q");
                        break;
                        case ".-.":
                        System.out.print("r");
                        break;
                        case "...":
                        System.out.print("s");
                        break;
                        case "-":
                        System.out.print("t");
                        break;
                        case "..-":
                        System.out.print("u");
                        break;
                        case "...-":
                        System.out.print("v");
                        break;
                        case ".--":
                        System.out.print("w");
                        break;
                        case "-..-":
                        System.out.print("x");
                        break;
                        case "-.--":
                        System.out.print("y");
                        break;
                        case "--..":
                        System.out.print("z");
                        break;
                        case ".----":
                        System.out.print("1");
                        break;
                        case "..---":
                        System.out.print("2");
                        break;
                        case "...--":
                        System.out.print("3");
                        break;
                        case "....-":
                        System.out.print("4");
                        break;
                        case ".....":
                        System.out.print("5");
                        break;
                        case "-....":
                        System.out.print("6");
                        break;
                        case "--...":
                        System.out.print("7");
                        break;
                        case "---..":
                        System.out.print("8");
                        break;
                        case "----.":
                        System.out.print("9");
                        break;
                        case "-----":
                        System.out.print("0");
                        break;
                        default:
                        {
                            System.out.println("Wrong morse code. Try Again");
                            for(long a=0;a<=999999999;a++);
                            main();
                        }
                    }
                }
                else if(white==7)
                    System.out.print(" ");
                w="";
            }
            else
            {
                w=w+ch6;
                white=0;
            }
        }
        for(long z=1;z<=99999999;z++);
        cont();
    }
    String s[]=new String[2];
    public void vigenereCipherPassword(String s12,String s16)
    {
        s[0]=s12;
        s[1]=s16;
        for(int bc=2;bc<4;bc++)
        {
            for(int ac=97;ac<=122;ac++)
            {
                Anand[bc][ac-97]=(char)ac;
            }

            s[bc-2]=s[bc-2].toLowerCase();

            int lenp12=s[bc-2].length();

            int ctr=0,ar=1;
            String s13=""+s[bc-2].charAt(0);
            Anand[bc][0]=s[bc-2].charAt(0);
            for(int a=1;a<lenp12;a++)
            {
                char ch=s[bc-2].charAt(a);
                String s3=s[bc-2].substring(0,a);
                int b=s3.indexOf(ch);

                if(b==-1){
                    Anand[bc][ar]=ch;
                    s13=s13+ch;
                    ar++;
                }
            }
            //for(int x=0;x<26;x++)
            //System.out.print(Anand[x]);
            //System.out.println(s4);
            int c=s13.length();
            int e=97;
            int ar2=c;
            for(int d=c;d<26;d++)
            {
                char ch2=(char)e;
                int f=s13.indexOf(ch2);
                if(f==-1){
                    Anand[bc][ar2]=ch2;
                    s13=s13+ch2;
                    ar2++;
                }
                else
                    d--;
                e++;
            }
            //for(int x=0;x<26;x++)
            //System.out.println(Anand[x]);

        }
    }

    public void vigenereCipherMessage(String s14)
    {
        int len14=s14.length();
        String s15="";
        for(int m=0;m<len14;m++)
        {
            char ch7=s14.charAt(m);
            int n=(int)ch7;
            switch(m%2)
            {
                case 0:
                {
                    switch(n)
                    {
                        case 97:{
                            ch7=Anand[2][0];    
                            s15+=ch7;
                        }
                        break;
                        case 98:{
                            ch7=Anand[2][1];    
                            s15+=ch7;
                        }
                        break;
                        case 99:{
                            ch7=Anand[2][2];    
                            s15+=ch7;
                        }
                        break;
                        case 100:{
                            ch7=Anand[2][3];    
                            s15+=ch7;
                        }
                        break;
                        case 101:{
                            ch7=Anand[2][4];    
                            s15+=ch7;
                        }
                        break;
                        case 102:{
                            ch7=Anand[2][5];    
                            s15+=ch7;
                        }
                        break;
                        case 103:{
                            ch7=Anand[2][6];    
                            s15+=ch7;
                        }
                        break;
                        case 104:{
                            ch7=Anand[2][7];    
                            s15+=ch7;
                        }
                        break;
                        case 105:{
                            ch7=Anand[2][8];    
                            s15+=ch7;
                        }
                        break;
                        case 106:{
                            ch7=Anand[2][9];    
                            s15+=ch7;
                        }
                        break;
                        case 107:{
                            ch7=Anand[2][10];    
                            s15+=ch7;
                        }
                        break;
                        case 108:{
                            ch7=Anand[2][11];    
                            s15+=ch7;
                        }
                        break;
                        case 109:{
                            ch7=Anand[2][12];    
                            s15+=ch7;
                        }
                        break;
                        case 110:{
                            ch7=Anand[2][13];    
                            s15+=ch7;
                        }
                        break;
                        case 111:{
                            ch7=Anand[2][14];    
                            s15+=ch7;
                        }
                        break;
                        case 112:{
                            ch7=Anand[2][15];    
                            s15+=ch7;
                        }
                        break;
                        case 113:{
                            ch7=Anand[2][16];    
                            s15+=ch7;
                        }
                        break;
                        case 114:{
                            ch7=Anand[2][17];    
                            s15+=ch7;
                        }
                        break;
                        case 115:{
                            ch7=Anand[2][18];    
                            s15+=ch7;
                        }
                        break;
                        case 116:{
                            ch7=Anand[2][19];    
                            s15+=ch7;
                        }
                        break;
                        case 117:{
                            ch7=Anand[2][20];    
                            s15+=ch7;
                        }
                        break;
                        case 118:{
                            ch7=Anand[2][21];    
                            s15+=ch7;
                        }
                        break;
                        case 119:{
                            ch7=Anand[2][22];    
                            s15+=ch7;
                        }
                        break;
                        case 120:{
                            ch7=Anand[2][23];    
                            s15+=ch7;
                        }
                        break;

                        case 121:{
                            ch7=Anand[2][24];    
                            s15+=ch7;
                        }
                        break;
                        case 122:{
                            ch7=Anand[2][25];    
                            s15+=ch7;
                        }
                        break;
                        default:s15+=ch7;

                    }
                }
                break;
                default:
                {
                    switch(n)
                    {
                        case 97:{
                            ch7=Anand[3][0];    
                            s15+=ch7;
                        }
                        break;
                        case 98:{
                            ch7=Anand[3][1];    
                            s15+=ch7;
                        }
                        break;
                        case 99:{
                            ch7=Anand[3][2];    
                            s15+=ch7;
                        }
                        break;
                        case 100:{
                            ch7=Anand[3][3];    
                            s15+=ch7;
                        }
                        break;
                        case 101:{
                            ch7=Anand[3][4];    
                            s15+=ch7;
                        }
                        break;
                        case 102:{
                            ch7=Anand[3][5];    
                            s15+=ch7;
                        }
                        break;
                        case 103:{
                            ch7=Anand[3][6];    
                            s15+=ch7;
                        }
                        break;
                        case 104:{
                            ch7=Anand[3][7];    
                            s15+=ch7;
                        }
                        break;
                        case 105:{
                            ch7=Anand[3][8];    
                            s15+=ch7;
                        }
                        break;
                        case 106:{
                            ch7=Anand[3][9];    
                            s15+=ch7;
                        }
                        break;
                        case 107:{
                            ch7=Anand[3][10];    
                            s15+=ch7;
                        }
                        break;
                        case 108:{
                            ch7=Anand[3][11];    
                            s15+=ch7;
                        }
                        break;
                        case 109:{
                            ch7=Anand[3][12];    
                            s15+=ch7;
                        }
                        break;
                        case 110:{
                            ch7=Anand[3][13];    
                            s15+=ch7;
                        }
                        break;
                        case 111:{
                            ch7=Anand[3][14];    
                            s15+=ch7;
                        }
                        break;
                        case 112:{
                            ch7=Anand[3][15];    
                            s15+=ch7;
                        }
                        break;
                        case 113:{
                            ch7=Anand[3][16];    
                            s15+=ch7;
                        }
                        break;
                        case 114:{
                            ch7=Anand[3][17];    
                            s15+=ch7;
                        }
                        break;
                        case 115:{
                            ch7=Anand[3][18];    
                            s15+=ch7;
                        }
                        break;
                        case 116:{
                            ch7=Anand[3][19];    
                            s15+=ch7;
                        }
                        break;
                        case 117:{
                            ch7=Anand[3][20];    
                            s15+=ch7;
                        }
                        break;
                        case 118:{
                            ch7=Anand[3][21];    
                            s15+=ch7;
                        }
                        break;
                        case 119:{
                            ch7=Anand[3][22];    
                            s15+=ch7;
                        }
                        break;
                        case 120:{
                            ch7=Anand[3][23];    
                            s15+=ch7;
                        }
                        break;

                        case 121:{
                            ch7=Anand[3][24];    
                            s15+=ch7;
                        }
                        break;
                        case 122:{
                            ch7=Anand[3][25];    
                            s15+=ch7;
                        }
                        break;
                        default:s15+=ch7;

                    }
                }
            }

        }
        System.out.println("Your secret encrypted message:");
        System.out.println(s15);
        for(long z=1;z<=99999999;z++);
        cont();
    }

    public void vigenereCipherDecryptor(String s17)
    {
        int lenp2=s17.length();
        String s18="";
        String s19="";
        String s20="";
        char []array3={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int o=0;o<26;o++)
        {
            s18+=Anand[2][o];
        }
        for(int p=0;p<26;p++)
        {
            s19+=Anand[3][p];
        }
        for(int h=0;h<lenp2;h++)
        {
            char ch7=s17.charAt(h);
            if(h%2==0)
            {
                int i=s18.indexOf(ch7);
                if(i==-1)
                    s20+=ch7;
                else
                    s20+=array3[i];
            }
            else
            {
                int i=s19.indexOf(ch7);
                if(i==-1)
                    s20+=ch7;
                else
                    s20+=array3[i];
            }
        }
        System.out.println("Your secret decrypted message:");
        System.out.println(s20);
        for(long z=1;z<=99999999;z++);
        cont();
    }
    char array4[]=new char[26];
    char array5[]=new char[26];
  
    public void affineCipherPassword()
    {
        System.out.println("Enter value for a(positive integer which is co-prime with 26)");
        int a=sc.nextInt();
        System.out.println("Enter value for b(positive integer)");
        int b=sc.nextInt();
        for(int q=0;q<26;q++)
        {
            int r=q+97;
            array4[q]=(char)r;
            int s=a*q+b;
            while(s>26)
            {
                s=s-26;
            }
            s=s+97;
            array5[q]=(char)s;
        }
    }

    public void affineCipherMessage(String s21)
    {
        int len21=s21.length();
        String s22="";
        String copy="";
        for(int aa=0;aa<len21;aa++)
        {
            char cch=s21.charAt(aa);
            if(cch==' ')
            {
               continue;
            }
            else
            {
                copy+=cch;
            }
           
        }
        s21=copy;
        len21=s21.length();
        for(int v=0;v<len21;v++)
        {
            char ch9=s21.charAt(v);
            int index=0;
            for(int u=0;u<26;u++)
            {
                char ch10=array4[u];
                if(ch9==ch10)
                    index=u;
            }
            switch(index)
            {
                case 0:
                {
                    ch9=array5[0];
                }
                break;
                case 1:
                {
                    ch9=array5[1];
                }
                break;
                case 2:
                {
                    ch9=array5[2];
                }
                break;
                case 3:
                {
                    ch9=array5[3];
                }
                break;
                case 4:
                {
                    ch9=array5[4];
                }
                break;
                case 5:
                {
                    ch9=array5[5];
                }
                break;
                case 6:
                {
                    ch9=array5[6];
                }
                break;
                case 7:
                {
                    ch9=array5[7];
                }
                break;
                case 8:
                {
                    ch9=array5[8];
                }
                break;
                case 9:
                {
                    ch9=array5[9];
                }
                break;
                case 10:
                {
                    ch9=array5[10];
                }
                break;
                case 11:
                {
                    ch9=array5[11];
                }
                break;
                case 12:
                {
                    ch9=array5[12];
                }
                break;
                case 13:
                {
                    ch9=array5[13];
                }
                break;
                case 14:
                {
                    ch9=array5[14];
                }
                break;
                case 15:
                {
                    ch9=array5[15];
                }
                break;
                case 16:
                {
                    ch9=array5[16];
                }
                break;
                case 17:
                {
                    ch9=array5[17];
                }
                break;
                case 18:
                {
                    ch9=array5[18];
                }
                break;
                case 19:
                {
                    ch9=array5[19];
                }
                break;
                case 20:
                {
                    ch9=array5[20];
                }
                break;
                case 21:
                {
                    ch9=array5[21];
                }
                break;
                case 22:
                {
                    ch9=array5[22];
                }
                break;
                case 23:
                {
                    ch9=array5[23];
                }
                break;
                case 24:
                {
                    ch9=array5[24];
                }
                break;
                case 25:
                {
                    ch9=array5[25];
                }
                break;
                default:ch9=' ';
            }
            s22+=ch9;
        }
        System.out.println("Your secret encrypted message:");
        System.out.println(s22);
        for(long z=1;z<=99999999;z++);
        cont();
    }

    public void affineCipherDecryptor(String s23)
    {
        int len23=s23.length();
        String s24="";
        for(int t=0;t<len23;t++)
        {
            char ch11=s23.charAt(t);
            int index=0;
            for(int w=0;w<26;w++)
            {
                char ch12=array5[w];
                if(ch11==ch12)
                    index=w;
            }
            switch(index)
            {
                case 0:
                {
                    ch11=array4[0];
                }
                break;
                case 1:
                {
                    ch11=array4[1];
                }
                break;
                case 2:
                {
                    ch11=array4[2];
                }
                break;
                case 3:
                {
                    ch11=array4[3];
                }
                break;
                case 4:
                {
                    ch11=array4[4];
                }
                break;
                case 5:
                {
                    ch11=array4[5];
                }
                break;
                case 6:
                {
                    ch11=array4[6];
                }
                break;
                case 7:
                {
                    ch11=array4[7];
                }
                break;
                case 8:
                {
                    ch11=array4[8];
                }
                break;
                case 9:
                {
                    ch11=array4[9];
                }
                break;
                case 10:
                {
                    ch11=array4[10];
                }
                break;
                case 11:
                {
                    ch11=array4[11];
                }
                break;
                case 12:
                {
                    ch11=array4[12];
                }
                break;
                case 13:
                {
                    ch11=array4[13];
                }
                break;
                case 14:
                {
                    ch11=array4[14];
                }
                break;
                case 15:
                {
                    ch11=array4[15];
                }
                break;
                case 16:
                {
                    ch11=array4[16];
                }
                break;
                case 17:
                {
                    ch11=array4[17];
                }
                break;
                case 18:
                {
                    ch11=array4[18];
                }
                break;
                case 19:
                {
                    ch11=array4[19];
                }
                break;
                case 20:
                {
                    ch11=array4[20];
                }
                break;
                case 21:
                {
                    ch11=array4[21];
                }
                break;
                case 22:
                {
                    ch11=array4[22];
                }
                break;
                case 23:
                {
                    ch11=array4[23];
                }
                break;
                case 24:
                {
                    ch11=array4[24];
                }
                break;
                case 25:
                {
                    ch11=array4[25];
                }
                break;
                default:ch11=' ';
            }
            s24+=ch11;
        }
        System.out.println("Your secret decrypted message:");
        System.out.println(s24);
        for(long z=1;z<=99999999;z++);
        cont();
    }
    public void cont()
    {
        System.out.println();
        System.out.println("Do you want to continue? Press y or n");
        char cont1=sc.next().charAt(0);
        if(cont1=='y'||cont1=='Y')
            main();
            else
            {
                end();
            }
    }
    public void end()
    {
        System.out.println();
        System.out.println("Are you sure you want to exit? Press y for yes and anything else for no");
        char cont2=sc.next().charAt(0);
        if(cont2=='y'||cont2=='Y')
        {}
        else
        cont();
        String s5="We hope to have been useful to you and the agency when you used this encryptor/decryptor device.";
        String s6="Thank you for your services and you are welcome anytime to use this device.";
        String s7="For security reasons that you may know, that is to prevent this program form falling",s8="into the wrong hands, this device will terminate and remove all data this program created in 2 seconds";
        for(int m=0;m<s5.length();m++)
        {
            char ch5=s5.charAt(m);
            for(long n=1;n<=99999999;n++);
            System.out.print(ch5);
        }
        System.out.println();
        for(int n=0;n<s6.length();n++)
        {
            char ch6=s6.charAt(n);
            for(long o=1;o<=99999999;o++);
            System.out.print(ch6);
        }
        System.out.println();
        for(int o=0;o<s7.length();o++)
        {
            char ch7=s7.charAt(o);
            for(long p=1;p<=99999999;p++);
            System.out.print(ch7);
        }
        System.out.println();
        for(int p=0;p<s8.length();p++)
        {
            char ch8=s8.charAt(p);
            for(long q=1;q<=99999999;q++);
            System.out.print(ch8);
        }
        for(long r=-99999999;r<=99999999;r++);
        System.exit(0);
    }
    public static void main()
    {
        System.out.println("\f");
        
        if(ctr2==0)
        {
            title();
            welcome();
        }
        ctr2++;
        int choice1=0;
        encryptor obj=new encryptor();
        System.out.println();
        System.out.println("Enter choice:");
        System.out.println("1.Playfair Cipher");
        System.out.println("2.Morse Code");
        System.out.println("3.Vigenere Cipher");
        System.out.println("4.Affine Cipher");
        System.out.println("To learn about the ciphers, selct their respective numbers");
        int choice2=sc.nextInt();
        if(choice2==1||choice2==2||choice2==3||choice2==4){}
        else
        {
            System.out.println("Wrong choice. Please try again. Thank you.");
            for(int z=0;z<=999999;z++);
            main();
        }

        String message="";
        String keyword="";

        sc.nextLine();//for correcting the \n problem

        switch(choice2)
        {
            case 1:
            {

                System.out.println(" ______ _              __      _          _____ _       _                 ");
                System.out.println(" | ___ \\ |            / _|    (_)        /  __ (_)     | |               ");
                System.out.println(" | |_/ / | __ _ _   _| |_ __ _ _ _ __    | /  \\/_ _ __ | |__   ___ _ __  ");
                System.out.println(" |  __/| |/ _` | | | |  _/ _` | | '__|   | |   | | '_ \\| '_ \\ / _ \\ '__| ");
                System.out.println(" | |   | | (_| | |_| | || (_| | | |      | \\__/\\ | |_) | | | |  __/ |    ");
                System.out.println(" \\_|   |_|\\__,_|\\__, |_| \\__,_|_|_|       \\____/_| .__/|_| |_|\\___|_|    ");
                System.out.println("                 __/ |                           | |                     ");
                System.out.println("                |___/                            |_|                     ");
                System.out.println();
                System.out.println();
                System.out.println("The playfair cipher was invented in 1854 by Charles Wheatstone."+"\n"+"It involves a password or key which substitutes the letters of plaintext alphabet to ciphertext alphabet.");
                System.out.println("Example: Let's say the key is dog. Then the normal alphabet(a,b,c,d...) is converted to ciphertext(d,o,g,a,b,c,e...)");
                System.out.println("         The letters absent in the key will follow the word chronologically in the ciphertext, but the letters which are present in the word do not repeat");
                System.out.println();
                System.out.println("Security level: 2/5");
                message="0";
                while(message.equals("0"))
                {
                    while(choice1!=1&&choice1!=2)
                    {
                        System.out.println();
                        System.out.println("Enter choice:");
                        System.out.println("1.Encrypt message");
                        System.out.println("2.Decrypt message");
                        System.out.println("To go back to the previous menu, press 0");
                        choice1=sc.nextInt(); 
                        if(choice1==1||choice1==2){
                            break;
                        }
                        else if(choice1==0)
                        {
                            main();
                        }
                    
                        else
                            System.out.println("Wrong choice. Please try again. Thank you."); 
                        }
                        System.out.println("Enter Message. To go back, press 0");
                        message=sc.nextLine();
                        message=sc.nextLine();
                        if(message.equals("0"))
                        {
                            choice1=-1;
                        }
                    }
                    System.out.println();
                System.out.println("Enter Keyword/Password(has to be only alphabets as Playfair Cipher generates ciphertext on keyword) ");
                keyword=sc.nextLine();
                switch(choice1)
                {
                    case 1:
                    {
                        obj.playfairCipherPassword(keyword);
                        obj.playfairCipherMessage(message);
                    }
                    break;
                    case 2:
                    {
                        obj.playfairCipherPassword(keyword);
                        obj.playfairCipherDecryptor(message);
                    }
                    break;
                }

            }
            break;
            case 2:
            {

                System.out.println("___  ___                      _____           _      ");
                System.out.println("|  \\/  |                     /  __ \\         | |     ");
                System.out.println("| .  . | ___  _ __ ___  ___  | /  \\/ ___   __| | ___ ");
                System.out.println("| |\\/| |/ _ \\| '__/ __|/ _ \\ | |    / _ \\ / _` |/ _ \\");
                System.out.println("| |  | | (_) | |  \\__ \\  __/ | \\__/\\ (_) | (_| |  __/");
                System.out.println("\\_|  |_/\\___/|_|  |___/\\___|  \\____/\\___/ \\__,_|\\___|");
                message="0";
                System.out.println();
                System.out.println();
                System.out.println("Morse code was invented in 1837. It is a code which replaces a letter with a series of dots or dashes");
                System.out.println("One space represents the next letter and three space, the next word");
                System.out.println();
                System.out.println("Security level: 1/5");
                while(message.equals("0"))
                {
                    while(choice1!=1||choice1!=2)
                    {
                        System.out.println();
                        System.out.println("Enter choice:");
                        System.out.println("1.Encrypt message");
                        System.out.println("2.Decrypt message");
                        System.out.println("To go back to the previous menu press 0");
                        choice1=sc.nextInt();
                        if(choice1==1||choice1==2){
                            break;
                        }
                        else
                            System.out.println("Wrong choice. Please try again. Thank you");
                        }
                        System.out.println("Enter Message. To go back, press 0");
                        message=sc.nextLine();
                        message=sc.nextLine();
                        if(message.equals("0"))
                        choice1=-1;                    
                    }
                switch(choice1)
                {
                    case 1:obj.morseCode(message);
                    break;
                    case 2:obj.morseCodeDecryptor(message);
                    break;
                }

            }
            break;
            case 3:
            {

                System.out.println("  _   _ _                                  _____ _       _                        ");
                System.out.println(" | | | (_)                                /  __ (_)     | |              ");
                System.out.println(" | | | |_  __ _  ___ _ __   ___ _ __ ___  | /  \\/_ _ __ | |__   ___ _ __          ");
                System.out.println(" | | | | |/ _` |/ _ \\ '_ \\ / _ \\ '__/ _ \\ | |   | | '_ \\| '_ \\ / _ \\ '__|");
                System.out.println(" \\ \\_/ / | (_| |  __/ | | |  __/ | |  __/ | \\__/\\ | |_) | | | |  __/ |   ");
                System.out.println("  \\___/|_|\\__, |\\___|_| |_|\\___|_|  \\___|  \\____/_| .__/|_| |_|\\___|_|   ");
                System.out.println("           __/ |                                  | |                    ");
                System.out.println("          |___/                                   |_|                    ");
                
                System.out.println();
                System.out.println();
                System.out.println("It is a very old cipher. It is similar to the playfair cipher, but is more difficult to crack");
                System.out.println("Instead of using one ciphertext like in the playfair cipher, it alternates between two ciphertexts and hence requires two keys.");
                System.out.println();
                System.out.println("Security level: 3/5");
                message="0";
                while(message.equals("0"))
                {
                    while(choice1!=1||choice1!=2)
                    {
                        System.out.println();
                        System.out.println("Enter choice:");
                        System.out.println("1.Encrypt message");
                        System.out.println("2.Decrypt message");
                        System.out.println("To go back to the previous menu, press 0");
                        choice1=sc.nextInt();
                        if(choice1==1||choice1==2){
                            break;
                        }
                        else if(choice1==0)
                        main();
                        
                        else
                        System.out.println("Wrong choice. Please try again. Thank you");  
                    } 
                    System.out.println("Enter Message. To go back, press 0");
                    message=sc.nextLine();
                    message=sc.nextLine();
                    if(message.equals("0"))
                    choice1=-1;
                }
                System.out.println();
                    System.out.println("Enter Keyword(has to be only alphabets as Vigenere Cipher generates ciphertext on keyword)");
                    keyword=sc.nextLine();
                    //keyword=sc.nextLine();

                    System.out.println("Enter keyword 2(has to be only alphabets as Vigenere Cipher generates ciphertext on keyword)");
                    String keyword2=sc.nextLine();
                    //keyword2=sc.nextLine();
                    
                switch(choice1)
                {
                    case 1:
                    {
                        obj.vigenereCipherPassword(keyword,keyword2);
                        obj.vigenereCipherMessage(message);
                    }
                    break;
                    case 2:
                    {
                        obj.vigenereCipherPassword(keyword,keyword2);
                        obj.vigenereCipherDecryptor(message);
                    }
                }
            }
            break;
            case 4:
            {

                System.out.println("  ___   __  __ _              _____ _       _            ");   
                System.out.println(" / _ \\ / _|/ _(_)            /  __ (_)     | |              ");
                System.out.println("/ /_\\ \\ |_| |_ _ _ __   ___  | /  \\/_ _ __ | |__   ___ _ __ ");
                System.out.println("|  _  |  _|  _| | '_ \\ / _ \\ | |   | | '_ \\| '_ \\ / _ \\ '__|");
                System.out.println("| | | | | | | | | | | |  __/ | \\__/\\ | |_) | | | |  __/ |   ");
                System.out.println("\\_| |_/_| |_| |_|_| |_|\\___|  \\____/_| .__/|_| |_|\\___|_|   ");
                System.out.println("                                     | |                    ");
                System.out.println("                                     |_|                    ");
                
                System.out.println();
                System.out.println();
                System.out.println("Affine cipher uses mathematical functions to encrypt a message. it converts the letters into their numerical equivalent.");
                System.out.println("It then performs a function on the number and converts it back to another letter which has that numerical value.");
                System.out.println("It uses modular arithmetic to convert the number to one less than 26. The mathematical function is ax + b where a and b are user-inputs");
                System.out.println("The a and 26 have to be co-prime numbers for this cipher to work.");
                System.out.println();
                System.out.println("Security level: 4/5");
                message="0";
                while(message.equals("0"))
                {
                    while(choice1!=1||choice1!=2)
                    {
                        System.out.println();
                        System.out.println("Enter choice:");
                        System.out.println("1.Encrypt message");
                        System.out.println("2.Decrypt message");
                        System.out.println("To go back to the previous menu, press 0");
                        choice1=sc.nextInt();
                        if(choice1==1||choice1==2){
                            break;
                        }
                        else if(choice1==0)
                        main();
                        else
                            System.out.println("Wrong choice. Please try again. Thank you");
                        }
                        System.out.println("Enter message. To go back, press 0");
                        message=sc.nextLine();
                        message=sc.nextLine();
                        if(message.equals("0"))
                        choice1=-1;
                    }
                switch(choice1)
                {
                    case 1:
                    {
                        obj.affineCipherPassword();
                        obj.affineCipherMessage(message);
                    }
                    break;
                    case 2:
                    {
                        obj.affineCipherPassword();
                        obj.affineCipherDecryptor(message);
                    }
                }
            }
        }

    }
}
