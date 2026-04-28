package com;
import java.util.Scanner;

//import com.Song;

//import com.MusicPlayer;
//import com.Song;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	boolean flag=true;
	System.out.println("Enter your choice to continue");
	System.out.println("1. Add New Song");
	System.out.println("2. Update Existing Song");
	System.out.println("3. Delete Song");
	System.out.println("4. Display All Songs");
	System.out.println("5. Create New Playlist");
	System.out.println("6. Add Song to Playlist");
	System.out.println("7. Display All Playlist");
	System.out.println("8. Display Songs in PlayList");
	System.out.println("9. Play Song in PlayList");
	System.out.println("10. Pause Song in Playlist");
	System.out.println("11. Stop Song in Playlist");
	System.out.println("12. Exit");
	MusicPlayerImpl music = new MusicPlayerImpl();
	while(flag) {
	 
	int num=sc.nextInt();
	switch(num) {
	case 1: System.out.println("Enter a song id");
	int id=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter song titile");
	String title = sc.nextLine();
	System.out.println("Enter duration");
	Double duration = sc.nextDouble();
	System.out.println("Enter singer name");
	sc.nextLine();
	String name=sc.nextLine();
	        Song n = new Song(id,title,name,duration);
	       // MusicPlayer music = new MusicPlayer();
	        music.addSong(n);
	        System.out.println("to continue enter 1 else 0");
	        int g=sc.nextInt();
	        if(g>0)
	        	flag=true;
	        else
	        	flag=false;
	        break;
	case 2:System.out.println("Enter a song id");
	 id=sc.nextInt();
	 System.out.println("Enter song titile");
		 title = sc.next();
		 sc.nextLine();
		System.out.println("Enter singer name");
		 name = sc.nextLine();
		System.out.println("Enter duration");
		 duration=sc.nextDouble();
		 sc.nextLine();
	       //  n = new Song(id,name,title,duration);
	        // System.out.println("Enter singer name");
	        // String singername = sc.nextLine();
	       // MusicPlayer music = new MusicPlayer();
	        music.updateSong(id,title,name,duration);
	        System.out.println("to continue enter 1 else 0");
	         g=sc.nextInt();
	        if(g>0)
	        	flag=true;
	        else
	        	flag=false;
	        break;
	case 3: 
	 System.out.println("Enter song id");
		 int id1 = sc.nextInt();
		 
	       //  n = new Song(id,title,name,duration);
	         music.deleteSong(id1);
	         System.out.println("to continue enter 1 else 0");
	         g=sc.nextInt();
	        if(g>0)
	        	flag=true;
		        else
		        	flag=false;
	         break;
	case 4:music.displayAllSongs();
	System.out.println("to continue enter 1 else 0");
    g=sc.nextInt();
    sc.nextLine();
   if(g>0)
   	flag=true;
    else
    	flag=false;
	break;
	case 5:System.out.println("enter playlist name");
	sc.nextLine();
	String s= sc.nextLine();
	//System.out.println("enter playlist id");
	 //id=sc.nextInt();
	music.createPlayList(s);
	System.out.println("to continue enter 1 else 0");
    g=sc.nextInt();
   if(g>0)
   	flag=true;
    else
    	flag=false;
	break;
	case 6:
		System.out.println("enter playlist name");
		sc.nextLine();
		s= sc.nextLine();
		System.out.println("Enter a song id");
		 id=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter song titile");
			 title = sc.nextLine();
			System.out.println("Enter singer name");
			 name = sc.nextLine();
			System.out.println("Enter duration");
			 duration=sc.nextDouble();
		         n = new Song(id,title,name,duration);
		         music.addSongToPlayList(s,n);
		         System.out.println("to continue enter 1 else 0");
		         g=sc.nextInt();
		        if(g>0)
		        	flag=true;
			        else
			        	flag=false;
		break;
	case 7: 
	music.displayAllPlayList();
	System.out.println("to continue enter 1 else 0");
    g=sc.nextInt();
   if(g>0)
   	flag=true;
    else
    	flag=false;
	break;
	case 9:System.out.println("enter playlist name");
	sc.nextLine();
	 s= sc.nextLine();
	 System.out.println("Enter song id");
	 int s1=sc.nextInt();
	 music.playSongPlayList( s,s1);
	 System.out.println("to continue enter 1 else 0");
     g=sc.nextInt();
    if(g>0)
    	flag=true;
     else
     	flag=false;
	 break;
	case 8:
		System.out.println("enter playlist name");
		sc.nextLine();
		 s= sc.nextLine();
		 music.playPlayList( s);
		 System.out.println("to continue enter 1 else 0");
         g=sc.nextInt();
        if(g>0)
        	flag=true;
	        else
	        	flag=false;
		 break;
	case 10: music.pauseSong();
   // break;
	 
	System.out.println("to continue enter 1 else 0");
    g=sc.nextInt();
   if(g>0)
   	flag=true;
    else
    	flag=false;
    break;
	case 11: music.stop();
	System.out.println("to continue enter 1 else 0");
    g=sc.nextInt();
	if(g>0)
	   	flag=true;
	    else
	    	flag=false;
	break;
	//case 12: break;
	default:System.out.println("Enter correct choice");
	System.out.println("to continue enter 1 else 0");
    g=sc.nextInt();
   if(g>0)
   	flag=true;
    else
    	flag=false;
    break;
	}
	}
}
}
