/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package member;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rezananda
 */
public class MainMember {
     public static ArrayList <Member> m1 = new ArrayList<>();
    public static void main(String[] args) {
       
        Member n1 = new Member();
        Member n2 = new Member();
        Member n3 = new Member();
        n1.setNama("Reza");
        n1.setTeam("Dragon");
        n1.setUmur(19);
        n1.setNilaiP(80);
        n1.setNilaiA(70);
        n1.setNilaiS(90);
        
        n2.setNama("Budi");
        n2.setTeam("Naga Bonar");
        n2.setUmur(20);
        n2.setNilaiP(70);
        n2.setNilaiA(85);
        n2.setNilaiS(60);
        
        n3.setNama("Andi");
        n3.setTeam("Singo Edan");
        n3.setUmur(30);
        n3.setNilaiP(65);
        n3.setNilaiA(75);
        n3.setNilaiS(80);
        
        m1.add(n1);
        m1.add(n2);
        m1.add(n3);
        
       tampilkan();
    }
    public static void tampilkan(){
        
        for(int i = 0; i < m1.size(); i++){
            System.out.println("Nama : " + m1.get(i).getNama());
            System.out.println("Team : " + m1.get(i).getTeam());
            System.out.println("Umur : " + m1.get(i).getUmur());
            System.out.println("Nilai : " + m1.get(i).totalNilai());
                      
        }
    }
}
